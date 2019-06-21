package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;

final class RemittanceBaseUI$15
  implements DialogInterface.OnClickListener
{
  RemittanceBaseUI$15(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44839);
    a.b(this.pRX, "ShowOrdersInfoProcess", null);
    AppMethodBeat.o(44839);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.15
 * JD-Core Version:    0.6.2
 */