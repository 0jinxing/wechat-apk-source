package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtSaveFetchFinishUI$4
  implements Runnable
{
  WalletLqtSaveFetchFinishUI$4(WalletLqtSaveFetchFinishUI paramWalletLqtSaveFetchFinishUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45641);
    LinearLayout localLinearLayout = (LinearLayout)this.tkl.findViewById(2131828862);
    RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)localLinearLayout.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams2 = localLayoutParams1;
    if (localLayoutParams1 == null)
      localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams2.addRule(12);
    localLinearLayout.setLayoutParams(localLayoutParams2);
    AppMethodBeat.o(45641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI.4
 * JD-Core Version:    0.6.2
 */