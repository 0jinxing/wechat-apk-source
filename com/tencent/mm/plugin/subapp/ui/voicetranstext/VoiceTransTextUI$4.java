package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class VoiceTransTextUI$4
  implements ap.a
{
  VoiceTransTextUI$4(VoiceTransTextUI paramVoiceTransTextUI, int paramInt)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(25595);
    if (VoiceTransTextUI.m(this.swl))
      AppMethodBeat.o(25595);
    while (true)
    {
      return false;
      ab.d("MicroMsg.VoiceTransTextUI", "timmer get, delay:%d", new Object[] { Integer.valueOf(this.srY) });
      VoiceTransTextUI.a(this.swl, VoiceTransTextUI.a.swu);
      AppMethodBeat.o(25595);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI.4
 * JD-Core Version:    0.6.2
 */