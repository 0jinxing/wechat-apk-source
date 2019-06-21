package com.tencent.mm.plugin.wallet.balance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.cashier.b.a;
import com.tencent.mm.wallet_core.d.g;

final class WalletBalanceFetchPwdInputUI$2
  implements b.a
{
  WalletBalanceFetchPwdInputUI$2(WalletBalanceFetchPwdInputUI paramWalletBalanceFetchPwdInputUI)
  {
  }

  public final void a(String paramString, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard)
  {
    AppMethodBeat.i(45336);
    if (this.tgz.dOD() != null)
      this.tgz.dOE().p(new Object[] { paramString });
    AppMethodBeat.o(45336);
  }

  public final void cMN()
  {
  }

  public final void onCancel()
  {
    AppMethodBeat.i(45337);
    this.tgz.finish();
    h.pYm.e(16398, new Object[] { WalletBalanceFetchPwdInputUI.a(this.tgz), Integer.valueOf(8), "", "" });
    AppMethodBeat.o(45337);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI.2
 * JD-Core Version:    0.6.2
 */