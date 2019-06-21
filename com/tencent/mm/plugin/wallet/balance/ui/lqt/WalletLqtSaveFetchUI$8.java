package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletLqtSaveFetchUI$8
  implements a
{
  WalletLqtSaveFetchUI$8(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(45653);
    if (paramBoolean)
      if (WalletLqtSaveFetchUI.h(this.tkP) == 2)
      {
        WalletLqtSaveFetchUI.m(this.tkP);
        AppMethodBeat.o(45653);
      }
    while (true)
    {
      return;
      if (WalletLqtSaveFetchUI.h(this.tkP) == 1)
      {
        WalletLqtSaveFetchUI.m(this.tkP);
        AppMethodBeat.o(45653);
        continue;
        WalletLqtSaveFetchUI.n(this.tkP).scrollTo(0, 0);
        if ((WalletLqtSaveFetchUI.h(this.tkP) == 2) && (bo.isNullOrNil(WalletLqtSaveFetchUI.c(this.tkP).getText())))
          WalletLqtSaveFetchUI.o(this.tkP);
      }
      else
      {
        AppMethodBeat.o(45653);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.8
 * JD-Core Version:    0.6.2
 */