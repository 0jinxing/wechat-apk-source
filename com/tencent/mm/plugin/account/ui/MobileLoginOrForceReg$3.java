package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileLoginOrForceReg$3
  implements DialogInterface.OnDismissListener
{
  MobileLoginOrForceReg$3(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125206);
    MobileLoginOrForceReg.s(this.gEv);
    AppMethodBeat.o(125206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.3
 * JD-Core Version:    0.6.2
 */