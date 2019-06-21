package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.widget.MMSwitchBtn;

final class WalletUniversalPayOrderUI$3$1
  implements DialogInterface.OnClickListener
{
  WalletUniversalPayOrderUI$3$1(WalletUniversalPayOrderUI.3 param3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46424);
    WalletUniversalPayOrderUI.d(this.ttz.ttx).setCheck(false);
    h.pYm.e(16343, new Object[] { Integer.valueOf(4) });
    AppMethodBeat.o(46424);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.3.1
 * JD-Core Version:    0.6.2
 */