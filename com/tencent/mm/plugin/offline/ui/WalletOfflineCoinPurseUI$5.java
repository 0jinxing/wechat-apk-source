package com.tencent.mm.plugin.offline.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uo.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class WalletOfflineCoinPurseUI$5
  implements Runnable
{
  WalletOfflineCoinPurseUI$5(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, uo paramuo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43508);
    if (!bo.isNullOrNil(this.kHm.cQK.cQM))
    {
      e.a((TextView)this.pav.findViewById(2131821634), this.kHm.cQK.cQM, this.kHm.cQK.content, this.kHm.cQK.url);
      AppMethodBeat.o(43508);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "no bulletin data");
      AppMethodBeat.o(43508);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.5
 * JD-Core Version:    0.6.2
 */