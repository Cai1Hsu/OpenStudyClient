package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.os.BuildCompat;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;

/* loaded from: classes.jar:android/support/v4/content/ContextCompat.class */
public class ContextCompat {
    private static final String DIR_ANDROID = "Android";
    private static final String DIR_OBB = "obb";
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static TypedValue sTempValue;

    protected ContextCompat() {
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            throw new IllegalArgumentException("permission is null");
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return BuildCompat.isAtLeastN() ? ContextCompatApi24.createDeviceProtectedStorageContext(context) : null;
    }

    private static File createFilesDir(File file) {
        File file2;
        synchronized (ContextCompat.class) {
            file2 = file;
            try {
                if (!file.exists()) {
                    file2 = file;
                    if (!file.mkdirs()) {
                        if (file.exists()) {
                            file2 = file;
                        } else {
                            Log.w(TAG, "Unable to create files subdir " + file.getPath());
                            file2 = null;
                        }
                    }
                }
            } finally {
            }
        }
        return file2;
    }

    public static File getCodeCacheDir(Context context) {
        return Build.VERSION.SDK_INT >= 21 ? ContextCompatApi21.getCodeCacheDir(context) : createFilesDir(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    @ColorInt
    public static final int getColor(Context context, @ColorRes int i) {
        return Build.VERSION.SDK_INT >= 23 ? ContextCompatApi23.getColor(context, i) : context.getResources().getColor(i);
    }

    public static final ColorStateList getColorStateList(Context context, @ColorRes int i) {
        return Build.VERSION.SDK_INT >= 23 ? ContextCompatApi23.getColorStateList(context, i) : context.getResources().getColorStateList(i);
    }

    public static File getDataDir(Context context) {
        File file;
        if (BuildCompat.isAtLeastN()) {
            file = ContextCompatApi24.getDataDir(context);
        } else {
            String str = context.getApplicationInfo().dataDir;
            file = str != null ? new File(str) : null;
        }
        return file;
    }

    public static final Drawable getDrawable(Context context, @DrawableRes int i) {
        int i2;
        Drawable drawable;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            drawable = ContextCompatApi21.getDrawable(context, i);
        } else if (i3 >= 16) {
            drawable = context.getResources().getDrawable(i);
        } else {
            synchronized (sLock) {
                if (sTempValue == null) {
                    sTempValue = new TypedValue();
                }
                context.getResources().getValue(i, sTempValue, true);
                i2 = sTempValue.resourceId;
            }
            drawable = context.getResources().getDrawable(i2);
        }
        return drawable;
    }

    public static File[] getExternalCacheDirs(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? ContextCompatKitKat.getExternalCacheDirs(context) : new File[]{context.getExternalCacheDir()};
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? ContextCompatKitKat.getExternalFilesDirs(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static final File getNoBackupFilesDir(Context context) {
        return Build.VERSION.SDK_INT >= 21 ? ContextCompatApi21.getNoBackupFilesDir(context) : createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static File[] getObbDirs(Context context) {
        File[] fileArr;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            fileArr = ContextCompatKitKat.getObbDirs(context);
        } else {
            fileArr = new File[]{i >= 11 ? ContextCompatHoneycomb.getObbDir(context) : buildPath(Environment.getExternalStorageDirectory(), DIR_ANDROID, DIR_OBB, context.getPackageName())};
        }
        return fileArr;
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return BuildCompat.isAtLeastN() ? ContextCompatApi24.isDeviceProtectedStorage(context) : false;
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            ContextCompatJellybean.startActivities(context, intentArr, bundle);
        } else if (i >= 11) {
            ContextCompatHoneycomb.startActivities(context, intentArr);
        } else {
            z = false;
        }
        return z;
    }

    public static void startActivity(Context context, Intent intent, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            ContextCompatJellybean.startActivity(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}
