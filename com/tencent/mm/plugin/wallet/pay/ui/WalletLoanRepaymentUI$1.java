package com.tencent.mm.plugin.wallet.pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.c.s;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.q.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletLoanRepaymentUI$1
  implements q.c
{
  WalletLoanRepaymentUI$1(WalletLoanRepaymentUI paramWalletLoanRepaymentUI)
  {
  }

  public final void a(String paramString, FavorPayInfo paramFavorPayInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(45991);
    WalletLoanRepaymentUI.a(this.toY, paramString);
    this.toY.a(new s(WalletLoanRepaymentUI.a(this.toY), WalletLoanRepaymentUI.b(this.toY), (byte)0), true, true);
    AppMethodBeat.o(45991);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.1
 * JD-Core Version:    0.6.2
 */