package com.tencent.mm.plugin.exdevice.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.sport.a.d;
import com.tencent.mm.ui.base.n.d;

final class ExdeviceRankInfoUI$20
  implements n.d
{
  ExdeviceRankInfoUI$20(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(20158);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 0:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(20158);
      while (true)
      {
        return;
        d.kT(16);
        ExdeviceRankInfoUI.m(this.lDC);
        AppMethodBeat.o(20158);
        continue;
        d.kT(15);
        ExdeviceRankInfoUI.n(this.lDC);
        AppMethodBeat.o(20158);
        continue;
        d.kT(7);
        ExdeviceRankInfoUI.o(this.lDC);
        AppMethodBeat.o(20158);
      }
      d.kT(36);
      paramMenuItem = new AppBrandStatObject();
      paramMenuItem.scene = 1063;
      ((e)g.K(e.class)).a(null, "gh_1f9ebf140e39@app", null, 0, 0, null, paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.20
 * JD-Core Version:    0.6.2
 */