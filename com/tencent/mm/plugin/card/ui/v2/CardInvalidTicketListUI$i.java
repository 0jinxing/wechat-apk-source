package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class CardInvalidTicketListUI$i
  implements MenuItem.OnMenuItemClickListener
{
  CardInvalidTicketListUI$i(CardInvalidTicketListUI paramCardInvalidTicketListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(89263);
    com.tencent.mm.ui.base.h.a((Context)this.kpK.dxU(), false, this.kpK.getString(2131297886), "", this.kpK.getString(2131298421), this.kpK.getString(2131298419), (DialogInterface.OnClickListener)new CardInvalidTicketListUI.i.1(this), (DialogInterface.OnClickListener)CardInvalidTicketListUI.i.2.kpP);
    com.tencent.mm.plugin.report.service.h.pYm.e(16322, new Object[] { Integer.valueOf(10) });
    AppMethodBeat.o(89263);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.i
 * JD-Core Version:    0.6.2
 */