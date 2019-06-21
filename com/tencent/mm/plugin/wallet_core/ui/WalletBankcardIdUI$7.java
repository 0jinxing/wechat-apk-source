package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.wallet_core.ui.e;

final class WalletBankcardIdUI$7
  implements View.OnClickListener
{
  WalletBankcardIdUI$7(WalletBankcardIdUI paramWalletBankcardIdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47167);
    h.pYm.e(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
    e.d(this.tEv, r.cPI().bhp());
    AppMethodBeat.o(47167);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.7
 * JD-Core Version:    0.6.2
 */