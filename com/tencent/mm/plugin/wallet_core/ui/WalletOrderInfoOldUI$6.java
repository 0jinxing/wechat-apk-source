package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class WalletOrderInfoOldUI$6
  implements ao.b.a
{
  WalletOrderInfoOldUI$6(WalletOrderInfoOldUI paramWalletOrderInfoOldUI)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(47479);
    ad localad = ((j)g.K(j.class)).XM().aoO(paramString);
    ab.d("MicroMsg.WalletOrderInfoOldUI", "call back from contactServer " + paramString + " succ: " + paramBoolean);
    this.tIW.S(localad);
    AppMethodBeat.o(47479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.6
 * JD-Core Version:    0.6.2
 */