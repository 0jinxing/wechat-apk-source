package com.tencent.mm.plugin.expt.hellhound.a.c;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.n;
import com.tencent.mm.kernel.d;
import com.tencent.mm.protocal.protobuf.caz;
import com.tencent.mm.protocal.protobuf.cci;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.j.a;
import com.tencent.mm.vending.j.c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class b
{
  private static int lMW = 0;

  private static c<String, Integer> T(LinkedList<caz> paramLinkedList)
  {
    AppMethodBeat.i(73463);
    JSONArray localJSONArray;
    try
    {
      localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        caz localcaz = (caz)localIterator.next();
        if (localcaz != null)
        {
          paramLinkedList = new org/json/JSONObject;
          paramLinkedList.<init>();
          paramLinkedList.put("feedId", localcaz.feedId);
          paramLinkedList.put("feedheight", localcaz.height);
          BigDecimal localBigDecimal = new java/math/BigDecimal;
          localBigDecimal.<init>(localcaz.xaj);
          localcaz.xaj = localBigDecimal.setScale(2, 4).doubleValue();
          paramLinkedList.put("realShowTime", localcaz.xaj);
          localBigDecimal = new java/math/BigDecimal;
          localBigDecimal.<init>(localcaz.xai);
          localcaz.xai = localBigDecimal.setScale(2, 4).doubleValue();
          paramLinkedList.put("stayTimeRelative", localcaz.xai);
          paramLinkedList.put("realScreenHeight", localcaz.iev - localcaz.qDY - localcaz.xaf - localcaz.xae);
          localJSONArray.put(paramLinkedList);
        }
      }
    }
    catch (Exception paramLinkedList)
    {
      ab.printErrStackTrace("HellTimelineReport", paramLinkedList, "habbyge-mali, reportTimeline-_feedList2JsonV2-crash", new Object[0]);
    }
    while (true)
    {
      paramLinkedList = null;
      AppMethodBeat.o(73463);
      while (true)
      {
        return paramLinkedList;
        int i = localJSONArray.length();
        if (i <= 0)
          break;
        paramLinkedList = a.F(localJSONArray.toString(), Integer.valueOf(i));
        AppMethodBeat.o(73463);
      }
      ab.e("HellTimelineReport", "habbyge-mali, _feedList2JsonV2 jsonArray Empty !!!!");
    }
  }

  private static List<n> a(n paramn)
  {
    AppMethodBeat.i(73464);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = paramn.Fj().getBytes();
    if (localObject1.length <= 5120)
    {
      paramn.cWl = 0;
      paramn.cWm = 1;
      localArrayList.add(paramn);
      AppMethodBeat.o(73464);
      paramn = localArrayList;
    }
    while (true)
    {
      return paramn;
      Object localObject2 = paramn.cWi;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject2);
        if (localJSONArray == null)
        {
          paramn = null;
          AppMethodBeat.o(73464);
        }
      }
      catch (Exception localException)
      {
        Object localObject3;
        while (true)
        {
          ab.printErrStackTrace("HellTimelineReport", localException, "habbyge-mali, reportTimeline-_spliteLogIfBigger7K-Exception", new Object[0]);
          localObject3 = null;
        }
        int i = localObject3.length();
        double d = Math.ceil(localObject1.length / 5120.0D);
        int j = i / (int)d;
        int k = i % (int)d;
        int m = (int)d;
        int n = m;
        if (k > 0)
          n = m + 1;
        int i1 = 0;
        m = 0;
        int i2 = 0;
        while (i2 < d)
        {
          localObject2 = new n();
          ((n)localObject2).cWc = paramn.cWc;
          ((n)localObject2).eF(paramn.cWd);
          ((n)localObject2).eG(paramn.cWe);
          ((n)localObject2).cWf = paramn.cWf;
          ((n)localObject2).cWg = paramn.cWg;
          ((n)localObject2).cWh = paramn.cWh;
          ((n)localObject2).cWk = paramn.cWk;
          localObject1 = new JSONArray();
          for (m = i2 * j; (m < (i2 + 1) * j) && (m < i - k); m++)
            ((JSONArray)localObject1).put(localObject3.opt(m));
          ((n)localObject2).cWi = ((JSONArray)localObject1).toString();
          ((n)localObject2).cWj = ((JSONArray)localObject1).length();
          ((n)localObject2).cWl = i1;
          ((n)localObject2).cWm = n;
          localArrayList.add(localObject2);
          i2++;
          i1++;
        }
        if (k > 0)
        {
          localObject1 = new n();
          ((n)localObject1).cWc = paramn.cWc;
          ((n)localObject1).eF(paramn.cWd);
          ((n)localObject1).eG(paramn.cWe);
          ((n)localObject1).cWf = paramn.cWf;
          ((n)localObject1).cWg = paramn.cWg;
          ((n)localObject1).cWh = paramn.cWh;
          ((n)localObject1).cWk = paramn.cWk;
          paramn = new JSONArray();
          while (m < i)
          {
            paramn.put(localObject3.opt(m));
            m++;
          }
          ((n)localObject1).cWi = paramn.toString();
          ((n)localObject1).cWj = paramn.length();
          ((n)localObject1).cWl = i1;
          ((n)localObject1).cWm = n;
          localArrayList.add(localObject1);
        }
        AppMethodBeat.o(73464);
        paramn = localArrayList;
      }
    }
  }

  static void a(cci paramcci)
  {
    AppMethodBeat.i(73462);
    ab.i("HellTimelineReport", "habbyge-mali, reportTimelineV2");
    Object localObject = T(paramcci.xbM);
    if (localObject == null)
      AppMethodBeat.o(73462);
    while (true)
    {
      return;
      ab.i("HellTimelineReport", "habbyge-mali, reportTimelineV2 YES");
      String str = (String)((com.tencent.mm.vending.j.b)localObject).get(0);
      n localn1 = new n();
      localn1.cWc = Process.myPid();
      n localn2 = localn1.eF(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).eHT).eG(paramcci.cvF);
      localn2.cWf = paramcci.xbJ;
      localn2.cWg = paramcci.xbK;
      localn2.cWh = paramcci.xbL;
      localn2.cWi = str;
      localn2.cWj = ((Integer)((c)localObject).get(1)).intValue();
      int i = lMW;
      lMW = i + 1;
      localn2.cWk = i;
      localObject = a(localn1);
      if (localObject == null)
      {
        AppMethodBeat.o(73462);
      }
      else
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          localn2 = (n)((Iterator)localObject).next();
          localn2.cWi = localn2.cWi.replace(",", "#");
          localn2.ajK();
        }
        if (paramcci != null)
        {
          long l1 = paramcci.xbK;
          long l2 = paramcci.xbL;
          if (Math.abs(paramcci.xbJ - (l1 + l2)) > 50L)
            break label325;
          com.tencent.mm.plugin.report.service.h.pYm.a(932L, 87L, 1L, false);
          ab.i("TimelineMonitorCheck", "habbyge-mali, Timeline分时监控数据准确率上报-timeline前台时长(停留+滚动)-准确");
        }
        while (true)
        {
          localObject = paramcci.xbM.iterator();
          for (d = 0.0D; ((Iterator)localObject).hasNext(); d = ((caz)((Iterator)localObject).next()).xai + d);
          label325: com.tencent.mm.plugin.report.service.h.pYm.a(932L, 88L, 1L, false);
          ab.i("TimelineMonitorCheck", "habbyge-mali, Timeline分时监控数据准确率上报-timeline前台时长(停留+滚动)-不准确");
        }
        double d = Math.abs(paramcci.xbK - d);
        if (d <= 50.0D)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(932L, 89L, 1L, false);
          ab.i("TimelineMonitorCheck", "habbyge-mali, Timeline分时监控数据准确率上报-feed停留分时时长-准确: ".concat(String.valueOf(d)));
          AppMethodBeat.o(73462);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(932L, 90L, 1L, false);
          ab.i("TimelineMonitorCheck", "habbyge-mali, Timeline分时监控数据准确率上报-feed停留分时时长-不准确: ".concat(String.valueOf(d)));
          AppMethodBeat.o(73462);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.a.c.b
 * JD-Core Version:    0.6.2
 */