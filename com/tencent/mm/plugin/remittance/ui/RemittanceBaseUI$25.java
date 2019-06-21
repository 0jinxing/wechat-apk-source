package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.v;

final class RemittanceBaseUI$25
  implements DialogInterface.OnClickListener
{
  RemittanceBaseUI$25(RemittanceBaseUI paramRemittanceBaseUI, String paramString, v paramv)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44856);
    this.pRX.a(this.pSf, this.pRX.edV, this.pRX.pRx, this.pQM);
    AppMethodBeat.o(44856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.25
 * JD-Core Version:    0.6.2
 */