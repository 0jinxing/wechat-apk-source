package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import a.v;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.protocal.protobuf.ny;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$1$headerClickListener$1"})
final class CardHomePageNewUI$e$c
  implements View.OnClickListener
{
  CardHomePageNewUI$e$c(ns paramns1, CardHomePageNewUI.e parame, ns paramns2, int paramInt, CardHomePageNewUI.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(89193);
    ab.i("MicroMsg.CardHomePageNewUI", "click header");
    CardHomePageNewUI.i(this.kpp.koY);
    CardHomePageNewUI.a(this.kpp.koY, 0);
    CardHomePageNewUI.a(this.kpp.koY, this.kpu);
    switch (this.kpt.vSW)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      h.pYm.e(16324, new Object[] { Integer.valueOf(1), this.kpt.vSR, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(this.iPU), Integer.valueOf(CardHomePageNewUI.k(this.kpp.koY)) });
      AppMethodBeat.o(89193);
      return;
      paramView = this.kpp.apJ;
      j.o(paramView, "itemView");
      paramView = paramView.getContext();
      if (paramView == null)
      {
        paramView = new v("null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        AppMethodBeat.o(89193);
        throw paramView;
      }
      b.a((MMActivity)paramView, this.kpt.vSX);
      continue;
      paramView = this.kpt.vSY;
      b.t(paramView.tzW, paramView.ttg, paramView.tIE);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.e.c
 * JD-Core Version:    0.6.2
 */