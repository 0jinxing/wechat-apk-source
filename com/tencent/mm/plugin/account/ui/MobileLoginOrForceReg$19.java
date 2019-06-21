package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;

final class MobileLoginOrForceReg$19
  implements DialogInterface.OnCancelListener
{
  MobileLoginOrForceReg$19(MobileLoginOrForceReg paramMobileLoginOrForceReg, r paramr)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125221);
    g.Rg().c(this.gCx);
    AppMethodBeat.o(125221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.19
 * JD-Core Version:    0.6.2
 */