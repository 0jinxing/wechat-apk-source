package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.g;
import java.util.concurrent.ConcurrentHashMap;

final class l$6
  implements Runnable
{
  l$6(l paraml, long paramLong, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78329);
    n localn = n.ahb();
    long l1 = this.fFE;
    long l2 = this.fFn;
    long l3 = this.fFH;
    if (localn.fFL.containsKey(Long.valueOf(l1)));
    for (n.d locald = (n.d)localn.fFL.get(Long.valueOf(l1)); ; locald = new n.d())
    {
      locald.xb = l3;
      locald.cET = l2;
      localn.fFL.put(Long.valueOf(l1), locald);
      l.F(this.fFF).a(this.fFH, this.fFn, this.fFF);
      AppMethodBeat.o(78329);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.l.6
 * JD-Core Version:    0.6.2
 */