package com.tencent.mm.plugin.voip_cs.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipCSMainUI$11
  implements DialogInterface.OnClickListener
{
  VoipCSMainUI$11(VoipCSMainUI paramVoipCSMainUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(135399);
    paramDialogInterface.dismiss();
    this.teJ.GV(0);
    AppMethodBeat.o(135399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI.11
 * JD-Core Version:    0.6.2
 */