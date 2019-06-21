package com.tencent.mm.plugin.ipcall.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallFuncButton$1
  implements View.OnTouchListener
{
  IPCallFuncButton$1(IPCallFuncButton paramIPCallFuncButton)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(22180);
    if (!IPCallFuncButton.a(this.nDo))
    {
      AppMethodBeat.o(22180);
      return false;
    }
    if (paramMotionEvent.getAction() == 0)
      if (!IPCallFuncButton.b(this.nDo))
        if (IPCallFuncButton.c(this.nDo) != null)
          IPCallFuncButton.d(this.nDo).setImageDrawable(IPCallFuncButton.c(this.nDo));
    while (true)
    {
      AppMethodBeat.o(22180);
      break;
      if (IPCallFuncButton.e(this.nDo))
      {
        IPCallFuncButton.d(this.nDo).setImageDrawable(IPCallFuncButton.f(this.nDo));
        IPCallFuncButton.a(this.nDo, false);
      }
      while (true)
      {
        if (IPCallFuncButton.g(this.nDo) == null)
          break label172;
        IPCallFuncButton.g(this.nDo).iv(IPCallFuncButton.e(this.nDo));
        break;
        IPCallFuncButton.d(this.nDo).setImageDrawable(IPCallFuncButton.c(this.nDo));
        IPCallFuncButton.a(this.nDo, true);
      }
      label172: continue;
      if (((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1)) && (!IPCallFuncButton.b(this.nDo)))
      {
        if (IPCallFuncButton.f(this.nDo) != null)
          IPCallFuncButton.d(this.nDo).setImageDrawable(IPCallFuncButton.f(this.nDo));
        if (IPCallFuncButton.g(this.nDo) != null)
          IPCallFuncButton.g(this.nDo).iv(false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton.1
 * JD-Core Version:    0.6.2
 */