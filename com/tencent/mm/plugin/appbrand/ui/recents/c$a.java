package com.tencent.mm.plugin.appbrand.ui.recents;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class c$a
  implements Runnable
{
  c$a(c paramc, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135128);
    AppBrandNearbyShowcaseView localAppBrandNearbyShowcaseView = this.iLY.iMd;
    j.o(localAppBrandNearbyShowcaseView, "mShowcaseView");
    if (this.iLX);
    for (int i = 0; ; i = 8)
    {
      localAppBrandNearbyShowcaseView.setVisibility(i);
      AppMethodBeat.o(135128);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.c.a
 * JD-Core Version:    0.6.2
 */