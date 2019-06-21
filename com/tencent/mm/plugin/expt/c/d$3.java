package com.tencent.mm.plugin.expt.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.plugin.expt.hellhound.a.a.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class d$3 extends c<jt>
{
  d$3(d paramd)
  {
    AppMethodBeat.i(73533);
    this.xxI = jt.class.getName().hashCode();
    AppMethodBeat.o(73533);
  }

  private boolean bre()
  {
    AppMethodBeat.i(73534);
    ab.i("MicroMsg.MMPageFlowService", "manual force login");
    if (!d.a(this.lOd))
    {
      d.b(this.lOd);
      b.s(105, null, null);
      b.bqF();
      com.tencent.mm.plugin.expt.hellhound.a.a.a.uY(7);
      com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.uX(7);
    }
    AppMethodBeat.o(73534);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.c.d.3
 * JD-Core Version:    0.6.2
 */