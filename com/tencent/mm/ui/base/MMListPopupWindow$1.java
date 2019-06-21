package com.tencent.mm.ui.base;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMListPopupWindow$1
  implements Runnable
{
  MMListPopupWindow$1(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112505);
    View localView = this.yvN.amx;
    if ((localView != null) && (localView.getWindowToken() != null))
      this.yvN.show();
    AppMethodBeat.o(112505);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMListPopupWindow.1
 * JD-Core Version:    0.6.2
 */