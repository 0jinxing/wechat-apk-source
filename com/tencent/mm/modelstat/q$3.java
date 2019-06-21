package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class q$3 extends n.a
{
  q$3(q paramq)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(78791);
    if ((paramInt != 4) && (paramInt != 6))
      AppMethodBeat.o(78791);
    while (true)
    {
      return;
      g.RS().m(new q.3.1(this), 3000L);
      ab.d("MicroMsg.SubCoreStat", "NetTypeReporter st:%d", new Object[] { Integer.valueOf(paramInt) });
      o.mg(2);
      AppMethodBeat.o(78791);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.q.3
 * JD-Core Version:    0.6.2
 */