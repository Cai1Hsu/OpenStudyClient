package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.support.annotation.RequiresApi;

@RequiresApi(18)
@TargetApi(18)
/* loaded from: classes.jar:android/support/v4/accessibilityservice/AccessibilityServiceInfoCompatJellyBeanMr2.class */
class AccessibilityServiceInfoCompatJellyBeanMr2 {
    AccessibilityServiceInfoCompatJellyBeanMr2() {
    }

    public static int getCapabilities(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }
}
