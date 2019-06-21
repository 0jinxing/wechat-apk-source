package com.tencent.mm.pluginsdk.ui.chat;

import android.telephony.PhoneStateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout;
import com.tencent.mm.sdk.platformtools.ab;

final class n$b extends PhoneStateListener
{
  VoiceInputLayout voR;

  public n$b(VoiceInputLayout paramVoiceInputLayout)
  {
    this.voR = paramVoiceInputLayout;
  }

  public final void onCallStateChanged(int paramInt, String paramString)
  {
    AppMethodBeat.i(27984);
    super.onCallStateChanged(paramInt, paramString);
    int i = -1;
    if (this.voR != null)
    {
      i = this.voR.getCurrentState();
      this.voR.amA();
    }
    ab.d("MicroMsg.VoiceInputPanel", "onCallStateChanged :%s, currentState: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if (i != 2)
      AppMethodBeat.o(27984);
    while (true)
    {
      return;
      AppMethodBeat.o(27984);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.n.b
 * JD-Core Version:    0.6.2
 */