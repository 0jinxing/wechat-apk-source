package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class k$2
  implements b.a
{
  long lastReportTime = 0L;

  k$2(k paramk)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(11402);
    if (!paramBoolean)
      AppMethodBeat.o(11402);
    while (true)
    {
      return true;
      ab.i("MicroMsg.ReportLocation", "LBSManager notify. lat:%f, lng:%f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1) });
      if (bo.anT() >= this.lastReportTime + this.fwA.fww)
      {
        k.a(this.fwA.userName, 0, paramFloat2, paramFloat1, (int)paramDouble2);
        this.lastReportTime = bo.anT();
      }
      if (this.fwA.fwt == 2)
        this.fwA.aeJ();
      if (!this.fwA.fwx)
      {
        this.fwA.fwx = true;
        o.a(2013, paramFloat1, paramFloat2, (int)paramDouble2);
      }
      AppMethodBeat.o(11402);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.k.2
 * JD-Core Version:    0.6.2
 */