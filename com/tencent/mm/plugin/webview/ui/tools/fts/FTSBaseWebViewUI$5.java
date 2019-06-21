package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.platformtools.ab;

final class FTSBaseWebViewUI$5
  implements Runnable
{
  FTSBaseWebViewUI$5(FTSBaseWebViewUI paramFTSBaseWebViewUI, int paramInt, long paramLong, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8388);
    if (FTSBaseWebViewUI.z(this.uAU) != null)
    {
      FTSBaseWebViewUI.A(this.uAU).a(this.rcK, this.uAE, this.kjc);
      ab.i("MicroMsg.FTS.FTSBaseWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", new Object[] { Integer.valueOf(this.rcK), Long.valueOf(this.uAE), this.kjc });
    }
    AppMethodBeat.o(8388);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.5
 * JD-Core Version:    0.6.2
 */