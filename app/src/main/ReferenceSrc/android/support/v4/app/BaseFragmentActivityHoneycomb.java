package android.support.v4.app;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.jar:android/support/v4/app/BaseFragmentActivityHoneycomb.class */
abstract class BaseFragmentActivityHoneycomb extends BaseFragmentActivityGingerbread {
    BaseFragmentActivityHoneycomb() {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        View view2 = dispatchFragmentsOnCreateView;
        if (dispatchFragmentsOnCreateView == null) {
            view2 = dispatchFragmentsOnCreateView;
            if (Build.VERSION.SDK_INT >= 11) {
                view2 = super.onCreateView(view, str, context, attributeSet);
            }
        }
        return view2;
    }
}
