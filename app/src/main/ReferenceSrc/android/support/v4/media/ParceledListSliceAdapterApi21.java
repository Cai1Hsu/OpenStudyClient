package android.support.v4.media;

import android.annotation.TargetApi;
import android.media.browse.MediaBrowser;
import android.support.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RequiresApi(21)
@TargetApi(21)
/* loaded from: classes.jar:android/support/v4/media/ParceledListSliceAdapterApi21.class */
class ParceledListSliceAdapterApi21 {
    private static Constructor sConstructor;

    static {
        try {
            sConstructor = Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    ParceledListSliceAdapterApi21() {
    }

    static Object newInstance(List<MediaBrowser.MediaItem> list) {
        Object obj;
        try {
            obj = sConstructor.newInstance(list);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            obj = null;
        }
        return obj;
    }
}
