package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.sns.model.a;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bpx;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbt;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigInteger;

public final class l
  implements bz.a
{
  private static String ab(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(35891);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString3)))
    {
      paramString1 = "";
      AppMethodBeat.o(35891);
    }
    while (true)
    {
      return paramString1;
      int i = paramString1.indexOf(paramString2);
      if (i >= 0);
      for (int j = paramString1.indexOf(paramString3); ; j = -1)
      {
        if ((i < 0) || (j <= i))
          break label90;
        paramString1 = paramString1.substring(i, j + paramString3.length());
        AppMethodBeat.o(35891);
        break;
      }
      label90: paramString1 = "";
      AppMethodBeat.o(35891);
    }
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(35890);
    if ((parama == null) || (parama.eAB == null) || (parama.eAB.vED == null))
    {
      ab.i("MicroMsg.SimpleExperimentLsn", "recv null msg");
      AppMethodBeat.o(35890);
    }
    while (true)
    {
      return;
      Object localObject1 = aa.a(parama.eAB.vED);
      ab.d("MicroMsg.SimpleExperimentLsn", "recv addMsg ".concat(String.valueOf(localObject1)));
      parama = ab((String)localObject1, "<TimelineObject", "</TimelineObject>");
      if (bo.isNullOrNil(parama))
      {
        ab.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  timelineObj tag");
        AppMethodBeat.o(35890);
      }
      else
      {
        Object localObject2 = ab((String)localObject1, "<RecXml", "</RecXml>");
        if (bo.isNullOrNil((String)localObject2))
        {
          ab.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  RecXml tag");
          AppMethodBeat.o(35890);
        }
        else
        {
          Object localObject3 = ab((String)localObject1, "<ADInfo", "</ADInfo>");
          if (bo.isNullOrNil((String)localObject3))
          {
            ab.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  ADInfo tag");
            AppMethodBeat.o(35890);
          }
          else
          {
            localObject1 = e.tC(parama);
            bpx localbpx = new bpx();
            localbpx.wSg = aa.vy((String)localObject3);
            localObject3 = new cbt();
            localbpx.wSf = ((cbt)localObject3);
            ((cbt)localObject3).xbf = aa.vy((String)localObject2);
            localObject2 = new cbf();
            ((cbf)localObject2).vQE = new BigInteger(((TimeLineObject)localObject1).Id).longValue();
            ((cbf)localObject2).pcX = ((TimeLineObject)localObject1).pcX;
            ((cbf)localObject2).vHl = ((TimeLineObject)localObject1).jBB;
            ((cbf)localObject2).xam = aa.ad(parama.getBytes());
            ((cbt)localObject3).wZu = ((cbf)localObject2);
            a.b(localbpx);
            AppMethodBeat.o(35890);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.a.l
 * JD-Core Version:    0.6.2
 */