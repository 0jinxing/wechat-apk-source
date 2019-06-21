package android.support.design.widget;

import android.os.Build.VERSION;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.List;

final class TextInputLayout$a extends a
{
  TextInputLayout$a(TextInputLayout paramTextInputLayout)
  {
  }

  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    paramb.setClassName(TextInputLayout.class.getSimpleName());
    paramView = this.tS.oU.mText;
    if (!TextUtils.isEmpty(paramView))
      paramb.setText(paramView);
    if (this.tS.tc != null)
    {
      paramView = this.tS.tc;
      if (Build.VERSION.SDK_INT >= 17)
        paramb.NG.setLabelFor(paramView);
    }
    if (this.tS.tm != null);
    for (paramView = this.tS.tm.getText(); ; paramView = null)
    {
      if (!TextUtils.isEmpty(paramView))
      {
        if (Build.VERSION.SDK_INT >= 19)
          paramb.NG.setContentInvalid(true);
        if (Build.VERSION.SDK_INT >= 21)
          paramb.NG.setError(paramView);
      }
      return;
    }
  }

  public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramView = this.tS.oU.mText;
    if (!TextUtils.isEmpty(paramView))
      paramAccessibilityEvent.getText().add(paramView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TextInputLayout.a
 * JD-Core Version:    0.6.2
 */