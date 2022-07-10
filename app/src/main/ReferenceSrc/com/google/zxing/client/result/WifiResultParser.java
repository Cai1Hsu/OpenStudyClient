package com.google.zxing.client.result;

import com.google.zxing.Result;
/* loaded from: /home/caiyi/jadx/jadx-1.4.2/bin/classes.dex */
public final class WifiResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public WifiParsedResult parse(Result result) {
        String ssid;
        String rawText = result.getText();
        if (!rawText.startsWith("WIFI:") || (ssid = matchSinglePrefixedField("S:", rawText, ';', false)) == null || ssid.length() == 0) {
            return null;
        }
        String pass = matchSinglePrefixedField("P:", rawText, ';', false);
        String type = matchSinglePrefixedField("T:", rawText, ';', false);
        if (type == null) {
            type = "nopass";
        }
        return new WifiParsedResult(type, ssid, pass);
    }
}
