package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.sdk.platformtools.al;

final class AppBrandProfileUI$4
  implements Runnable
{
  AppBrandProfileUI$4(AppBrandProfileUI paramAppBrandProfileUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133029);
    al.d(new AppBrandProfileUI.4.1(this, p.zh(AppBrandProfileUI.d(this.iIf)), p.zk(AppBrandProfileUI.d(this.iIf))));
    if (this.iIg)
    {
      r.zu(AppBrandProfileUI.d(this.iIf));
      AppBrandProfileUI.a(this.iIf, 1, 1);
    }
    AppMethodBeat.o(133029);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.4
 * JD-Core Version:    0.6.2
 */