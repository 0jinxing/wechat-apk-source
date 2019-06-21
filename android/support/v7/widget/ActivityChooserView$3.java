package android.support.v7.widget;

import android.os.Build.VERSION;
import android.support.v4.view.a.b;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;

final class ActivityChooserView$3 extends View.AccessibilityDelegate
{
  ActivityChooserView$3(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfo);
    paramView = b.a(paramAccessibilityNodeInfo);
    if (Build.VERSION.SDK_INT >= 19)
      paramView.NG.setCanOpenPopup(true);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActivityChooserView.3
 * JD-Core Version:    0.6.2
 */