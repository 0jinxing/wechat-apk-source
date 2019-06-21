package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandTBSDownloadProxyUI$2$1
  implements Runnable
{
  AppBrandTBSDownloadProxyUI$2$1(AppBrandTBSDownloadProxyUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133099);
    ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onNeedDownloadFinish : showDialog");
    AppBrandTBSDownloadProxyUI.a(this.iIK.iIJ);
    AppMethodBeat.o(133099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI.2.1
 * JD-Core Version:    0.6.2
 */