package com.tencent.mm.plugin.topstory;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.topstory.a.b.b;
import com.tencent.mm.plugin.topstory.a.f;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.w;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c
  implements f
{
  ak sAv;
  Map<Long, c.a> sAw;

  public c()
  {
    AppMethodBeat.i(65497);
    this.sAw = new ConcurrentHashMap();
    this.sAv = new c.1(this, new al("TopStoryReportExposeTask").oAl.getLooper());
    AppMethodBeat.o(65497);
  }

  public static void a(chv paramchv, chw paramchw, com.tencent.mm.plugin.topstory.a.b.a parama)
  {
    AppMethodBeat.i(65499);
    ab.i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay: %s %s", new Object[] { paramchw, parama });
    if ((paramchw != null) && (parama != null))
    {
      parama.sAF = System.currentTimeMillis();
      parama.sAG = (parama.sAF - parama.sAE);
      Object localObject = b(paramchv, paramchw, parama);
      if (!bo.isNullOrNil((String)localObject))
      {
        bsj localbsj = new bsj();
        localbsj.wUu = ((String)localObject);
        ab.i("MicroMsg.TopStory.TopStoryReporterImpl", "build14436VideoPlayReportString %s", new Object[] { localbsj.wUu });
        localObject = new w(localbsj);
        g.Rg().a((m)localObject, 0);
      }
      paramchv = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(paramchv.scene), paramchw.xgS, Long.valueOf(paramchw.xha), "mp4", Integer.valueOf(paramchw.xgR), Integer.valueOf(0), Long.valueOf(parama.sAE), Long.valueOf(parama.sAF), Long.valueOf(parama.sAH), Long.valueOf(parama.sAG), Long.valueOf(parama.sAJ), Long.valueOf(parama.sAK), Long.valueOf(parama.sAL), Long.valueOf(parama.sAM), Long.valueOf(parama.sAP), Long.valueOf(parama.sAQ), Long.valueOf(parama.sAI), Long.valueOf(parama.sAR), Long.valueOf(parama.sAS), Long.valueOf(parama.sAU), Long.valueOf(parama.sAV), parama.fjS, Long.valueOf(parama.position), aa.bVP(), Long.valueOf(parama.sAT), Long.valueOf(parama.sAW), Long.valueOf(parama.sAN), Long.valueOf(parama.sAO), paramchv.xgj });
      ab.i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay 15414 %s", new Object[] { paramchv });
      e.pXa.X(15414, paramchv);
      com.tencent.mm.plugin.topstory.a.a.a.a(parama);
    }
    AppMethodBeat.o(65499);
  }

  private static String b(chv paramchv, chw paramchw, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(65501);
    StringBuilder localStringBuilder = new StringBuilder("");
    try
    {
      localStringBuilder.append("scene=");
      localStringBuilder.append(paramchv.scene);
      localStringBuilder.append("&");
      localStringBuilder.append("businesstype=3");
      localStringBuilder.append("&");
      localStringBuilder.append("mediatype=2");
      localStringBuilder.append("&");
      localStringBuilder.append("docid=");
      localStringBuilder.append(paramchw.ubA);
      localStringBuilder.append("&");
      localStringBuilder.append("typepos=");
      localStringBuilder.append("0");
      localStringBuilder.append("&");
      localStringBuilder.append("docpos=");
      localStringBuilder.append(paramInt1 + 1);
      localStringBuilder.append("&");
      localStringBuilder.append("searchid=");
      localStringBuilder.append(paramchv.hlm);
      localStringBuilder.append("&");
      localStringBuilder.append("ishomepage=");
      localStringBuilder.append(0);
      localStringBuilder.append("&rec_category=");
      localStringBuilder.append(paramchw.xgT);
      localStringBuilder.append("&");
      localStringBuilder.append("timestamp=");
      localStringBuilder.append(System.currentTimeMillis());
      localStringBuilder.append("&");
      localStringBuilder.append("clicktype=");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append("&");
      localStringBuilder.append("clickcontent=");
    }
    catch (Exception paramchv)
    {
      try
      {
        localStringBuilder.append(q.encode(paramString, "utf-8"));
        label308: localStringBuilder.append("&");
        localStringBuilder.append("clicksource=");
        localStringBuilder.append("4");
        localStringBuilder.append("&");
        localStringBuilder.append("sceneactiontype=");
        localStringBuilder.append(1);
        localStringBuilder.append("&");
        localStringBuilder.append("query=");
        try
        {
          localStringBuilder.append(q.encode(paramchv.ctj, "utf-8"));
          label394: localStringBuilder.append("&");
          localStringBuilder.append("resulttype=");
          localStringBuilder.append(paramchw.xgZ);
          localStringBuilder.append("&");
          localStringBuilder.append("sessionid=");
          localStringBuilder.append(aa.HP(paramchv.scene));
          localStringBuilder.append("&");
          localStringBuilder.append("expand=");
          try
          {
            localStringBuilder.append(q.encode(paramchw.xgV, "utf-8"));
            label487: localStringBuilder.append("&");
            localStringBuilder.append("title=");
            try
            {
              localStringBuilder.append(q.encode(paramchw.title, "utf-8"));
              label521: localStringBuilder.append("&");
              localStringBuilder.append("nettype=");
              if (at.isWifi(ah.getContext()))
                localStringBuilder.append("wifi");
              while (true)
              {
                localStringBuilder.append("&");
                localStringBuilder.append("itemtype=");
                localStringBuilder.append(paramchw.xgW);
                while (true)
                {
                  paramchv = localStringBuilder.toString();
                  AppMethodBeat.o(65501);
                  return paramchv;
                  if (!at.is4G(ah.getContext()))
                    break label623;
                  localStringBuilder.append("4g");
                  break;
                  paramchv = paramchv;
                }
                label623: localStringBuilder.append("3g");
              }
            }
            catch (Exception paramchv)
            {
              break label521;
            }
          }
          catch (Exception paramchv)
          {
            break label487;
          }
        }
        catch (Exception paramString)
        {
          break label394;
        }
      }
      catch (Exception paramString)
      {
        break label308;
      }
    }
  }

  private static String b(chv paramchv, chw paramchw, com.tencent.mm.plugin.topstory.a.b.a parama)
  {
    AppMethodBeat.i(65502);
    StringBuilder localStringBuilder = new StringBuilder("");
    localStringBuilder.append("ismediaplay=1");
    localStringBuilder.append("&searchid=");
    localStringBuilder.append(paramchv.hlm);
    localStringBuilder.append("&scene=");
    localStringBuilder.append(paramchv.scene);
    localStringBuilder.append("&businesstype=3");
    localStringBuilder.append("&mediatype=2");
    localStringBuilder.append("&rec_category=");
    localStringBuilder.append(paramchv.xgG);
    localStringBuilder.append("&docid=");
    localStringBuilder.append(paramchw.ubA);
    try
    {
      localStringBuilder.append("&expand1=").append(q.encode(paramchw.xgV, "utf-8"));
      label129: localStringBuilder.append("&query=");
      try
      {
        localStringBuilder.append(q.encode(paramchv.ctj, "utf-8"));
        label152: localStringBuilder.append("&title=");
        try
        {
          localStringBuilder.append(q.encode(paramchw.title, "utf-8"));
          label175: localStringBuilder.append("&duration=");
          localStringBuilder.append(paramchw.xgR * 1000);
          localStringBuilder.append("&mediaid=");
          localStringBuilder.append(paramchw.xgS);
          if (parama != null)
          {
            localStringBuilder.append("&startplaytime=");
            localStringBuilder.append(parama.sAE);
            localStringBuilder.append("&endplaytime=");
            localStringBuilder.append(parama.sAF);
            localStringBuilder.append("&playtime=");
            localStringBuilder.append(parama.sAG);
            localStringBuilder.append("&lastplayms=");
            localStringBuilder.append(parama.sAH);
            localStringBuilder.append("&autoplay=");
            localStringBuilder.append(parama.sAL);
            localStringBuilder.append("&hasplayended=");
            localStringBuilder.append(parama.sAI);
            localStringBuilder.append("&hasquickplay=");
            localStringBuilder.append(parama.sAJ);
            localStringBuilder.append("&hasfullscreen=");
            localStringBuilder.append(parama.sAK);
            localStringBuilder.append("&hitpreload=");
            localStringBuilder.append(parama.sAM);
            localStringBuilder.append("&firstloadtime=");
            localStringBuilder.append(parama.sAP);
            localStringBuilder.append("&downloadfinishtime=");
            localStringBuilder.append(parama.sAQ);
            localStringBuilder.append("&firstmoovreadytime=");
            localStringBuilder.append(parama.sAR);
            localStringBuilder.append("&firstdataavailabletime=");
            localStringBuilder.append(parama.sAU);
          }
          paramchv = localStringBuilder.toString();
          AppMethodBeat.o(65502);
          return paramchv;
        }
        catch (Exception paramchv)
        {
          break label175;
        }
      }
      catch (Exception paramchv)
      {
        break label152;
      }
    }
    catch (Exception localException)
    {
      break label129;
    }
  }

  public final void a(chv paramchv, chw paramchw, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(65500);
    paramchv = b(paramchv, paramchw, paramInt1, paramInt2, paramString);
    if (!bo.isNullOrNil(paramchv))
    {
      paramchw = new bsj();
      paramchw.wUu = paramchv;
      ab.i("MicroMsg.TopStory.TopStoryReporterImpl", "do12721ClickVideoReport %s", new Object[] { paramchw.wUu });
      paramchv = new w(paramchw);
      g.Rg().a(paramchv, 0);
    }
    AppMethodBeat.o(65500);
  }

  public final void a(chv paramchv, HashSet<b> paramHashSet)
  {
    AppMethodBeat.i(65498);
    if (paramHashSet.size() == 0)
      AppMethodBeat.o(65498);
    while (true)
    {
      return;
      c.a locala = (c.a)this.sAw.get(Long.valueOf(paramchv.xgG));
      if ((locala != null) && (this.sAv.hasMessages(0)))
      {
        ab.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo hit cached task %d add %d", new Object[] { Integer.valueOf(locala.sAy.size()), Integer.valueOf(paramHashSet.size()) });
        paramHashSet = paramHashSet.iterator();
        while (paramHashSet.hasNext())
        {
          paramchv = (b)paramHashSet.next();
          locala.sAy.add(paramchv);
        }
        AppMethodBeat.o(65498);
      }
      else
      {
        if (locala != null)
          ab.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo not report task: %s size: %d", new Object[] { locala, Integer.valueOf(locala.sAy.size()) });
        locala = new c.a(this, (byte)0);
        ab.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo new task %d %s", new Object[] { Integer.valueOf(paramHashSet.size()), locala });
        locala.createTime = System.currentTimeMillis();
        Iterator localIterator = paramHashSet.iterator();
        while (localIterator.hasNext())
        {
          paramHashSet = (b)localIterator.next();
          locala.sAy.add(paramHashSet);
        }
        locala.sAz = paramchv;
        if (locala.sAy.size() > 0)
        {
          this.sAv.removeMessages(0);
          this.sAv.sendMessageDelayed(this.sAv.obtainMessage(0, locala), 5000L);
          this.sAw.put(Long.valueOf(paramchv.xgG), locala);
        }
        AppMethodBeat.o(65498);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.c
 * JD-Core Version:    0.6.2
 */