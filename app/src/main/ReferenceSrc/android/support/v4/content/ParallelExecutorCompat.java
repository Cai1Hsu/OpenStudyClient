package android.support.v4.content;

import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes.jar:android/support/v4/content/ParallelExecutorCompat.class */
public final class ParallelExecutorCompat {
    private ParallelExecutorCompat() {
    }

    public static Executor getParallelExecutor() {
        return Build.VERSION.SDK_INT >= 11 ? ExecutorCompatHoneycomb.getParallelExecutor() : ModernAsyncTask.THREAD_POOL_EXECUTOR;
    }
}
