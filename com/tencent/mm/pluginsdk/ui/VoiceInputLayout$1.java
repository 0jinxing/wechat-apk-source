package com.tencent.mm.pluginsdk.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class VoiceInputLayout$1 extends ak
{
  VoiceInputLayout$1(VoiceInputLayout paramVoiceInputLayout)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(27579);
    if (paramMessage.what != 0)
    {
      if (paramMessage.what == 1)
        ab.w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", new Object[] { Integer.valueOf(this.vjt.currentState) });
    }
    else
    {
      ab.d("MicroMsg.VoiceInputLayout", "Recognized force finished %s", new Object[] { Integer.valueOf(this.vjt.currentState) });
      if (this.vjt.currentState == 3)
        break label96;
      AppMethodBeat.o(27579);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(27579);
      continue;
      label96: VoiceInputLayout.a(this.vjt).removeMessages(0);
      VoiceInputLayout.a(this.vjt).removeMessages(1);
      if (VoiceInputLayout.b(this.vjt) != null)
        VoiceInputLayout.b(this.vjt).cancel(true);
      this.vjt.reset(true);
      AppMethodBeat.o(27579);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputLayout.1
 * JD-Core Version:    0.6.2
 */