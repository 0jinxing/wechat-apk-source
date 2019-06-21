package com.tencent.mm.plugin.music.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$4
  implements Runnable
{
  b$4(b paramb, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137652);
    ab.i("MicroMsg.Music.BasePlayer", "onStop, isComplete:%b", new Object[] { Boolean.valueOf(this.oNU) });
    this.oNT.oNQ.b(this.oNT.oLt, this.oNU);
    AppMethodBeat.o(137652);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.a.b.4
 * JD-Core Version:    0.6.2
 */