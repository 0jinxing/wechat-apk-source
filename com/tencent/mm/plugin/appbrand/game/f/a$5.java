package com.tencent.mm.plugin.appbrand.game.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

final class a$5
  implements Runnable
{
  a$5(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130331);
    long l1 = a.g(this.huk) - a.h(this.huk);
    long l2 = (bo.yz() - a.g(this.huk)) / 1000L;
    double d;
    if ((l2 > 0L) && (l2 < 10L))
    {
      if (a.c(this.huk) == null)
        break label592;
      d = a.c(this.huk).fQ(a.d(this.huk));
    }
    while (true)
    {
      a.b localb = new a.b(this.huk);
      if ((a.a(this.huk).size() > 0) && (a.b(this.huk) > 0))
        a.a(this.huk, localb, a.a(this.huk));
      a.a locala = new a.a(this.huk);
      if (a.a(this.huk).size() > 0)
        a.a(locala, a.a(this.huk));
      a.a(this.huk, 0);
      a.a(this.huk).clear();
      Object localObject2 = this.huk;
      synchronized (((a)localObject2).huh)
      {
        Iterator localIterator = ((a)localObject2).huh.entrySet().iterator();
        if (!localIterator.hasNext())
          break label345;
        localObject2 = (Map.Entry)localIterator.next();
        int i = ((Integer)((Map.Entry)localObject2).getKey()).intValue();
        int j = ((Integer)((Map.Entry)localObject2).getValue()).intValue();
        ab.i("MicroMsg.MBNiReporter", "hy: picSize level:%d,num:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        h.pYm.a(936L, i, j, false);
      }
      d = a.i(this.huk);
      continue;
      label345: a.f(this.huk).clear();
      ab.i("MicroMsg.MBNiReporter", "hy: decode performance appid:%s,inject2firstDraw:%d,firstFps:%f,PreDecodeNum:%d,PreDecodeTotalTime:%d,preDecodeAvgTime:%f,totalDecodeNum:%d,totalDecodeTime:%d,totalDecodeAvgTime:%f", new Object[] { a.j(this.huk), Long.valueOf(l1), Double.valueOf(d), Integer.valueOf(localObject1.hum), Long.valueOf(localObject1.hoN), Double.valueOf(localObject1.hun), Integer.valueOf(locala.hum), Long.valueOf(locala.hoN), Double.valueOf(locala.hun) });
      if (l1 > 0L)
        h.pYm.e(16136, new Object[] { a.j(this.huk), Long.valueOf(l1), Double.valueOf(d), Integer.valueOf(localObject1.hum), Long.valueOf(localObject1.hoN), Double.valueOf(localObject1.hun), Integer.valueOf(locala.hum), Long.valueOf(locala.hoN), Double.valueOf(locala.hun) });
      a.k(this.huk);
      AppMethodBeat.o(130331);
      return;
      label592: d = -1.0D;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.f.a.5
 * JD-Core Version:    0.6.2
 */