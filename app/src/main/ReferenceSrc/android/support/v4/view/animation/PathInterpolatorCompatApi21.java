package android.support.v4.view.animation;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.support.annotation.RequiresApi;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

@RequiresApi(21)
@TargetApi(21)
/* loaded from: classes.jar:android/support/v4/view/animation/PathInterpolatorCompatApi21.class */
class PathInterpolatorCompatApi21 {
    private PathInterpolatorCompatApi21() {
    }

    public static Interpolator create(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    public static Interpolator create(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    public static Interpolator create(Path path) {
        return new PathInterpolator(path);
    }
}
