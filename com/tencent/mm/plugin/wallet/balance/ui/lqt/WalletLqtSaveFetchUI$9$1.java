package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;

final class WalletLqtSaveFetchUI$9$1
  implements d.a
{
  WalletLqtSaveFetchUI$9$1(WalletLqtSaveFetchUI.9 param9)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(45654);
    ab.i("MicroMsg.WalletLqtSaveFetchUI", "save failed: %s", new Object[] { paramObject });
    this.tkT.tkP.aDw();
    if (paramObject != null)
      if (!(paramObject instanceof String))
        break label63;
    label63: for (paramObject = paramObject.toString(); ; paramObject = this.tkT.tkP.getString(2131304945))
    {
      this.tkT.tkP.Vz(paramObject);
      AppMethodBeat.o(45654);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.9.1
 * JD-Core Version:    0.6.2
 */