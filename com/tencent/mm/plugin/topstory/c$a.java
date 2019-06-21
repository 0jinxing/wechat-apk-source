package com.tencent.mm.plugin.topstory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.topstory.a.b.b;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class c$a
  implements Runnable
{
  long createTime;
  HashSet<b> sAy;
  chv sAz;

  private c$a(c paramc)
  {
    AppMethodBeat.i(65494);
    this.sAy = new HashSet();
    AppMethodBeat.o(65494);
  }

  private static String a(List<b> paramList, chv paramchv)
  {
    AppMethodBeat.i(65496);
    while (true)
    {
      StringBuilder localStringBuilder1;
      try
      {
        int i = paramList.size();
        if (i == 0)
        {
          AppMethodBeat.o(65496);
          paramList = null;
          return paramList;
        }
        localStringBuilder1 = new java/lang/StringBuilder;
        localStringBuilder1.<init>("");
        localStringBuilder1.append("isexpose=1&content=");
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("");
        localIterator = paramList.iterator();
        if (localIterator.hasNext())
        {
          b localb = (b)localIterator.next();
          localchw = localb.sAX;
          ((StringBuilder)localObject).append(localchw.ctk);
          ((StringBuilder)localObject).append(":");
          ((StringBuilder)localObject).append(localchw.ubA);
          ((StringBuilder)localObject).append(":");
          ((StringBuilder)localObject).append(localb.mLr);
          ((StringBuilder)localObject).append(":");
          ((StringBuilder)localObject).append(localchw.xgV);
          ((StringBuilder)localObject).append(";");
          continue;
        }
      }
      catch (Exception paramList)
      {
        Object localObject;
        Iterator localIterator;
        chw localchw;
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryReporterImpl", paramList, "build14057VideoInfoExposeString error: %s", new Object[] { paramList.getMessage() });
        AppMethodBeat.o(65496);
        paramList = null;
        continue;
        try
        {
          localStringBuilder1.append(q.encode(((StringBuilder)localObject).toString(), "utf-8"));
          localStringBuilder1.append("&resulttype=");
          localIterator = paramList.iterator();
          if (localIterator.hasNext())
          {
            localObject = ((b)localIterator.next()).sAX;
            localStringBuilder1.append(((chw)localObject).ctk);
            localStringBuilder1.append(":");
            localStringBuilder1.append(((chw)localObject).xgZ);
            localStringBuilder1.append(";");
            continue;
          }
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.TopStory.TopStoryReporterImpl", localException, "", new Object[0]);
          continue;
          localStringBuilder1.append("&expand=");
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>("");
          localObject = paramList.iterator();
          if (((Iterator)localObject).hasNext())
          {
            localchw = ((b)((Iterator)localObject).next()).sAX;
            localStringBuilder2.append(localchw.ctk);
            localStringBuilder2.append(":");
            localStringBuilder2.append(localchw.xgX);
            localStringBuilder2.append(";");
            continue;
          }
          try
          {
            localStringBuilder1.append(q.encode(localStringBuilder2.toString(), "utf-8"));
            localStringBuilder1.append("&itemtype=");
            localStringBuilder2 = new java/lang/StringBuilder;
            localStringBuilder2.<init>("");
            paramList = paramList.iterator();
            if (paramList.hasNext())
            {
              localStringBuilder2.append(((b)paramList.next()).sAX.xgW);
              localStringBuilder2.append(";");
              continue;
            }
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            ab.printErrStackTrace("MicroMsg.TopStory.TopStoryReporterImpl", localUnsupportedEncodingException, "", new Object[0]);
            continue;
            localStringBuilder1.append(localUnsupportedEncodingException);
            if (paramchv == null)
              break label644;
          }
          localStringBuilder1.append("&");
          localStringBuilder1.append("searchid=");
          localStringBuilder1.append(paramchv.hlm);
          localStringBuilder1.append("&");
          localStringBuilder1.append("query=");
        }
      }
      try
      {
        localStringBuilder1.append(q.encode(paramchv.ctj, "utf-8"));
        localStringBuilder1.append("&");
        localStringBuilder1.append("ishomepage=0");
        localStringBuilder1.append("&");
        localStringBuilder1.append("sessionid=");
        localStringBuilder1.append(aa.HP(paramchv.scene));
        localStringBuilder1.append("&");
        localStringBuilder1.append("scene=");
        localStringBuilder1.append(paramchv.scene);
        localStringBuilder1.append("&rec_category=");
        localStringBuilder1.append(paramchv.xgG);
        label644: paramList = localStringBuilder1.toString();
        AppMethodBeat.o(65496);
      }
      catch (Exception paramList)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.TopStory.TopStoryReporterImpl", paramList, "", new Object[0]);
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(65495);
    ab.i("MicroMsg.TopStory.TopStoryReporterImpl", "Star to run ReportExposeTask");
    this.sAx.sAw.remove(Long.valueOf(this.sAz.xgG));
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.sAy);
    int j;
    for (int i = 0; ; i = j)
    {
      j = i + 20;
      if (j >= localArrayList.size());
      for (List localList = localArrayList.subList(i, localArrayList.size()); ; localList = localArrayList.subList(i, j))
      {
        String str = a(localList, this.sAz);
        if (!bo.isNullOrNil(str))
        {
          bsj localbsj = new bsj();
          localbsj.wUu = str;
          ab.i("MicroMsg.TopStory.TopStoryReporterImpl", "build14057VideoInfoExposeString %d report string: %s", new Object[] { Integer.valueOf(localList.size()), localbsj.wUu });
          al.d(new c.a.1(this, localbsj));
        }
        if (j < localArrayList.size())
          break;
        AppMethodBeat.o(65495);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.c.a
 * JD-Core Version:    0.6.2
 */