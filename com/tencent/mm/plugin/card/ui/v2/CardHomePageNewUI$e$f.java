package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class CardHomePageNewUI$e$f
  implements View.OnClickListener
{
  CardHomePageNewUI$e$f(CardHomePageNewUI.e parame, int paramInt, ns paramns)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(89196);
    ab.d("MicroMsg.CardHomePageNewUI", "do collapse coupon layout");
    CardHomePageNewUI.e.b(this.kpp, this.exi);
    paramView = this.kpp.kpo;
    if (paramView != null)
      paramView.koX = false;
    paramView = h.pYm;
    ns localns = this.kpq;
    if (localns == null)
      j.dWJ();
    paramView.e(16324, new Object[] { Integer.valueOf(1), localns.vSR, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(5), Integer.valueOf(this.exi), Integer.valueOf(CardHomePageNewUI.k(this.kpp.koY)) });
    AppMethodBeat.o(89196);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.e.f
 * JD-Core Version:    0.6.2
 */