package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.pluginsdk.wallet.h;

final class RemittanceDetailUI$21
  implements a.a
{
  RemittanceDetailUI$21(RemittanceDetailUI paramRemittanceDetailUI, boolean paramBoolean)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45022);
    if (this.pVJ)
    {
      d.H(this.pVw, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
      AppMethodBeat.o(45022);
    }
    while (true)
    {
      return;
      h.ak(this.pVw, 0);
      AppMethodBeat.o(45022);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.21
 * JD-Core Version:    0.6.2
 */