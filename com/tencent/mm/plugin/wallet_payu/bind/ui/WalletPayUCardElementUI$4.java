package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery.PayUBankcardElement;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.HashMap;

final class WalletPayUCardElementUI$4
  implements View.OnClickListener
{
  WalletPayUCardElementUI$4(WalletPayUCardElementUI paramWalletPayUCardElementUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48363);
    paramView = (NetScenePayUElementQuery.PayUBankcardElement)WalletPayUCardElementUI.d(this.tSX).get(WalletPayUCardElementUI.c(this.tSX).getText());
    if (paramView == null)
    {
      ab.e("MicroMsg.WalletPayUCardElementUI", "hy: should not be NULL!!!");
      AppMethodBeat.o(48363);
    }
    while (true)
    {
      return;
      WalletPayUCardElementUI.c(this.tSX).setEncryptType(50);
      this.tSX.mBundle.putParcelable("key_card_element", paramView);
      this.tSX.mBundle.putString("key_card_id", WalletPayUCardElementUI.c(this.tSX).getText());
      this.tSX.mBundle.putString("key_cvv", WalletPayUCardElementUI.a(this.tSX).getText());
      this.tSX.mBundle.putString("key_expire_data", this.tSX.tSM.getText());
      this.tSX.dOE().p(new Object[0]);
      AppMethodBeat.o(48363);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI.4
 * JD-Core Version:    0.6.2
 */