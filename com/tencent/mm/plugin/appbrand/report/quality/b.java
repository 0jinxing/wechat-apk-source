package com.tencent.mm.plugin.appbrand.report.quality;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bv;
import com.tencent.mm.g.b.a.bv.a;
import com.tencent.mm.g.b.a.ca;
import com.tencent.mm.g.b.a.ca.a;
import com.tencent.mm.g.b.a.ci;
import com.tencent.mm.g.b.a.ci.a;
import com.tencent.mm.g.b.a.ck;
import com.tencent.mm.g.b.a.ck.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler;

public final class b extends c
{
  public static void a(com.tencent.mm.plugin.appbrand.task.g paramg, String paramString, long paramLong, com.tencent.mm.plugin.appbrand.report.a parama)
  {
    long l1 = 0L;
    AppMethodBeat.i(132688);
    bv localbv = new bv();
    int i;
    if (paramg != null)
      i = 1;
    long l2;
    while (true)
      if (i == 0)
      {
        paramg = a.DG(paramString);
        if (paramg == null)
        {
          AppMethodBeat.o(132688);
          return;
          i = 0;
        }
        else
        {
          localbv.gy(paramg.appId);
          localbv.gx(paramg.igT);
          localbv.ded = bv.a.gW(paramg.iCZ);
          localbv.ddz = paramg.apptype;
          localbv.ddd = paramg.iDa;
          localbv.cVR = paramg.scene;
          if (paramg.iDj)
          {
            l2 = 2L;
            label124: localbv.ddg = l2;
            if (paramg.hrs)
              l1 = 1L;
            localbv.dee = l1;
            label148: localbv.dL(paramLong);
            localbv.GY();
            localbv.dK(localbv.ddC - paramLong);
            switch (1.iCI[parama.ordinal()])
            {
            default:
              localbv.dbX = 2147483647L;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            }
          }
        }
      }
    while (true)
    {
      localbv.ajK();
      AppMethodBeat.o(132688);
      break;
      l2 = 0L;
      break label124;
      localbv.ddg = 1L;
      if (paramg == com.tencent.mm.plugin.appbrand.task.g.iFg)
        l1 = 1L;
      localbv.dee = l1;
      break label148;
      localbv.dbX = 1L;
      continue;
      localbv.dbX = 2L;
      continue;
      localbv.dbX = 3L;
      continue;
      localbv.dbX = 4L;
      continue;
      localbv.dbX = 5L;
      continue;
      localbv.dbX = 6L;
    }
  }

  public static void a(String paramString, AppBrandPreloadProfiler paramAppBrandPreloadProfiler)
  {
    AppMethodBeat.i(132686);
    ci localci = new ci();
    paramString = a.DG(paramString);
    if (paramString == null)
      AppMethodBeat.o(132686);
    while (true)
    {
      return;
      localci.hg(paramString.appId);
      localci.hf(paramString.igT);
      localci.dgp = ci.a.hj(paramString.iCZ);
      localci.ddz = paramString.apptype;
      localci.ddd = paramString.iDa;
      localci.en(paramAppBrandPreloadProfiler.aLN());
      localci.eo(paramAppBrandPreloadProfiler.aLM());
      localci.ajK();
      AppMethodBeat.o(132686);
    }
  }

  public static void a(boolean paramBoolean, String paramString, long paramLong, com.tencent.mm.plugin.appbrand.report.g paramg)
  {
    AppMethodBeat.i(132687);
    ck localck = new ck();
    long l;
    if (!paramBoolean)
    {
      paramString = a.DG(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(132687);
        return;
      }
      localck.hk(paramString.appId);
      localck.hj(paramString.igT);
      localck.dgL = ck.a.hl(paramString.iCZ);
      localck.ddz = paramString.apptype;
      localck.ddd = paramString.iDa;
      localck.cVR = paramString.scene;
      if (paramString.iDj)
      {
        l = 2L;
        label107: localck.ddg = l;
        label114: localck.es(paramLong);
        localck.Hh();
        localck.er(localck.ddC - paramLong);
        switch (1.iCH[paramg.ordinal()])
        {
        default:
          localck.dbX = 2147483647L;
        case 1:
        case 2:
        case 3:
        }
      }
    }
    while (true)
    {
      localck.ajK();
      AppMethodBeat.o(132687);
      break;
      l = 0L;
      break label107;
      localck.ddg = 1L;
      break label114;
      localck.dbX = 2L;
      continue;
      localck.dbX = 4L;
      continue;
      localck.dbX = 3L;
    }
  }

  public static void a(boolean paramBoolean, String paramString1, long paramLong1, String paramString2, long paramLong2)
  {
    AppMethodBeat.i(132689);
    ca localca = new ca();
    long l;
    if (!paramBoolean)
    {
      paramString1 = a.DG(paramString1);
      if (paramString1 == null)
      {
        AppMethodBeat.o(132689);
        return;
      }
      localca.gN(paramString1.appId);
      localca.gM(paramString1.igT);
      localca.deJ = ca.a.hb(paramString1.iCZ);
      localca.ddz = paramString1.apptype;
      localca.ddd = paramString1.iDa;
      localca.cVR = paramString1.scene;
      if (paramString1.iDj)
        l = 2L;
    }
    label107: for (localca.ddg = l; ; localca.ddg = 1L)
    {
      localca.dT(paramLong1);
      localca.Hc();
      localca.dS(localca.ddC - paramLong1);
      localca.gO(paramString2);
      localca.dep = paramLong2;
      localca.gP(WxaCommLibRuntimeReader.getVersionName());
      localca.ajK();
      AppMethodBeat.o(132689);
      break;
      l = 0L;
      break label107;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.b
 * JD-Core Version:    0.6.2
 */