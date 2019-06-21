package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.bind.a.b;

final class VerifyQQUI$3$1
  implements DialogInterface.OnCancelListener
{
  VerifyQQUI$3$1(VerifyQQUI.3 param3, b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13779);
    g.Rg().c(this.guz);
    AppMethodBeat.o(13779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.VerifyQQUI.3.1
 * JD-Core Version:    0.6.2
 */