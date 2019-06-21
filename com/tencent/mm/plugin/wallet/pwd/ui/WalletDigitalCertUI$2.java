package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.wallet_core.c.ab;
import com.tencent.mm.wallet_core.c.m;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.d;

final class WalletDigitalCertUI$2 extends d
{
  WalletDigitalCertUI$2(WalletDigitalCertUI paramWalletDigitalCertUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46252);
    ab.dNZ();
    paramView = new m(ab.dNY());
    this.trr.a(paramView, true, true);
    h.pYm.e(13731, new Object[] { Integer.valueOf(10) });
    AppMethodBeat.o(46252);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI.2
 * JD-Core Version:    0.6.2
 */