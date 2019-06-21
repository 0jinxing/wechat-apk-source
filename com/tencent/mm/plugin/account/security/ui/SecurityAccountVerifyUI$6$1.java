package com.tencent.mm.plugin.account.security.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class SecurityAccountVerifyUI$6$1
  implements DialogInterface.OnCancelListener
{
  SecurityAccountVerifyUI$6$1(SecurityAccountVerifyUI.6 param6, m paramm)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(69921);
    g.Rg().c(this.gAc);
    AppMethodBeat.o(69921);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI.6.1
 * JD-Core Version:    0.6.2
 */