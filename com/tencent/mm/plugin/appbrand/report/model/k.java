package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.d;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class k
{
  private static final k iBx;
  public String appId;
  public int apptype;
  public int axy;
  public int cOq;
  public String cOr;
  public int css;
  public String cst;
  public String csu;
  public String cvF;
  public com.tencent.mm.plugin.appbrand.i gPI;
  public int hgP;
  public int iAo;
  public long iBA;
  public String iBB;
  public int iBC;
  public String iBD;
  public long iBE;
  public int iBF;
  public int iBG;
  public String iBH;
  public String iBI;
  public long iBv;
  private final boolean iBw;
  boolean iBy = false;
  public String iBz;
  private final i ikv;
  public int scene;

  static
  {
    AppMethodBeat.i(132636);
    iBx = new k(true, null);
    AppMethodBeat.o(132636);
  }

  private k(boolean paramBoolean, i parami)
  {
    this.iBw = paramBoolean;
    this.ikv = parami;
  }

  public static k a(o paramo, String paramString, i parami)
  {
    AppMethodBeat.i(132631);
    parami = new k(false, parami);
    parami.cvF = paramString;
    paramString = paramo.ya().bQn;
    parami.scene = paramString.scene;
    parami.cst = paramString.cst;
    parami.appId = paramo.mAppId;
    parami.gPI = paramo;
    parami.css = (paramo.atI().gVs + 1);
    parami.axy = paramo.atI().axy;
    parami.iAo = paramString.iAo;
    parami.cOq = paramString.cOq;
    parami.cOr = paramString.cOr;
    AppMethodBeat.o(132631);
    return parami;
  }

  public static k aLv()
  {
    return iBx;
  }

  final void IF()
  {
    AppMethodBeat.i(132635);
    if (this.iBw)
      AppMethodBeat.o(132635);
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrand.Report.kv_13536", "report " + toString());
      k.1 local1 = new k.1(this, new Object[] { Integer.valueOf(this.scene), this.cst, this.cvF, this.appId, Integer.valueOf(this.axy), Integer.valueOf(this.css), Integer.valueOf(this.iAo), this.csu, this.iBz, Long.valueOf(this.iBv), Long.valueOf(this.iBA), this.iBB, Integer.valueOf(this.iBC), this.iBD, Long.valueOf(this.iBE), Integer.valueOf(this.iBF), Integer.valueOf(this.cOq), this.cOr, Integer.valueOf(this.iBG), this.iBH, Integer.valueOf(this.apptype), Integer.valueOf(this.hgP), this.iBI });
      if (this.iBy)
      {
        local1.run();
        try
        {
          KVCommCrossProcessReceiver.cgo();
          AppMethodBeat.o(132635);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.AppBrand.Report.kv_13536", localException, "sendKV", new Object[0]);
          AppMethodBeat.o(132635);
        }
      }
      else
      {
        e.aNS().aa(localException);
        AppMethodBeat.o(132635);
      }
    }
  }

  public final void n(w paramw)
  {
    AppMethodBeat.i(132632);
    o(paramw);
    IF();
    AppMethodBeat.o(132632);
  }

  final void o(w paramw)
  {
    Object localObject1 = null;
    AppMethodBeat.i(132633);
    Object localObject2 = paramw.getRuntime().atH();
    if (localObject2 != null)
    {
      this.axy = ((h)localObject2).hhd.gVu;
      this.iBF = WxaCommLibRuntimeReader.avQ().gVu;
    }
    this.iBE = paramw.ito.iAU;
    this.iBv = paramw.ito.aLi();
    this.iBA = paramw.ito.aLk();
    this.csu = paramw.getURL();
    this.iBH = paramw.aBm();
    this.iBz = com.tencent.mm.plugin.appbrand.report.c.cV(ah.getContext());
    this.iAo = paramw.getRuntime().ya().bQn.iAo;
    localObject2 = this.ikv.k(paramw);
    Object localObject3;
    int i;
    if (localObject2 == null)
    {
      ab.e("MicroMsg.AppBrand.Report.kv_13536", "visitNode (%s) not found, maybe page switching to quickly", new Object[] { paramw.aBm() });
      localObject3 = null;
      localObject2 = null;
      if (localObject3 != null)
        break label319;
      i = 0;
      label163: this.iBC = i;
      if (localObject3 != null)
        break label329;
      localObject3 = null;
      label177: this.iBD = ((String)localObject3);
      if (localObject2 != null)
        break label339;
      localObject2 = null;
      label189: this.iBB = ((String)localObject2);
      if (!this.ikv.DC(this.iBH))
        break label347;
      i = 1;
      label213: this.iBG = i;
      localObject2 = paramw.getRuntime();
      if (localObject2 != null)
        break label353;
      localObject2 = localObject1;
      label230: if (localObject2 == null)
        break label361;
      this.apptype = ((AppBrandInitConfigWC)localObject2).bQe;
    }
    while (true)
    {
      this.apptype += 1000;
      this.hgP = paramw.getRuntime().atI().hgP;
      if (localObject2 != null)
      {
        paramw = ((AppBrandInitConfigWC)localObject2).hgF;
        if ((paramw != null) && (!bo.isNullOrNil(paramw.businessType)))
          this.iBI = paramw.businessType;
      }
      AppMethodBeat.o(132633);
      return;
      localObject3 = ((i.a)localObject2).iBl;
      localObject2 = ((i.a)localObject2).iBm;
      break;
      label319: i = ((i.c)localObject3).type;
      break label163;
      label329: localObject3 = ((i.c)localObject3).path;
      break label177;
      label339: localObject2 = ((i.b)localObject2).path;
      break label189;
      label347: i = 0;
      break label213;
      label353: localObject2 = ((o)localObject2).atI();
      break label230;
      label361: this.apptype = d.Dy(this.appId);
      ab.i("MicroMsg.AppBrand.Report.kv_13536", "prepareCommonFields null = initConfig! apptype:%s", new Object[] { Integer.valueOf(this.apptype) });
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(132634);
    String str = "kv_13536{scene=" + this.scene + ", sceneNote='" + this.cst + '\'' + ", sessionId='" + this.cvF + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.axy + ", appState=" + this.css + ", usedState=" + this.iAo + ", pagePath='" + this.csu + '\'' + ", networkType='" + this.iBz + '\'' + ", costTime=" + this.iBv + ", stayTime=" + this.iBA + ", referPagePath='" + this.iBB + '\'' + ", targetAction=" + this.iBC + ", targetPagePath='" + this.iBD + '\'' + ", clickTimestamp=" + this.iBE + ", publicLibVersion=" + this.iBF + ", preScene=" + this.cOq + ", preSceneNote='" + this.cOr + '\'' + ", isEntrance=" + this.iBG + ", apptype=" + this.apptype + ", systemRecentsReason=" + this.hgP + ", referAction=" + this.iBI + '}';
    AppMethodBeat.o(132634);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.k
 * JD-Core Version:    0.6.2
 */