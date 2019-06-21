package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.od;
import com.tencent.mm.g.a.od.a;
import com.tencent.mm.plugin.remittance.model.u;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class RemittanceDetailUI$1$1
  implements DialogInterface.OnClickListener
{
  RemittanceDetailUI$1$1(RemittanceDetailUI.1 param1, od paramod)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44992);
    paramDialogInterface = new u(this.pVx.cKt.cAa, this.pVx.cKt.cEa, this.pVx.cKt.cKu, "refuse", this.pVx.cKt.cKv, this.pVx.cKt.cKw);
    paramDialogInterface.eHT = "RemittanceProcess";
    this.pVy.pVw.a(paramDialogInterface, true, true);
    AppMethodBeat.o(44992);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.1.1
 * JD-Core Version:    0.6.2
 */