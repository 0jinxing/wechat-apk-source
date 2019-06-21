package com.tencent.mm.plugin.wallet_core.ui.cashier;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements b.b
{
  a$1(a parama)
  {
  }

  public final void cSa()
  {
    AppMethodBeat.i(47736);
    ab.i("MicroMsg.WcPayCashierBankcardDialog", "cashier dialog has dismissed");
    this.tLI.dismiss();
    AppMethodBeat.o(47736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.a.1
 * JD-Core Version:    0.6.2
 */