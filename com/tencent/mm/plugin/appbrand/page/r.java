package com.tencent.mm.plugin.appbrand.page;

import a.f.b.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.AnimationUtils;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bs;
import com.tencent.mm.g.b.a.bs.a;
import com.tencent.mm.plugin.appbrand.ReportStorageSizeTask;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.model.g;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.plugin.appbrand.task.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

@SuppressLint({"ViewConstructor"})
public class r extends q
{
  private volatile g isi;
  private f isj;
  public boolean isk;
  public boolean isl;
  private long ism;
  private long isn;
  private long iso;
  private String isp;
  private long isq;
  private boolean isr;

  public r(Context paramContext, o paramo)
  {
    super(paramContext, paramo);
    AppMethodBeat.i(132351);
    this.isk = false;
    this.isl = false;
    this.isq = 0L;
    this.isr = false;
    this.isi = aHU();
    AppMethodBeat.o(132351);
  }

  private void a(String paramString, aq paramaq, q.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(132357);
    h localh = h.pYm;
    if (paramBoolean);
    for (long l = 5L; ; l = 1L)
    {
      localh.k(937L, l, 1L);
      getRuntime().gNO.a(paramString, true, new r.3(this, paramBoolean, parama, paramString, paramaq));
      AppMethodBeat.o(132357);
      return;
    }
  }

  private void aJs()
  {
    AppMethodBeat.i(132371);
    AppBrandRecommendStatObj localAppBrandRecommendStatObj;
    if ((getCurrentPage() != null) && (getCurrentPage().getCurrentPageView() != null) && (getRuntime().ya().bQn.scene == 1118))
    {
      if (getRuntime().ya().bQn != null)
        break label138;
      localAppBrandRecommendStatObj = null;
      if (localAppBrandRecommendStatObj != null)
      {
        ab.i("MicroMsg.AppBrandPageContainer", "recommendStatObj is got");
        if ((TextUtils.isEmpty(localAppBrandRecommendStatObj.iAb)) || (TextUtils.isEmpty(localAppBrandRecommendStatObj.iAc)))
          break label155;
        this.isp = (localAppBrandRecommendStatObj.iAb + "?" + localAppBrandRecommendStatObj.iAc);
      }
    }
    while (true)
    {
      this.isk = true;
      this.isn = System.currentTimeMillis();
      AppMethodBeat.o(132371);
      return;
      label138: localAppBrandRecommendStatObj = getRuntime().ya().bQn.iAp;
      break;
      label155: if (!TextUtils.isEmpty(localAppBrandRecommendStatObj.iAb))
        this.isp = localAppBrandRecommendStatObj.iAb;
      else
        this.isp = getRuntime().atc();
    }
  }

  public void Az(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(132354);
    super.Az(paramString);
    if (getRuntime().atH().bQp)
      al.n(new r.1(this), 10000L);
    try
    {
      com.tencent.mm.plugin.appbrand.report.quality.a.aLz();
      j.p(this, "pagecontainer");
      bs localbs = new com/tencent/mm/g/b/a/bs;
      localbs.<init>();
      Object localObject3 = com.tencent.mm.plugin.appbrand.report.quality.a.DG(getAppId());
      paramString = localObject1;
      int i;
      if (localObject3 != null)
      {
        localbs.gr(((QualitySessionRuntime)localObject3).igT);
        localbs.gs(((QualitySessionRuntime)localObject3).appId);
        localbs.ddd = ((QualitySessionRuntime)localObject3).iDa;
        localbs.ddN = bs.a.gT(((QualitySessionRuntime)localObject3).iCZ);
        localbs.ddz = ((QualitySessionRuntime)localObject3).apptype;
        localbs.cVR = ((QualitySessionRuntime)localObject3).scene;
        localbs.dC(((QualitySessionRuntime)localObject3).iDk);
        localbs.dD(bo.anU());
        localbs.dB(localbs.ddC - localbs.ddB);
        paramString = getCurrentPage();
        if (paramString == null)
          break label289;
        paramString = paramString.getCurrentPageView();
        if (paramString == null)
          break label289;
        paramString = paramString.aJz();
        if ((paramString instanceof aa))
          break label350;
        paramString = localObject2;
        paramString = (aa)paramString;
        if (paramString == null)
          break label324;
        if (!paramString.isSysKernel())
          break label294;
        i = 4;
      }
      while (true)
      {
        localbs.dbX = i;
        localbs.ajK();
        paramString = (String)localObject3;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Null session with ");
        com.tencent.mm.plugin.appbrand.report.quality.c.a(paramString, getAppId());
        aJs();
        AppMethodBeat.o(132354);
        return;
        label289: paramString = null;
        break;
        label294: if (paramString.getIsX5Kernel())
        {
          i = 2;
        }
        else
        {
          boolean bool = paramString.isXWalkKernel();
          if (bool)
            i = 3;
          else
            label324: i = -1;
        }
      }
    }
    catch (Throwable paramString)
    {
      label350: 
      while (true)
        ab.w("MicroMsg.AppBrandPageContainer", "pagecontainerInitReport %s", new Object[] { paramString });
    }
  }

