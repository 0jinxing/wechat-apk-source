package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.ui.base.n.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "menuItem", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "index", "", "onMMMenuItemSelected", "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$4$1$2"})
final class CardHomePageNewUI$m$b
  implements n.d
{
  CardHomePageNewUI$m$b(CardHomePageNewUI.a parama, CardHomePageNewUI.m paramm, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(89225);
    j.o(paramMenuItem, "menuItem");
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(89225);
      return;
      com.tencent.mm.ui.base.h.a((Context)this.kpB.koY.dxU(), this.kpB.koY.getString(2131297887), "", false, (DialogInterface.OnClickListener)new CardHomePageNewUI.m.b.1(this));
      com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
      paramMenuItem = this.kpC.koU;
      if (paramMenuItem == null)
        j.dWJ();
      localh.e(16324, new Object[] { Integer.valueOf(2), paramMenuItem.vSR, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(8), Integer.valueOf(this.iPU), Integer.valueOf(CardHomePageNewUI.k(this.kpB.koY)) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.m.b
 * JD-Core Version:    0.6.2
 */