package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class VoiceTransTextUI$5$1
  implements Runnable
{
  VoiceTransTextUI$5$1(VoiceTransTextUI.5 param5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25596);
    ab.i("MicroMsg.VoiceTransTextUI", "notify has new trans, so pull");
    if (VoiceTransTextUI.q(this.swn.swl) != null)
      VoiceTransTextUI.q(this.swn.swl).stopTimer();
    VoiceTransTextUI.a(this.swn.swl, VoiceTransTextUI.a.swu);
    AppMethodBeat.o(25596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI.5.1
 * JD-Core Version:    0.6.2
 */