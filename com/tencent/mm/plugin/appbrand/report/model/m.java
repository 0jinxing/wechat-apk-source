package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.protocal.protobuf.cwt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class m
{
  private static final m iCa;
  public String appId;
  public int cOq;
  public String cOr;
  public int css;
  public String cst;
  public String csu;
  public String cvF;
  public int iAo;
  public String iBB;
  public int iBG;
  private final boolean iBw;
  private final i ikv;
  public int scene;

  static
  {
    AppMethodBeat.i(132649);
    iCa = new m(true, i.iBj);
    AppMethodBeat.o(132649);
  }

  private m(boolean paramBoolean, i parami)
  {
    this.iBw = paramBoolean;
    this.ikv = parami;
  }

  private void IF()
  {
    AppMethodBeat.i(132647);
    if (this.iBw)
      AppMethodBeat.o(132647);
    while (true)
    {
      return;
      cwt localcwt = new cwt();
      localcwt.jCt = 1;
      localcwt.fKh = this.appId;
      localcwt.xso = this.csu;
      localcwt.pXC = 0;
      localcwt.lvf = ((int)bo.anT());
      localcwt.pXD = 1;
      localcwt.xsp = "";
      localcwt.xsq = this.css;
      localcwt.vGA = this.cvF;
      localcwt.xsr = c.cV(ah.getContext());
      localcwt.ugc = this.scene;
      localcwt.xss = this.iAo;
      localcwt.xst = this.cst;
      localcwt.iBB = this.iBB;
      localcwt.cOq = this.cOq;
      localcwt.cOr = this.cOr;
      localcwt.iBG = this.iBG;
      AppBrandIDKeyBatchReport.a(localcwt);
      ab.i("MicroMsg.AppBrand.Report.kv_14004", "report " + toString());
      AppMethodBeat.o(132647);
    }
  }

  public static m aLw()
  {
    return iCa;
  }

  public static m b(o paramo, String paramString, i parami)
  {
    AppMethodBeat.i(132645);
    parami = new m(false, parami);
    try
    {
      parami.cvF = paramString;
      parami.appId = paramo.mAppId;
      paramString = paramo.ya().bQn;
      parami.scene = paramString.scene;
      parami.cst = paramString.cst;
      parami.cOq = paramString.cOq;
      parami.cOr = paramString.cOr;
      parami.iAo = paramString.iAo;
      parami.css = (paramo.atI().gVs + 1);
      AppMethodBeat.o(132645);
      return parami;
    }
    catch (Exception paramo)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AppBrand.Report.kv_14004", paramo, "Kv_14004 protect the npe", new Object[0]);
    }
  }

  public final void p(w paramw)
  {
    AppMethodBeat.i(132646);
    this.csu = paramw.aBm();
    paramw = this.ikv.k(paramw);
    if ((paramw != null) && (paramw.iBm != null))
    {
      paramw = paramw.iBm.path;
      this.iBB = paramw;
      if (!this.ikv.DC(this.csu))
        break label86;
    }
    label86: for (int i = 1; ; i = 0)
    {
      this.iBG = i;
      IF();
      AppMethodBeat.o(132646);
      return;
      paramw = null;
      break;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(132648);
    String str = "kv_14004{appId='" + this.appId + '\'' + ", sessionId='" + this.cvF + '\'' + ", scene=" + this.scene + ", sceneNote='" + this.cst + '\'' + ", preScene=" + this.cOq + ", preSceneNote='" + this.cOr + '\'' + ", pagePath='" + this.csu + '\'' + ", usedState=" + this.iAo + ", appState=" + this.css + ", referPagePath='" + this.iBB + '\'' + ", isEntrance=" + this.iBG + '}';
    AppMethodBeat.o(132648);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.m
 * JD-Core Version:    0.6.2
 */