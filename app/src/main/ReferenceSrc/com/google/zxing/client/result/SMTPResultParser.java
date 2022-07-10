package com.google.zxing.client.result;

import com.google.zxing.Result;
/* loaded from: /home/caiyi/jadx/jadx-1.4.2/bin/classes.dex */
public final class SMTPResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String rawText = result.getText();
        if (!rawText.startsWith("smtp:") && !rawText.startsWith("SMTP:")) {
            return null;
        }
        String emailAddress = rawText.substring(5);
        String subject = null;
        String body = null;
        int colon = emailAddress.indexOf(58);
        if (colon >= 0) {
            subject = emailAddress.substring(colon + 1);
            emailAddress = emailAddress.substring(0, colon);
            int colon2 = subject.indexOf(58);
            if (colon2 >= 0) {
                body = subject.substring(colon2 + 1);
                subject = subject.substring(0, colon2);
            }
        }
        String mailtoURI = "mailto:" + emailAddress;
        return new EmailAddressParsedResult(emailAddress, subject, body, mailtoURI);
    }
}
