package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.talkroom.b.d;
import com.tencent.mm.sdk.platformtools.ap.a;

final class g$3
  implements ap.a
{
  g$3(g paramg)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(25807);
    int i = g.e(this.syS);
    long l = g.f(this.syS);
    Object localObject = g.g(this.syS);
    g localg = this.syS;
    g.g(this.syS);
    localObject = new d(i, l, 1, (String)localObject, localg.cEt());
    aw.Rg().a((m)localObject, 0);
    AppMethodBeat.o(25807);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.g.3
 * JD-Core Version:    0.6.2
 */