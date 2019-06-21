package com.tencent.mm.plugin.voip_cs.ui;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip_cs.b.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class VoipCSMainUI$3
  implements HeadsetPlugReceiver.a
{
  VoipCSMainUI$3(VoipCSMainUI paramVoipCSMainUI)
  {
  }

  public final void fS(boolean paramBoolean)
  {
    AppMethodBeat.i(135391);
    ab.d("MicroMsg.voipcs.VoipCSMainUI", "onHeadsetState, on:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (VoipCSMainUI.d(this.teJ) == paramBoolean)
    {
      ab.d("MicroMsg.voipcs.VoipCSMainUI", "same status, no changed");
      AppMethodBeat.o(135391);
    }
    while (true)
    {
      return;
      VoipCSMainUI.a(this.teJ, paramBoolean);
      if (paramBoolean)
      {
        VoipCSMainUI.c(this.teJ).mr(false);
        Toast.makeText(ah.getContext(), ah.getContext().getString(2131304485), 0).show();
        AppMethodBeat.o(135391);
      }
      else
      {
        VoipCSMainUI.c(this.teJ).mr(true);
        Toast.makeText(ah.getContext(), ah.getContext().getString(2131304486), 0).show();
        AppMethodBeat.o(135391);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI.3
 * JD-Core Version:    0.6.2
 */