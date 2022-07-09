package android.support.v4.view;

import android.annotation.TargetApi;
import android.support.annotation.RequiresApi;
import android.view.MotionEvent;

@RequiresApi(12)
@TargetApi(12)
/* loaded from: classes.jar:android/support/v4/view/MotionEventCompatHoneycombMr1.class */
class MotionEventCompatHoneycombMr1 {
    MotionEventCompatHoneycombMr1() {
    }

    static float getAxisValue(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    static float getAxisValue(MotionEvent motionEvent, int i, int i2) {
        return motionEvent.getAxisValue(i, i2);
    }
}
