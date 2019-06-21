package com.tencent.mm.plugin.voip_cs.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.model.q;
import com.tencent.mm.sdk.platformtools.ab;

final class VoipCSMainUI$16
  implements DialogInterface.OnClickListener
{
  VoipCSMainUI$16(VoipCSMainUI paramVoipCSMainUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(135404);
    ab.i("MicroMsg.voipcs.VoipCSMainUI", " start voip by user choose continue call  in not wifi network!");
    q.cJU();
    if (VoipCSMainUI.a(this.teJ))
      VoipCSMainUI.b(this.teJ);
    AppMethodBeat.o(135404);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI.16
 * JD-Core Version:    0.6.2
 */