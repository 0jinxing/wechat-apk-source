package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.s;

final class RegByMobileSetNickUI$1$1
  implements DialogInterface.OnCancelListener
{
  RegByMobileSetNickUI$1$1(RegByMobileSetNickUI.1 param1, s params)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125428);
    g.Rg().c(this.gGy);
    AppMethodBeat.o(125428);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSetNickUI.1.1
 * JD-Core Version:    0.6.2
 */