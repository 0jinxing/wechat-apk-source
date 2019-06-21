package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.rn;
import com.tencent.mm.kernel.b;
import com.tencent.mm.m.e;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Date;

final class ao$1 extends c<rn>
{
  ao$1(ao paramao)
  {
    AppMethodBeat.i(36600);
    this.xxI = rn.class.getName().hashCode();
    AppMethodBeat.o(36600);
  }

  private boolean cog()
  {
    int i = 1200;
    AppMethodBeat.i(36601);
    ao localao = this.qMO;
    int j;
    try
    {
      if (localao.cof())
      {
        Date localDate = new java/util/Date;
        localDate.<init>();
        j = localDate.getHours();
        j = localDate.getMinutes() + j * 60;
        if ((j >= localao.qMJ) && (j <= localao.qMK))
        {
          ab.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  %d in [%d, %d]", new Object[] { Integer.valueOf(j), Integer.valueOf(localao.qMJ), Integer.valueOf(localao.qMK) });
          AppMethodBeat.o(36601);
          return false;
        }
      }
    }
    catch (Exception localException)
    {
      int k;
      int m;
      int n;
      do
      {
        k = com.tencent.mm.m.g.Nu().getInt("SnsImgPreLoadingSmallImage", 1);
        m = com.tencent.mm.m.g.Nu().getInt("SnsImgPreLoadingBigImage", 1);
        n = com.tencent.mm.m.g.Nu().getInt("SnsPreLoadingVideo", 1);
        j = com.tencent.mm.m.g.Nu().getInt("SnsImgPreLoadingInterval", 1200);
        ab.i("MicroMsg.SnsPreTimelineService", " preloadingSamllImage %d preloadingBigImage %d preloadingVideo %d preloadingInterval %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j) });
      }
      while ((k <= 0) && (m <= 0) && (n <= 0));
      if (j > 0);
    }
    while (true)
    {
      if ((localao.fVW) || (localao.fVX) || (bo.fp(localao.qMH) < i))
      {
        ab.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  isInChatting:%b, isInSnsTimeline:%b", new Object[] { Boolean.valueOf(localao.fVW), Boolean.valueOf(localao.fVX) });
        break;
      }
      if (!y.XO("@__weixintimtline"))
      {
        ab.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked: doing timeline");
        break;
      }
      com.tencent.mm.kernel.g.RQ();
      if (!com.tencent.mm.kernel.g.RO().eJo.a(new t(), 0))
      {
        ab.i("MicroMsg.SnsPreTimelineService", "newObjectSync triggered");
        y.XP("@__weixintimtline");
      }
      localao.qMH = bo.anT();
      break;
      i = j;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ao.1
 * JD-Core Version:    0.6.2
 */