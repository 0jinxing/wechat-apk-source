package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.of;
import com.tencent.mm.g.a.of.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.platformtools.ab;

final class af$17 extends com.tencent.mm.sdk.b.c<of>
{
  af$17(af paramaf)
  {
    AppMethodBeat.i(36442);
    this.xxI = of.class.getName().hashCode();
    AppMethodBeat.o(36442);
  }

  private static boolean a(of paramof)
  {
    boolean bool = false;
    AppMethodBeat.i(36443);
    try
    {
      SnsAdClick localSnsAdClick = paramof.cKy.cKz;
      paramof = af.cnI().ku(localSnsAdClick.cND);
      if (paramof == null)
      {
        AppMethodBeat.o(36443);
        return bool;
      }
      n localn = paramof.cqB();
      label55: com.tencent.mm.plugin.sns.a.b.c localc;
      if (localSnsAdClick.cvd == 2)
      {
        paramof = localn.cqr();
        if (paramof == null)
          break label271;
        if (localSnsAdClick.cvd != 2)
          break label170;
        ab.i("MicroMsg.SnsCore", "at_friend_detail report ad click");
        localc = new com/tencent/mm/plugin/sns/a/b/c;
        localc.<init>(localSnsAdClick.cND, paramof.hnw, localSnsAdClick.fPZ, localSnsAdClick.fQa, localSnsAdClick.fPY, "", localn.crf(), localn.cqu().rjC, localSnsAdClick.fQf, localn.crd().cqy(), localn.crd().cqz());
        g.RQ();
        g.RO().eJo.a(localc, 0);
      }
      while (true)
      {
        bool = true;
        AppMethodBeat.o(36443);
        break;
        paramof = localn.cqq();
        break label55;
        label170: ab.i("MicroMsg.SnsCore", "report ad click");
        localc = new com/tencent/mm/plugin/sns/a/b/c;
        localc.<init>(localSnsAdClick.cND, paramof.hnw, localSnsAdClick.fPZ, localSnsAdClick.fQa, localSnsAdClick.fPY, "", localn.crf(), localn.cqu().rjC, localSnsAdClick.fQf, localn.crd().cqw(), localn.crd().cqx());
        g.RQ();
        g.RO().eJo.a(localc, 0);
      }
    }
    catch (Exception paramof)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsCore", paramof, "report ad click error", new Object[0]);
        label271: AppMethodBeat.o(36443);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.af.17
 * JD-Core Version:    0.6.2
 */