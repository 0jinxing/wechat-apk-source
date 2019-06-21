package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.b;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.vending.g.f;

final class z$1
  implements d.a
{
  z$1(z paramz)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(45306);
    ab.i("MicroMsg.LqtSaveFetchLogic", "onInterrupt %s", new Object[] { paramObject });
    z.a(this.tgm).aDw();
    f.dMj().cR(paramObject);
    AppMethodBeat.o(45306);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.z.1
 * JD-Core Version:    0.6.2
 */