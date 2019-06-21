package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bpu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class o$2
  implements w.a
{
  o$2(long paramLong1, bpu parambpu, String[] paramArrayOfString, float paramFloat1, float paramFloat2, int paramInt, long paramLong2)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(78768);
    ab.d("MicroMsg.NetTypeReporter", "onGYNetEnd errType:%d errCode:%d msg:%s  %d val:%s ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Long.valueOf(bo.gb(this.fUc)), this.fUd.pXM });
    long l2;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      long l1 = bo.gb(o.access$100());
      if (l1 <= 600000L)
      {
        l2 = l1;
        if (l1 >= 0L);
      }
      else
      {
        l2 = 0L;
      }
      paramb = h.pYm;
      paramm = new StringBuilder().append(this.fUe[0]).append("1,").append(this.fNA).append(",").append(this.fNB).append(",").append(this.fNC).append(",").append(this.fUf).append(",");
      if (!com.tencent.mm.sdk.a.b.foreground)
        break label265;
    }
    label265: for (paramString = "1"; ; paramString = String.valueOf(l2))
    {
      paramb.X(11747, paramString + "," + this.fUe[1] + "," + this.fUe[2] + "," + this.fUe[3]);
      g.RP().Ry().set(ac.a.xJL, Long.valueOf(bo.anU()));
      AppMethodBeat.o(78768);
      return 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.o.2
 * JD-Core Version:    0.6.2
 */