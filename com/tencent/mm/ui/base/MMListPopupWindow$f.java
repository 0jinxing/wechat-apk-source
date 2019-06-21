package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMListPopupWindow$f
  implements Runnable
{
  private MMListPopupWindow$f(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112519);
    if ((MMListPopupWindow.a(this.yvN) != null) && (MMListPopupWindow.a(this.yvN).getCount() > MMListPopupWindow.a(this.yvN).getChildCount()) && (MMListPopupWindow.a(this.yvN).getChildCount() <= this.yvN.amu))
    {
      MMListPopupWindow.b(this.yvN).setInputMethodMode(2);
      this.yvN.show();
    }
    AppMethodBeat.o(112519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMListPopupWindow.f
 * JD-Core Version:    0.6.2
 */