package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.z;

final class EmailVerifyUI$7
  implements DialogInterface.OnCancelListener
{
  EmailVerifyUI$7(EmailVerifyUI paramEmailVerifyUI, z paramz)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124765);
    g.Rg().c(this.gAR);
    AppMethodBeat.o(124765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.EmailVerifyUI.7
 * JD-Core Version:    0.6.2
 */