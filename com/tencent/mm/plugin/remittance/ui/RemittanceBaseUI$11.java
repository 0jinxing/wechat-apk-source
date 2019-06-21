package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.v;

final class RemittanceBaseUI$11
  implements DialogInterface.OnClickListener
{
  RemittanceBaseUI$11(RemittanceBaseUI paramRemittanceBaseUI, v paramv)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44835);
    if (!RemittanceBaseUI.a(this.pRX, this.pRY))
      this.pRX.a(this.pRY.cBT, this.pRX.edV, this.pRX.pRx, this.pRY);
    AppMethodBeat.o(44835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.11
 * JD-Core Version:    0.6.2
 */