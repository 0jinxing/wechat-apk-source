package com.tencent.mm.plugin.appbrand.launching.a;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.b.a.ch;
import com.tencent.mm.g.b.a.ch.b;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.mm.protocal.protobuf.axq;
import com.tencent.mm.protocal.protobuf.axr;
import com.tencent.mm.protocal.protobuf.cwf;
import com.tencent.mm.protocal.protobuf.cxe;
import com.tencent.mm.protocal.protobuf.cxj;
import com.tencent.mm.protocal.protobuf.cyb;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.g.c.a;

public final class a extends com.tencent.mm.ai.a<axr>
{
  final String bQd;
  final com.tencent.mm.ai.b ehh;
  public volatile boolean ihY;
  public volatile com.tencent.mm.plugin.appbrand.launching.aa iiW;
  private final ch iiX;

  public a(String paramString1, boolean paramBoolean, cwf paramcwf, cyb paramcyb, cxj paramcxj, String paramString2, int paramInt, QualitySession paramQualitySession)
  {
    AppMethodBeat.i(132022);
    this.ihY = false;
    this.bQd = paramString2;
    this.iiX = com.tencent.mm.plugin.appbrand.report.quality.g.b(paramQualitySession);
    paramQualitySession = this.iiX;
    if (paramBoolean)
      paramString2 = ch.b.dgh;
    while (true)
    {
      paramQualitySession.dgb = paramString2;
      this.iiX.cXm = com.tencent.mm.plugin.appbrand.report.quality.g.getNetworkType();
      paramString2 = new axq();
      paramString2.fKh = paramString1;
      paramString2.wBB = paramcwf;
      int i;
      if (paramBoolean)
      {
        i = 1;
        label90: paramString2.wsv = i;
        paramString2.wBE = paramcyb;
        paramString2.wBF = paramcxj;
        paramString1 = new cxe();
        paramString1.wDC = paramInt;
        if (paramInt > 0)
        {
          paramcwf = com.tencent.mm.plugin.appbrand.app.f.ava();
          if (paramcwf != null)
          {
            paramcyb = new com.tencent.mm.plugin.appbrand.appcache.aa();
            paramcyb.field_key = "@LibraryAppId";
            paramcyb.field_version = paramInt;
            if (paramcwf.b(paramcyb, new String[] { "key", "version" }))
            {
              paramString1.vEr = ((int)paramcyb.field_updateTime);
              paramString1.xsE = paramcyb.field_scene;
            }
          }
        }
        paramString2.wBD = paramString1;
      }
      try
      {
        if (q.etl.epE)
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "DeviceInfo isLimit benchmarkLevel");
        for (paramString2.wBH = -2; ; paramString2.wBH = com.tencent.mm.m.g.Nu().getInt("ClientBenchmarkLevel", 0))
        {
          paramString1 = new b.a();
          paramString1.fsI = 1122;
          paramString1.uri = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
          paramString1.fsJ = paramString2;
          paramString1.fsK = new axr();
          paramString1 = paramString1.acD();
          this.ehh = paramString1;
          this.ehh = paramString1;
          AppMethodBeat.o(132022);
          return;
          paramString2 = ch.b.dgi;
          break;
          i = 2;
          break label90;
        }
      }
      catch (Exception paramString1)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", paramString1, "read performanceLevel", new Object[0]);
      }
    }
  }

  final boolean aHC()
  {
    if (((axq)this.ehh.fsG.fsP).wBB.wDA > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final int aHD()
  {
    return ((axq)this.ehh.fsG.fsP).wBB.Scene;
  }

  final axq aHE()
  {
    return (axq)this.ehh.fsG.fsP;
  }

  public final void aHF()
  {
    AppMethodBeat.i(132023);
    com.tencent.mm.plugin.appbrand.s.e.aNS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(132017);
        a.this.ihY = false;
        a.this.acy();
        AppMethodBeat.o(132017);
      }
    });
    AppMethodBeat.o(132023);
  }

  public final com.tencent.mm.ci.f<a.a<axr>> acy()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(132024);
        Object localObject1 = ((com.tencent.mm.plugin.appbrand.appcache.b.e.e)com.tencent.mm.plugin.appbrand.app.f.E(com.tencent.mm.plugin.appbrand.appcache.b.e.e.class)).az(getAppId(), aHD());
        Object localObject3;
        if (((Pair)localObject1).first != null)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "before run, get issued data by appId(%s) scene(%d)", new Object[] { getAppId(), Integer.valueOf(aHD()) });
          localObject3 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
          com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(((Long)((Pair)localObject1).second).longValue(), 106L);
          localObject3 = new com/tencent/mm/plugin/appbrand/launching/a/a$2;
          ((a.2)localObject3).<init>(this, (Pair)localObject1);
          localObject1 = com.tencent.mm.ci.g.c((c.a)localObject3);
          AppMethodBeat.o(132024);
          return localObject1;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "run() appId[%s], scene[%d], libVersion[%d] performanceLevel[%d]", new Object[] { getAppId(), Integer.valueOf(aHD()), Integer.valueOf(((axq)this.ehh.fsG.fsP).wBD.wDC), Integer.valueOf(aHE().wBH) });
        if (aHE().wBH == 0)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "run() appId[%s] invalid performanceLevel[%d]", new Object[] { getAppId(), Integer.valueOf(aHE().wBH) });
        if (!this.ihY)
        {
          localObject3 = ((com.tencent.mm.plugin.appbrand.appcache.b.e.b)com.tencent.mm.plugin.appbrand.app.f.E(com.tencent.mm.plugin.appbrand.appcache.b.e.b.class)).y(getAppId(), 2, aHD());
          if (((Boolean)((Pair)localObject3).first).booleanValue())
          {
            localObject1 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
            com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(((Integer)((Pair)localObject3).second).intValue(), 168L);
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "async launch with appid(%s) scene(%d) blocked", new Object[] { getAppId(), Integer.valueOf(aHD()) });
            localObject1 = new com/tencent/mm/plugin/appbrand/launching/a/a$3;
            ((a.3)localObject1).<init>(this);
            localObject1 = com.tencent.mm.ci.g.c((c.a)localObject1);
            AppMethodBeat.o(132024);
            continue;
          }
        }
      }
      finally
      {
      }
      long l = bo.anU();
      this.iiX.el(l);
      com.tencent.mm.ci.f localf = super.acy();
      AppMethodBeat.o(132024);
    }
  }

  final int asT()
  {
    return ((axq)this.ehh.fsG.fsP).wBB.wzF;
  }

  final String getAppId()
  {
    return ((axq)this.ehh.fsG.fsP).fKh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.a.a
 * JD-Core Version:    0.6.2
 */