package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtDetailUI$9$2$1
  implements DialogInterface.OnClickListener
{
  WalletLqtDetailUI$9$2$1(WalletLqtDetailUI.9.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45531);
    WalletLqtDetailUI.g(this.tiK.tiJ.tiH);
    paramDialogInterface = new Intent(this.tiK.tiJ.tiH, WalletLqtSimpleCheckPwdUI.class);
    this.tiK.tiJ.tiH.startActivityForResult(paramDialogInterface, 123);
    AppMethodBeat.o(45531);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.9.2.1
 * JD-Core Version:    0.6.2
 */