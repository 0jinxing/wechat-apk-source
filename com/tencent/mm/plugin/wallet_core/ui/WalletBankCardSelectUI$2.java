package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.o.b;

final class WalletBankCardSelectUI$2
  implements o.b
{
  WalletBankCardSelectUI$2(WalletBankCardSelectUI paramWalletBankCardSelectUI)
  {
  }

  public final void apo()
  {
    AppMethodBeat.i(47142);
    WalletBankCardSelectUI.a(this.tEf, false);
    this.tEf.aqX();
    WalletBankCardSelectUI.a(this.tEf).ql(true);
    WalletBankCardSelectUI.a(this.tEf).setMode(0);
    AppMethodBeat.o(47142);
  }

  public final void app()
  {
    AppMethodBeat.i(47141);
    WalletBankCardSelectUI.a(this.tEf, true);
    WalletBankCardSelectUI.a(this.tEf).ql(false);
    WalletBankCardSelectUI.a(this.tEf).setMode(1);
    AppMethodBeat.o(47141);
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(47144);
    this.tEf.aqX();
    AppMethodBeat.o(47144);
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(47143);
    ab.d("WalletBankCardSelectUI", "search text: %s", new Object[] { paramString });
    WalletBankCardSelectUI.a(this.tEf).aqS(paramString);
    AppMethodBeat.o(47143);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI.2
 * JD-Core Version:    0.6.2
 */