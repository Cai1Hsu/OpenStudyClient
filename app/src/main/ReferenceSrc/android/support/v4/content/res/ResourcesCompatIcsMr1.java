package android.support.v4.content.res;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;

@RequiresApi(15)
@TargetApi(15)
/* loaded from: classes.jar:android/support/v4/content/res/ResourcesCompatIcsMr1.class */
class ResourcesCompatIcsMr1 {
    ResourcesCompatIcsMr1() {
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2) throws Resources.NotFoundException {
        return resources.getDrawableForDensity(i, i2);
    }
}
