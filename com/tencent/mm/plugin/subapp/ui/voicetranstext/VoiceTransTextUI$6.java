package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class VoiceTransTextUI$6 extends ak
{
  VoiceTransTextUI$6(VoiceTransTextUI paramVoiceTransTextUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(25599);
    int i = paramMessage.what;
    if (i == 1)
    {
      VoiceTransTextUI.b(this.swl, true);
      AppMethodBeat.o(25599);
    }
    while (true)
    {
      return;
      if (i == 2)
        VoiceTransTextUI.b(this.swl, false);
      AppMethodBeat.o(25599);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI.6
 * JD-Core Version:    0.6.2
 */