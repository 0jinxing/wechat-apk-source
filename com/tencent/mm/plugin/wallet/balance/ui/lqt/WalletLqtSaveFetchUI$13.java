package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletLqtSaveFetchUI$13
  implements Runnable
{
  WalletLqtSaveFetchUI$13(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45664);
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    this.tkP.findViewById(2131828872).getLocationInWindow(arrayOfInt1);
    WalletLqtSaveFetchUI.n(this.tkP).getLocationInWindow(arrayOfInt2);
    ab.d("MicroMsg.WalletLqtSaveFetchUI", "scroll y: %s", new Object[] { Integer.valueOf(arrayOfInt1[1] - arrayOfInt2[1]) });
    WalletLqtSaveFetchUI.n(this.tkP).scrollBy(0, arrayOfInt1[1] - arrayOfInt2[1]);
    AppMethodBeat.o(45664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.13
 * JD-Core Version:    0.6.2
 */