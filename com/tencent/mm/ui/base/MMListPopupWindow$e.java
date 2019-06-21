package com.tencent.mm.ui.base;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMListPopupWindow$e
  implements View.OnTouchListener
{
  private MMListPopupWindow$e(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(112518);
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (MMListPopupWindow.b(this.yvN) != null) && (MMListPopupWindow.b(this.yvN).isShowing()) && (j >= 0) && (j < MMListPopupWindow.b(this.yvN).getWidth()) && (k >= 0) && (k < MMListPopupWindow.b(this.yvN).getHeight()))
      MMListPopupWindow.d(this.yvN).postDelayed(MMListPopupWindow.c(this.yvN), 250L);
    while (true)
    {
      AppMethodBeat.o(112518);
      return false;
      if (i == 1)
        MMListPopupWindow.d(this.yvN).removeCallbacks(MMListPopupWindow.c(this.yvN));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMListPopupWindow.e
 * JD-Core Version:    0.6.2
 */