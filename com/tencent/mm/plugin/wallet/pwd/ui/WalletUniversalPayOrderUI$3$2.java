package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class WalletUniversalPayOrderUI$3$2
  implements DialogInterface.OnClickListener
{
  WalletUniversalPayOrderUI$3$2(WalletUniversalPayOrderUI.3 param3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46425);
    WalletUniversalPayOrderUI.f(this.ttz.ttx);
    h.pYm.e(16343, new Object[] { Integer.valueOf(5) });
    AppMethodBeat.o(46425);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.3.2
 * JD-Core Version:    0.6.2
 */