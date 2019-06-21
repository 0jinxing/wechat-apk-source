package com.tencent.mm.wallet_core.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBaseUI$5
  implements Runnable
{
  WalletBaseUI$5(WalletBaseUI paramWalletBaseUI, View paramView, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(49243);
    this.imq.scrollBy(0, this.pNU);
    AppMethodBeat.o(49243);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletBaseUI.5
 * JD-Core Version:    0.6.2
 */