package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;
import java.util.Map;

final class m$2
  implements Runnable
{
  m$2(m paramm, long paramLong, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50735);
    m.alh();
    m.c(this.fWk);
    m.a(this.fWk, "");
    long l1 = 0L;
    long l2 = l1;
    if (this.fWj > 0L)
    {
      l2 = l1;
      if (m.d(this.fWk).get(Long.valueOf(this.fWj)) != null)
        l2 = ((g.a)m.d(this.fWk).get(Long.valueOf(this.fWj))).Mr();
    }
    ab.i("MicroMsg.SightMassSendService", "on ERROR massSendId: %d time: %d errType %d errCode %d", new Object[] { Long.valueOf(this.fWj), Long.valueOf(l2), Integer.valueOf(this.crc), Integer.valueOf(this.crd) });
    if ((this.crc != 0) || (this.crd != 0))
      m.j(this.fWk);
    ab.i("MicroMsg.SightMassSendService", "onSceneEnd  inCnt: %d stop: %d running: %B sending: %B", new Object[] { Integer.valueOf(m.access$300()), Integer.valueOf(m.e(this.fWk)), Boolean.valueOf(m.f(this.fWk)), Boolean.valueOf(m.g(this.fWk)) });
    if (m.e(this.fWk) > 0)
      m.h(this.fWk);
    while (m.g(this.fWk))
    {
      m.ali();
      AppMethodBeat.o(50735);
      return;
    }
    ab.w("MicroMsg.SightMassSendService", "StopFlag ERROR force do stop, fail all job");
    t localt = o.all();
    Object localObject1 = m.k(this.fWk);
    if ((localObject1 == null) || (((List)localObject1).isEmpty()));
    while (true)
    {
      m.i(this.fWk);
      break;
      l2 = System.currentTimeMillis() / 1000L;
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append('(');
      for (int i = 0; i < ((List)localObject1).size() - 1; i++)
      {
        ((StringBuilder)localObject2).append((Long)((List)localObject1).get(i));
        ((StringBuilder)localObject2).append(',');
      }
      localObject1 = (Long)((List)localObject1).get(((List)localObject1).size() - 1);
      if (localObject1 != null)
        ((StringBuilder)localObject2).append(localObject1);
      ((StringBuilder)localObject2).append(')');
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject2 = "UPDATE videoinfo2 SET status=198, lastmodifytime=" + l2 + " WHERE masssendid IN " + (String)localObject2;
      ab.i("MicroMsg.VideoInfoStorage", "fail all massSendInfos, sql %s", new Object[] { localObject2 });
      localt.fni.hY("videoinfo2", (String)localObject2);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(50736);
    String str = super.toString() + "|onSceneEnd";
    AppMethodBeat.o(50736);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.m.2
 * JD-Core Version:    0.6.2
 */