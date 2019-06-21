package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtSaveFetchFinishUI$1
  implements View.OnClickListener
{
  WalletLqtSaveFetchFinishUI$1(WalletLqtSaveFetchFinishUI paramWalletLqtSaveFetchFinishUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45638);
    this.tkl.finish();
    AppMethodBeat.o(45638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI.1
 * JD-Core Version:    0.6.2
 */