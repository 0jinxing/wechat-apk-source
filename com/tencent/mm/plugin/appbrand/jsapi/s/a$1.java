package com.tencent.mm.plugin.appbrand.jsapi.s;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class a$1 extends View.AccessibilityDelegate
{
  a$1(String paramString1, String paramString2)
  {
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AppMethodBeat.i(91065);
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfo);
    if (!bo.isNullOrNil(this.ibr))
      paramAccessibilityNodeInfo.setContentDescription(this.ibr);
    if ((!bo.isNullOrNil(this.ibs)) && (this.ibs.equalsIgnoreCase("button")))
    {
      paramAccessibilityNodeInfo.setClickable(true);
      paramAccessibilityNodeInfo.setClassName(Button.class.getName());
      AppMethodBeat.o(91065);
    }
    while (true)
    {
      return;
      paramAccessibilityNodeInfo.setClickable(false);
      paramAccessibilityNodeInfo.setClassName(TextView.class.getName());
      AppMethodBeat.o(91065);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.s.a.1
 * JD-Core Version:    0.6.2
 */