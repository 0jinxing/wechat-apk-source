package com.tencent.mm.plugin.wallet_ecard.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletECardFinishUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletECardFinishUI$1(WalletECardFinishUI paramWalletECardFinishUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(48144);
    ab.i("MicroMsg.WalletECardFinishUI", "press back btn");
    WalletECardFinishUI.a(this.tQI).performClick();
    AppMethodBeat.o(48144);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI.1
 * JD-Core Version:    0.6.2
 */