package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class AppBrandSearchUI$2
  implements Runnable
{
  AppBrandSearchUI$2(AppBrandSearchUI paramAppBrandSearchUI, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17082);
    if (AppBrandSearchUI.b(this.iIz) != null)
      AppBrandSearchUI.c(this.iIz).m(this.iIA, this.iIB, this.iIC, this.iID);
    AppMethodBeat.o(17082);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI.2
 * JD-Core Version:    0.6.2
 */