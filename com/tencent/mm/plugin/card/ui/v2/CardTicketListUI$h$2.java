package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bih;
import com.tencent.mm.ui.base.n.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "menuItem", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "index", "", "onMMMenuItemSelected"})
final class CardTicketListUI$h$2
  implements n.d
{
  CardTicketListUI$h$2(CardTicketListUI.h paramh, bih parambih)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(89307);
    j.o(paramMenuItem, "menuItem");
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(89307);
      return;
      if (this.kqj != null)
      {
        com.tencent.mm.ui.base.h.a((Context)this.kqi.kqh.dxU(), this.kqi.kqh.getString(2131297887), "", this.kqi.kqh.getString(2131296994), this.kqi.kqh.getString(2131296868), false, (DialogInterface.OnClickListener)new CardTicketListUI.h.2.1(this), (DialogInterface.OnClickListener)CardTicketListUI.h.2.2.kql);
        paramMenuItem = com.tencent.mm.plugin.report.service.h.pYm;
        Object localObject1 = this.kqj;
        if (localObject1 == null)
          j.dWJ();
        paramInt = ((bih)localObject1).wLB;
        localObject1 = this.kqj;
        if (localObject1 == null)
          j.dWJ();
        localObject1 = ((bih)localObject1).vCb;
        c localc = CardTicketListUI.b(this.kqi.kqh);
        Object localObject2 = this.kqj;
        if (localObject2 == null)
          j.dWJ();
        localObject2 = ((bih)localObject2).vCb;
        j.o(localObject2, "ticketElement!!.user_card_id");
        bih localbih = this.kqj;
        if (localbih == null)
          j.dWJ();
        paramMenuItem.e(16326, new Object[] { Integer.valueOf(paramInt), localObject1, Integer.valueOf(localc.bO((String)localObject2, localbih.wLB)), Integer.valueOf(3) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.h.2
 * JD-Core Version:    0.6.2
 */