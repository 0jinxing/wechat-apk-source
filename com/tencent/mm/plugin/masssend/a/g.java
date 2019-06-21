package com.tencent.mm.plugin.masssend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class g extends com.tencent.mm.sdk.b.c<mp>
{
  public g()
  {
    AppMethodBeat.i(22741);
    this.xxI = mp.class.getName().hashCode();
    AppMethodBeat.o(22741);
  }

  private static boolean aiv()
  {
    AppMethodBeat.i(22742);
    if (!aw.RK())
    {
      ab.e("MicroMsg.PostTaskMassSendListener", "has not set uin");
      AppMethodBeat.o(22742);
    }
    while (true)
    {
      return false;
      h.bNF();
      aw.ZK();
      if (bo.gb(bo.a((Long)com.tencent.mm.model.c.Ry().get(102409, null), 0L)) > 900000L);
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label88;
        ab.d("MicroMsg.PostTaskMassSendListener", "time limit");
        AppMethodBeat.o(22742);
        break;
      }
      label88: h.bNF().bNA();
      h.bNF();
      c.je(bo.anU());
      AppMethodBeat.o(22742);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.a.g
 * JD-Core Version:    0.6.2
 */