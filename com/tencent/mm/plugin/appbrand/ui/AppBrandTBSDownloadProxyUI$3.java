package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandTBSDownloadProxyUI$3
  implements Runnable
{
  AppBrandTBSDownloadProxyUI$3(AppBrandTBSDownloadProxyUI paramAppBrandTBSDownloadProxyUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133101);
    AppBrandTBSDownloadProxyUI.aMr();
    Intent localIntent = new Intent();
    this.iIJ.setResult(0, localIntent);
    this.iIJ.finish();
    AppMethodBeat.o(133101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI.3
 * JD-Core Version:    0.6.2
 */