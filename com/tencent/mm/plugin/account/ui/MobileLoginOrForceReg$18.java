package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileLoginOrForceReg$18
  implements DialogInterface.OnDismissListener
{
  MobileLoginOrForceReg$18(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125220);
    MobileLoginOrForceReg.s(this.gEv);
    AppMethodBeat.o(125220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.18
 * JD-Core Version:    0.6.2
 */