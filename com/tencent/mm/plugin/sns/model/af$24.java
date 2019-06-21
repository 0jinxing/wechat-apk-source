package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.g.a.ol.a;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.a.b.i;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class af$24 extends c<ol>
{
  af$24(af paramaf)
  {
    AppMethodBeat.i(36456);
    this.xxI = ol.class.getName().hashCode();
    AppMethodBeat.o(36456);
  }

  private static boolean a(ol paramol)
  {
    AppMethodBeat.i(36457);
    SnsAdClick localSnsAdClick = paramol.cKM.cKz;
    try
    {
      e locale;
      Object localObject1;
      int i;
      int j;
      if (paramol.cKM.cKN == 1)
      {
        if (localSnsAdClick.fQb != 1)
          break label379;
        locale = af.cnI().ku(localSnsAdClick.cND);
        if ((locale == null) || (!locale.coX()))
          break label271;
        localObject1 = af.cnz();
        i = 14647;
        localObject2 = new Object[7];
        localObject2[0] = Long.valueOf(localSnsAdClick.cND);
        localObject2[1] = locale.cqq().qPj;
        localObject2[2] = Integer.valueOf(localSnsAdClick.fPY);
        localObject2[3] = Long.valueOf(localSnsAdClick.startTime);
        localObject2[4] = Long.valueOf(System.currentTimeMillis());
        j = locale.cqs();
        paramol = (ol)localObject2;
        paramol[5] = Integer.valueOf(j);
        localObject2[6] = "";
        ((i)localObject1).e(i, (Object[])localObject2);
        paramol = b.lZ(750);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = paramol.tx(localSnsAdClick.cND).tx(locale.cqq().qPj).mb(localSnsAdClick.fPY);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((b)localObject2).tx(localSnsAdClick.startTime);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((b)localObject1).tx(System.currentTimeMillis());
        paramol.ajK();
      }
      while (true)
      {
        AppMethodBeat.o(36457);
        return false;
        label271: i locali = af.cnz();
        i = 13155;
        paramol = new Object[7];
        paramol[0] = Long.valueOf(localSnsAdClick.cND);
        paramol[1] = locale.cqq().qPj;
        paramol[2] = Integer.valueOf(localSnsAdClick.fPY);
        paramol[3] = Long.valueOf(localSnsAdClick.startTime);
        paramol[4] = Long.valueOf(System.currentTimeMillis());
        if (locale != null)
        {
          j = locale.cqs();
          localObject2 = paramol;
          localObject1 = paramol;
          paramol = (ol)localObject2;
          localObject2 = localObject1;
          localObject1 = locali;
          break;
        }
        j = -1;
        localObject1 = paramol;
        localObject2 = paramol;
        paramol = (ol)localObject1;
        localObject1 = locali;
        break;
        label379: paramol = af.cnI().ku(localSnsAdClick.cND);
        localObject2 = com.tencent.mm.plugin.sns.a.b.f.a(localSnsAdClick.cND, new Object[] { localSnsAdClick, paramol.cqq().qPj, Integer.valueOf(localSnsAdClick.fPY), Long.valueOf(localSnsAdClick.startTime), Long.valueOf(System.currentTimeMillis()) });
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = String.format(",%s", new Object[] { localSnsAdClick.fQc });
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = String.format(",%s", new Object[] { System.currentTimeMillis() - localSnsAdClick.startTime - localSnsAdClick.fQe });
        if ((paramol == null) || (!paramol.coX()))
          break label721;
        af.cnz().e(14643, new Object[] { localObject2 });
        localObject2 = b.lZ(733);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((b)localObject2).tx(localSnsAdClick.cND).tx(paramol.cqq().qPj).mb(localSnsAdClick.fPY);
        paramol = new java/lang/StringBuilder;
        paramol.<init>();
        paramol = ((b)localObject1).tx(localSnsAdClick.startTime);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        paramol.tx(System.currentTimeMillis());
        ((b)localObject2).ajK();
      }
    }
    catch (Exception paramol)
    {
      while (true)
      {
        Object localObject2;
        ab.printErrStackTrace("MicroMsg.SnsCore", paramol, "report ad click error", new Object[0]);
        continue;
        label721: af.cnz().e(12013, new Object[] { localObject2 });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.af.24
 * JD-Core Version:    0.6.2
 */