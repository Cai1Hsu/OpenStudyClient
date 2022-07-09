package android.support.v4.content;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.RequiresApi;

@RequiresApi(23)
@TargetApi(23)
/* loaded from: classes.jar:android/support/v4/content/ContextCompatApi23.class */
class ContextCompatApi23 {
    ContextCompatApi23() {
    }

    public static int getColor(Context context, int i) {
        return context.getColor(i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return context.getColorStateList(i);
    }
}
