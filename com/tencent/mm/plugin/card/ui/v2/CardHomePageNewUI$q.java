package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "menuItem", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "index", "", "onMMMenuItemSelected"})
final class CardHomePageNewUI$q
  implements n.d
{
  CardHomePageNewUI$q(CardHomePageNewUI paramCardHomePageNewUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(89233);
    j.o(paramMenuItem, "menuItem");
    paramInt = paramMenuItem.getItemId();
    ab.i("MicroMsg.CardHomePageNewUI", "click item: %s, sortType: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(CardHomePageNewUI.k(this.koY)) });
    if ((paramInt == 0) && (CardHomePageNewUI.k(this.koY) == 2))
      if (!this.koY.kpR)
      {
        com.tencent.mm.ui.base.h.a((Context)this.koY, this.koY.getString(2131305852), this.koY.getString(2131301936), this.koY.getString(2131300878), this.koY.getString(2131298419), false, (DialogInterface.OnClickListener)new CardHomePageNewUI.q.1(this), null);
        AppMethodBeat.o(89233);
      }
    while (true)
    {
      return;
      CardHomePageNewUI.b(this.koY, true);
      CardHomePageNewUI.c(this.koY, 0);
      CardHomePageNewUI.b(this.koY, 1);
      CardHomePageNewUI.p(this.koY);
      com.tencent.mm.plugin.report.service.h.pYm.e(16322, new Object[] { Integer.valueOf(15) });
      AppMethodBeat.o(89233);
      continue;
      if ((paramInt == 1) && (CardHomePageNewUI.k(this.koY) == 1))
      {
        CardHomePageNewUI.b(this.koY, true);
        CardHomePageNewUI.c(this.koY, 0);
        CardHomePageNewUI.b(this.koY, 2);
        CardHomePageNewUI.p(this.koY);
        com.tencent.mm.plugin.report.service.h.pYm.e(16322, new Object[] { Integer.valueOf(16) });
      }
      AppMethodBeat.o(89233);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.q
 * JD-Core Version:    0.6.2
 */