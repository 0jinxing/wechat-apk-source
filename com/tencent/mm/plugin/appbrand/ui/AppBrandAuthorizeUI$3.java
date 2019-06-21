package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class AppBrandAuthorizeUI$3
  implements Runnable
{
  AppBrandAuthorizeUI$3(AppBrandAuthorizeUI paramAppBrandAuthorizeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132894);
    if ((AppBrandAuthorizeUI.f(this.iFJ) != null) && (AppBrandAuthorizeUI.f(this.iFJ).isShowing()))
      AppBrandAuthorizeUI.f(this.iFJ).dismiss();
    AppMethodBeat.o(132894);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.3
 * JD-Core Version:    0.6.2
 */