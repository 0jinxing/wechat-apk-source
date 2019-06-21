package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.balance.a.a.aa;
import com.tencent.mm.plugin.wallet.balance.a.a.aa.a;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.protocal.protobuf.bqr;
import com.tencent.mm.protocal.protobuf.ha;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletLqtSaveFetchUI$9
  implements View.OnClickListener
{
  WalletLqtSaveFetchUI$9(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45660);
    if (bo.az(WalletLqtSaveFetchUI.p(this.tkP)) < 800L)
    {
      ab.d("MicroMsg.WalletLqtSaveFetchUI", "saveButton click too soon");
      AppMethodBeat.o(45660);
    }
    while (true)
    {
      return;
      WalletLqtSaveFetchUI.a(this.tkP, bo.yz());
      int i = WalletLqtSaveFetchUI.gJ(WalletLqtSaveFetchUI.c(this.tkP).getText(), "100");
      if (i > 0)
      {
        this.tkP.dOz();
        if (WalletLqtSaveFetchUI.h(this.tkP) == 1)
        {
          ab.i("MicroMsg.WalletLqtSaveFetchUI", "click save lqt");
          paramView = WalletLqtSaveFetchUI.r(this.tkP).tgp;
          f.h(Integer.valueOf(i), Integer.valueOf(WalletLqtSaveFetchUI.q(this.tkP)), WalletLqtSaveFetchUI.d(this.tkP)).c(paramView).f(new WalletLqtSaveFetchUI.9.2(this, i)).a(new WalletLqtSaveFetchUI.9.1(this));
          AppMethodBeat.o(45660);
        }
        else if (WalletLqtSaveFetchUI.h(this.tkP) == 2)
        {
          ab.i("MicroMsg.WalletLqtSaveFetchUI", "click fetch lqt");
          aa.a locala = null;
          paramView = locala;
          if (WalletLqtSaveFetchUI.d(this.tkP) != null)
          {
            paramView = locala;
            if (!WalletLqtSaveFetchUI.d(this.tkP).cPc())
            {
              paramView = new ha();
              paramView.nuL = WalletLqtSaveFetchUI.d(this.tkP).field_bankName;
              paramView.pbn = WalletLqtSaveFetchUI.d(this.tkP).field_bankcardType;
              paramView.vJF = WalletLqtSaveFetchUI.d(this.tkP).field_bindSerial;
              paramView.pck = WalletLqtSaveFetchUI.d(this.tkP).field_bankcardTail;
            }
          }
          int j = -1;
          if (WalletLqtSaveFetchUI.s(this.tkP).getSelectRedeemType() != null)
            j = WalletLqtSaveFetchUI.s(this.tkP).getSelectRedeemType().wOl;
          locala = WalletLqtSaveFetchUI.r(this.tkP).tgq;
          f.b(Integer.valueOf(i), Integer.valueOf(WalletLqtSaveFetchUI.q(this.tkP)), Integer.valueOf(j), paramView).c(locala).f(new WalletLqtSaveFetchUI.9.4(this, i)).a(new WalletLqtSaveFetchUI.9.3(this));
        }
      }
      else
      {
        AppMethodBeat.o(45660);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.9
 * JD-Core Version:    0.6.2
 */