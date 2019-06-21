package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.v;

final class RemittanceBaseUI$10
  implements DialogInterface.OnClickListener
{
  RemittanceBaseUI$10(RemittanceBaseUI paramRemittanceBaseUI, v paramv)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44834);
    RemittanceBaseUI.a(this.pRX, 2, this.pRY.cEa);
    AppMethodBeat.o(44834);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.10
 * JD-Core Version:    0.6.2
 */