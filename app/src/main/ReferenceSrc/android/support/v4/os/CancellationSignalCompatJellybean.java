package android.support.v4.os;

import android.annotation.TargetApi;
import android.support.annotation.RequiresApi;

@RequiresApi(16)
@TargetApi(16)
/* loaded from: classes.jar:android/support/v4/os/CancellationSignalCompatJellybean.class */
class CancellationSignalCompatJellybean {
    CancellationSignalCompatJellybean() {
    }

    public static void cancel(Object obj) {
        ((android.os.CancellationSignal) obj).cancel();
    }

    public static Object create() {
        return new android.os.CancellationSignal();
    }
}
