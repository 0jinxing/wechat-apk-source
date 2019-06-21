package com.tencent.mm.plugin.wallet.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.wallet_core.model.f;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletBankcardManageUI$7
  implements View.OnClickListener
{
  WalletBankcardManageUI$7(WalletBankcardManageUI paramWalletBankcardManageUI, f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45769);
    paramView = new se();
    paramView.cOf.userName = this.tmb.txx;
    paramView.cOf.cOh = bo.bc(this.tmb.txy, "");
    paramView.cOf.scene = 1071;
    paramView.cOf.cOi = 0;
    a.xxA.m(paramView);
    AppMethodBeat.o(45769);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.7
 * JD-Core Version:    0.6.2
 */