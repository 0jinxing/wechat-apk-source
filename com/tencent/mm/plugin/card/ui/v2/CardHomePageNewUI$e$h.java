package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.protocal.protobuf.ny;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showMiniAppLayout$1$1"})
final class CardHomePageNewUI$e$h
  implements View.OnClickListener
{
  CardHomePageNewUI$e$h(ns paramns, CardHomePageNewUI.e parame, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(89198);
    if (this.kpt.vTd != null)
      if (this.kpt.vTd == null)
        break label225;
    label225: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.CardHomePageNewUI", "detail goto mini app %s", new Object[] { Boolean.valueOf(bool) });
      CardHomePageNewUI.i(this.kpp.koY);
      CardHomePageNewUI.a(this.kpp.koY, 0);
      CardHomePageNewUI.a(this.kpp.koY, this.kpt);
      b.t(this.kpt.vTd.tzW, this.kpt.vTd.ttg, this.kpt.vTd.tIE);
      paramView = h.pYm;
      Object localObject = this.kpp.kpo;
      if (localObject == null)
        j.dWJ();
      localObject = ((CardHomePageNewUI.a)localObject).koU;
      if (localObject == null)
        j.dWJ();
      paramView.e(16324, new Object[] { Integer.valueOf(1), ((ns)localObject).vSR, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(6), Integer.valueOf(this.iPU), Integer.valueOf(CardHomePageNewUI.k(this.kpp.koY)) });
      AppMethodBeat.o(89198);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.e.h
 * JD-Core Version:    0.6.2
 */