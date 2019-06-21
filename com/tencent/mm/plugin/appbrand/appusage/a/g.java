package com.tencent.mm.plugin.appbrand.appusage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.protocal.protobuf.ani;
import com.tencent.mm.protocal.protobuf.anj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.concurrent.TimeUnit;

public class g extends com.tencent.mm.ai.a<anj>
{
  public g()
  {
    AppMethodBeat.i(129746);
    ab.i("MicroMsg.Recommend.CgiGetRecallInfo", "CgiGetRecallInfo");
    b.a locala = new b.a();
    locala.fsJ = new ani();
    locala.fsK = new anj();
    locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/getrecallinfo";
    locala.fsI = 2572;
    this.ehh = locala.acD();
    AppMethodBeat.o(129746);
  }

  public static void dF(boolean paramBoolean)
  {
    AppMethodBeat.i(129747);
    int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFR, 0);
    int j;
    if (i == 1)
    {
      j = 1;
      if (j != 0)
        break label63;
      ab.e("MicroMsg.Recommend.CgiGetRecallInfo", "ABTestShowRecommend is not open, labValue:%d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(129747);
    }
    while (true)
    {
      return;
      j = 0;
      break;
      label63: long l1 = AppBrandGlobalSystemConfig.ayC().hgj;
      long l2 = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xOv, Long.valueOf(0L))).longValue();
      long l3 = bo.anT();
      long l4 = TimeUnit.DAYS.toSeconds(1L);
      l2 = l3 - l2;
      ab.i("MicroMsg.Recommend.CgiGetRecallInfo", "weUseRecallInterval:%d, internalTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
      if ((paramBoolean) || ((l1 > 0L) && (l2 >= l1)) || ((l1 <= 0L) && (l2 >= l4)))
      {
        ab.i("MicroMsg.Recommend.CgiGetRecallInfo", "force or It's time to do getRecallInfo");
        com.tencent.mm.plugin.appbrand.s.e.aNS().aa(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(129745);
            new g.1.1(this).acy();
            AppMethodBeat.o(129745);
          }
        });
        AppMethodBeat.o(129747);
      }
      else
      {
        ab.i("MicroMsg.Recommend.CgiGetRecallInfo", "time is not exceed one day, not to getRecallInfo");
        AppMethodBeat.o(129747);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.g
 * JD-Core Version:    0.6.2
 */