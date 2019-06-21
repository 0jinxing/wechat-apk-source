package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Dialog;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class BankRemitBankcardInputUI$27 extends s
{
  BankRemitBankcardInputUI$27(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(44544);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "click next btn");
    this.pMO.aqX();
    this.pMO.aoB();
    if (BankRemitBankcardInputUI.u(this.pMO))
      AppMethodBeat.o(44544);
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return;
      localObject1 = BankRemitBankcardInputUI.n(this.pMO).getText();
      localObject2 = BankRemitBankcardInputUI.r(this.pMO).getText();
      if ((bo.isNullOrNil((String)localObject1)) || (((String)localObject1).trim().isEmpty()) || (bo.isNullOrNil((String)localObject2)) || (((String)localObject2).trim().isEmpty()) || (BankRemitBankcardInputUI.v(this.pMO) == null))
      {
        ab.w("MicroMsg.BankRemitBankcardInputUI", "args is empty, payeeName: %s, bankCardNo: %s, bankcard: %s", new Object[] { localObject1, localObject2, BankRemitBankcardInputUI.v(this.pMO) });
        AppMethodBeat.o(44544);
      }
      else
      {
        ab.i("MicroMsg.BankRemitBankcardInputUI", "onRealClick() ifGetOperation:%s waitingGetOperation:%s ifAutoNext:%s", new Object[] { Boolean.valueOf(BankRemitBankcardInputUI.m(this.pMO)), Boolean.valueOf(BankRemitBankcardInputUI.x(this.pMO)), Boolean.valueOf(BankRemitBankcardInputUI.y(this.pMO)) });
        if (!BankRemitBankcardInputUI.m(this.pMO))
          break;
        if (!BankRemitBankcardInputUI.z(this.pMO))
          break label348;
        if (BankRemitBankcardInputUI.i(this.pMO))
        {
          ab.i("MicroMsg.BankRemitBankcardInputUI", "from record goto next direct");
          BankRemitBankcardInputUI.A(this.pMO);
          AppMethodBeat.o(44544);
        }
        else
        {
          BankRemitBankcardInputUI.a(this.pMO, (String)localObject1, (String)localObject2, BankRemitBankcardInputUI.v(this.pMO).nuL, BankRemitBankcardInputUI.v(this.pMO).pbn);
          AppMethodBeat.o(44544);
        }
      }
    }
    BankRemitBankcardInputUI.b(this.pMO, true);
    BankRemitBankcardInputUI.a(this.pMO, (String)localObject1);
    BankRemitBankcardInputUI.b(this.pMO, (String)localObject2);
    if (BankRemitBankcardInputUI.B(this.pMO) != null)
      BankRemitBankcardInputUI.B(this.pMO).show();
    while (true)
    {
      if (!BankRemitBankcardInputUI.x(this.pMO))
        BankRemitBankcardInputUI.G(this.pMO);
      label348: AppMethodBeat.o(44544);
      break;
      localObject2 = this.pMO;
      localObject1 = this.pMO;
      this.pMO.getString(2131296899);
      BankRemitBankcardInputUI.a((BankRemitBankcardInputUI)localObject2, h.b((Context)localObject1, this.pMO.getString(2131305190), true, new BankRemitBankcardInputUI.27.1(this)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.27
 * JD-Core Version:    0.6.2
 */