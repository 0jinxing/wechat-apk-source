package com.tencent.mm.plugin.voip_cs.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipCSMainUI$7
  implements DialogInterface.OnClickListener
{
  VoipCSMainUI$7(VoipCSMainUI paramVoipCSMainUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(135395);
    paramDialogInterface.dismiss();
    this.teJ.GV(2);
    AppMethodBeat.o(135395);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI.7
 * JD-Core Version:    0.6.2
 */