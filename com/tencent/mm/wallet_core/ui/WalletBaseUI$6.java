package com.tencent.mm.wallet_core.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBaseUI$6
  implements MenuItem.OnMenuItemClickListener
{
  WalletBaseUI$6(WalletBaseUI paramWalletBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(49244);
    this.AhA.Ahw = 4;
    if (this.AhA.cNR())
    {
      this.AhA.aqX();
      this.AhA.showDialog(1000);
    }
    while (true)
    {
      AppMethodBeat.o(49244);
      return true;
      this.AhA.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletBaseUI.6
 * JD-Core Version:    0.6.2
 */