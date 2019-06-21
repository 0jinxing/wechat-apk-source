package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.a;

final class WalletPayUI$26
  implements c.a
{
  WalletPayUI$26(WalletPayUI paramWalletPayUI)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(46064);
    ab.i(this.tqj.TAG, "pay process end");
    this.tqj.tpx = false;
    paramBundle = new Intent();
    AppMethodBeat.o(46064);
    return paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.26
 * JD-Core Version:    0.6.2
 */