  protected final void a(n paramn1, n paramn2)
  {
    AppMethodBeat.i(132358);
    super.a(paramn1, paramn2);
    this.isi.aHW();
    this.isi.a((w)paramn2.getCurrentPageView(), (w)paramn1.getCurrentPageView(), aq.iva);
    post(new r.4(this));
    AppMethodBeat.o(132358);
  }

  protected final void a(n paramn1, n paramn2, aq paramaq)
  {
    Object localObject = null;
    AppMethodBeat.i(132360);
    super.a(paramn1, paramn2, paramaq);
    long l = System.currentTimeMillis() - this.isq;
    this.isi.a(l, paramaq);
    ab.i("MicroMsg.AppBrandPageContainer", "onReady received, time: %d", new Object[] { Long.valueOf(l) });
    if (this.isj != null)
    {
      this.isj.aJc();
      this.isj = null;
    }
    g localg = this.isi;
    w localw = (w)paramn2.getCurrentPageView();
    if (paramn1 == null)
    {
      paramn2 = localObject;
      localg.a(localw, paramn2, paramaq);
      if ((aq.ive != paramaq) && (aq.iuZ != paramaq))
        post(new r.5(this, paramaq));
      if ((paramn1 != null) && (paramaq == aq.iuZ) && (getRuntime().ya().bQn.scene == 1118) && (this.isk) && (!this.isl))
        if (paramn1.getCurrentPageView() != null)
          break label259;
    }
    label259: for (paramn2 = ""; ; paramn2 = paramn1.getCurrentPageView().aBm())
    {
      if ((this.isp != null) && (this.isp.equals(paramn2)))
      {
        ab.i("MicroMsg.AppBrandPageContainer", "statPageTime");
        this.ism = ((w)paramn1.getCurrentPageView()).ito.aLk();
        this.isl = true;
      }
      AppMethodBeat.o(132360);
      return;
      paramn2 = (w)paramn1.getCurrentPageView();
      break;
    }
  }

  protected final void a(n paramn1, n paramn2, aq paramaq, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(132359);
    super.a(paramn1, paramn2, paramaq, paramString);
    this.isq = System.currentTimeMillis();
    if (!getRuntime().xy())
      if ((paramaq == aq.ivd) || (paramaq == aq.iuY))
      {
        if (!paramString.startsWith(getRuntime().getAppConfig().ayw()))
          bool = true;
        this.isr = bool;
        AppMethodBeat.o(132359);
      }
    while (true)
    {
      return;
      if ((paramaq == aq.ivc) && (paramString.startsWith(getRuntime().getAppConfig().ayw())))
        this.isr = false;
      AppMethodBeat.o(132359);
    }
  }

  protected final boolean a(String paramString, aq paramaq, q.a parama)
  {
    AppMethodBeat.i(132356);
    com.tencent.mm.plugin.appbrand.j.a locala = getRuntime().gNO;
    if (!locala.aIy())
      locala.a(paramString, false, new r.2(this, parama));
    while (true)
    {
      AppMethodBeat.o(132356);
      return true;
      a(paramString, paramaq, parama, false);
    }
  }

  public boolean aAW()
  {
    return this.isr;
  }

  protected g aHU()
  {
    AppMethodBeat.i(132352);
    com.tencent.mm.plugin.appbrand.report.model.b localb = new com.tencent.mm.plugin.appbrand.report.model.b(getRuntime());
    AppMethodBeat.o(132352);
    return localb;
  }

