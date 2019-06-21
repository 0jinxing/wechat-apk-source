package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class BankRemitMoneyInputUI$3 extends s
{
  BankRemitMoneyInputUI$3(BankRemitMoneyInputUI paramBankRemitMoneyInputUI)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(44632);
    ab.d("MicroMsg.BankRemitMoneyInputUI", "on click next");
    double d = a.fM(BankRemitMoneyInputUI.c(this.pNT).getText(), "100");
    if (d <= 0.0D)
    {
      ab.w("MicroMsg.BankRemitMoneyInputUI", "illegal money: %s", new Object[] { Double.valueOf(d) });
      Toast.makeText(this.pNT, 2131297465, 1).show();
      AppMethodBeat.o(44632);
    }
    while (true)
    {
      return;
      BankRemitMoneyInputUI.d(this.pNT);
      AppMethodBeat.o(44632);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.3
 * JD-Core Version:    0.6.2
 */