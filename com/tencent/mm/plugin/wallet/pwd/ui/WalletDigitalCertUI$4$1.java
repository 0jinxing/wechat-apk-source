package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.aa;
import com.tencent.mm.wallet_core.c.m;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletDigitalCertUI$4$1
  implements DialogInterface.OnClickListener
{
  WalletDigitalCertUI$4$1(WalletDigitalCertUI.4 param4, aa paramaa)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46254);
    ab.i("MicroMsg.WalletDigitalCertUI", "del crt %s", new Object[] { this.trs.xfz });
    paramDialogInterface = new m(this.trs.xfz);
    this.trt.trr.a(paramDialogInterface, true, true);
    paramDialogInterface = new bj();
    paramDialogInterface.cVT = 2L;
    paramDialogInterface.dcm = 1L;
    paramDialogInterface.ajK();
    AppMethodBeat.o(46254);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI.4.1
 * JD-Core Version:    0.6.2
 */