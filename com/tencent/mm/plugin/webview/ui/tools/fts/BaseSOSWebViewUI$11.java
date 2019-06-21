package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.platformtools.ab;

final class BaseSOSWebViewUI$11
  implements Runnable
{
  BaseSOSWebViewUI$11(BaseSOSWebViewUI paramBaseSOSWebViewUI, int paramInt, long paramLong, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8341);
    if (BaseSOSWebViewUI.d(this.uAz) != null)
    {
      BaseSOSWebViewUI.e(this.uAz).a(this.rcK, this.uAE, this.kjc);
      ab.i("MicroMsg.FTS.BaseSOSWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", new Object[] { Integer.valueOf(this.rcK), Long.valueOf(this.uAE), this.kjc });
    }
    AppMethodBeat.o(8341);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.11
 * JD-Core Version:    0.6.2
 */