package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class WeappWebSearchFragment$2
  implements Runnable
{
  WeappWebSearchFragment$2(WeappWebSearchFragment paramWeappWebSearchFragment, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8610);
    if (this.uCQ.getJsapi() != null)
      this.uCQ.getJsapi().m(this.iIA, this.iIB, this.iIC, this.iID);
    AppMethodBeat.o(8610);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.WeappWebSearchFragment.2
 * JD-Core Version:    0.6.2
 */