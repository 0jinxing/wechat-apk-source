package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.x;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class BaseSearchWebViewUI$4
  implements x
{
  BaseSearchWebViewUI$4(BaseSearchWebViewUI paramBaseSearchWebViewUI)
  {
  }

  public final void go(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(8382);
    if (this.uAS.getJsapi() != null)
      this.uAS.getJsapi().gA(paramInt1, paramInt2);
    AppMethodBeat.o(8382);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.4
 * JD-Core Version:    0.6.2
 */