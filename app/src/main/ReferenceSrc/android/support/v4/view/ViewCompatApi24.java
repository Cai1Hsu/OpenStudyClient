package android.support.v4.view;

import android.annotation.TargetApi;
import android.support.annotation.RequiresApi;
import android.view.PointerIcon;
import android.view.View;

@RequiresApi(24)
@TargetApi(24)
/* loaded from: classes.jar:android/support/v4/view/ViewCompatApi24.class */
class ViewCompatApi24 {
    ViewCompatApi24() {
    }

    public static void setPointerIcon(View view, Object obj) {
        view.setPointerIcon((PointerIcon) obj);
    }
}
