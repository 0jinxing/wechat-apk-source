package com.tencent.mm.plugin.wallet_core.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class a$1
  implements DialogInterface.OnClickListener
{
  a$1(a parama, WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46467);
    this.ttI.b(this.tnX, this.ttI.mqu);
    if (this.tnX.bwP())
      this.tnX.finish();
    WalletBaseUI.dOB();
    AppMethodBeat.o(46467);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.b.a.1
 * JD-Core Version:    0.6.2
 */