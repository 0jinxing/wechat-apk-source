package com.tencent.mm.plugin.music.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements Runnable
{
  b$1(b paramb, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137649);
    ab.i("MicroMsg.Music.BasePlayer", "onError, needRetry:%b", new Object[] { Boolean.valueOf(this.oNS) });
    this.oNT.oNQ.c(this.oNT.oLt, this.oNS);
    AppMethodBeat.o(137649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.a.b.1
 * JD-Core Version:    0.6.2
 */