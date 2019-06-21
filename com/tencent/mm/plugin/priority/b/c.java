package com.tencent.mm.plugin.priority.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.n;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.protocal.protobuf.gi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;

public final class c
{
  public static final void a(int paramInt1, long paramLong, int paramInt2, gi paramgi)
  {
    AppMethodBeat.i(54897);
    if (!((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHK, a.pgk))
    {
      AppMethodBeat.o(54897);
      return;
    }
    String str = at.gB(ah.getContext());
    int i;
    label55: int j;
    label69: int k;
    label85: ad localad;
    int m;
    if (t.kH(paramgi.ptA))
    {
      i = 1;
      if (!com.tencent.mm.plugin.priority.a.a.a.a.UE(paramgi.ptA))
        break label404;
      j = 1;
      if (i != 1)
        break label410;
      k = n.mA(paramgi.ptA);
      localad = ((j)g.K(j.class)).XM().aoO(paramgi.ptA);
      if (i != 1)
        break label422;
      if (!com.tencent.mm.n.a.jh(localad.field_type))
        break label416;
      m = 3;
      label130: if (!((j)g.K(j.class)).XR().aph(paramgi.ptA))
        break label442;
    }
    label404: label410: label416: label422: label442: for (int n = 1; ; n = 2)
    {
      long l = Math.round(paramgi.vIB * 100.0D);
      paramgi = String.format("%d,%d,%d,%s,%d,%d,%d,%d,%d,%d,%d,%d,%s,%d,%d,%d,%d,%s,%d", new Object[] { Long.valueOf(paramgi.vIs), Integer.valueOf(paramInt1), Long.valueOf(paramLong), str, Integer.valueOf(paramgi.vIw), Integer.valueOf(paramInt2), Long.valueOf(paramLong - paramgi.vIv), Integer.valueOf(0), Integer.valueOf(paramgi.vIz), Long.valueOf(paramgi.vIy), Integer.valueOf(i), Integer.valueOf(j), paramgi.ptA, Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Long.valueOf(l), paramgi.vIt, Integer.valueOf(paramgi.vIC) });
      ab.i("MicroMsg.Priority.PriorityReportLogic", "report16308 %s", new Object[] { paramgi });
      e.pXa.X(16308, paramgi);
      AppMethodBeat.o(54897);
      break;
      i = 2;
      break label55;
      j = 2;
      break label69;
      k = 1;
      break label85;
      m = 4;
      break label130;
      if (localad.Oc());
      for (m = 1; ; m = 2)
        break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.c
 * JD-Core Version:    0.6.2
 */