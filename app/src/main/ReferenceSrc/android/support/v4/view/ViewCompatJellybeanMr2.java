package android.support.v4.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.support.annotation.RequiresApi;
import android.view.View;

@RequiresApi(18)
@TargetApi(18)
/* loaded from: classes.jar:android/support/v4/view/ViewCompatJellybeanMr2.class */
class ViewCompatJellybeanMr2 {
    ViewCompatJellybeanMr2() {
    }

    public static Rect getClipBounds(View view) {
        return view.getClipBounds();
    }

    public static boolean isInLayout(View view) {
        return view.isInLayout();
    }

    public static void setClipBounds(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}
