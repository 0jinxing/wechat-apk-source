package com.tencent.mm.plugin.music.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137650);
    ab.i("MicroMsg.Music.BasePlayer", "onStart %b", new Object[] { Boolean.valueOf(this.oNT.isPlaying()) });
    this.oNT.oNQ.k(this.oNT.oLt);
    AppMethodBeat.o(137650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.a.b.2
 * JD-Core Version:    0.6.2
 */