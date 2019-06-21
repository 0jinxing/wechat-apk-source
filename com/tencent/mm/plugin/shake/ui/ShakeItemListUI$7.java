package com.tencent.mm.plugin.shake.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.applet.b;

final class ShakeItemListUI$7
  implements View.OnTouchListener
{
  ShakeItemListUI$7(ShakeItemListUI paramShakeItemListUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(24726);
    if (ShakeItemListUI.b(this.quC) != null)
    {
      paramView = ShakeItemListUI.b(this.quC);
      if (paramView.gvm != null)
        paramView.gvm.onTouchEvent(paramMotionEvent);
    }
    AppMethodBeat.o(24726);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeItemListUI.7
 * JD-Core Version:    0.6.2
 */