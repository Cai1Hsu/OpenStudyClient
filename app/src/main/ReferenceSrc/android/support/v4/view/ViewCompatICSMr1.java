package android.support.v4.view;

import android.annotation.TargetApi;
import android.support.annotation.RequiresApi;
import android.view.View;

@RequiresApi(15)
@TargetApi(15)
/* loaded from: classes.jar:android/support/v4/view/ViewCompatICSMr1.class */
class ViewCompatICSMr1 {
    ViewCompatICSMr1() {
    }

    public static boolean hasOnClickListeners(View view) {
        return view.hasOnClickListeners();
    }
}
