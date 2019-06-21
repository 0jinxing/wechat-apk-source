package com.tencent.mm.plugin.address.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ki;

final class WalletSelectAddrUI$9
  implements Runnable
{
  WalletSelectAddrUI$9(WalletSelectAddrUI paramWalletSelectAddrUI, ki paramki)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16987);
    WalletSelectAddrUI.k(this.gLk).post(new WalletSelectAddrUI.9.1(this));
    AppMethodBeat.o(16987);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.9
 * JD-Core Version:    0.6.2
 */