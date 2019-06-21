package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.a;

final class WalletLqtSaveFetchUI$3
  implements c.a
{
  WalletLqtSaveFetchUI$3(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(45646);
    ab.i("MicroMsg.WalletLqtSaveFetchUI", "feedbackData: %s", new Object[] { paramBundle });
    AppMethodBeat.o(45646);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.3
 * JD-Core Version:    0.6.2
 */