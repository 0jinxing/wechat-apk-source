package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.a.b.a.a;
import java.util.Map;

final class g$4
  implements Runnable
{
  g$4(g paramg, long paramLong1, long paramLong2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35719);
    g localg;
    long l1;
    h localh;
    if (this.qEb.jN(this.qDZ))
    {
      localg = this.qEb;
      l1 = this.qDZ;
      long l2 = this.eEn;
      boolean bool = this.qEa;
      if (bool)
        if (localg.qDQ.containsKey(Long.valueOf(l1)))
        {
          localh = (h)localg.qDQ.get(Long.valueOf(l1));
          if (localh.qEs.qFu == 0L)
            localh.qEs.qFu = l2;
          if (!bool)
            break label195;
          localg.qDQ.put(Long.valueOf(l1), localh);
          AppMethodBeat.o(35719);
        }
    }
    while (true)
    {
      return;
      localh = new h("timeline");
      break;
      if (localg.qDP.containsKey(Long.valueOf(l1)))
      {
        localh = (h)localg.qDP.get(Long.valueOf(l1));
        break;
      }
      localh = new h("timeline");
      break;
      label195: localg.qDP.put(Long.valueOf(l1), localh);
      AppMethodBeat.o(35719);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.g.4
 * JD-Core Version:    0.6.2
 */