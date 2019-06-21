package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.xweb.w;
import com.tencent.xweb.xwalk.b;

final class AppBrandXWebDownloadProxyUI$a
  implements b
{
  boolean iJD = false;

  private AppBrandXWebDownloadProxyUI$a(AppBrandXWebDownloadProxyUI paramAppBrandXWebDownloadProxyUI)
  {
  }

  public final void aMA()
  {
    AppMethodBeat.i(133181);
    AppBrandXWebDownloadProxyUI.c(this.iJB);
    w.a(AppBrandXWebDownloadProxyUI.d(this.iJB));
    Intent localIntent = new Intent();
    this.iJB.setResult(0, localIntent);
    this.iJB.finish();
    AppMethodBeat.o(133181);
  }

  public final void aMB()
  {
    AppMethodBeat.i(133182);
    AppBrandXWebDownloadProxyUI.c(this.iJB);
    w.a(AppBrandXWebDownloadProxyUI.d(this.iJB));
    Intent localIntent = new Intent();
    this.iJB.setResult(-1, localIntent);
    this.iJB.finish();
    AppMethodBeat.o(133182);
  }

  public final boolean aMy()
  {
    AppMethodBeat.i(133178);
    this.iJD = true;
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(133176);
        ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "start download : showDialog");
        AppBrandXWebDownloadProxyUI.b(AppBrandXWebDownloadProxyUI.a.this.iJB);
        AppMethodBeat.o(133176);
      }
    });
    AppMethodBeat.o(133178);
    return true;
  }

  public final void aMz()
  {
    AppMethodBeat.i(133180);
    AppBrandXWebDownloadProxyUI.c(this.iJB);
    w.a(AppBrandXWebDownloadProxyUI.d(this.iJB));
    Intent localIntent = new Intent();
    this.iJB.setResult(0, localIntent);
    this.iJB.finish();
    AppMethodBeat.o(133180);
  }

  public final void pP(int paramInt)
  {
    AppMethodBeat.i(133179);
    if (!this.iJD)
      AppMethodBeat.o(133179);
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "onDownloadProgress, percent = %d", new Object[] { Integer.valueOf(paramInt) });
      if (this.iJB.tipDialog != null)
        al.d(new AppBrandXWebDownloadProxyUI.a.2(this, paramInt));
      AppMethodBeat.o(133179);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI.a
 * JD-Core Version:    0.6.2
 */