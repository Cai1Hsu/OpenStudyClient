package android.support.v4.view;

import android.annotation.TargetApi;
import android.support.annotation.RequiresApi;
import android.view.KeyEvent;

@RequiresApi(11)
@TargetApi(11)
/* loaded from: classes.jar:android/support/v4/view/KeyEventCompatHoneycomb.class */
class KeyEventCompatHoneycomb {
    KeyEventCompatHoneycomb() {
    }

    public static boolean isCtrlPressed(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static boolean metaStateHasModifiers(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    public static boolean metaStateHasNoModifiers(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }

    public static int normalizeMetaState(int i) {
        return KeyEvent.normalizeMetaState(i);
    }
}
