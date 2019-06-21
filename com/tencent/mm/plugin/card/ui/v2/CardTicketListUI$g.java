package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bih;
import com.tencent.mm.protocal.protobuf.bii;
import com.tencent.mm.protocal.protobuf.ny;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "parent", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "position", "", "id", "", "onItemClick"})
final class CardTicketListUI$g
  implements MRecyclerView.a
{
  CardTicketListUI$g(CardTicketListUI paramCardTicketListUI)
  {
  }

  public final void I(View paramView, int paramInt)
  {
    AppMethodBeat.i(89303);
    ab.i("MicroMsg.CardTicketListUI", "click item");
    paramView = CardTicketListUI.b(this.kqh).tl(paramInt);
    if (paramView != null)
      switch (paramView.type)
      {
      default:
        AppMethodBeat.o(89303);
      case 1:
      case 2:
      }
    while (true)
    {
      return;
      paramView = paramView.kqd;
      if (paramView != null)
        switch (paramView.wLI)
        {
        default:
        case 1:
        case 2:
        }
      while (true)
      {
        h.pYm.e(16322, new Object[] { Integer.valueOf(7) });
        AppMethodBeat.o(89303);
        break;
        b.a((MMActivity)this.kqh, paramView.wLJ);
        continue;
        paramView = paramView.wLK;
        if (paramView != null)
          b.t(paramView.tzW, paramView.ttg, paramView.tIE);
      }
      paramView = paramView.kqe;
      if (paramView == null)
        break;
      Object localObject = this.kqh;
      String str1 = paramView.vCb;
      j.o(str1, "user_card_id");
      CardTicketListUI.a((CardTicketListUI)localObject, str1);
      h.pYm.e(16322, new Object[] { Integer.valueOf(10) });
      localObject = h.pYm;
      paramInt = paramView.wLB;
      String str2 = paramView.vCb;
      c localc = CardTicketListUI.b(this.kqh);
      str1 = paramView.vCb;
      j.o(str1, "user_card_id");
      ((h)localObject).e(16326, new Object[] { Integer.valueOf(paramInt), str2, Integer.valueOf(localc.bO(str1, paramView.wLB)), Integer.valueOf(1) });
      AppMethodBeat.o(89303);
      continue;
      AppMethodBeat.o(89303);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.g
 * JD-Core Version:    0.6.2
 */