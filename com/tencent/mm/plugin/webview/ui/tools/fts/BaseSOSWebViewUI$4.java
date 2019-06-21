package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class BaseSOSWebViewUI$4
  implements Runnable
{
  BaseSOSWebViewUI$4(BaseSOSWebViewUI paramBaseSOSWebViewUI, Bundle paramBundle, String paramString1, boolean paramBoolean, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8334);
    if (this.uAz.getJsapi() != null)
      if ((this.uAA != null) && (this.uAA.getInt("isRefresh") == 1) && (this.uAA.getString("widgetId") != null))
      {
        this.uAz.getJsapi().hj(this.uAA.getString("widgetId"), this.iIA);
        AppMethodBeat.o(8334);
      }
    while (true)
    {
      return;
      this.uAz.getJsapi().h(this.iIA, this.uAB, this.ufX);
      AppMethodBeat.o(8334);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.4
 * JD-Core Version:    0.6.2
 */