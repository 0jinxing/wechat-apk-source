package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bih;
import com.tencent.mm.ui.base.n.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "menuItem", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "index", "", "onMMMenuItemSelected", "com/tencent/mm/plugin/card/ui/v2/CardInvalidTicketListUI$initView$3$1$2"})
final class CardInvalidTicketListUI$g$b
  implements n.d
{
  CardInvalidTicketListUI$g$b(CardInvalidTicketListUI.g paramg, d paramd)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(89257);
    j.o(paramMenuItem, "menuItem");
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(89257);
      return;
      paramMenuItem = this.kpM.kpK;
      Object localObject = this.kpN.kqe;
      if (localObject == null)
        j.dWJ();
      localObject = ((bih)localObject).vCb;
      j.o(localObject, "model.ticketElement!!.user_card_id");
      CardInvalidTicketListUI.b(paramMenuItem, (String)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.g.b
 * JD-Core Version:    0.6.2
 */