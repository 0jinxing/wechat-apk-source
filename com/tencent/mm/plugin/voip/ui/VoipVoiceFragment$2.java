package com.tencent.mm.plugin.voip.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.TimerTask;

final class VoipVoiceFragment$2 extends TimerTask
{
  VoipVoiceFragment$2(VoipVoiceFragment paramVoipVoiceFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4940);
    this.sYV.iGP.post(new VoipVoiceFragment.2.1(this));
    AppMethodBeat.o(4940);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVoiceFragment.2
 * JD-Core Version:    0.6.2
 */