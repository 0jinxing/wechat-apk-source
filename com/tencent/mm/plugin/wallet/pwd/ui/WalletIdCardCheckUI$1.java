package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletIdCardCheckUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletIdCardCheckUI$1(WalletIdCardCheckUI paramWalletIdCardCheckUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(46322);
    ab.i("Micromsg.WalletIdCardCheckUI", "onbackbtn click");
    this.tsc.finish();
    AppMethodBeat.o(46322);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI.1
 * JD-Core Version:    0.6.2
 */