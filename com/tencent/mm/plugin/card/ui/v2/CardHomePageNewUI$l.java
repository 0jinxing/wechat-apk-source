package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.protocal.protobuf.ny;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "parent", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "position", "", "id", "", "onItemClick"})
final class CardHomePageNewUI$l
  implements MRecyclerView.a
{
  CardHomePageNewUI$l(CardHomePageNewUI paramCardHomePageNewUI)
  {
  }

  public final void I(View paramView, int paramInt)
  {
    AppMethodBeat.i(89222);
    paramView = CardHomePageNewUI.o(this.koY).th(paramInt);
    if (paramView != null)
    {
      ab.i("MicroMsg.CardHomePageNewUI", "click type: %s", new Object[] { Integer.valueOf(paramView.type) });
      switch (paramView.type)
      {
      case 3:
      default:
        AppMethodBeat.o(89222);
      case 2:
      case 4:
      case 5:
      }
    }
    while (true)
    {
      return;
      CardHomePageNewUI.i(this.koY);
      CardHomePageNewUI.a(this.koY, 1);
      CardHomePageNewUI.a(this.koY, paramView.koU);
      Object localObject = paramView.koU;
      if (localObject == null)
        j.dWJ();
      switch (((ns)localObject).vSW)
      {
      default:
      case 1:
      case 2:
      }
      while (true)
      {
        localObject = h.pYm;
        paramView = paramView.koU;
        if (paramView == null)
          j.dWJ();
        ((h)localObject).e(16324, new Object[] { Integer.valueOf(2), paramView.vSR, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(CardHomePageNewUI.k(this.koY)) });
        AppMethodBeat.o(89222);
        break;
        localObject = (MMActivity)this.koY;
        ns localns = paramView.koU;
        if (localns == null)
          j.dWJ();
        b.a((MMActivity)localObject, localns.vSX);
        continue;
        localObject = paramView.koU;
        if (localObject == null)
          j.dWJ();
        localObject = ((ns)localObject).vSY;
        b.t(((ny)localObject).tzW, ((ny)localObject).ttg, ((ny)localObject).tIE);
      }
      ab.i("MicroMsg.CardHomePageNewUI", "click ticket item");
      paramView = new Intent((Context)this.koY, CardTicketListUI.class);
      this.koY.startActivity(paramView);
      h.pYm.e(16322, new Object[] { Integer.valueOf(5) });
      AppMethodBeat.o(89222);
      continue;
      h.pYm.e(16322, new Object[] { Integer.valueOf(13) });
      AppMethodBeat.o(89222);
      continue;
      AppMethodBeat.o(89222);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.l
 * JD-Core Version:    0.6.2
 */