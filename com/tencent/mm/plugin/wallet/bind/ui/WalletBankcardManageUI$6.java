package com.tencent.mm.plugin.wallet.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.f;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WalletBankcardManageUI$6
  implements View.OnClickListener
{
  WalletBankcardManageUI$6(WalletBankcardManageUI paramWalletBankcardManageUI, f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45768);
    if (!bo.isNullOrNil(this.tmb.txw))
      e.n(this.tlZ.mController.ylL, this.tmb.txw, false);
    AppMethodBeat.o(45768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.6
 * JD-Core Version:    0.6.2
 */