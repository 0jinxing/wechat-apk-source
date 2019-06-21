package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.aa;
import com.tencent.mm.wallet_core.ui.d;

final class WalletDigitalCertUI$4 extends d
{
  WalletDigitalCertUI$4(WalletDigitalCertUI paramWalletDigitalCertUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46255);
    if ((paramView.getTag() instanceof aa))
    {
      paramView = (aa)paramView.getTag();
      h.a(this.trr, this.trr.getString(2131305105, new Object[] { paramView.xoz }), "", this.trr.getString(2131296881), this.trr.getString(2131296868), true, new WalletDigitalCertUI.4.1(this, paramView), null);
    }
    AppMethodBeat.o(46255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI.4
 * JD-Core Version:    0.6.2
 */