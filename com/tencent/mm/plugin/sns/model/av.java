package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class av
  implements f
{
  private static HashMap<String, av.b> qNg;
  private static HashMap<String, WeakReference<av.b>> qNh;

  static
  {
    AppMethodBeat.i(36681);
    qNg = new HashMap();
    qNh = new HashMap();
    AppMethodBeat.o(36681);
  }

  public static void Yi(String paramString)
  {
    AppMethodBeat.i(36675);
    if (ae.giZ)
      ab.d("MicroMsg.TimelineSmallPicStat", "recordStartLoadSmallPic, mediaId:%s", new Object[] { paramString });
    paramString = (WeakReference)qNh.get(paramString);
    if (paramString != null)
    {
      paramString = (av.b)paramString.get();
      if (paramString != null)
      {
        paramString.nnR = true;
        AppMethodBeat.o(36675);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(36675);
    }
  }

  public static void Yj(String paramString)
  {
    AppMethodBeat.i(36676);
    if (ae.giZ)
      ab.d("MicroMsg.TimelineSmallPicStat", "recordEndLoadSmallPic, mediaId:%s", new Object[] { paramString });
    Object localObject = (WeakReference)qNh.get(paramString);
    if (localObject != null)
    {
      localObject = (av.b)((WeakReference)localObject).get();
      if (localObject != null)
      {
        if ((localObject != null) && (((av.b)localObject).qNi == -1L))
        {
          HashMap localHashMap = ((av.b)localObject).qNm;
          if ((localHashMap != null) && (localHashMap.containsKey(paramString)))
          {
            paramString = (av.a)localHashMap.get(paramString);
            if ((paramString != null) && (paramString.qNi == -1L))
            {
              paramString.qNi = 1L;
              ((av.b)localObject).qNl += 1;
            }
          }
        }
        AppMethodBeat.o(36676);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(36676);
    }
  }

  public static void Yk(String paramString)
  {
    AppMethodBeat.i(36677);
    ab.d("MicroMsg.TimelineSmallPicStat", "recordClickBigpic, localId:%s", new Object[] { paramString });
    if (qNg.containsKey(paramString))
    {
      ab.d("MicroMsg.TimelineSmallPicStat", "recordClickBigPic, localId:%s, update map", new Object[] { paramString });
      paramString = (av.b)qNg.get(paramString);
      if ((paramString != null) && (paramString.qNi == -1L) && (paramString.startTime != -1L))
      {
        paramString.qNi = 1L;
        paramString.qNl = paramString.fjN;
        paramString.endTime = System.currentTimeMillis();
        paramString.qNk = (paramString.endTime - paramString.startTime);
        paramString = paramString.qNm.values().iterator();
        while (paramString.hasNext())
          ((av.a)paramString.next()).qNi = 1L;
      }
    }
    AppMethodBeat.o(36677);
  }

  public final void XJ(String paramString)
  {
    AppMethodBeat.i(36679);
    if (qNg.containsKey(paramString))
    {
      if (ae.giZ)
        ab.d("MicroMsg.TimelineSmallPicStat", "load finish localId:%s", new Object[] { paramString });
      paramString = (av.b)qNg.get(paramString);
      if ((paramString != null) && (paramString.startTime != -1L) && (paramString.qNi == -1L))
      {
        paramString.endTime = System.currentTimeMillis();
        paramString.qNk = (paramString.endTime - paramString.startTime);
        if (paramString.qNl == paramString.fjN)
        {
          paramString.qNi = 1L;
          AppMethodBeat.o(36679);
        }
      }
    }
    while (true)
    {
      return;
      paramString.qNi = 2L;
      AppMethodBeat.o(36679);
    }
  }

  public final void a(String paramString, TimeLineObject paramTimeLineObject)
  {
    AppMethodBeat.i(36678);
    if (!qNg.containsKey(paramString))
    {
      if (ae.giZ)
        ab.d("MicroMsg.TimelineSmallPicStat", "put localId:%s into reportData", new Object[] { paramString });
      if ((paramTimeLineObject != null) && (paramTimeLineObject.xfI != null) && (paramTimeLineObject.xfI.wbJ == 1) && (paramTimeLineObject.xfI.wbK != null) && (paramTimeLineObject.xfI.wbK.size() > 0))
      {
        av.b localb = new av.b(this);
        localb.fjN = paramTimeLineObject.xfI.wbK.size();
        localb.qNl = 0;
        localb.qNm = new HashMap();
        paramTimeLineObject = paramTimeLineObject.xfI.wbK.iterator();
        while (paramTimeLineObject.hasNext())
        {
          bau localbau = (bau)paramTimeLineObject.next();
          av.a locala = new av.a(this);
          locala.cHr = localbau.Id;
          localb.qNm.put(localbau.Id, locala);
          qNh.put(localbau.Id, new WeakReference(localb));
        }
        localb.startTime = System.currentTimeMillis();
        qNg.put(paramString, localb);
        AppMethodBeat.o(36678);
      }
    }
    while (true)
    {
      return;
      if (ae.giZ)
        ab.d("MicroMsg.TimelineSmallPicStat", "onItemAdd error, timelineObject is nulli");
      AppMethodBeat.o(36678);
    }
  }

  public final void cmU()
  {
    AppMethodBeat.i(36680);
    ab.d("MicroMsg.TimelineSmallPicStat", "reportAll, reportData.size:%d", new Object[] { Integer.valueOf(qNg.size()) });
    int i = i.cms();
    Iterator localIterator = qNg.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (av.b)qNg.get(localObject);
      if ((localObject != null) && (((av.b)localObject).nnR))
        if ((((av.b)localObject).qNk == -1L) || (((av.b)localObject).qNi == -1L) || (((av.b)localObject).startTime == -1L))
        {
          if (((av.b)localObject).startTime != -1L)
          {
            ((av.b)localObject).endTime = System.currentTimeMillis();
            ((av.b)localObject).qNk = (((av.b)localObject).endTime - ((av.b)localObject).startTime);
            if (((av.b)localObject).fjN != ((av.b)localObject).qNl);
          }
        }
        else
          for (((av.b)localObject).qNi = 1L; ; ((av.b)localObject).qNi = 2L)
          {
            ab.d("MicroMsg.TimelineSmallPicStat", "reportAll, picNum:%d, loadResult:%d, loadCostTime:%d, loadPicNum:%d, networkType:%d", new Object[] { Integer.valueOf(((av.b)localObject).fjN), Long.valueOf(((av.b)localObject).qNi), Long.valueOf(((av.b)localObject).qNk), Integer.valueOf(((av.b)localObject).qNl), Integer.valueOf(i) });
            h.pYm.e(11600, new Object[] { Integer.valueOf(((av.b)localObject).fjN), Long.valueOf(((av.b)localObject).qNi), Long.valueOf(((av.b)localObject).qNk), Integer.valueOf(((av.b)localObject).qNl), Integer.valueOf(i) });
            break;
          }
    }
    qNg.clear();
    qNh.clear();
    AppMethodBeat.o(36680);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.av
 * JD-Core Version:    0.6.2
 */