package com.tencent.mm.plugin.fts.ui.widget;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class VoiceInputLayout$1 extends ak
{
  VoiceInputLayout$1(VoiceInputLayout paramVoiceInputLayout)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(62207);
    if (paramMessage.what != 0)
    {
      if (paramMessage.what == 1)
        ab.w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", new Object[] { Integer.valueOf(this.mNl.currentState) });
    }
    else
    {
      ab.d("MicroMsg.VoiceInputLayout", "Recognized force finished %s", new Object[] { Integer.valueOf(this.mNl.currentState) });
      if (this.mNl.currentState == 3)
        break label93;
      AppMethodBeat.o(62207);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(62207);
      continue;
      label93: VoiceInputLayout.a(this.mNl).removeMessages(0);
      VoiceInputLayout.a(this.mNl).removeMessages(1);
      if (VoiceInputLayout.b(this.mNl) != null)
        VoiceInputLayout.b(this.mNl).cancel(true);
      this.mNl.reset(true);
      AppMethodBeat.o(62207);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout.1
 * JD-Core Version:    0.6.2
 */