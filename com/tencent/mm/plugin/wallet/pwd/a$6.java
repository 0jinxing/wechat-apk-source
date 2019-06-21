package com.tencent.mm.plugin.wallet.pwd;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class a$6
  implements DialogInterface.OnClickListener
{
  a$6(a parama, WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46136);
    this.tqt.b(this.tnX, a.g(this.tqt));
    if (this.tnX.bwP())
      this.tnX.finish();
    WalletBaseUI.dOB();
    AppMethodBeat.o(46136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.6
 * JD-Core Version:    0.6.2
 */