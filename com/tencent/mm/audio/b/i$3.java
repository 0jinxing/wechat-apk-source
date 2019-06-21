package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class i$3
  implements ap.a
{
  i$3(i parami)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(116521);
    ab.d("MicroMsg.SceneVoiceService", "onTimerExpired");
    i.h(this.cre);
    AppMethodBeat.o(116521);
    return false;
  }

  public final String toString()
  {
    AppMethodBeat.i(116522);
    String str = super.toString() + "|scenePusher";
    AppMethodBeat.o(116522);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.i.3
 * JD-Core Version:    0.6.2
 */