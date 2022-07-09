package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.Map;

/* loaded from: classes.dex */
public final class EmailAddressResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String rawText = result.getText();
        if (rawText.startsWith("mailto:") || rawText.startsWith("MAILTO:")) {
            String emailAddress = rawText.substring(7);
            int queryStart = emailAddress.indexOf(63);
            if (queryStart >= 0) {
                emailAddress = emailAddress.substring(0, queryStart);
            }
            Map<String, String> nameValues = parseNameValuePairs(rawText);
            String subject = null;
            String body = null;
            if (nameValues != null) {
                if (emailAddress.length() == 0) {
                    emailAddress = nameValues.get("to");
                }
                String subject2 = nameValues.get("subject");
                subject = subject2;
                String body2 = nameValues.get("body");
                body = body2;
            }
            return new EmailAddressParsedResult(emailAddress, subject, body, rawText);
        } else if (!EmailDoCoMoResultParser.isBasicallyValidEmailAddress(rawText)) {
            return null;
        } else {
            return new EmailAddressParsedResult(rawText, null, null, "mailto:" + rawText);
        }
    }
}
