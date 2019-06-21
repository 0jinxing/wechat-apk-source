package com.tencent.mm.plugin.offline.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.a.m;
import com.tencent.mm.plugin.offline.i;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletOfflineCoinPurseUI$26
  implements View.OnClickListener
{
  WalletOfflineCoinPurseUI$26(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43533);
    k.bXg();
    k.bXj();
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "do get token, %s", new Object[] { Integer.valueOf(i.bXf()) });
    k.bXg();
    k.bXj();
    if (i.bXf() <= 0)
    {
      paramView = new m((int)(System.currentTimeMillis() / 1000L), 10);
      this.pav.a(paramView, true, false);
      AppMethodBeat.o(43533);
    }
    while (true)
    {
      return;
      WalletOfflineCoinPurseUI.J(this.pav);
      AppMethodBeat.o(43533);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.26
 * JD-Core Version:    0.6.2
 */