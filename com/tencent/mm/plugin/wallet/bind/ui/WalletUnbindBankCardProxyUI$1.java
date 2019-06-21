package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.c.a;

final class WalletUnbindBankCardProxyUI$1
  implements c.a
{
  WalletUnbindBankCardProxyUI$1(WalletUnbindBankCardProxyUI paramWalletUnbindBankCardProxyUI)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(45830);
    switch (paramInt)
    {
    default:
    case 0:
    case -1:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(45830);
      return null;
      this.tmy.setResult(0);
      continue;
      this.tmy.setResult(-1);
      continue;
      this.tmy.setResult(1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI.1
 * JD-Core Version:    0.6.2
 */