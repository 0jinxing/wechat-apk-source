package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.config.u;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class AppBrandProfileUI$2
  implements n.c
{
  AppBrandProfileUI$2(AppBrandProfileUI paramAppBrandProfileUI)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(133026);
    paraml.clear();
    if (((af)g.K(af.class)).aB(AppBrandProfileUI.d(this.iIf), 0));
    for (int i = 2131296854; ; i = 2131296851)
    {
      paraml.hi(4, i);
      paraml.hi(2, 2131296568);
      if ((AppBrandProfileUI.e(this.iIf) != null) && (AppBrandProfileUI.e(this.iIf).bQl == 0))
        paraml.hi(5, 2131296788);
      AppMethodBeat.o(133026);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.2
 * JD-Core Version:    0.6.2
 */