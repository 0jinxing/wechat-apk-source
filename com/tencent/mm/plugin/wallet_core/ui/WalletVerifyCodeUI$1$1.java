package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class WalletVerifyCodeUI$1$1
  implements DialogInterface.OnClickListener
{
  WalletVerifyCodeUI$1$1(WalletVerifyCodeUI.1 param1, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47689);
    this.tLp.tLn.cRV();
    h.pYm.e(15443, new Object[] { Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(this.tLo) });
    AppMethodBeat.o(47689);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.1.1
 * JD-Core Version:    0.6.2
 */