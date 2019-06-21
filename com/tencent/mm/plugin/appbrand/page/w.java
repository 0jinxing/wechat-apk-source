package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cc;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.q;
import com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper;
import com.tencent.mm.plugin.appbrand.page.b.c.b;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.l;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class w extends com.tencent.luggage.sdk.a.a.a
{
  private com.tencent.mm.plugin.appbrand.o gOq;
  protected com.tencent.mm.plugin.appbrand.widget.actionbar.g itm;
  private AppBrandRecentView itn;
  public final com.tencent.mm.plugin.appbrand.report.model.c ito;
  private long itp;
  private long itq;
  private long itr;
  private boolean its;
  private cc itt;
  private boolean itu;
  private boolean itv;
  private boolean itw;

  public w()
  {
    AppMethodBeat.i(132398);
    this.ito = new com.tencent.mm.plugin.appbrand.report.model.c(hashCode());
    this.itp = System.currentTimeMillis();
    this.its = false;
    this.itt = null;
    this.itu = false;
    this.itv = false;
    this.itw = false;
    if ((bp.dpL()) || (f.IS_FLAVOR_RED))
      bool = true;
    this.gNV = bool;
    AppMethodBeat.o(132398);
  }

  private void aJU()
  {
    AppMethodBeat.i(132428);
    com.tencent.mm.plugin.report.service.h.pYm.a(370L, 1L, 1L, false);
    com.tencent.mm.plugin.appbrand.s.n.a(aBx(), com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/android.js"), null);
    String str = WxaCommLibRuntimeReader.xu("WAWebview.js");
    long l = System.currentTimeMillis();
    if (str == null);
    for (int i = 0; ; i = str.length())
    {
      boolean bool = atU();
      com.tencent.mm.plugin.appbrand.s.n.a(aBx(), str, new w.2(this, bool, l, i));
      AppMethodBeat.o(132428);
      return;
    }
  }

  private void aJV()
  {
    AppMethodBeat.i(132430);
    if (this.its)
      AppMethodBeat.o(132430);
    String str;
    while (true)
    {
      return;
      if (!this.gOq.gNO.aIy())
        break label82;
      str = aw.a(this.gOq, "app-wxss.js");
      if (!TextUtils.isEmpty(str))
        break;
      AppMethodBeat.o(132430);
    }
    aBx().evaluateJavascript(str, null);
    while (true)
    {
      this.its = true;
      AppMethodBeat.o(132430);
      break;
      label82: str = aw.a(this.gOq, "page-frame.html");
      aBx().evaluateJavascript(v.Di(str), null);
    }
  }

  public boolean AA(String paramString)
  {
    AppMethodBeat.i(132412);
    this.itw = false;
    this.ito.DB(paramString);
    this.itq = System.currentTimeMillis();
    boolean bool = super.AA(paramString);
    AppMethodBeat.o(132412);
    return bool;
  }

  protected final void De(String paramString)
  {
    AppMethodBeat.i(132418);
    this.itr = System.currentTimeMillis();
    aJV();
    StringBuilder localStringBuilder;
    if (this.gOq.gNO.aIy())
    {
      paramString = com.tencent.luggage.g.h.bO(paramString);
      paramString = this.gOq.gNO.CC(paramString);
      localStringBuilder = new StringBuilder().append(paramString);
      if (!paramString.endsWith("/"))
        break label112;
    }
    label112: for (paramString = ""; ; paramString = "/")
    {
      paramString = paramString + "page-frame.js";
      aBx().evaluateJavascript(aw.a(this.gOq, paramString), null);
      AppMethodBeat.o(132418);
      return;
    }
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.appbrand.i parami)
  {
    AppMethodBeat.i(132399);
    this.gOq = ((com.tencent.mm.plugin.appbrand.o)parami);
    super.a(paramContext, parami);
    paramContext = this.ito;
    paramContext.mAppId = parami.mAppId;
    paramContext.iAS.start();
    aIb();
    getActionBar().setCloseButtonClickListener(new w.1(this));
    this.hvM = new com.tencent.mm.plugin.appbrand.permission.a((com.tencent.mm.plugin.appbrand.o)parami, this);
    AppMethodBeat.o(132399);
  }

  protected void aBa()
  {
    AppMethodBeat.i(132413);
    super.aBa();
    this.gOq.gPr.y(4, System.currentTimeMillis() - this.itr);
    AppBrandPerformanceManager.a(getRuntime(), 203, System.currentTimeMillis() - this.itq);
    com.tencent.mm.plugin.appbrand.performance.c.a(getAppId(), "Native", "PageLoad", this.itq, System.currentTimeMillis(), "");
    this.ito.aLj();
    AppMethodBeat.o(132413);
  }

  protected void aBb()
  {
    AppMethodBeat.i(132414);
    super.aBb();
    this.ito.wU();
    AppMethodBeat.o(132414);
  }

  protected void aBc()
  {
    AppMethodBeat.i(132415);
    super.aBc();
    if (this.itm != null)
      this.itm.dismiss();
    this.ito.wW();
    AppMethodBeat.o(132415);
  }

  protected void aBd()
  {
    AppMethodBeat.i(132417);
    super.aBd();
    Object localObject = this.ito;
    ((com.tencent.mm.plugin.appbrand.report.model.c)localObject).iAS.aLh();
    localObject = ((com.tencent.mm.plugin.appbrand.report.model.c)localObject).iAS;
    ((l)localObject).quit();
    ((l)localObject).mStopped = true;
    if ((this.isJ instanceof com.tencent.xweb.c.h))
    {
      localObject = (com.tencent.xweb.c.h)this.isJ;
      if (((com.tencent.xweb.c.h)localObject).hasEnteredFullscreen())
      {
        ab.i("MicroMsg.AppBrandPageViewWC", "performPageDestroy, leave fullscreen");
        ((com.tencent.xweb.c.h)localObject).leaveFullscreen();
      }
    }
    AppMethodBeat.o(132417);
  }

  public View aBl()
  {
    AppMethodBeat.i(132421);
    Object localObject;
    if (aJQ())
    {
      localObject = new AppBrandActionHeaderLayout(this.mContext);
      ((AppBrandActionHeaderLayout)localObject).setAppId(getAppId());
      ((AppBrandActionHeaderLayout)localObject).setActionHeaderStyle(this.isO);
      ab.w("MicroMsg.AppBrandPageViewWC", "getActionSheetHeader orientation:%d, mActionSheetTitle:%s", new Object[] { Integer.valueOf(((MMActivity)this.mContext).getRequestedOrientation()), this.isP });
      if (!TextUtils.isEmpty(this.isP))
        ((AppBrandActionHeaderLayout)localObject).setStatusDescription(this.isP);
      ((AppBrandActionHeaderLayout)localObject).cI(getRuntime().atI().iconUrl, getRuntime().atI().cwz);
      AppMethodBeat.o(132421);
    }
    while (true)
    {
      return localObject;
      localObject = super.aBl();
      AppMethodBeat.o(132421);
    }
  }

  protected com.tencent.mm.plugin.appbrand.page.b.c aBq()
  {
    AppMethodBeat.i(132409);
    Object localObject;
    if (com.tencent.mm.plugin.appbrand.weishi.e.E(getRuntime()))
    {
      localObject = new com.tencent.mm.plugin.appbrand.weishi.c(this);
      AppMethodBeat.o(132409);
    }
    while (true)
    {
      return localObject;
      localObject = super.aBq();
      AppMethodBeat.o(132409);
    }
  }

  protected void aIb()
  {
    AppMethodBeat.i(132407);
    com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.widget.recentview.d.class);
    if (getRuntime().atD())
    {
      AppMethodBeat.o(132407);
      return;
    }
    this.itn = ((com.tencent.mm.plugin.appbrand.widget.recentview.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.widget.recentview.d.class)).a(this.mContext, d.b.joc, new w.6(this));
    this.itm = new com.tencent.mm.plugin.appbrand.widget.actionbar.g(this.mContext);
    this.itm.setWidth(-1);
    this.itm.setBackgroundDrawable(new ColorDrawable());
    if (this.itn != null)
    {
      this.itn.refresh();
      this.itm.setHeight(this.itn.getLayoutParams().height);
      this.itn.setBackground(com.tencent.mm.bz.a.g(this.mContext, 2130837740));
      this.itm.setContentView(this.itn);
      this.itn.setOnItemClickListener(new w.7(this));
    }
    while (true)
    {
      getActionBar().setCapsuleHomeButtonLongClickListener(new w.8(this));
      AppMethodBeat.o(132407);
      break;
      ab.w("MicroMsg.AppBrandPageViewWC", "AppBrandRecentView is null, appId: %s", new Object[] { getAppId() });
    }
  }

  public final String aJA()
  {
    AppMethodBeat.i(132425);
    if (this.gOq == null);
    for (String str = "https://servicewechat.com/" + "preload/"; ; str = "https://servicewechat.com/" + String.format(Locale.US, "%s/%d/", new Object[] { getAppId(), Integer.valueOf(this.gOq.atH().hhd.gVu) }))
    {
      AppMethodBeat.o(132425);
      return str;
    }
  }

  protected final void aJC()
  {
    boolean bool1 = false;
    AppMethodBeat.i(132408);
    super.aJC();
    Object localObject = getPageConfig();
    boolean bool2 = getRuntime().xY().a(this, new w.a((byte)0));
    if ((!((a.d)localObject).hfy) || (!bool2))
      bool1 = true;
    super.ew(bool1);
    if ((!bool2) || (!((a.d)localObject).hfy) || (getRuntime().atI().bQe != 7) || (getActionBar().isFullscreenMode()))
      ab.i("MicroMsg.AppBrandPageViewWC", "hasPermission:" + bool2 + " navigationBarRightButtonHide:" + ((a.d)localObject).hfy + " appServiceType:" + getRuntime().atI().bQe + " isFullscreenMode:" + getActionBar().isFullscreenMode());
    while (true)
    {
      if (com.tencent.mm.plugin.appbrand.weishi.e.E(getRuntime()))
        runOnUiThread(new w.11(this));
      AppMethodBeat.o(132408);
      return;
      localObject = new com.tencent.mm.plugin.appbrand.widget.i.b(((a.d)localObject).hfx, new w.9(this));
      ((com.tencent.mm.plugin.appbrand.widget.i.b)localObject).a(new w.10(this));
      ((com.tencent.mm.plugin.appbrand.widget.i.b)localObject).aSg();
    }
  }

  protected final void aJH()
  {
    AppMethodBeat.i(132420);
    if (getRuntime().ya().bQn.scene == 1023)
      aJJ();
    while (true)
    {
      if (com.tencent.mm.plugin.appbrand.weishi.e.E(this.gOq))
        getActionBar().aON();
      AppMethodBeat.o(132420);
      return;
      if ((!getRuntime().atD()) && (getRuntime().atJ().getPageCount() == 1))
        aJJ();
      else
        aJI();
    }
  }

  protected final boolean aJK()
  {
    AppMethodBeat.i(132434);
    boolean bool = super.aJK();
    this.itw = bool;
    AppMethodBeat.o(132434);
    return bool;
  }

  protected final String aJP()
  {
    AppMethodBeat.i(132429);
    String str = WxaCommLibRuntimeReader.xu("WAPageFrame.html");
    AppMethodBeat.o(132429);
    return str;
  }

  public final com.tencent.mm.plugin.appbrand.jsapi.t.a aJS()
  {
    AppMethodBeat.i(132410);
    Object localObject = getContentView().findViewById(2131820572);
    if ((localObject instanceof com.tencent.mm.plugin.appbrand.jsapi.t.a))
    {
      localObject = (com.tencent.mm.plugin.appbrand.jsapi.t.a)localObject;
      AppMethodBeat.o(132410);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(132410);
    }
  }

  public final void aJT()
  {
    AppMethodBeat.i(132424);
    new p(this, this.irD).aJm();
    AppMethodBeat.o(132424);
  }

  protected final List<com.tencent.mm.plugin.appbrand.menu.n> aJx()
  {
    boolean bool1 = true;
    AppMethodBeat.i(132411);
    Object localObject = getAppId();
    LinkedList localLinkedList = new LinkedList();
    if ("wxfe02ecfe70800f46".equalsIgnoreCase((String)localObject))
    {
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imO.ordinal(), false);
      AppMethodBeat.o(132411);
      return localLinkedList;
    }
    WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imM.ordinal(), false);
    WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imN.ordinal(), false);
    WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imO.ordinal(), true);
    WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imV.ordinal(), false);
    localObject = com.tencent.mm.plugin.appbrand.a.wJ((String)localObject);
    if (!com.tencent.mm.sdk.a.b.dnO())
    {
      bool2 = bool1;
      if (localObject != null)
        if (((com.tencent.mm.plugin.appbrand.config.h)localObject).hhd.gVt != 1)
          break label246;
    }
    label246: for (boolean bool2 = bool1; ; bool2 = false)
    {
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imW.ordinal(), bool2);
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imX.ordinal(), false);
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imY.ordinal(), false);
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imQ.ordinal(), false);
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imS.ordinal(), false);
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.inb.ordinal(), false);
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imR.ordinal(), false);
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imT.ordinal(), false);
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.ina.ordinal(), false);
      WxaMenuHelper.c(localLinkedList, com.tencent.mm.plugin.appbrand.menu.o.imU.ordinal(), false);
      AppMethodBeat.o(132411);
      break;
    }
  }

  protected void aL(List<com.tencent.mm.plugin.appbrand.menu.n> paramList)
  {
    AppMethodBeat.i(132423);
    new p(this, paramList).aJm();
    AppMethodBeat.o(132423);
  }

  public final s atK()
  {
    AppMethodBeat.i(132405);
    s locals = (s)super.xM();
    AppMethodBeat.o(132405);
    return locals;
  }

  protected final void atV()
  {
    AppMethodBeat.i(132426);
    aJU();
    this.itu = true;
    AppMethodBeat.o(132426);
  }

  public Map<String, com.tencent.mm.plugin.appbrand.jsapi.m> aub()
  {
    AppMethodBeat.i(132403);
    Map localMap = q.aCi();
    AppMethodBeat.o(132403);
    return localMap;
  }

  public final void bN(String paramString)
  {
    AppMethodBeat.i(132419);
    super.bN(paramString);
    com.tencent.mm.plugin.appbrand.report.c.br(getAppId(), 27);
    AppMethodBeat.o(132419);
  }

  public aj cF(Context paramContext)
  {
    AppMethodBeat.i(132402);
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    paramContext = new aa(localContext, this.isX);
    AppMethodBeat.o(132402);
    return paramContext;
  }

  protected am cG(Context paramContext)
  {
    AppMethodBeat.i(132433);
    paramContext = new w.4(this, paramContext);
    AppMethodBeat.o(132433);
    return paramContext;
  }

  public final void ew(boolean paramBoolean)
  {
    AppMethodBeat.i(132431);
    com.tencent.mm.plugin.appbrand.permission.e locale = getRuntime().xY();
    if ((locale.b((s)super.xM(), com.tencent.mm.plugin.appbrand.jsapi.k.p.class)) || (locale.b(this, com.tencent.mm.plugin.appbrand.jsapi.k.p.class)))
    {
      super.ew(paramBoolean);
      AppMethodBeat.o(132431);
    }
    while (true)
    {
      return;
      super.ew(true);
      AppMethodBeat.o(132431);
    }
  }

  public com.tencent.mm.plugin.appbrand.o getRuntime()
  {
    AppMethodBeat.i(132404);
    com.tencent.mm.plugin.appbrand.o localo = (com.tencent.mm.plugin.appbrand.o)super.xL();
    AppMethodBeat.o(132404);
    return localo;
  }

  public final void h(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(132432);
    super.h(paramJSONObject);
    b(paramJSONObject, "clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.vxo));
    com.tencent.mm.plugin.appbrand.e.d.a(com.tencent.mm.plugin.appbrand.u.a.aSj(), paramJSONObject);
    com.tencent.mm.plugin.appbrand.e.d.b(com.tencent.mm.plugin.appbrand.u.a.aSk(), paramJSONObject);
    AppMethodBeat.o(132432);
  }

  protected void initView()
  {
    AppMethodBeat.i(132401);
    super.initView();
    if ((aJz() instanceof MMWebView))
      ((MMWebView)aJz()).getIsX5Kernel();
    aJy().a(new w.5(this));
    AppMethodBeat.o(132401);
  }

  public boolean isFullScreen()
  {
    AppMethodBeat.i(132422);
    boolean bool;
    if (this.isT.aBt() == c.b.ivv)
    {
      bool = true;
      AppMethodBeat.o(132422);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(132422);
    }
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(132416);
    super.onConfigurationChanged(paramConfiguration);
    al.d(new w.12(this, paramConfiguration));
    AppMethodBeat.o(132416);
  }

  protected void onCreate()
  {
    AppMethodBeat.i(132427);
    Object localObject1;
    if ((aJz() instanceof MMWebView))
    {
      localObject1 = (MMWebView)aJz();
      com.tencent.mm.plugin.appbrand.n.xb(getAppId()).gPe.set(((MMWebView)localObject1).getIsX5Kernel());
      com.tencent.mm.plugin.appbrand.report.c.eA(((MMWebView)localObject1).getIsX5Kernel());
    }
    aBx().evaluateJavascript(String.format(Locale.US, "history.pushState({},\"\",\"%s\");", new Object[] { aJB() }), null);
    Object localObject2;
    if (!this.itu)
    {
      aJU();
      localObject2 = "";
      localObject1 = localObject2;
      if (this.gOq.atH().bQp)
      {
        localObject1 = localObject2;
        if (!this.gOq.yd())
          localObject1 = WxaCommLibRuntimeReader.xu("WAVConsole.js");
      }
      if (bo.isNullOrNil((String)localObject1))
        break label237;
      long l = System.currentTimeMillis();
      boolean bool = atU();
      aBx().evaluateJavascript((String)localObject1, new w.3(this, bool, l, (String)localObject1));
    }
    while (true)
    {
      aJV();
      if (!this.itv)
      {
        this.itv = true;
        this.gOq.gPr.y(3, System.currentTimeMillis() - this.itp);
        com.tencent.mm.plugin.appbrand.performance.c.a(getAppId(), "Native", "WebViewInit+PageFrameLoad", this.itp, System.currentTimeMillis(), "");
      }
      AppMethodBeat.o(132427);
      return;
      this.itu = false;
      break;
      label237: localObject2 = new StringBuilder();
      localObject1 = "";
      if (AppBrandPerformanceManager.b(getRuntime()))
        localObject1 = WxaCommLibRuntimeReader.xu("WAPerf.js");
      localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = "";
      if (this.gOq.yd())
        localObject1 = ";" + WxaCommLibRuntimeReader.xu("WARemoteDebug.js");
      localObject1 = (String)localObject1;
      aBx().evaluateJavascript((String)localObject1, null);
    }
  }

  public void xN()
  {
    AppMethodBeat.i(132406);
    super.xN();
    if (this.itn != null)
      this.itn.release();
    if (this.itm != null)
    {
      com.tencent.mm.plugin.appbrand.widget.actionbar.g localg = this.itm;
      localg.dismiss();
      if (localg.iVi != null)
      {
        localg.iVi.removeAllViews();
        localg.iVi = null;
      }
    }
    AppMethodBeat.o(132406);
  }

  public final void xO()
  {
    AppMethodBeat.i(132400);
    ab.i("MicroMsg.AppBrandPageViewWC", "[wxa_reload] onWebViewTrimmed %s", new Object[] { getURL() });
    super.xO();
    this.itu = false;
    this.its = false;
    AppMethodBeat.o(132400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w
 * JD-Core Version:    0.6.2
 */