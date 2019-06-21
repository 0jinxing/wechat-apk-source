package com.tencent.mm.plugin.wenote.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.m;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.protocal.protobuf.abf;
import java.util.HashMap;

final class g$2
  implements Runnable
{
  g$2(g paramg, abf paramabf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26618);
    if (this.uNr != null)
    {
      com.tencent.mm.plugin.fav.a.g localg = new com.tencent.mm.plugin.fav.a.g();
      localg.field_localId = g.a(this.uNs);
      localg.field_favProto = this.uNr;
      this.uNs.uMZ = localg.field_favProto;
      this.uNs.uMQ = localg;
      g.a(this.uNs, localg);
    }
    if (g.bEi().containsKey(g.b(this.uNs)))
      this.uNs.uMP = ((m)g.bEi().get(g.b(this.uNs)));
    while (true)
    {
      this.uNs.ef(this.uNs.uMP.pJZ);
      if (k.deT() != null)
        k.deX();
      AppMethodBeat.o(26618);
      return;
      g.c(this.uNs);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(26619);
    String str = super.toString() + "|dealWNoteInfo";
    AppMethodBeat.o(26619);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.g.2
 * JD-Core Version:    0.6.2
 */