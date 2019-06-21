package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.b.a;

final class RegSetInfoUI$26
  implements DialogInterface.OnClickListener
{
  RegSetInfoUI$26(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125532);
    a.wA("R500_100");
    paramDialogInterface = new Intent(this.gHM, RegByEmailUI.class);
    paramDialogInterface.addFlags(67108864);
    this.gHM.startActivity(paramDialogInterface);
    this.gHM.finish();
    AppMethodBeat.o(125532);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.26
 * JD-Core Version:    0.6.2
 */