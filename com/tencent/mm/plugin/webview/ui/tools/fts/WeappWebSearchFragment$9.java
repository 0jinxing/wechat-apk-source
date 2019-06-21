package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.x;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class WeappWebSearchFragment$9
  implements x
{
  WeappWebSearchFragment$9(WeappWebSearchFragment paramWeappWebSearchFragment)
  {
  }

  public final void go(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(8617);
    if (this.uCQ.getJsapi() != null)
      this.uCQ.getJsapi().gA(paramInt1, paramInt2);
    AppMethodBeat.o(8617);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.WeappWebSearchFragment.9
 * JD-Core Version:    0.6.2
 */