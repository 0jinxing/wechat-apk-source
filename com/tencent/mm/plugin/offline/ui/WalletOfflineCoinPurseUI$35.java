package com.tencent.mm.plugin.offline.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ca;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class WalletOfflineCoinPurseUI$35
  implements ap.a
{
  WalletOfflineCoinPurseUI$35(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(43545);
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "onTimerExpired, send ConsumedCardByOfflinePay event: %s", new Object[] { Boolean.valueOf(WalletOfflineCoinPurseUI.P(this.pav)) });
    if (WalletOfflineCoinPurseUI.P(this.pav))
    {
      ca localca = new ca();
      localca.cvj.bFZ = 0;
      a.xxA.m(localca);
    }
    this.pav.finish();
    AppMethodBeat.o(43545);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.35
 * JD-Core Version:    0.6.2
 */