package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandXWebDownloadProxyUI$2
  implements Runnable
{
  AppBrandXWebDownloadProxyUI$2(AppBrandXWebDownloadProxyUI paramAppBrandXWebDownloadProxyUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133171);
    AppBrandXWebDownloadProxyUI.aMx();
    Intent localIntent = new Intent();
    this.iJB.setResult(0, localIntent);
    this.iJB.finish();
    AppMethodBeat.o(133171);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI.2
 * JD-Core Version:    0.6.2
 */