package com.tencent.mm.plugin.music.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class c$4
  implements Runnable
{
  c$4(c paramc, String paramString, long paramLong1, long paramLong2, long paramLong3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104819);
    label1156: label1159: 
    while (true)
      synchronized (c.bDq())
      {
        ab.d("MicroMsg.Audio.AudioReportService", "leonlaudio clear appId:%s", new Object[] { this.val$appId });
        int i = 0;
        Object localObject1 = c.Nx().entrySet().iterator();
        int j = 0;
        Object localObject2 = "";
        if (((Iterator)localObject1).hasNext())
        {
          localObject4 = (Map.Entry)((Iterator)localObject1).next();
          localObject5 = (String)((Map.Entry)localObject4).getKey();
          i += ((Integer)((Map.Entry)localObject4).getValue()).intValue();
          if (((Integer)((Map.Entry)localObject4).getValue()).intValue() <= j)
            break label1159;
          j = ((Integer)((Map.Entry)localObject4).getValue()).intValue();
          localObject2 = localObject5;
          ab.d("MicroMsg.Audio.AudioReportService", "leonlaudio clear real invoke audioKey:%s, lostCount:%s", new Object[] { localObject5, ((Map.Entry)localObject4).getValue() });
          continue;
        }
        c.Nx().clear();
        Object localObject4 = c.bDq().entrySet().iterator();
        int k = 0;
        Object localObject5 = "";
        int m = 0;
        int n;
        if (((Iterator)localObject4).hasNext())
        {
          localObject6 = (Map.Entry)((Iterator)localObject4).next();
          localObject1 = (String)((Map.Entry)localObject6).getKey();
          n = ((Integer)((Map.Entry)localObject6).getValue()).intValue();
          if (((Integer)((Map.Entry)localObject6).getValue()).intValue() <= k)
            break label1156;
          k = ((Integer)((Map.Entry)localObject6).getValue()).intValue();
          localObject5 = localObject1;
          ab.d("MicroMsg.Audio.AudioReportService", "leonlaudio clear audioKey:%s, lostCount:%s", new Object[] { localObject1, ((Map.Entry)localObject6).getValue() });
          m += n;
          continue;
        }
        c.bDq().clear();
        localObject4 = new com/tencent/mm/plugin/music/b/a/c$b;
        ((c.b)localObject4).<init>(this.oKF);
        Object localObject6 = new com/tencent/mm/plugin/music/b/a/c$b;
        ((c.b)localObject6).<init>(this.oKF);
        localObject1 = new com/tencent/mm/plugin/music/b/a/c$b;
        ((c.b)localObject1).<init>(this.oKF);
        c.a((c.b)localObject4, c.bTo());
        c.a((c.b)localObject6, c.bTp());
        c.a((c.b)localObject1, c.bTq());
        c.bTo().clear();
        c.bTp().clear();
        c.bTq().clear();
        ab.d("MicroMsg.Audio.AudioReportService", "leonlaudio clear invokeTotalLostCount:%s, invokeMaxLostCount:%s, invokeMaxLostKey:%s, totalCostCount:%s, totalCostTime:%s, averageCostTime:%s, totalJsCostCount:%s, totalJSCostTime:%s, averageJSCostTime:%s,totalInvokeCostCount:%s, totalInvokeCostTime:%s, averageInvokeCostTime:%s,totalLostCount:%s, maxLostCount:%s, maxLostKey:%s, realInvokeTotalCount:%s, reachMaxPlayerCount:%s, audioPlayerType:%s, useQQAudioPlayerCount:%s, useAudioMixPlayerCount:%s, mixAverageTime:%s, maxCacheBufferSize:%s, realCacheBufferSize:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localObject2, Integer.valueOf(((c.b)localObject4).oKR), Long.valueOf(((c.b)localObject4).hoN), Long.valueOf(((c.b)localObject4).oKS), Integer.valueOf(((c.b)localObject6).oKR), Long.valueOf(((c.b)localObject6).hoN), Long.valueOf(((c.b)localObject6).oKS), Integer.valueOf(((c.b)localObject1).oKR), Long.valueOf(((c.b)localObject1).hoN), Long.valueOf(((c.b)localObject1).oKS), Integer.valueOf(m), Integer.valueOf(k), localObject5, Integer.valueOf(c.access$200()), Integer.valueOf(c.AU()), Integer.valueOf(c.alV()), Integer.valueOf(c.access$1100()), Integer.valueOf(c.bQp()), Long.valueOf(this.oKN), Long.valueOf(this.oKO), Long.valueOf(this.oKP) });
        ab.d("MicroMsg.Audio.AudioReportService", "leonlaudio clear invokeQQAudioPlayerPlayCount:%s, invokeMixPlayerPlayCount:%s, useQQAudioPlayerPlayLostCount:%s, useMixPlayerPlayLostCount:%s, ", new Object[] { Integer.valueOf(c.access$400()), Integer.valueOf(c.access$300()), Integer.valueOf(c.access$400() - c.access$1100() + c.AU()), Integer.valueOf(c.access$300() - c.bQp()) });
        if ((((c.b)localObject4).oKR > 0) && (((c.b)localObject6).oKR > 0) && (((c.b)localObject1).oKR > 0))
        {
          h.pYm.e(15686, new Object[] { this.val$appId, Integer.valueOf(i), Integer.valueOf(j), localObject2, Integer.valueOf(((c.b)localObject4).oKR), Long.valueOf(((c.b)localObject4).hoN), Long.valueOf(((c.b)localObject4).oKS), Integer.valueOf(((c.b)localObject6).oKR), Long.valueOf(((c.b)localObject6).hoN), Long.valueOf(((c.b)localObject6).oKS), Integer.valueOf(((c.b)localObject1).oKR), Long.valueOf(((c.b)localObject1).hoN), Long.valueOf(((c.b)localObject1).oKS), Integer.valueOf(m), Integer.valueOf(k), localObject5, Integer.valueOf(c.access$200()), Integer.valueOf(c.AU()), Integer.valueOf(c.alV()), Integer.valueOf(c.access$1100()), Integer.valueOf(c.bQp()), Long.valueOf(this.oKN), Long.valueOf(this.oKO), Long.valueOf(this.oKP), Integer.valueOf(c.access$400() - c.access$1100() + c.AU()), Integer.valueOf(c.access$300() - c.bQp()) });
          k = c.alV();
          long l1 = ((c.b)localObject6).oKS;
          long l2 = ((c.b)localObject1).oKS;
          long l3 = ((c.b)localObject4).oKS;
          n = c.AU();
          long l4 = this.oKO;
          long l5 = this.oKP;
          int i1 = c.access$400();
          j = c.access$1100();
          c.a(k, l1, l2, l3, m + n, i, l4, l5, c.AU() + (i1 - j), c.access$300() - c.bQp());
        }
        c.bTu();
        c.AX();
        c.zt(0);
        c.Ce();
        c.aTk();
        c.bTv();
        c.bTw();
        c.SO(this.val$appId);
        c.bTt().clear();
        AppMethodBeat.o(104819);
        return;
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.a.c.4
 * JD-Core Version:    0.6.2
 */