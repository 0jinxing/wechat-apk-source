package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class WeappWebSearchFragment$6
  implements Runnable
{
  WeappWebSearchFragment$6(WeappWebSearchFragment paramWeappWebSearchFragment, int paramInt1, String paramString, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8614);
    if (this.uCQ.getJsapi() != null)
      this.uCQ.getJsapi().n(this.uAC, this.iIA, this.iIB);
    AppMethodBeat.o(8614);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.WeappWebSearchFragment.6
 * JD-Core Version:    0.6.2
 */