package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.z;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class BaseSearchWebViewUI$1
  implements d.a
{
  BaseSearchWebViewUI$1(BaseSearchWebViewUI paramBaseSearchWebViewUI)
  {
  }

  public final void onReady()
  {
    AppMethodBeat.i(8379);
    BaseSearchWebViewUI.a(this.uAS);
    ab.d("BaseSearchWebViewUI", "jsapi ready");
    z.cUX();
    AppMethodBeat.o(8379);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.1
 * JD-Core Version:    0.6.2
 */