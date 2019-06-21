package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtSaveFetchUI$4
  implements View.OnClickListener
{
  WalletLqtSaveFetchUI$4(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45647);
    if (!WalletLqtSaveFetchUI.l(this.tkP).isChecked());
    for (boolean bool = true; ; bool = false)
    {
      WalletLqtSaveFetchUI.l(this.tkP).setChecked(bool);
      AppMethodBeat.o(45647);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.4
 * JD-Core Version:    0.6.2
 */