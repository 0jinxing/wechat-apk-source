package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtSaveFetchFinishProgressUI$2
  implements View.OnClickListener
{
  WalletLqtSaveFetchFinishProgressUI$2(WalletLqtSaveFetchFinishProgressUI paramWalletLqtSaveFetchFinishProgressUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45635);
    this.tkb.finish();
    AppMethodBeat.o(45635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishProgressUI.2
 * JD-Core Version:    0.6.2
 */