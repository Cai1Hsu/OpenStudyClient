package android.support.v4.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.util.Pair;
import android.view.View;

@RequiresApi(23)
@TargetApi(23)
/* loaded from: classes.jar:android/support/v4/app/ActivityOptionsCompat23.class */
class ActivityOptionsCompat23 {
    private final ActivityOptions mActivityOptions;

    private ActivityOptionsCompat23(ActivityOptions activityOptions) {
        this.mActivityOptions = activityOptions;
    }

    public static ActivityOptionsCompat23 makeBasic() {
        return new ActivityOptionsCompat23(ActivityOptions.makeBasic());
    }

    public static ActivityOptionsCompat23 makeClipRevealAnimation(View view, int i, int i2, int i3, int i4) {
        return new ActivityOptionsCompat23(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
    }

    public static ActivityOptionsCompat23 makeCustomAnimation(Context context, int i, int i2) {
        return new ActivityOptionsCompat23(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static ActivityOptionsCompat23 makeScaleUpAnimation(View view, int i, int i2, int i3, int i4) {
        return new ActivityOptionsCompat23(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    public static ActivityOptionsCompat23 makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return new ActivityOptionsCompat23(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static ActivityOptionsCompat23 makeSceneTransitionAnimation(Activity activity, View[] viewArr, String[] strArr) {
        Pair[] pairArr = null;
        if (viewArr != null) {
            Pair[] pairArr2 = new Pair[viewArr.length];
            int i = 0;
            while (true) {
                pairArr = pairArr2;
                if (i >= pairArr2.length) {
                    break;
                }
                pairArr2[i] = Pair.create(viewArr[i], strArr[i]);
                i++;
            }
        }
        return new ActivityOptionsCompat23(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static ActivityOptionsCompat23 makeTaskLaunchBehind() {
        return new ActivityOptionsCompat23(ActivityOptions.makeTaskLaunchBehind());
    }

    public static ActivityOptionsCompat23 makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i2) {
        return new ActivityOptionsCompat23(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
        this.mActivityOptions.requestUsageTimeReport(pendingIntent);
    }

    public Bundle toBundle() {
        return this.mActivityOptions.toBundle();
    }

    public void update(ActivityOptionsCompat23 activityOptionsCompat23) {
        this.mActivityOptions.update(activityOptionsCompat23.mActivityOptions);
    }
}
