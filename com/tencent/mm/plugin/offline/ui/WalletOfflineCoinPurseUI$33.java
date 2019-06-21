package com.tencent.mm.plugin.offline.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.g;
import com.tencent.mm.sdk.platformtools.ap.a;

final class WalletOfflineCoinPurseUI$33
  implements ap.a
{
  WalletOfflineCoinPurseUI$33(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(43543);
    WalletOfflineCoinPurseUI.a(this.pav);
    if ((WalletOfflineCoinPurseUI.o(this.pav) != null) && (WalletOfflineCoinPurseUI.o(this.pav).isShowing()))
      WalletOfflineCoinPurseUI.o(this.pav).dismiss();
    g.bXc();
    WalletOfflineCoinPurseUI.O(this.pav);
    if (a.bYE())
      this.pav.bXu();
    AppMethodBeat.o(43543);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.33
 * JD-Core Version:    0.6.2
 */