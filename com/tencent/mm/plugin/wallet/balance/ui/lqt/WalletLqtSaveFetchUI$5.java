package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtSaveFetchUI$5
  implements CompoundButton.OnCheckedChangeListener
{
  WalletLqtSaveFetchUI$5(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(45648);
    if (!paramBoolean)
    {
      WalletLqtSaveFetchUI.a(this.tkP, false);
      AppMethodBeat.o(45648);
    }
    while (true)
    {
      return;
      WalletLqtSaveFetchUI.a(this.tkP, true);
      AppMethodBeat.o(45648);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.5
 * JD-Core Version:    0.6.2
 */