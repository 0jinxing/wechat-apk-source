package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$4
  implements DialogInterface.OnClickListener
{
  b$4(Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(43468);
    if ((this.val$activity instanceof WalletOfflineCoinPurseUI))
      ((WalletOfflineCoinPurseUI)this.val$activity).par = false;
    paramDialogInterface.dismiss();
    AppMethodBeat.o(43468);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.b.4
 * JD-Core Version:    0.6.2
 */