package com.tencent.mm.plugin.expt.hellhound;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.w;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.d;
import com.tencent.mm.plugin.expt.a.b.b;
import com.tencent.mm.plugin.expt.a.c.a;
import com.tencent.mm.plugin.expt.c.e;
import com.tencent.mm.plugin.expt.hellhound.a.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements b.b
{
  public final void a(String paramString1, String paramString2, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(73335);
    ab.i("HellhoundService", "habbyge-mali, frontToBackMMProcessEnd: " + paramString1 + "/" + paramInt1);
    int i = Integer.valueOf(paramString2).intValue();
    paramString2 = c.a.lMd;
    w localw = new w();
    localw.cWc = paramInt1;
    paramString1 = localw.eS(((h)com.tencent.mm.kernel.g.RM().Rn()).eHT).eT(paramString1);
    paramString1.cYc = paramInt2;
    paramString1.cWS = paramString2.value;
    paramString1 = paramString1.aQ(paramLong);
    paramString1.cWU = i;
    e.brf().a(paramString1);
    ab.i("HellFrontBackReport", "habbyge-mali, [进程尾部补偿8] frontback-pure-report [%s]", new Object[] { paramString1.Fk() });
    AppMethodBeat.o(73335);
  }

  public final void ec(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73333);
    c.a(paramString1, Integer.valueOf(paramString2).intValue(), c.a.lMc);
    AppMethodBeat.o(73333);
  }

  public final void ed(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73334);
    c.a(paramString1, Integer.valueOf(paramString2).intValue(), c.a.lMd);
    AppMethodBeat.o(73334);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.b.2
 * JD-Core Version:    0.6.2
 */