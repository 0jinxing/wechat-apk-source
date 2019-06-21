package com.tencent.mm.plugin.wallet.pay.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.i;
import com.tencent.mm.plugin.wallet_core.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletChangeBankcardUI$6
  implements View.OnClickListener
{
  WalletChangeBankcardUI$6(WalletChangeBankcardUI paramWalletChangeBankcardUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45963);
    if (this.toL.toD != null)
      this.toL.toD.dismiss();
    this.toL.mW(false);
    this.toL.toF.f(this.toL.tgB, true);
    this.toL.toH = ((FavorPayInfo)paramView.getTag());
    if (this.toL.toH != null)
      this.toL.toH.tzf = "";
    this.toL.mBundle.putParcelable("key_favor_pay_info", this.toL.toH);
    this.toL.cu();
    this.toL.AM(0);
    this.toL.toJ = null;
    AppMethodBeat.o(45963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.6
 * JD-Core Version:    0.6.2
 */