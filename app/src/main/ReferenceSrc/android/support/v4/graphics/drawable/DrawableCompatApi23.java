package android.support.v4.graphics.drawable;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;

@RequiresApi(23)
@TargetApi(23)
/* loaded from: classes.jar:android/support/v4/graphics/drawable/DrawableCompatApi23.class */
class DrawableCompatApi23 {
    DrawableCompatApi23() {
    }

    public static int getLayoutDirection(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static boolean setLayoutDirection(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }
}
