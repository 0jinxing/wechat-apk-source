package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.wallet.b;
import com.tencent.mm.wallet_core.d.i;

final class RemittanceDetailUI$18
  implements View.OnClickListener
{
  RemittanceDetailUI$18(RemittanceDetailUI paramRemittanceDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45018);
    ((b)g.K(b.class)).eA(9, 4);
    r.cPD();
    paramView = this.pVw;
    i locali = RemittanceDetailUI.c(this.pVw);
    new RemittanceDetailUI.18.1(this);
    if (!r.a(paramView, locali))
      this.pVw.cfV();
    AppMethodBeat.o(45018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.18
 * JD-Core Version:    0.6.2
 */