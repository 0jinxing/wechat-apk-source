package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class ac$6$1
  implements DialogInterface.OnCancelListener
{
  ac$6$1(ac.6 param6)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(38343);
    this.rkU.rkS.rkO = null;
    this.rkU.rkS.rkz = false;
    al.af(this.rkU.rkS.rkQ);
    AppMethodBeat.o(38343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ac.6.1
 * JD-Core Version:    0.6.2
 */