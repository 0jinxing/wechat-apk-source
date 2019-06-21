package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegSetInfoUI$21
  implements DialogInterface.OnClickListener
{
  RegSetInfoUI$21(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125527);
    if (RegSetInfoUI.I(this.gHM) == 2)
    {
      paramDialogInterface = new Intent(this.gHM, MobileInputUI.class);
      paramDialogInterface.putExtra("mobile_input_purpose", 2);
    }
    while (true)
    {
      paramDialogInterface.addFlags(67108864);
      this.gHM.startActivity(paramDialogInterface);
      this.gHM.finish();
      AppMethodBeat.o(125527);
      return;
      paramDialogInterface = new Intent(this.gHM, RegByMobileRegAIOUI.class);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.21
 * JD-Core Version:    0.6.2
 */