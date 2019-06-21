package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.og;
import com.tencent.mm.g.a.og.a;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class af$18 extends c<og>
{
  af$18(af paramaf)
  {
    AppMethodBeat.i(36445);
    this.xxI = og.class.getName().hashCode();
    AppMethodBeat.o(36445);
  }

  private static boolean a(og paramog)
  {
    boolean bool = false;
    AppMethodBeat.i(36446);
    try
    {
      SnsAdClick localSnsAdClick = paramog.cKA.cKz;
      Object localObject = af.cnI().ku(localSnsAdClick.cND);
      if (localObject == null)
      {
        AppMethodBeat.o(36446);
        return bool;
      }
      n localn = ((e)localObject).cqB();
      if (localSnsAdClick.cvd == 2)
      {
        localObject = localn.cqr();
        label57: if (localObject == null)
          break label233;
        if (localSnsAdClick.cvd != 2)
          break label210;
        ab.i("MicroMsg.SnsCore", "at_friend_detail report ad h5 load");
      }
      while (true)
      {
        h.pYm.e(16972, new Object[] { Long.valueOf(localSnsAdClick.cND), Integer.valueOf(localSnsAdClick.fPY), ((a)localObject).qPj, Integer.valueOf(localn.cre()), localn.cqu().rjC, paramog.cKA.url, Integer.valueOf(paramog.cKA.cKB), Integer.valueOf(paramog.cKA.errorCode), Long.valueOf(paramog.cKA.timestamp) });
        AppMethodBeat.o(36446);
        bool = true;
        break;
        localObject = localn.cqq();
        break label57;
        label210: ab.i("MicroMsg.SnsCore", "report ad h5 load");
      }
    }
    catch (Exception paramog)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsCore", paramog, "report load ad h5 error", new Object[0]);
        label233: AppMethodBeat.o(36446);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.af.18
 * JD-Core Version:    0.6.2
 */