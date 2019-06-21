package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bih;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "parent", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "position", "", "id", "", "onItemLongClick"})
final class CardTicketListUI$h
  implements MRecyclerView.b
{
  CardTicketListUI$h(CardTicketListUI paramCardTicketListUI)
  {
  }

  public final boolean L(View paramView, int paramInt)
  {
    AppMethodBeat.i(89308);
    ab.i("MicroMsg.CardTicketListUI", "long click item");
    Object localObject = CardTicketListUI.b(this.kqh).tl(paramInt);
    if (localObject != null)
    {
      paramView = ((d)localObject).kqe;
      switch (((d)localObject).type)
      {
      default:
      case 2:
      }
    }
    while (true)
    {
      AppMethodBeat.o(89308);
      return false;
      localObject = new com.tencent.mm.ui.tools.j((Context)this.kqh.dxU());
      ((com.tencent.mm.ui.tools.j)localObject).a((n.c)new CardTicketListUI.h.1(this));
      ((com.tencent.mm.ui.tools.j)localObject).a((n.d)new CardTicketListUI.h.2(this, paramView));
      ((com.tencent.mm.ui.tools.j)localObject).cuu();
      if (paramView != null)
      {
        h localh = h.pYm;
        paramInt = paramView.wLB;
        String str = paramView.vCb;
        c localc = CardTicketListUI.b(this.kqh);
        localObject = paramView.vCb;
        a.f.b.j.o(localObject, "user_card_id");
        localh.e(16326, new Object[] { Integer.valueOf(paramInt), str, Integer.valueOf(localc.bO((String)localObject, paramView.wLB)), Integer.valueOf(2) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.h
 * JD-Core Version:    0.6.2
 */