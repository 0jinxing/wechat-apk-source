package com.tencent.mm.plugin.wallet.bind.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uo.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class WalletBankcardManageUI$5
  implements Runnable
{
  WalletBankcardManageUI$5(WalletBankcardManageUI paramWalletBankcardManageUI, uo paramuo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45767);
    if (!bo.isNullOrNil(this.kHm.cQK.cQM))
    {
      e.a((TextView)this.tlZ.findViewById(2131821634), this.kHm.cQK.cQM, this.kHm.cQK.content, this.kHm.cQK.url);
      AppMethodBeat.o(45767);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletBankcardManageUI", "no bulletin data");
      AppMethodBeat.o(45767);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.5
 * JD-Core Version:    0.6.2
 */