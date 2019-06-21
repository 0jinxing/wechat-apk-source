package com.tencent.mm.plugin.wallet_payu.balance.ui;

import android.app.Activity;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

public class WalletPayUBalanceResultUI extends WalletBalanceResultUI
{
  public final void cu()
  {
    AppMethodBeat.i(48329);
    if (this.pWy != null)
    {
      this.thG.setText(e.e(this.pWy.pTN, this.pWy.pcl));
      if ((this.thJ != null) && (!bo.isNullOrNil(this.thJ.field_bankName)))
        if (!bo.isNullOrNil(this.thJ.field_bankcardTail))
        {
          this.pMc.setText(this.thJ.field_bankName + " " + getString(2131305177) + this.thJ.field_bankcardTail);
          AppMethodBeat.o(48329);
        }
    }
    while (true)
    {
      return;
      this.pMc.setText(this.thJ.field_bankName);
      AppMethodBeat.o(48329);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(48328);
    super.initView();
    this.thI.setVisibility(8);
    AppMethodBeat.o(48328);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceResultUI
 * JD-Core Version:    0.6.2
 */