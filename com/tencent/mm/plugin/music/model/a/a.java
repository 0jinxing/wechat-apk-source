package com.tencent.mm.plugin.music.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.music.cache.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class a
  implements b
{
  public final void bTy()
  {
    AppMethodBeat.i(138732);
    bUn();
    AppMethodBeat.o(138732);
  }

  public final void bUn()
  {
    AppMethodBeat.i(104908);
    long l1 = ((Long)g.RP().Ry().get(ac.a.xQS, Long.valueOf(0L))).longValue();
    long l2 = System.currentTimeMillis();
    if (l2 - l1 < cls.longValue())
    {
      ab.e("MicroMsg.PieceCacheCleanController", "don't scanMusic because the time is in one day");
      AppMethodBeat.o(104908);
    }
    while (true)
    {
      return;
      g.RP().Ry().set(ac.a.xQS, Long.valueOf(l2));
      d.f(new a.1(this), "ScanMusicThread");
      AppMethodBeat.o(104908);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a
 * JD-Core Version:    0.6.2
 */