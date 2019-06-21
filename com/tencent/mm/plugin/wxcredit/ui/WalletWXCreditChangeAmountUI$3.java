package com.tencent.mm.plugin.wxcredit.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletWXCreditChangeAmountUI$3
  implements DialogInterface.OnClickListener
{
  WalletWXCreditChangeAmountUI$3(WalletWXCreditChangeAmountUI paramWalletWXCreditChangeAmountUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48691);
    paramDialogInterface = a.aE(this.uZr);
    if (paramDialogInterface != null)
    {
      paramDialogInterface.b(this.uZr, this.uZr.mBundle);
      AppMethodBeat.o(48691);
    }
    while (true)
    {
      return;
      this.uZr.finish();
      AppMethodBeat.o(48691);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.3
 * JD-Core Version:    0.6.2
 */