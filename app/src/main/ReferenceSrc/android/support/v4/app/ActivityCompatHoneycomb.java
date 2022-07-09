package android.support.v4.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.support.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@RequiresApi(11)
@TargetApi(11)
/* loaded from: classes.jar:android/support/v4/app/ActivityCompatHoneycomb.class */
class ActivityCompatHoneycomb {
    ActivityCompatHoneycomb() {
    }

    static void dump(Activity activity, String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        activity.dump(str, fileDescriptor, printWriter, strArr);
    }

    static void invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
    }
}
