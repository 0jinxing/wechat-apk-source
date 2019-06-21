package com.tencent.mm.plugin.voip_cs.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipCSMainUI$15
  implements DialogInterface.OnClickListener
{
  VoipCSMainUI$15(VoipCSMainUI paramVoipCSMainUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(135403);
    paramDialogInterface.dismiss();
    this.teJ.GV(9);
    AppMethodBeat.o(135403);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI.15
 * JD-Core Version:    0.6.2
 */