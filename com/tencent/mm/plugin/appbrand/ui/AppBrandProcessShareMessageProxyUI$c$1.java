package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class AppBrandProcessShareMessageProxyUI$c$1
  implements Runnable
{
  AppBrandProcessShareMessageProxyUI$c$1(AppBrandProcessShareMessageProxyUI.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133017);
    if (this.iHo.tipDialog != null)
      this.iHo.tipDialog.dismiss();
    this.iHo.aMl();
    AppMethodBeat.o(133017);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI.c.1
 * JD-Core Version:    0.6.2
 */