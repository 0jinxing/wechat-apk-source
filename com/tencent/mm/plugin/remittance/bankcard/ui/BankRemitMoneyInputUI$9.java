package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.a.o;
import com.tencent.mm.protocal.protobuf.bst;
import com.tencent.mm.protocal.protobuf.dc;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class BankRemitMoneyInputUI$9
  implements DialogInterface.OnClickListener
{
  BankRemitMoneyInputUI$9(BankRemitMoneyInputUI paramBankRemitMoneyInputUI, o paramo, dc paramdc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44641);
    if (this.pNV.pLG.kCl == 0)
    {
      BankRemitMoneyInputUI.a(this.pNT, this.pNV.pLG.nYX, this.pNV.pLG.pMf, this.pNV.pLG.nuL, this.pNV.pLG.pMe);
      AppMethodBeat.o(44641);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.pNY.kCs))
        e.n(this.pNT.mController.ylL, this.pNY.kCs, false);
      AppMethodBeat.o(44641);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.9
 * JD-Core Version:    0.6.2
 */