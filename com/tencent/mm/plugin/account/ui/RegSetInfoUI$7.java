package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.s;

final class RegSetInfoUI$7
  implements DialogInterface.OnCancelListener
{
  RegSetInfoUI$7(RegSetInfoUI paramRegSetInfoUI, s params)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125512);
    g.Rg().c(this.gHN);
    g.Rg().b(126, this.gHM);
    AppMethodBeat.o(125512);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.7
 * JD-Core Version:    0.6.2
 */