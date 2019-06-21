package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class BankRemitBankcardInputUI$12$2
  implements n.d
{
  BankRemitBankcardInputUI$12$2(BankRemitBankcardInputUI.12 param12)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(44525);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(44525);
      return;
      if (!bo.isNullOrNil(BankRemitBankcardInputUI.b(this.pMT.pMO)))
        e.n(this.pMT.pMO.mController.ylL, BankRemitBankcardInputUI.b(this.pMT.pMO), false);
      while (true)
      {
        h.pYm.e(14673, new Object[] { Integer.valueOf(6) });
        AppMethodBeat.o(44525);
        break;
        ab.w("MicroMsg.BankRemitBankcardInputUI", "paylist url is null");
      }
      e.n(this.pMT.pMO.mController.ylL, "https://kf.qq.com/touch/scene_product.html?scene_id=kf4568", true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.12.2
 * JD-Core Version:    0.6.2
 */