  public u aHV()
  {
    AppMethodBeat.i(132366);
    Object localObject = null;
    if ((getRuntime().getAppConfig().heY) || (!e.aLR()))
      localObject = e.DK(getAppId());
    if (localObject != null)
      AppMethodBeat.o(132366);
    while (true)
    {
      return localObject;
      localObject = new w();
      AppMethodBeat.o(132366);
    }
  }

  protected final n b(String paramString, aq paramaq)
  {
    AppMethodBeat.i(132365);
    paramString = super.b(paramString, paramaq);
    at.cr(paramString);
    AppMethodBeat.o(132365);
    return paramString;
  }

  public final Object f(n paramn)
  {
    AppMethodBeat.i(132367);
    paramn = AnimationUtils.loadAnimation(getContext(), 2131034265);
    AppMethodBeat.o(132367);
    return paramn;
  }

  public final Object g(n paramn)
  {
    AppMethodBeat.i(132368);
    paramn = AnimationUtils.loadAnimation(getContext(), 2131034262);
    AppMethodBeat.o(132368);
    return paramn;
  }

  public g getReporter()
  {
    return this.isi;
  }

  public o getRuntime()
  {
    AppMethodBeat.i(132353);
    o localo = (o)super.getRuntime();
    AppMethodBeat.o(132353);
    return localo;
  }

  public final Object h(n paramn)
  {
    AppMethodBeat.i(132369);
    paramn = AnimationUtils.loadAnimation(getContext(), 2131034261);
    AppMethodBeat.o(132369);
    return paramn;
  }

  public final Object i(n paramn)
  {
    AppMethodBeat.i(132370);
    paramn = AnimationUtils.loadAnimation(getContext(), 2131034266);
    AppMethodBeat.o(132370);
    return paramn;
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(132355);
    if (this.isj != null)
    {
      this.isj.dismiss();
      this.isj = null;
      AppMethodBeat.o(132355);
    }
    while (true)
    {
      return;
      super.onBackPressed();
      AppMethodBeat.o(132355);
    }
  }

  protected final void onDestroy()
  {
    AppMethodBeat.i(132362);
    super.onDestroy();
    if (getPageCount() > 0)
      this.isi.a((w)getCurrentPage().getCurrentPageView());
    if (this.isj != null)
    {
      this.isj.cleanup();
      this.isj = null;
    }
    AppMethodBeat.o(132362);
  }

  protected void onReady()
  {
    AppMethodBeat.i(132361);
    super.onReady();
    ReportStorageSizeTask localReportStorageSizeTask = new ReportStorageSizeTask();
    localReportStorageSizeTask.appId = getRuntime().mAppId;
    AppBrandMainProcessService.a(localReportStorageSizeTask);
    AppMethodBeat.o(132361);
  }

  public void wU()
  {
    AppMethodBeat.i(132363);
    super.wU();
    if (getPageCount() > 0)
      this.isi.c((w)getCurrentPage().getCurrentPageView());
    aJs();
    AppMethodBeat.o(132363);
  }

  public void wW()
  {
    AppMethodBeat.i(132364);
    super.wW();
    if (getPageCount() > 0)
      this.isi.b((w)getCurrentPage().getCurrentPageView());
    Object localObject;
    if ((getCurrentPage() != null) && (getCurrentPage().getCurrentPageView() != null) && (getRuntime().ya().bQn.scene == 1118))
      if ((this.isk) && (!this.isl))
      {
        localObject = getCurrentPage().getCurrentPageView().aBm();
        if ((this.isp != null) && (this.isp.equals(localObject)))
        {
          ab.i("MicroMsg.AppBrandPageContainer", "statPageTime onBackground");
          localObject = ((w)getCurrentPage().getCurrentPageView()).ito;
          if (localObject != null)
            break label256;
        }
      }
    label256: for (long l = 0L; ; l = ((com.tencent.mm.plugin.appbrand.report.model.c)localObject).aLk())
    {
      this.ism = l;
      this.isl = true;
      this.iso = (System.currentTimeMillis() - this.isn);
      if ((this.isk) && (this.isl) && (getRuntime().ya().bQn != null))
      {
        ab.i("MicroMsg.AppBrandPageContainer", "report pageStayTime:%d, appStayTime:%d", new Object[] { Long.valueOf(this.ism), Long.valueOf(this.iso) });
        com.tencent.mm.plugin.appbrand.appusage.a.i.b(1, this.ism, this.iso, getRuntime().ya().bQn.iAp);
      }
      AppMethodBeat.o(132364);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.r
 * JD-Core Version:    0.6.2
 */