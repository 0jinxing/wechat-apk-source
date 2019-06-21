package com.tencent.mm.pluginsdk.ui.websearch;

import android.telephony.PhoneStateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout;
import com.tencent.mm.sdk.platformtools.ab;

final class a$4 extends PhoneStateListener
{
  a$4(a parama)
  {
  }

  public final void onCallStateChanged(int paramInt, String paramString)
  {
    AppMethodBeat.i(28243);
    super.onCallStateChanged(paramInt, paramString);
    int i = -1;
    if (a.f(this.vwd) != null)
      i = a.f(this.vwd).getCurrentState();
    ab.d("MicroMsg.VoiceInputPanel", "onCallStateChanged :%s, currentState: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    a.f(this.vwd);
    if (i != 2)
      AppMethodBeat.o(28243);
    while (true)
    {
      return;
      this.vwd.pause();
      AppMethodBeat.o(28243);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.websearch.a.4
 * JD-Core Version:    0.6.2
 */