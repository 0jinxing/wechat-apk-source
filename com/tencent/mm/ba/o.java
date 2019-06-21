package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class o extends c<mp>
{
  public o()
  {
    AppMethodBeat.i(78498);
    this.xxI = mp.class.getName().hashCode();
    AppMethodBeat.o(78498);
  }

  private static boolean aiv()
  {
    AppMethodBeat.i(78499);
    if (bo.fp(bo.a((Long)g.RP().Ry().get(66818, null), 0L)) * 1000L > 1800000L);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        i = bo.a((Integer)g.RP().Ry().get(66820, null), -99999);
        if (i != -99999)
        {
          bv.s(9, String.valueOf(i));
          g.RP().Ry().set(66820, Integer.valueOf(-99999));
        }
        g.RP().Ry().set(66818, Long.valueOf(bo.anT()));
      }
      AppMethodBeat.o(78499);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.o
 * JD-Core Version:    0.6.2
 */