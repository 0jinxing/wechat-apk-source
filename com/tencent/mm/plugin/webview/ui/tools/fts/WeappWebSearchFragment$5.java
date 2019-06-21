package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class WeappWebSearchFragment$5
  implements Runnable
{
  WeappWebSearchFragment$5(WeappWebSearchFragment paramWeappWebSearchFragment, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8613);
    if (this.uCQ.getJsapi() != null)
      this.uCQ.getJsapi().bH(this.rcK, this.hvS);
    AppMethodBeat.o(8613);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.WeappWebSearchFragment.5
 * JD-Core Version:    0.6.2
 */