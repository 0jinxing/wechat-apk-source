package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "parent", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "position", "", "id", "", "onItemLongClick"})
final class CardHomePageNewUI$m
  implements MRecyclerView.b
{
  CardHomePageNewUI$m(CardHomePageNewUI paramCardHomePageNewUI)
  {
  }

  public final boolean L(View paramView, int paramInt)
  {
    AppMethodBeat.i(89226);
    paramView = CardHomePageNewUI.o(this.koY).th(paramInt);
    if (paramView != null)
    {
      ab.i("MicroMsg.CardHomePageNewUI", "long click type: %s", new Object[] { Integer.valueOf(paramView.type) });
      switch (paramView.type)
      {
      default:
      case 2:
      }
    }
    while (true)
    {
      AppMethodBeat.o(89226);
      return false;
      Object localObject = new com.tencent.mm.ui.tools.j((Context)this.koY.dxU());
      ((com.tencent.mm.ui.tools.j)localObject).a((n.c)new CardHomePageNewUI.m.a(this, paramInt));
      ((com.tencent.mm.ui.tools.j)localObject).a((n.d)new CardHomePageNewUI.m.b(paramView, this, paramInt));
      ((com.tencent.mm.ui.tools.j)localObject).cuu();
      localObject = h.pYm;
      paramView = paramView.koU;
      if (paramView == null)
        a.f.b.j.dWJ();
      ((h)localObject).e(16324, new Object[] { Integer.valueOf(2), paramView.vSR, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(7), Integer.valueOf(paramInt), Integer.valueOf(CardHomePageNewUI.k(this.koY)) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.m
 * JD-Core Version:    0.6.2
 */