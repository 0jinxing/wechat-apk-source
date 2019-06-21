package com.tencent.mm.plugin.trafficmonitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import java.util.ArrayList;
import java.util.TimerTask;

final class b$1 extends TimerTask
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114756);
    a.update(this.sJO.id);
    long l1 = 0L;
    long l2 = 0L;
    int i = this.sJO.type;
    long l3 = System.currentTimeMillis();
    Object localObject = as.eg("trafficmonitor", 1);
    long l4 = ((as)localObject).amI("trafficmonitor_" + this.sJO.interval);
    ((as)localObject).encode("trafficmonitor_" + this.sJO.interval, l3);
    long l5;
    long l6;
    long l7;
    if (i == 0)
    {
      l1 = a.FU(this.sJO.id);
      l2 = a.FT(this.sJO.id);
      l5 = l1 + l2;
      l6 = l5;
      l7 = 0L;
      long l8 = a.FQ(this.sJO.id);
      long l9 = a.FP(this.sJO.id);
      if ((l8 >= l1) && (l9 >= l2))
        break label296;
      AppMethodBeat.o(114756);
    }
    label296: ArrayList localArrayList;
    while (true)
    {
      return;
      if (i == 1)
      {
        l7 = a.FS(this.sJO.id) + a.FR(this.sJO.id);
        l6 = l7;
        l5 = 0L;
        break;
      }
      if (i == 2)
      {
        l1 = a.FU(this.sJO.id);
        l2 = a.FT(this.sJO.id);
        l5 = l1 + l2;
        l7 = a.FS(this.sJO.id) + a.FR(this.sJO.id);
        l6 = l7 + l5;
        break;
      }
      AppMethodBeat.o(114756);
      continue;
      localArrayList = new ArrayList();
      i = TrafficClickFlowReceiver.a(this.sJO.currentIndex, l3 - this.sJO.interval, localArrayList);
      if (i == -1)
      {
        AppMethodBeat.o(114756);
      }
      else
      {
        this.sJO.currentIndex = i;
        if (!b.lG(l4))
          break label382;
        ab.i("MicroMsg.FileTrafficStatsInspector", "isDownloadAndNormal");
        this.sJO.cHD();
        AppMethodBeat.o(114756);
      }
    }
    label382: ab.i("MicroMsg.FileTrafficStatsInspector", "wxTotalTraffic : %d , interval : %d", new Object[] { Long.valueOf(l6), Long.valueOf(this.sJO.interval) });
    String str;
    int j;
    if (this.sJO.sJZ.a(localArrayList, l6, this.sJO.interval, l3 - l4))
    {
      localObject = Double.valueOf(this.sJO.sJZ.sKf);
      str = String.valueOf(localObject);
      j = (int)Math.round(((Double)localObject).doubleValue());
      i = 0;
      if ((j <= 3) || (j > 4))
        break label630;
      i = 60;
    }
    while (true)
    {
      ab.i("MicroMsg.FileTrafficStatsInspector", "Traffic Execced ExceedIndex : %s", new Object[] { str });
      e.pXa.a(877L, i, 1L, true);
      e.pXa.e(15856, new Object[] { Long.valueOf(this.sJO.interval), localArrayList.toString(), Long.valueOf(l6), Long.valueOf(l5), Long.valueOf(l7), Long.valueOf(this.sJO.sJZ.sKe), str, Integer.valueOf(j) });
      this.sJO.cHD();
      AppMethodBeat.o(114756);
      break;
      label630: if ((j > 4) && (j <= 5))
        i = 61;
      else if ((j > 5) && (j <= 6))
        i = 62;
      else if ((j > 6) && (j <= 7))
        i = 63;
      else if (j > 7)
        i = 64;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.b.1
 * JD-Core Version:    0.6.2
 */