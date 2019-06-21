package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletIdCardCheckUI$3
  implements DialogInterface.OnClickListener
{
  WalletIdCardCheckUI$3(WalletIdCardCheckUI paramWalletIdCardCheckUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46324);
    this.tsc.setResult(-1);
    this.tsc.finish();
    AppMethodBeat.o(46324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI.3
 * JD-Core Version:    0.6.2
 */