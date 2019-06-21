package com.tencent.mm.plugin.appbrand.page;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$12
  implements ak
{
  u$12(u paramu)
  {
  }

  public final void a(AppBrandPageFullScreenView paramAppBrandPageFullScreenView)
  {
    AppMethodBeat.i(138231);
    if (u.g(this.ita) == null)
    {
      d.e("MicroMsg.AppBrandPageView", "mContainerPage is null, check time sequence, err");
      AppMethodBeat.o(138231);
    }
    while (true)
    {
      return;
      u.g(this.ita).a(this.ita, paramAppBrandPageFullScreenView);
      AppMethodBeat.o(138231);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.12
 * JD-Core Version:    0.6.2
 */