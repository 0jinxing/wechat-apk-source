package com.tencent.mm.plugin.wenote.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public final class k$2
  implements j.a
{
  public k$2(k paramk)
  {
  }

  public final void onError()
  {
    AppMethodBeat.i(26665);
    ab.e("MicroMsg.WNNoteVoiceLogic", "SimpleVoiceRecorder,Record Failed");
    k.a(this.uNS).stopTimer();
    AppMethodBeat.o(26665);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.k.2
 * JD-Core Version:    0.6.2
 */