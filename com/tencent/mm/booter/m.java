package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.ba.k;
import com.tencent.mm.bf.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.storage.z;

public final class m
{
  private static long ecD = 86400000L;

  public static void run()
  {
    AppMethodBeat.i(15862);
    aw.ZK();
    if (ah.fp(ah.c((Long)c.Ry().get(81944, null))) * 1000L > ecD);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        Object localObject = d.ajP();
        d.ajQ();
        if (!((d)localObject).fpA)
        {
          g.RQ();
          if (g.RP().isSDCardAvailable())
          {
            ((d)localObject).release();
            ((d)localObject).fpA = true;
            g.Rg().a(159, (f)localObject);
            localObject = new k(9);
            g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
          }
        }
      }
      AppMethodBeat.o(15862);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.m
 * JD-Core Version:    0.6.2
 */