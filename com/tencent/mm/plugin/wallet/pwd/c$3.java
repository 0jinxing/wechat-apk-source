package com.tencent.mm.plugin.wallet.pwd;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class c$3
  implements DialogInterface.OnClickListener
{
  c$3(c paramc, WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46159);
    this.tqw.b(this.tnX, c.f(this.tqw));
    if (this.tnX.bwP())
      this.tnX.finish();
    WalletBaseUI.dOB();
    AppMethodBeat.o(46159);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.c.3
 * JD-Core Version:    0.6.2
 */