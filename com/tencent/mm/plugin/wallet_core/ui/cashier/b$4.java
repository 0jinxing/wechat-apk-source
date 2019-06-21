package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.m;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.c;
import com.tencent.mm.sdk.platformtools.ab;

final class b$4
  implements View.OnClickListener
{
  b$4(b paramb, com.tencent.mm.plugin.wallet.a.b paramb1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47762);
    ab.i("MicroMsg.WcPayCashierDialog", "click bank favor btn");
    b.t(this.tMC);
    this.tMC.tMq = r.cPI().h(this.tME.tmC.pbo, false, false);
    paramView = c.tDU.a(this.tMC.pWy).acX(this.tME.tmE);
    ab.i("MicroMsg.WcPayCashierDialog", "set favor info: %s", new Object[] { paramView.tzb });
    if (paramView.tzb.equals("0"))
      b.u(this.tMC);
    while (true)
    {
      b.p(this.tMC);
      b.q(this.tMC);
      b.v(this.tMC);
      b.w(this.tMC);
      b.x(this.tMC);
      AppMethodBeat.o(47762);
      return;
      this.tMC.toH = paramView;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.4
 * JD-Core Version:    0.6.2
 */