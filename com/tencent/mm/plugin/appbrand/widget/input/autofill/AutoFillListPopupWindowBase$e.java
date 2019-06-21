package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class AutoFillListPopupWindowBase$e
  implements View.OnTouchListener
{
  private AutoFillListPopupWindowBase$e(AutoFillListPopupWindowBase paramAutoFillListPopupWindowBase)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(123920);
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (AutoFillListPopupWindowBase.b(this.jib) != null) && (AutoFillListPopupWindowBase.b(this.jib).isShowing()) && (j >= 0) && (j < AutoFillListPopupWindowBase.b(this.jib).getWidth()) && (k >= 0) && (k < AutoFillListPopupWindowBase.b(this.jib).getHeight()))
      AutoFillListPopupWindowBase.d(this.jib).postDelayed(AutoFillListPopupWindowBase.c(this.jib), 250L);
    while (true)
    {
      AppMethodBeat.o(123920);
      return false;
      if (i == 1)
        AutoFillListPopupWindowBase.d(this.jib).removeCallbacks(AutoFillListPopupWindowBase.c(this.jib));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase.e
 * JD-Core Version:    0.6.2
 */