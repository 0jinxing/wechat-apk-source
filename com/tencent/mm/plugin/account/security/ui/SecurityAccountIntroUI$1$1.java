package com.tencent.mm.plugin.account.security.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class SecurityAccountIntroUI$1$1
  implements DialogInterface.OnCancelListener
{
  SecurityAccountIntroUI$1$1(SecurityAccountIntroUI.1 param1, m paramm)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(69903);
    g.Rg().c(this.gzT);
    AppMethodBeat.o(69903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI.1.1
 * JD-Core Version:    0.6.2
 */