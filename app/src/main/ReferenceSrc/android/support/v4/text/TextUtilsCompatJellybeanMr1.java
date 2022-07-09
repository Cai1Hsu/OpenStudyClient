package android.support.v4.text;

import android.annotation.TargetApi;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import java.util.Locale;

@RequiresApi(17)
@TargetApi(17)
/* loaded from: classes.jar:android/support/v4/text/TextUtilsCompatJellybeanMr1.class */
class TextUtilsCompatJellybeanMr1 {
    TextUtilsCompatJellybeanMr1() {
    }

    public static int getLayoutDirectionFromLocale(@Nullable Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    @NonNull
    public static String htmlEncode(@NonNull String str) {
        return TextUtils.htmlEncode(str);
    }
}
