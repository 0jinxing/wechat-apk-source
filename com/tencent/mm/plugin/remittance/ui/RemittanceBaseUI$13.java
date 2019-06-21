package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.v;
import com.tencent.mm.plugin.remittance.model.v.a;
import com.tencent.mm.sdk.platformtools.bo;

final class RemittanceBaseUI$13
  implements DialogInterface.OnClickListener
{
  RemittanceBaseUI$13(RemittanceBaseUI paramRemittanceBaseUI, v paramv)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44837);
    if (bo.isNullOrNil(this.pRY.pPm.pPO))
    {
      com.tencent.mm.wallet_core.a.b(this.pRX, "ShowOrdersInfoProcess", null);
      AppMethodBeat.o(44837);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.account.a.b.a.b(this.pRX, this.pRY.pPm.pPO, 5, true);
      AppMethodBeat.o(44837);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.13
 * JD-Core Version:    0.6.2
 */