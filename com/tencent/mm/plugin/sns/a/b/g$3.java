package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

final class g$3
  implements Runnable
{
  g$3(g paramg, long paramLong1, long paramLong2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35718);
    if (this.qEb.jN(this.qDZ))
    {
      g localg = this.qEb;
      long l = this.qEd;
      if (!localg.qDO.contains(Long.valueOf(l)))
        localg.qDO.add(Long.valueOf(l));
    }
    AppMethodBeat.o(35718);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.g.3
 * JD-Core Version:    0.6.2
 */