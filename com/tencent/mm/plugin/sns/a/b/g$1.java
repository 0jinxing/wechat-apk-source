package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.a.b.a.a;
import java.util.Map;

final class g$1
  implements Runnable
{
  g$1(g paramg, long paramLong, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35716);
    g localg;
    long l;
    h localh;
    if (this.qEb.jN(this.qDZ))
    {
      localg = this.qEb;
      l = this.qDZ;
      boolean bool = this.qEa;
      if (bool)
        if (localg.qDQ.containsKey(Long.valueOf(l)))
        {
          localh = (h)localg.qDQ.get(Long.valueOf(l));
          localh.qEk = 1;
          localh.qEs.qFp += 1;
          if (!bool)
            break label190;
          localg.qDQ.put(Long.valueOf(l), localh);
          AppMethodBeat.o(35716);
        }
    }
    while (true)
    {
      return;
      localh = new h("timeline");
      break;
      if (localg.qDP.containsKey(Long.valueOf(l)))
      {
        localh = (h)localg.qDP.get(Long.valueOf(l));
        break;
      }
      localh = new h("timeline");
      break;
      label190: localg.qDP.put(Long.valueOf(l), localh);
      AppMethodBeat.o(35716);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.g.1
 * JD-Core Version:    0.6.2
 */