package com.tencent.mm.plugin.wallet_ecard.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.protocal.protobuf.cif;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WalletECardLogoutUI$5
  implements o.a
{
  WalletECardLogoutUI$5(WalletECardLogoutUI paramWalletECardLogoutUI, cif paramcif)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(48150);
    e.n(this.tQM.mController.ylL, this.tQO.wdd, false);
    AppMethodBeat.o(48150);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI.5
 * JD-Core Version:    0.6.2
 */