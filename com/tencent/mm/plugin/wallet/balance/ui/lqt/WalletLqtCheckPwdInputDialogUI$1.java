package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtCheckPwdInputDialogUI$1
  implements DialogInterface.OnClickListener
{
  WalletLqtCheckPwdInputDialogUI$1(WalletLqtCheckPwdInputDialogUI paramWalletLqtCheckPwdInputDialogUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45516);
    this.tib.finish();
    AppMethodBeat.o(45516);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI.1
 * JD-Core Version:    0.6.2
 */