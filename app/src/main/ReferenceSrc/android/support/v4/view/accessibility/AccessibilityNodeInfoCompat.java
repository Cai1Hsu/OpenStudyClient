package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompatApi21;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompatKitKat;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat.class */
public class AccessibilityNodeInfoCompat {
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_SET_TEXT = 2097152;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    static final AccessibilityNodeInfoImpl IMPL;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    private final Object mInfo;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int mParentVirtualDescendantId = -1;

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityActionCompat.class */
    public static class AccessibilityActionCompat {
        final Object mAction;
        public static final AccessibilityActionCompat ACTION_FOCUS = new AccessibilityActionCompat(1, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, null);
        public static final AccessibilityActionCompat ACTION_SELECT = new AccessibilityActionCompat(4, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, null);
        public static final AccessibilityActionCompat ACTION_CLICK = new AccessibilityActionCompat(16, null);
        public static final AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityActionCompat(32, null);
        public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, null);
        public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(256, null);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(512, null);
        public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(1024, null);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(2048, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(8192, null);
        public static final AccessibilityActionCompat ACTION_COPY = new AccessibilityActionCompat(16384, null);
        public static final AccessibilityActionCompat ACTION_PASTE = new AccessibilityActionCompat(32768, null);
        public static final AccessibilityActionCompat ACTION_CUT = new AccessibilityActionCompat(65536, null);
        public static final AccessibilityActionCompat ACTION_SET_SELECTION = new AccessibilityActionCompat(131072, null);
        public static final AccessibilityActionCompat ACTION_EXPAND = new AccessibilityActionCompat(262144, null);
        public static final AccessibilityActionCompat ACTION_COLLAPSE = new AccessibilityActionCompat(524288, null);
        public static final AccessibilityActionCompat ACTION_DISMISS = new AccessibilityActionCompat(1048576, null);
        public static final AccessibilityActionCompat ACTION_SET_TEXT = new AccessibilityActionCompat(2097152, null);
        public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionShowOnScreen());
        public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollToPosition());
        public static final AccessibilityActionCompat ACTION_SCROLL_UP = new AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollUp());
        public static final AccessibilityActionCompat ACTION_SCROLL_LEFT = new AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollLeft());
        public static final AccessibilityActionCompat ACTION_SCROLL_DOWN = new AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollDown());
        public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollRight());
        public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionContextClick());
        public static final AccessibilityActionCompat ACTION_SET_PROGRESS = new AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionSetProgress());

        public AccessibilityActionCompat(int i, CharSequence charSequence) {
            this(AccessibilityNodeInfoCompat.IMPL.newAccessibilityAction(i, charSequence));
        }

        AccessibilityActionCompat(Object obj) {
            this.mAction = obj;
        }

        public int getId() {
            return AccessibilityNodeInfoCompat.IMPL.getAccessibilityActionId(this.mAction);
        }

        public CharSequence getLabel() {
            return AccessibilityNodeInfoCompat.IMPL.getAccessibilityActionLabel(this.mAction);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl.class */
    static class AccessibilityNodeInfoApi21Impl extends AccessibilityNodeInfoKitKatImpl {
        AccessibilityNodeInfoApi21Impl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addAction(Object obj, Object obj2) {
            AccessibilityNodeInfoCompatApi21.addAction(obj, obj2);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getAccessibilityActionId(Object obj) {
            return AccessibilityNodeInfoCompatApi21.getAccessibilityActionId(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getAccessibilityActionLabel(Object obj) {
            return AccessibilityNodeInfoCompatApi21.getAccessibilityActionLabel(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public List<Object> getActionList(Object obj) {
            return AccessibilityNodeInfoCompatApi21.getActionList(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionInfoSelectionMode(Object obj) {
            return AccessibilityNodeInfoCompatApi21.CollectionInfo.getSelectionMode(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getError(Object obj) {
            return AccessibilityNodeInfoCompatApi21.getError(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getMaxTextLength(Object obj) {
            return AccessibilityNodeInfoCompatApi21.getMaxTextLength(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getWindow(Object obj) {
            return AccessibilityNodeInfoCompatApi21.getWindow(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCollectionItemSelected(Object obj) {
            return AccessibilityNodeInfoCompatApi21.CollectionItemInfo.isSelected(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object newAccessibilityAction(int i, CharSequence charSequence) {
            return AccessibilityNodeInfoCompatApi21.newAccessibilityAction(i, charSequence);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoKitKatImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionInfo(int i, int i2, boolean z, int i3) {
            return AccessibilityNodeInfoCompatApi21.obtainCollectionInfo(i, i2, z, i3);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoKitKatImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionItemInfo(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return AccessibilityNodeInfoCompatApi21.obtainCollectionItemInfo(i, i2, i3, i4, z, z2);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean removeAction(Object obj, Object obj2) {
            return AccessibilityNodeInfoCompatApi21.removeAction(obj, obj2);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean removeChild(Object obj, View view) {
            return AccessibilityNodeInfoCompatApi21.removeChild(obj, view);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean removeChild(Object obj, View view, int i) {
            return AccessibilityNodeInfoCompatApi21.removeChild(obj, view, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setError(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatApi21.setError(obj, charSequence);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setMaxTextLength(Object obj, int i) {
            AccessibilityNodeInfoCompatApi21.setMaxTextLength(obj, i);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi22Impl.class */
    static class AccessibilityNodeInfoApi22Impl extends AccessibilityNodeInfoApi21Impl {
        AccessibilityNodeInfoApi22Impl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getTraversalAfter(Object obj) {
            return AccessibilityNodeInfoCompatApi22.getTraversalAfter(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getTraversalBefore(Object obj) {
            return AccessibilityNodeInfoCompatApi22.getTraversalBefore(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTraversalAfter(Object obj, View view) {
            AccessibilityNodeInfoCompatApi22.setTraversalAfter(obj, view);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTraversalAfter(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatApi22.setTraversalAfter(obj, view, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTraversalBefore(Object obj, View view) {
            AccessibilityNodeInfoCompatApi22.setTraversalBefore(obj, view);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTraversalBefore(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatApi22.setTraversalBefore(obj, view, i);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi23Impl.class */
    static class AccessibilityNodeInfoApi23Impl extends AccessibilityNodeInfoApi22Impl {
        AccessibilityNodeInfoApi23Impl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionContextClick() {
            return AccessibilityNodeInfoCompatApi23.getActionContextClick();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollDown() {
            return AccessibilityNodeInfoCompatApi23.getActionScrollDown();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollLeft() {
            return AccessibilityNodeInfoCompatApi23.getActionScrollLeft();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollRight() {
            return AccessibilityNodeInfoCompatApi23.getActionScrollRight();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollToPosition() {
            return AccessibilityNodeInfoCompatApi23.getActionScrollToPosition();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollUp() {
            return AccessibilityNodeInfoCompatApi23.getActionScrollUp();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionShowOnScreen() {
            return AccessibilityNodeInfoCompatApi23.getActionShowOnScreen();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isContextClickable(Object obj) {
            return AccessibilityNodeInfoCompatApi23.isContextClickable(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setContextClickable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatApi23.setContextClickable(obj, z);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi24Impl.class */
    static class AccessibilityNodeInfoApi24Impl extends AccessibilityNodeInfoApi23Impl {
        AccessibilityNodeInfoApi24Impl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionSetProgress() {
            return AccessibilityNodeInfoCompatApi24.getActionSetProgress();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getDrawingOrder(Object obj) {
            return AccessibilityNodeInfoCompatApi24.getDrawingOrder(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isImportantForAccessibility(Object obj) {
            return AccessibilityNodeInfoCompatApi24.isImportantForAccessibility(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setDrawingOrder(Object obj, int i) {
            AccessibilityNodeInfoCompatApi24.setDrawingOrder(obj, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setImportantForAccessibility(Object obj, boolean z) {
            AccessibilityNodeInfoCompatApi24.setImportantForAccessibility(obj, z);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoIcsImpl.class */
    static class AccessibilityNodeInfoIcsImpl extends AccessibilityNodeInfoStubImpl {
        AccessibilityNodeInfoIcsImpl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addAction(Object obj, int i) {
            AccessibilityNodeInfoCompatIcs.addAction(obj, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addChild(Object obj, View view) {
            AccessibilityNodeInfoCompatIcs.addChild(obj, view);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public List<Object> findAccessibilityNodeInfosByText(Object obj, String str) {
            return AccessibilityNodeInfoCompatIcs.findAccessibilityNodeInfosByText(obj, str);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getActions(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getActions(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void getBoundsInParent(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.getBoundsInParent(obj, rect);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void getBoundsInScreen(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.getBoundsInScreen(obj, rect);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getChild(Object obj, int i) {
            return AccessibilityNodeInfoCompatIcs.getChild(obj, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getChildCount(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getChildCount(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getClassName(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getClassName(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getContentDescription(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getContentDescription(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getPackageName(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getPackageName(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getParent(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getParent(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getText(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getText(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getWindowId(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getWindowId(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCheckable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isCheckable(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isChecked(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isChecked(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isClickable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isClickable(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isEnabled(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isEnabled(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isFocusable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isFocusable(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isFocused(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isFocused(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isLongClickable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isLongClickable(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isPassword(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isPassword(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isScrollable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isScrollable(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isSelected(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isSelected(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain() {
            return AccessibilityNodeInfoCompatIcs.obtain();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(View view) {
            return AccessibilityNodeInfoCompatIcs.obtain(view);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(Object obj) {
            return AccessibilityNodeInfoCompatIcs.obtain(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean performAction(Object obj, int i) {
            return AccessibilityNodeInfoCompatIcs.performAction(obj, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void recycle(Object obj) {
            AccessibilityNodeInfoCompatIcs.recycle(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setBoundsInParent(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.setBoundsInParent(obj, rect);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setBoundsInScreen(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.setBoundsInScreen(obj, rect);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCheckable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setCheckable(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setChecked(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setChecked(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setClassName(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setClassName(obj, charSequence);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setClickable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setClickable(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setContentDescription(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setContentDescription(obj, charSequence);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setEnabled(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setEnabled(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setFocusable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setFocusable(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setFocused(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setFocused(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLongClickable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setLongClickable(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setPackageName(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setPackageName(obj, charSequence);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setParent(Object obj, View view) {
            AccessibilityNodeInfoCompatIcs.setParent(obj, view);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setPassword(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setPassword(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setScrollable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setScrollable(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSelected(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setSelected(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSource(Object obj, View view) {
            AccessibilityNodeInfoCompatIcs.setSource(obj, view);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setText(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setText(obj, charSequence);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.class */
    interface AccessibilityNodeInfoImpl {
        void addAction(Object obj, int i);

        void addAction(Object obj, Object obj2);

        void addChild(Object obj, View view);

        void addChild(Object obj, View view, int i);

        boolean canOpenPopup(Object obj);

        List<Object> findAccessibilityNodeInfosByText(Object obj, String str);

        List<Object> findAccessibilityNodeInfosByViewId(Object obj, String str);

        Object findFocus(Object obj, int i);

        Object focusSearch(Object obj, int i);

        int getAccessibilityActionId(Object obj);

        CharSequence getAccessibilityActionLabel(Object obj);

        Object getActionContextClick();

        List<Object> getActionList(Object obj);

        Object getActionScrollDown();

        Object getActionScrollLeft();

        Object getActionScrollRight();

        Object getActionScrollToPosition();

        Object getActionScrollUp();

        Object getActionSetProgress();

        Object getActionShowOnScreen();

        int getActions(Object obj);

        void getBoundsInParent(Object obj, Rect rect);

        void getBoundsInScreen(Object obj, Rect rect);

        Object getChild(Object obj, int i);

        int getChildCount(Object obj);

        CharSequence getClassName(Object obj);

        Object getCollectionInfo(Object obj);

        int getCollectionInfoColumnCount(Object obj);

        int getCollectionInfoRowCount(Object obj);

        int getCollectionInfoSelectionMode(Object obj);

        int getCollectionItemColumnIndex(Object obj);

        int getCollectionItemColumnSpan(Object obj);

        Object getCollectionItemInfo(Object obj);

        int getCollectionItemRowIndex(Object obj);

        int getCollectionItemRowSpan(Object obj);

        CharSequence getContentDescription(Object obj);

        int getDrawingOrder(Object obj);

        CharSequence getError(Object obj);

        Bundle getExtras(Object obj);

        int getInputType(Object obj);

        Object getLabelFor(Object obj);

        Object getLabeledBy(Object obj);

        int getLiveRegion(Object obj);

        int getMaxTextLength(Object obj);

        int getMovementGranularities(Object obj);

        CharSequence getPackageName(Object obj);

        Object getParent(Object obj);

        Object getRangeInfo(Object obj);

        CharSequence getRoleDescription(Object obj);

        CharSequence getText(Object obj);

        int getTextSelectionEnd(Object obj);

        int getTextSelectionStart(Object obj);

        Object getTraversalAfter(Object obj);

        Object getTraversalBefore(Object obj);

        String getViewIdResourceName(Object obj);

        Object getWindow(Object obj);

        int getWindowId(Object obj);

        boolean isAccessibilityFocused(Object obj);

        boolean isCheckable(Object obj);

        boolean isChecked(Object obj);

        boolean isClickable(Object obj);

        boolean isCollectionInfoHierarchical(Object obj);

        boolean isCollectionItemHeading(Object obj);

        boolean isCollectionItemSelected(Object obj);

        boolean isContentInvalid(Object obj);

        boolean isContextClickable(Object obj);

        boolean isDismissable(Object obj);

        boolean isEditable(Object obj);

        boolean isEnabled(Object obj);

        boolean isFocusable(Object obj);

        boolean isFocused(Object obj);

        boolean isImportantForAccessibility(Object obj);

        boolean isLongClickable(Object obj);

        boolean isMultiLine(Object obj);

        boolean isPassword(Object obj);

        boolean isScrollable(Object obj);

        boolean isSelected(Object obj);

        boolean isVisibleToUser(Object obj);

        Object newAccessibilityAction(int i, CharSequence charSequence);

        Object obtain();

        Object obtain(View view);

        Object obtain(View view, int i);

        Object obtain(Object obj);

        Object obtainCollectionInfo(int i, int i2, boolean z);

        Object obtainCollectionInfo(int i, int i2, boolean z, int i3);

        Object obtainCollectionItemInfo(int i, int i2, int i3, int i4, boolean z);

        Object obtainCollectionItemInfo(int i, int i2, int i3, int i4, boolean z, boolean z2);

        Object obtainRangeInfo(int i, float f, float f2, float f3);

        boolean performAction(Object obj, int i);

        boolean performAction(Object obj, int i, Bundle bundle);

        void recycle(Object obj);

        boolean refresh(Object obj);

        boolean removeAction(Object obj, Object obj2);

        boolean removeChild(Object obj, View view);

        boolean removeChild(Object obj, View view, int i);

        void setAccessibilityFocused(Object obj, boolean z);

        void setBoundsInParent(Object obj, Rect rect);

        void setBoundsInScreen(Object obj, Rect rect);

        void setCanOpenPopup(Object obj, boolean z);

        void setCheckable(Object obj, boolean z);

        void setChecked(Object obj, boolean z);

        void setClassName(Object obj, CharSequence charSequence);

        void setClickable(Object obj, boolean z);

        void setCollectionInfo(Object obj, Object obj2);

        void setCollectionItemInfo(Object obj, Object obj2);

        void setContentDescription(Object obj, CharSequence charSequence);

        void setContentInvalid(Object obj, boolean z);

        void setContextClickable(Object obj, boolean z);

        void setDismissable(Object obj, boolean z);

        void setDrawingOrder(Object obj, int i);

        void setEditable(Object obj, boolean z);

        void setEnabled(Object obj, boolean z);

        void setError(Object obj, CharSequence charSequence);

        void setFocusable(Object obj, boolean z);

        void setFocused(Object obj, boolean z);

        void setImportantForAccessibility(Object obj, boolean z);

        void setInputType(Object obj, int i);

        void setLabelFor(Object obj, View view);

        void setLabelFor(Object obj, View view, int i);

        void setLabeledBy(Object obj, View view);

        void setLabeledBy(Object obj, View view, int i);

        void setLiveRegion(Object obj, int i);

        void setLongClickable(Object obj, boolean z);

        void setMaxTextLength(Object obj, int i);

        void setMovementGranularities(Object obj, int i);

        void setMultiLine(Object obj, boolean z);

        void setPackageName(Object obj, CharSequence charSequence);

        void setParent(Object obj, View view);

        void setParent(Object obj, View view, int i);

        void setPassword(Object obj, boolean z);

        void setRangeInfo(Object obj, Object obj2);

        void setRoleDescription(Object obj, CharSequence charSequence);

        void setScrollable(Object obj, boolean z);

        void setSelected(Object obj, boolean z);

        void setSource(Object obj, View view);

        void setSource(Object obj, View view, int i);

        void setText(Object obj, CharSequence charSequence);

        void setTextSelection(Object obj, int i, int i2);

        void setTraversalAfter(Object obj, View view);

        void setTraversalAfter(Object obj, View view, int i);

        void setTraversalBefore(Object obj, View view);

        void setTraversalBefore(Object obj, View view, int i);

        void setViewIdResourceName(Object obj, String str);

        void setVisibleToUser(Object obj, boolean z);
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanImpl.class */
    static class AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoIcsImpl {
        AccessibilityNodeInfoJellybeanImpl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addChild(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatJellyBean.addChild(obj, view, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object findFocus(Object obj, int i) {
            return AccessibilityNodeInfoCompatJellyBean.findFocus(obj, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object focusSearch(Object obj, int i) {
            return AccessibilityNodeInfoCompatJellyBean.focusSearch(obj, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getMovementGranularities(Object obj) {
            return AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isAccessibilityFocused(Object obj) {
            return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isVisibleToUser(Object obj) {
            return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(View view, int i) {
            return AccessibilityNodeInfoCompatJellyBean.obtain(view, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean performAction(Object obj, int i, Bundle bundle) {
            return AccessibilityNodeInfoCompatJellyBean.performAction(obj, i, bundle);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setAccessibilityFocused(Object obj, boolean z) {
            AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setMovementGranularities(Object obj, int i) {
            AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(obj, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setParent(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatJellyBean.setParent(obj, view, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSource(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatJellyBean.setSource(obj, view, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setVisibleToUser(Object obj, boolean z) {
            AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(obj, z);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanMr1Impl.class */
    static class AccessibilityNodeInfoJellybeanMr1Impl extends AccessibilityNodeInfoJellybeanImpl {
        AccessibilityNodeInfoJellybeanMr1Impl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getLabelFor(Object obj) {
            return AccessibilityNodeInfoCompatJellybeanMr1.getLabelFor(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getLabeledBy(Object obj) {
            return AccessibilityNodeInfoCompatJellybeanMr1.getLabeledBy(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLabelFor(Object obj, View view) {
            AccessibilityNodeInfoCompatJellybeanMr1.setLabelFor(obj, view);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLabelFor(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatJellybeanMr1.setLabelFor(obj, view, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLabeledBy(Object obj, View view) {
            AccessibilityNodeInfoCompatJellybeanMr1.setLabeledBy(obj, view);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLabeledBy(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatJellybeanMr1.setLabeledBy(obj, view, i);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanMr2Impl.class */
    static class AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoJellybeanMr1Impl {
        AccessibilityNodeInfoJellybeanMr2Impl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public List<Object> findAccessibilityNodeInfosByViewId(Object obj, String str) {
            return AccessibilityNodeInfoCompatJellybeanMr2.findAccessibilityNodeInfosByViewId(obj, str);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getTextSelectionEnd(Object obj) {
            return AccessibilityNodeInfoCompatJellybeanMr2.getTextSelectionEnd(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getTextSelectionStart(Object obj) {
            return AccessibilityNodeInfoCompatJellybeanMr2.getTextSelectionStart(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public String getViewIdResourceName(Object obj) {
            return AccessibilityNodeInfoCompatJellybeanMr2.getViewIdResourceName(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isEditable(Object obj) {
            return AccessibilityNodeInfoCompatJellybeanMr2.isEditable(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean refresh(Object obj) {
            return AccessibilityNodeInfoCompatJellybeanMr2.refresh(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setEditable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatJellybeanMr2.setEditable(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTextSelection(Object obj, int i, int i2) {
            AccessibilityNodeInfoCompatJellybeanMr2.setTextSelection(obj, i, i2);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setViewIdResourceName(Object obj, String str) {
            AccessibilityNodeInfoCompatJellybeanMr2.setViewIdResourceName(obj, str);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoKitKatImpl.class */
    static class AccessibilityNodeInfoKitKatImpl extends AccessibilityNodeInfoJellybeanMr2Impl {
        AccessibilityNodeInfoKitKatImpl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean canOpenPopup(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.canOpenPopup(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getCollectionInfo(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.getCollectionInfo(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionInfoColumnCount(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.CollectionInfo.getColumnCount(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionInfoRowCount(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.CollectionInfo.getRowCount(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionItemColumnIndex(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getColumnIndex(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionItemColumnSpan(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getColumnSpan(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getCollectionItemInfo(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.getCollectionItemInfo(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionItemRowIndex(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getRowIndex(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionItemRowSpan(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getRowSpan(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Bundle getExtras(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.getExtras(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getInputType(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.getInputType(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getLiveRegion(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.getLiveRegion(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getRangeInfo(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.getRangeInfo(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getRoleDescription(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.getRoleDescription(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCollectionInfoHierarchical(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.CollectionInfo.isHierarchical(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCollectionItemHeading(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.isHeading(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isContentInvalid(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.isContentInvalid(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isDismissable(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.isDismissable(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isMultiLine(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.isMultiLine(obj);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionInfo(int i, int i2, boolean z) {
            return AccessibilityNodeInfoCompatKitKat.obtainCollectionInfo(i, i2, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionInfo(int i, int i2, boolean z, int i3) {
            return AccessibilityNodeInfoCompatKitKat.obtainCollectionInfo(i, i2, z, i3);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionItemInfo(int i, int i2, int i3, int i4, boolean z) {
            return AccessibilityNodeInfoCompatKitKat.obtainCollectionItemInfo(i, i2, i3, i4, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionItemInfo(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return AccessibilityNodeInfoCompatKitKat.obtainCollectionItemInfo(i, i2, i3, i4, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainRangeInfo(int i, float f, float f2, float f3) {
            return AccessibilityNodeInfoCompatKitKat.obtainRangeInfo(i, f, f2, f3);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCanOpenPopup(Object obj, boolean z) {
            AccessibilityNodeInfoCompatKitKat.setCanOpenPopup(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCollectionInfo(Object obj, Object obj2) {
            AccessibilityNodeInfoCompatKitKat.setCollectionInfo(obj, obj2);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCollectionItemInfo(Object obj, Object obj2) {
            AccessibilityNodeInfoCompatKitKat.setCollectionItemInfo(obj, obj2);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setContentInvalid(Object obj, boolean z) {
            AccessibilityNodeInfoCompatKitKat.setContentInvalid(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setDismissable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatKitKat.setDismissable(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setInputType(Object obj, int i) {
            AccessibilityNodeInfoCompatKitKat.setInputType(obj, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLiveRegion(Object obj, int i) {
            AccessibilityNodeInfoCompatKitKat.setLiveRegion(obj, i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setMultiLine(Object obj, boolean z) {
            AccessibilityNodeInfoCompatKitKat.setMultiLine(obj, z);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setRangeInfo(Object obj, Object obj2) {
            AccessibilityNodeInfoCompatKitKat.setRangeInfo(obj, obj2);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setRoleDescription(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatKitKat.setRoleDescription(obj, charSequence);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoStubImpl.class */
    static class AccessibilityNodeInfoStubImpl implements AccessibilityNodeInfoImpl {
        AccessibilityNodeInfoStubImpl() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addAction(Object obj, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addAction(Object obj, Object obj2) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addChild(Object obj, View view) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addChild(Object obj, View view, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean canOpenPopup(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public List<Object> findAccessibilityNodeInfosByText(Object obj, String str) {
            return Collections.emptyList();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public List<Object> findAccessibilityNodeInfosByViewId(Object obj, String str) {
            return Collections.emptyList();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object findFocus(Object obj, int i) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object focusSearch(Object obj, int i) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getAccessibilityActionId(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getAccessibilityActionLabel(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionContextClick() {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public List<Object> getActionList(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollDown() {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollLeft() {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollRight() {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollToPosition() {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionScrollUp() {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionSetProgress() {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getActionShowOnScreen() {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getActions(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void getBoundsInParent(Object obj, Rect rect) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void getBoundsInScreen(Object obj, Rect rect) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getChild(Object obj, int i) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getChildCount(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getClassName(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getCollectionInfo(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionInfoColumnCount(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionInfoRowCount(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionInfoSelectionMode(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionItemColumnIndex(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionItemColumnSpan(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getCollectionItemInfo(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionItemRowIndex(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getCollectionItemRowSpan(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getContentDescription(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getDrawingOrder(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getError(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Bundle getExtras(Object obj) {
            return new Bundle();
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getInputType(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getLabelFor(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getLabeledBy(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getLiveRegion(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getMaxTextLength(Object obj) {
            return -1;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getMovementGranularities(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getPackageName(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getParent(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getRangeInfo(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getRoleDescription(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getText(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getTextSelectionEnd(Object obj) {
            return -1;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getTextSelectionStart(Object obj) {
            return -1;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getTraversalAfter(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getTraversalBefore(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public String getViewIdResourceName(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getWindow(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getWindowId(Object obj) {
            return 0;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isAccessibilityFocused(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCheckable(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isChecked(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isClickable(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCollectionInfoHierarchical(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCollectionItemHeading(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCollectionItemSelected(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isContentInvalid(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isContextClickable(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isDismissable(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isEditable(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isEnabled(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isFocusable(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isFocused(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isImportantForAccessibility(Object obj) {
            return true;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isLongClickable(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isMultiLine(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isPassword(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isScrollable(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isSelected(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isVisibleToUser(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object newAccessibilityAction(int i, CharSequence charSequence) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain() {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(View view) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(View view, int i) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(Object obj) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionInfo(int i, int i2, boolean z) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionInfo(int i, int i2, boolean z, int i3) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionItemInfo(int i, int i2, int i3, int i4, boolean z) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainCollectionItemInfo(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtainRangeInfo(int i, float f, float f2, float f3) {
            return null;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean performAction(Object obj, int i) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean performAction(Object obj, int i, Bundle bundle) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void recycle(Object obj) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean refresh(Object obj) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean removeAction(Object obj, Object obj2) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean removeChild(Object obj, View view) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean removeChild(Object obj, View view, int i) {
            return false;
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setAccessibilityFocused(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setBoundsInParent(Object obj, Rect rect) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setBoundsInScreen(Object obj, Rect rect) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCanOpenPopup(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCheckable(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setChecked(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setClassName(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setClickable(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCollectionInfo(Object obj, Object obj2) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCollectionItemInfo(Object obj, Object obj2) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setContentDescription(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setContentInvalid(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setContextClickable(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setDismissable(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setDrawingOrder(Object obj, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setEditable(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setEnabled(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setError(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setFocusable(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setFocused(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setImportantForAccessibility(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setInputType(Object obj, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLabelFor(Object obj, View view) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLabelFor(Object obj, View view, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLabeledBy(Object obj, View view) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLabeledBy(Object obj, View view, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLiveRegion(Object obj, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLongClickable(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setMaxTextLength(Object obj, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setMovementGranularities(Object obj, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setMultiLine(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setPackageName(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setParent(Object obj, View view) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setParent(Object obj, View view, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setPassword(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setRangeInfo(Object obj, Object obj2) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setRoleDescription(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setScrollable(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSelected(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSource(Object obj, View view) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSource(Object obj, View view, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setText(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTextSelection(Object obj, int i, int i2) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTraversalAfter(Object obj, View view) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTraversalAfter(Object obj, View view, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTraversalBefore(Object obj, View view) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setTraversalBefore(Object obj, View view, int i) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setViewIdResourceName(Object obj, String str) {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setVisibleToUser(Object obj, boolean z) {
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat.class */
    public static class CollectionInfoCompat {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        final Object mInfo;

        CollectionInfoCompat(Object obj) {
            this.mInfo = obj;
        }

        public static CollectionInfoCompat obtain(int i, int i2, boolean z) {
            return new CollectionInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionInfo(i, i2, z));
        }

        public static CollectionInfoCompat obtain(int i, int i2, boolean z, int i3) {
            return new CollectionInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionInfo(i, i2, z, i3));
        }

        public int getColumnCount() {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoColumnCount(this.mInfo);
        }

        public int getRowCount() {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoRowCount(this.mInfo);
        }

        public int getSelectionMode() {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoSelectionMode(this.mInfo);
        }

        public boolean isHierarchical() {
            return AccessibilityNodeInfoCompat.IMPL.isCollectionInfoHierarchical(this.mInfo);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat.class */
    public static class CollectionItemInfoCompat {
        final Object mInfo;

        CollectionItemInfoCompat(Object obj) {
            this.mInfo = obj;
        }

        public static CollectionItemInfoCompat obtain(int i, int i2, int i3, int i4, boolean z) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionItemInfo(i, i2, i3, i4, z));
        }

        public static CollectionItemInfoCompat obtain(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionItemInfo(i, i2, i3, i4, z, z2));
        }

        public int getColumnIndex() {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionItemColumnIndex(this.mInfo);
        }

        public int getColumnSpan() {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionItemColumnSpan(this.mInfo);
        }

        public int getRowIndex() {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionItemRowIndex(this.mInfo);
        }

        public int getRowSpan() {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionItemRowSpan(this.mInfo);
        }

        public boolean isHeading() {
            return AccessibilityNodeInfoCompat.IMPL.isCollectionItemHeading(this.mInfo);
        }

        public boolean isSelected() {
            return AccessibilityNodeInfoCompat.IMPL.isCollectionItemSelected(this.mInfo);
        }
    }

    /* loaded from: classes.jar:android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat.class */
    public static class RangeInfoCompat {
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        final Object mInfo;

        RangeInfoCompat(Object obj) {
            this.mInfo = obj;
        }

        public static RangeInfoCompat obtain(int i, float f, float f2, float f3) {
            return new RangeInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainRangeInfo(i, f, f2, f3));
        }

        public float getCurrent() {
            return AccessibilityNodeInfoCompatKitKat.RangeInfo.getCurrent(this.mInfo);
        }

        public float getMax() {
            return AccessibilityNodeInfoCompatKitKat.RangeInfo.getMax(this.mInfo);
        }

        public float getMin() {
            return AccessibilityNodeInfoCompatKitKat.RangeInfo.getMin(this.mInfo);
        }

        public int getType() {
            return AccessibilityNodeInfoCompatKitKat.RangeInfo.getType(this.mInfo);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            IMPL = new AccessibilityNodeInfoApi24Impl();
        } else if (Build.VERSION.SDK_INT >= 23) {
            IMPL = new AccessibilityNodeInfoApi23Impl();
        } else if (Build.VERSION.SDK_INT >= 22) {
            IMPL = new AccessibilityNodeInfoApi22Impl();
        } else if (Build.VERSION.SDK_INT >= 21) {
            IMPL = new AccessibilityNodeInfoApi21Impl();
        } else if (Build.VERSION.SDK_INT >= 19) {
            IMPL = new AccessibilityNodeInfoKitKatImpl();
        } else if (Build.VERSION.SDK_INT >= 18) {
            IMPL = new AccessibilityNodeInfoJellybeanMr2Impl();
        } else if (Build.VERSION.SDK_INT >= 17) {
            IMPL = new AccessibilityNodeInfoJellybeanMr1Impl();
        } else if (Build.VERSION.SDK_INT >= 16) {
            IMPL = new AccessibilityNodeInfoJellybeanImpl();
        } else if (Build.VERSION.SDK_INT >= 14) {
            IMPL = new AccessibilityNodeInfoIcsImpl();
        } else {
            IMPL = new AccessibilityNodeInfoStubImpl();
        }
    }

    public AccessibilityNodeInfoCompat(Object obj) {
        this.mInfo = obj;
    }

    private static String getActionSymbolicName(int i) {
        String str;
        switch (i) {
            case 1:
                str = "ACTION_FOCUS";
                break;
            case 2:
                str = "ACTION_CLEAR_FOCUS";
                break;
            case 4:
                str = "ACTION_SELECT";
                break;
            case 8:
                str = "ACTION_CLEAR_SELECTION";
                break;
            case 16:
                str = "ACTION_CLICK";
                break;
            case 32:
                str = "ACTION_LONG_CLICK";
                break;
            case 64:
                str = "ACTION_ACCESSIBILITY_FOCUS";
                break;
            case 128:
                str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                break;
            case 256:
                str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                break;
            case 512:
                str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                break;
            case 1024:
                str = "ACTION_NEXT_HTML_ELEMENT";
                break;
            case 2048:
                str = "ACTION_PREVIOUS_HTML_ELEMENT";
                break;
            case 4096:
                str = "ACTION_SCROLL_FORWARD";
                break;
            case 8192:
                str = "ACTION_SCROLL_BACKWARD";
                break;
            case 16384:
                str = "ACTION_COPY";
                break;
            case 32768:
                str = "ACTION_PASTE";
                break;
            case 65536:
                str = "ACTION_CUT";
                break;
            case 131072:
                str = "ACTION_SET_SELECTION";
                break;
            default:
                str = "ACTION_UNKNOWN";
                break;
        }
        return str;
    }

    public static AccessibilityNodeInfoCompat obtain() {
        return wrapNonNullInstance(IMPL.obtain());
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return wrapNonNullInstance(IMPL.obtain(accessibilityNodeInfoCompat.mInfo));
    }

    public static AccessibilityNodeInfoCompat obtain(View view) {
        return wrapNonNullInstance(IMPL.obtain(view));
    }

    public static AccessibilityNodeInfoCompat obtain(View view, int i) {
        return wrapNonNullInstance(IMPL.obtain(view, i));
    }

    static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj) {
        return obj != null ? new AccessibilityNodeInfoCompat(obj) : null;
    }

    public void addAction(int i) {
        IMPL.addAction(this.mInfo, i);
    }

    public void addAction(AccessibilityActionCompat accessibilityActionCompat) {
        IMPL.addAction(this.mInfo, accessibilityActionCompat.mAction);
    }

    public void addChild(View view) {
        IMPL.addChild(this.mInfo, view);
    }

    public void addChild(View view, int i) {
        IMPL.addChild(this.mInfo, view, i);
    }

    public boolean canOpenPopup() {
        return IMPL.canOpenPopup(this.mInfo);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null) {
                z = false;
            } else if (getClass() != obj.getClass()) {
                z = false;
            } else {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
                if (this.mInfo == null) {
                    if (accessibilityNodeInfoCompat.mInfo != null) {
                        z = false;
                    }
                } else if (!this.mInfo.equals(accessibilityNodeInfoCompat.mInfo)) {
                    z = false;
                }
            }
        }
        return z;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String str) {
        ArrayList arrayList = new ArrayList();
        List<Object> findAccessibilityNodeInfosByText = IMPL.findAccessibilityNodeInfosByText(this.mInfo, str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new AccessibilityNodeInfoCompat(findAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(String str) {
        ArrayList arrayList;
        List<Object> findAccessibilityNodeInfosByViewId = IMPL.findAccessibilityNodeInfosByViewId(this.mInfo, str);
        if (findAccessibilityNodeInfosByViewId != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Object> it = findAccessibilityNodeInfosByViewId.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                arrayList2.add(new AccessibilityNodeInfoCompat(it.next()));
            }
        } else {
            arrayList = Collections.emptyList();
        }
        return arrayList;
    }

    public AccessibilityNodeInfoCompat findFocus(int i) {
        return wrapNonNullInstance(IMPL.findFocus(this.mInfo, i));
    }

    public AccessibilityNodeInfoCompat focusSearch(int i) {
        return wrapNonNullInstance(IMPL.focusSearch(this.mInfo, i));
    }

    public List<AccessibilityActionCompat> getActionList() {
        ArrayList arrayList;
        List<Object> actionList = IMPL.getActionList(this.mInfo);
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            int i = 0;
            while (true) {
                arrayList = arrayList2;
                if (i >= size) {
                    break;
                }
                arrayList2.add(new AccessibilityActionCompat(actionList.get(i)));
                i++;
            }
        } else {
            arrayList = Collections.emptyList();
        }
        return arrayList;
    }

    public int getActions() {
        return IMPL.getActions(this.mInfo);
    }

    public void getBoundsInParent(Rect rect) {
        IMPL.getBoundsInParent(this.mInfo, rect);
    }

    public void getBoundsInScreen(Rect rect) {
        IMPL.getBoundsInScreen(this.mInfo, rect);
    }

    public AccessibilityNodeInfoCompat getChild(int i) {
        return wrapNonNullInstance(IMPL.getChild(this.mInfo, i));
    }

    public int getChildCount() {
        return IMPL.getChildCount(this.mInfo);
    }

    public CharSequence getClassName() {
        return IMPL.getClassName(this.mInfo);
    }

    public CollectionInfoCompat getCollectionInfo() {
        Object collectionInfo = IMPL.getCollectionInfo(this.mInfo);
        return collectionInfo == null ? null : new CollectionInfoCompat(collectionInfo);
    }

    public CollectionItemInfoCompat getCollectionItemInfo() {
        Object collectionItemInfo = IMPL.getCollectionItemInfo(this.mInfo);
        return collectionItemInfo == null ? null : new CollectionItemInfoCompat(collectionItemInfo);
    }

    public CharSequence getContentDescription() {
        return IMPL.getContentDescription(this.mInfo);
    }

    public int getDrawingOrder() {
        return IMPL.getDrawingOrder(this.mInfo);
    }

    public CharSequence getError() {
        return IMPL.getError(this.mInfo);
    }

    public Bundle getExtras() {
        return IMPL.getExtras(this.mInfo);
    }

    public Object getInfo() {
        return this.mInfo;
    }

    public int getInputType() {
        return IMPL.getInputType(this.mInfo);
    }

    public AccessibilityNodeInfoCompat getLabelFor() {
        return wrapNonNullInstance(IMPL.getLabelFor(this.mInfo));
    }

    public AccessibilityNodeInfoCompat getLabeledBy() {
        return wrapNonNullInstance(IMPL.getLabeledBy(this.mInfo));
    }

    public int getLiveRegion() {
        return IMPL.getLiveRegion(this.mInfo);
    }

    public int getMaxTextLength() {
        return IMPL.getMaxTextLength(this.mInfo);
    }

    public int getMovementGranularities() {
        return IMPL.getMovementGranularities(this.mInfo);
    }

    public CharSequence getPackageName() {
        return IMPL.getPackageName(this.mInfo);
    }

    public AccessibilityNodeInfoCompat getParent() {
        return wrapNonNullInstance(IMPL.getParent(this.mInfo));
    }

    public RangeInfoCompat getRangeInfo() {
        Object rangeInfo = IMPL.getRangeInfo(this.mInfo);
        return rangeInfo == null ? null : new RangeInfoCompat(rangeInfo);
    }

    @Nullable
    public CharSequence getRoleDescription() {
        return IMPL.getRoleDescription(this.mInfo);
    }

    public CharSequence getText() {
        return IMPL.getText(this.mInfo);
    }

    public int getTextSelectionEnd() {
        return IMPL.getTextSelectionEnd(this.mInfo);
    }

    public int getTextSelectionStart() {
        return IMPL.getTextSelectionStart(this.mInfo);
    }

    public AccessibilityNodeInfoCompat getTraversalAfter() {
        return wrapNonNullInstance(IMPL.getTraversalAfter(this.mInfo));
    }

    public AccessibilityNodeInfoCompat getTraversalBefore() {
        return wrapNonNullInstance(IMPL.getTraversalBefore(this.mInfo));
    }

    public String getViewIdResourceName() {
        return IMPL.getViewIdResourceName(this.mInfo);
    }

    public AccessibilityWindowInfoCompat getWindow() {
        return AccessibilityWindowInfoCompat.wrapNonNullInstance(IMPL.getWindow(this.mInfo));
    }

    public int getWindowId() {
        return IMPL.getWindowId(this.mInfo);
    }

    public int hashCode() {
        return this.mInfo == null ? 0 : this.mInfo.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return IMPL.isAccessibilityFocused(this.mInfo);
    }

    public boolean isCheckable() {
        return IMPL.isCheckable(this.mInfo);
    }

    public boolean isChecked() {
        return IMPL.isChecked(this.mInfo);
    }

    public boolean isClickable() {
        return IMPL.isClickable(this.mInfo);
    }

    public boolean isContentInvalid() {
        return IMPL.isContentInvalid(this.mInfo);
    }

    public boolean isContextClickable() {
        return IMPL.isContextClickable(this.mInfo);
    }

    public boolean isDismissable() {
        return IMPL.isDismissable(this.mInfo);
    }

    public boolean isEditable() {
        return IMPL.isEditable(this.mInfo);
    }

    public boolean isEnabled() {
        return IMPL.isEnabled(this.mInfo);
    }

    public boolean isFocusable() {
        return IMPL.isFocusable(this.mInfo);
    }

    public boolean isFocused() {
        return IMPL.isFocused(this.mInfo);
    }

    public boolean isImportantForAccessibility() {
        return IMPL.isImportantForAccessibility(this.mInfo);
    }

    public boolean isLongClickable() {
        return IMPL.isLongClickable(this.mInfo);
    }

    public boolean isMultiLine() {
        return IMPL.isMultiLine(this.mInfo);
    }

    public boolean isPassword() {
        return IMPL.isPassword(this.mInfo);
    }

    public boolean isScrollable() {
        return IMPL.isScrollable(this.mInfo);
    }

    public boolean isSelected() {
        return IMPL.isSelected(this.mInfo);
    }

    public boolean isVisibleToUser() {
        return IMPL.isVisibleToUser(this.mInfo);
    }

    public boolean performAction(int i) {
        return IMPL.performAction(this.mInfo, i);
    }

    public boolean performAction(int i, Bundle bundle) {
        return IMPL.performAction(this.mInfo, i, bundle);
    }

    public void recycle() {
        IMPL.recycle(this.mInfo);
    }

    public boolean refresh() {
        return IMPL.refresh(this.mInfo);
    }

    public boolean removeAction(AccessibilityActionCompat accessibilityActionCompat) {
        return IMPL.removeAction(this.mInfo, accessibilityActionCompat.mAction);
    }

    public boolean removeChild(View view) {
        return IMPL.removeChild(this.mInfo, view);
    }

    public boolean removeChild(View view, int i) {
        return IMPL.removeChild(this.mInfo, view, i);
    }

    public void setAccessibilityFocused(boolean z) {
        IMPL.setAccessibilityFocused(this.mInfo, z);
    }

    public void setBoundsInParent(Rect rect) {
        IMPL.setBoundsInParent(this.mInfo, rect);
    }

    public void setBoundsInScreen(Rect rect) {
        IMPL.setBoundsInScreen(this.mInfo, rect);
    }

    public void setCanOpenPopup(boolean z) {
        IMPL.setCanOpenPopup(this.mInfo, z);
    }

    public void setCheckable(boolean z) {
        IMPL.setCheckable(this.mInfo, z);
    }

    public void setChecked(boolean z) {
        IMPL.setChecked(this.mInfo, z);
    }

    public void setClassName(CharSequence charSequence) {
        IMPL.setClassName(this.mInfo, charSequence);
    }

    public void setClickable(boolean z) {
        IMPL.setClickable(this.mInfo, z);
    }

    public void setCollectionInfo(Object obj) {
        IMPL.setCollectionInfo(this.mInfo, ((CollectionInfoCompat) obj).mInfo);
    }

    public void setCollectionItemInfo(Object obj) {
        IMPL.setCollectionItemInfo(this.mInfo, ((CollectionItemInfoCompat) obj).mInfo);
    }

    public void setContentDescription(CharSequence charSequence) {
        IMPL.setContentDescription(this.mInfo, charSequence);
    }

    public void setContentInvalid(boolean z) {
        IMPL.setContentInvalid(this.mInfo, z);
    }

    public void setContextClickable(boolean z) {
        IMPL.setContextClickable(this.mInfo, z);
    }

    public void setDismissable(boolean z) {
        IMPL.setDismissable(this.mInfo, z);
    }

    public void setDrawingOrder(int i) {
        IMPL.setDrawingOrder(this.mInfo, i);
    }

    public void setEditable(boolean z) {
        IMPL.setEditable(this.mInfo, z);
    }

    public void setEnabled(boolean z) {
        IMPL.setEnabled(this.mInfo, z);
    }

    public void setError(CharSequence charSequence) {
        IMPL.setError(this.mInfo, charSequence);
    }

    public void setFocusable(boolean z) {
        IMPL.setFocusable(this.mInfo, z);
    }

    public void setFocused(boolean z) {
        IMPL.setFocused(this.mInfo, z);
    }

    public void setImportantForAccessibility(boolean z) {
        IMPL.setImportantForAccessibility(this.mInfo, z);
    }

    public void setInputType(int i) {
        IMPL.setInputType(this.mInfo, i);
    }

    public void setLabelFor(View view) {
        IMPL.setLabelFor(this.mInfo, view);
    }

    public void setLabelFor(View view, int i) {
        IMPL.setLabelFor(this.mInfo, view, i);
    }

    public void setLabeledBy(View view) {
        IMPL.setLabeledBy(this.mInfo, view);
    }

    public void setLabeledBy(View view, int i) {
        IMPL.setLabeledBy(this.mInfo, view, i);
    }

    public void setLiveRegion(int i) {
        IMPL.setLiveRegion(this.mInfo, i);
    }

    public void setLongClickable(boolean z) {
        IMPL.setLongClickable(this.mInfo, z);
    }

    public void setMaxTextLength(int i) {
        IMPL.setMaxTextLength(this.mInfo, i);
    }

    public void setMovementGranularities(int i) {
        IMPL.setMovementGranularities(this.mInfo, i);
    }

    public void setMultiLine(boolean z) {
        IMPL.setMultiLine(this.mInfo, z);
    }

    public void setPackageName(CharSequence charSequence) {
        IMPL.setPackageName(this.mInfo, charSequence);
    }

    public void setParent(View view) {
        IMPL.setParent(this.mInfo, view);
    }

    public void setParent(View view, int i) {
        this.mParentVirtualDescendantId = i;
        IMPL.setParent(this.mInfo, view, i);
    }

    public void setPassword(boolean z) {
        IMPL.setPassword(this.mInfo, z);
    }

    public void setRangeInfo(RangeInfoCompat rangeInfoCompat) {
        IMPL.setRangeInfo(this.mInfo, rangeInfoCompat.mInfo);
    }

    public void setRoleDescription(@Nullable CharSequence charSequence) {
        IMPL.setRoleDescription(this.mInfo, charSequence);
    }

    public void setScrollable(boolean z) {
        IMPL.setScrollable(this.mInfo, z);
    }

    public void setSelected(boolean z) {
        IMPL.setSelected(this.mInfo, z);
    }

    public void setSource(View view) {
        IMPL.setSource(this.mInfo, view);
    }

    public void setSource(View view, int i) {
        IMPL.setSource(this.mInfo, view, i);
    }

    public void setText(CharSequence charSequence) {
        IMPL.setText(this.mInfo, charSequence);
    }

    public void setTextSelection(int i, int i2) {
        IMPL.setTextSelection(this.mInfo, i, i2);
    }

    public void setTraversalAfter(View view) {
        IMPL.setTraversalAfter(this.mInfo, view);
    }

    public void setTraversalAfter(View view, int i) {
        IMPL.setTraversalAfter(this.mInfo, view, i);
    }

    public void setTraversalBefore(View view) {
        IMPL.setTraversalBefore(this.mInfo, view);
    }

    public void setTraversalBefore(View view, int i) {
        IMPL.setTraversalBefore(this.mInfo, view, i);
    }

    public void setViewIdResourceName(String str) {
        IMPL.setViewIdResourceName(this.mInfo, str);
    }

    public void setVisibleToUser(boolean z) {
        IMPL.setVisibleToUser(this.mInfo, z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(getPackageName());
        sb.append("; className: ").append(getClassName());
        sb.append("; text: ").append(getText());
        sb.append("; contentDescription: ").append(getContentDescription());
        sb.append("; viewId: ").append(getViewIdResourceName());
        sb.append("; checkable: ").append(isCheckable());
        sb.append("; checked: ").append(isChecked());
        sb.append("; focusable: ").append(isFocusable());
        sb.append("; focused: ").append(isFocused());
        sb.append("; selected: ").append(isSelected());
        sb.append("; clickable: ").append(isClickable());
        sb.append("; longClickable: ").append(isLongClickable());
        sb.append("; enabled: ").append(isEnabled());
        sb.append("; password: ").append(isPassword());
        sb.append("; scrollable: " + isScrollable());
        sb.append("; [");
        int actions = getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            int i = actions & (numberOfTrailingZeros ^ (-1));
            sb.append(getActionSymbolicName(numberOfTrailingZeros));
            actions = i;
            if (i != 0) {
                sb.append(", ");
                actions = i;
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
