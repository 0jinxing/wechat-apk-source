package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class WeappWebSearchFragment$8
  implements Runnable
{
  WeappWebSearchFragment$8(WeappWebSearchFragment paramWeappWebSearchFragment, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8616);
    if (this.uCQ.getJsapi() != null)
      this.uCQ.getJsapi().dN(this.uAD, this.fTG);
    AppMethodBeat.o(8616);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.WeappWebSearchFragment.8
 * JD-Core Version:    0.6.2
 */