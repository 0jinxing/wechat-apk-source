package com.tencent.mm.plugin.offline.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletOfflineCoinPurseUI$22
  implements DialogInterface.OnClickListener
{
  WalletOfflineCoinPurseUI$22(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(43528);
    paramDialogInterface.dismiss();
    this.pav.finish();
    AppMethodBeat.o(43528);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.22
 * JD-Core Version:    0.6.2
 */