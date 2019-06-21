package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.t.a;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.report.d;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.LinkedList;

public final class p
{
  private static final p iCw;
  public String appId;
  public int apptype;
  public int axy;
  public int cOq;
  public String cOr;
  public int css;
  public String cst;
  public String csu;
  public String cvF;
  public o gOq;
  public int iAo;
  public String iBB;
  public int iBC;
  public String iBD;
  public long iBE;
  public int iBF;
  public int iBG;
  public String iBH;
  private final boolean iBw;
  boolean iBy;
  public String iBz;
  public boolean iCA;
  private String iCx;
  public final LinkedList<String> iCy;
  public String iCz;
  public int scene;

  static
  {
    AppMethodBeat.i(132674);
    iCw = new p(true);
    AppMethodBeat.o(132674);
  }

  private p(boolean paramBoolean)
  {
    AppMethodBeat.i(132666);
    this.iCx = "";
    this.iCy = new LinkedList();
    this.iBy = false;
    this.iCA = true;
    this.iBw = paramBoolean;
    AppMethodBeat.o(132666);
  }

  private void IF()
  {
    AppMethodBeat.i(132673);
    if (this.iBw)
      AppMethodBeat.o(132673);
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrand.Report.kv_14992", "report " + toString());
      p.1 local1 = new p.1(this, new Object[] { Integer.valueOf(this.scene), this.cst, this.cvF, this.appId, Integer.valueOf(this.axy), Integer.valueOf(this.css), Integer.valueOf(this.iAo), this.csu, this.iCz, this.iBz, this.iBB, Integer.valueOf(this.iBC), this.iBD, Long.valueOf(this.iBE), Integer.valueOf(this.iBF), Integer.valueOf(this.cOq), this.cOr, Integer.valueOf(this.iBG), this.iBH, Integer.valueOf(this.apptype) });
      if (this.iBy)
      {
        local1.run();
        try
        {
          KVCommCrossProcessReceiver.cgo();
          AppMethodBeat.o(132673);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.AppBrand.Report.kv_14992", localException, "sendKV", new Object[0]);
          AppMethodBeat.o(132673);
        }
      }
      else
      {
        e.aNS().aa(localException);
        AppMethodBeat.o(132673);
      }
    }
  }

  public static p a(o paramo, String paramString, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(132667);
    p localp = new p(false);
    localp.cvF = paramString;
    paramString = paramo.ya().bQn;
    localp.scene = paramString.scene;
    localp.cst = paramString.cst;
    localp.appId = paramo.mAppId;
    localp.gOq = paramo;
    if (paramo.atH() == null)
      localp.css = (paramo.gNB.gVs + 1);
    for (localp.axy = paramo.atI().axy; ; localp.axy = paramo.atH().hhd.gVu)
    {
      localp.iAo = paramString.iAo;
      localp.cOq = paramString.cOq;
      localp.cOr = paramString.cOr;
      localp.iCy.addAll(paramLinkedList);
      AppMethodBeat.o(132667);
      return localp;
      localp.css = (paramo.atH().hhd.gVt + 1);
    }
  }

  private void a(w paramw, a parama)
  {
    AppMethodBeat.i(132671);
    Object localObject = paramw.getRuntime().atH();
    if (localObject != null)
    {
      this.axy = ((h)localObject).hhd.gVu;
      this.iBF = WxaCommLibRuntimeReader.avQ().gVu;
    }
    this.iBE = System.currentTimeMillis();
    localObject = parama.getWebView().getUrl();
    parama = (a)localObject;
    if (localObject == null)
      parama = "";
    this.iCz = q.encode(parama);
    this.csu = paramw.getURL();
    this.iBH = paramw.aBm();
    this.iBz = c.cV(ah.getContext());
    int i;
    if (this.iCA)
    {
      i = 1;
      this.iBG = i;
      this.iCA = false;
      paramw = paramw.getRuntime();
      if (paramw != null)
        break label166;
      paramw = null;
      label129: if (paramw == null)
        break label174;
      this.apptype = paramw.bQe;
    }
    while (true)
    {
      this.apptype += 1000;
      AppMethodBeat.o(132671);
      return;
      i = 0;
      break;
      label166: paramw = paramw.atI();
      break label129;
      label174: this.apptype = d.Dy(this.appId);
      ab.i("MicroMsg.AppBrand.Report.kv_14992", "prepareCommonFields null = initConfig! apptype:%s", new Object[] { Integer.valueOf(this.apptype) });
    }
  }

  public static p aLy()
  {
    return iCw;
  }

  public final void a(w paramw, String paramString)
  {
    AppMethodBeat.i(132668);
    this.iBB = ((String)this.iCy.peekFirst());
    this.iBC = 2;
    this.iBD = paramString;
    this.iCy.push(paramw.getURL());
    this.iCx = paramw.getURL();
    q(paramw);
    AppMethodBeat.o(132668);
  }

  public final void a(w paramw, boolean paramBoolean)
  {
    AppMethodBeat.i(132669);
    if (paramBoolean);
    for (int i = 1; ; i = 7)
    {
      this.iBC = i;
      String str = (String)this.iCy.pollFirst();
      this.iBD = str;
      this.iBB = str;
      if (!paramBoolean)
        this.iBD = this.iCx;
      q(paramw);
      AppMethodBeat.o(132669);
      return;
    }
  }

  public final void q(w paramw)
  {
    AppMethodBeat.i(132670);
    a locala = paramw.aJS();
    if (locala == null)
      AppMethodBeat.o(132670);
    while (true)
    {
      return;
      a(paramw, locala);
      IF();
      AppMethodBeat.o(132670);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(132672);
    String str = "kv_4992{scene=" + this.scene + ", sceneNote='" + this.cst + '\'' + ", sessionId='" + this.cvF + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.axy + ", appState=" + this.css + ", usedState=" + this.iAo + ", pagePath='" + this.csu + '\'' + ", currentUrl='" + this.iCz + '\'' + ", networkType='" + this.iBz + '\'' + ", referPagePath='" + this.iBB + '\'' + ", targetAction=" + this.iBC + ", targetPagePath='" + this.iBD + '\'' + ", clickTimestamp=" + this.iBE + ", publicLibVersion=" + this.iBF + ", preScene=" + this.cOq + ", preSceneNote='" + this.cOr + '\'' + ", isEntrance=" + this.iBG + ", apptype=" + this.apptype + '}';
    AppMethodBeat.o(132672);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.p
 * JD-Core Version:    0.6.2
 */