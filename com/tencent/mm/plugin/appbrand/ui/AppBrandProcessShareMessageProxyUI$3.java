package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.i.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class AppBrandProcessShareMessageProxyUI$3
  implements i.b
{
  AppBrandProcessShareMessageProxyUI$3(AppBrandProcessShareMessageProxyUI paramAppBrandProcessShareMessageProxyUI, AppBrandProcessShareMessageProxyUI.c paramc)
  {
  }

  public final void kQ(int paramInt)
  {
    AppMethodBeat.i(133011);
    ab.i("MicroMsg.AppBrandProcessShareMessageProxyUI", "onLoadImageResult, result:%d", new Object[] { Integer.valueOf(paramInt) });
    AppBrandProcessShareMessageProxyUI.c localc = this.iHi;
    localc.iHk = true;
    if (localc.oC())
    {
      al.af(localc.hEw);
      localc.aMl();
    }
    AppMethodBeat.o(133011);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI.3
 * JD-Core Version:    0.6.2
 */