package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Dialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtDetailUI$11$1
  implements Runnable
{
  WalletLqtDetailUI$11$1(WalletLqtDetailUI.11 param11)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45535);
    if (WalletLqtDetailUI.a(this.tiL.tiH) != null)
      WalletLqtDetailUI.a(this.tiL.tiH).dismiss();
    Toast.makeText(this.tiL.tiH, this.tiL.tiH.getString(2131304915), 1).show();
    this.tiL.tiH.finish();
    AppMethodBeat.o(45535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.11.1
 * JD-Core Version:    0.6.2
 */