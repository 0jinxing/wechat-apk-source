package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletRealNameProcessProxyUI$1
  implements DialogInterface.OnClickListener
{
  WalletRealNameProcessProxyUI$1(WalletRealNameProcessProxyUI paramWalletRealNameProcessProxyUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46613);
    this.tvn.setResult(1);
    this.tvn.finish();
    AppMethodBeat.o(46613);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI.1
 * JD-Core Version:    0.6.2
 */