package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletPayUChangeBankcardUI$1
  implements b.b
{
  WalletPayUChangeBankcardUI$1(WalletPayUChangeBankcardUI paramWalletPayUChangeBankcardUI)
  {
  }

  public final void a(String paramString1, String paramString2, FavorPayInfo paramFavorPayInfo)
  {
    AppMethodBeat.i(48461);
    WalletPayUChangeBankcardUI.a(this.tUc, paramFavorPayInfo);
    this.tUc.mBundle.putParcelable("key_favor_pay_info", WalletPayUChangeBankcardUI.a(this.tUc));
    WalletPayUChangeBankcardUI.a(this.tUc, paramString1);
    WalletPayUChangeBankcardUI.b(this.tUc, paramString2);
    this.tUc.aqX();
    this.tUc.acs(paramString1);
    AppMethodBeat.o(48461);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUChangeBankcardUI.1
 * JD-Core Version:    0.6.2
 */