package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.s;

final class RegSetInfoUI$10$1
  implements DialogInterface.OnCancelListener
{
  RegSetInfoUI$10$1(RegSetInfoUI.10 param10, s params)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125515);
    g.Rg().c(this.gEz);
    g.Rg().b(126, this.gHO.gHM);
    AppMethodBeat.o(125515);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.10.1
 * JD-Core Version:    0.6.2
 */