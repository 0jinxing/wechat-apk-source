package com.tencent.mm.plugin.appbrand;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bw;
import com.tencent.mm.g.b.a.bw.a;
import com.tencent.mm.g.b.a.cm;
import com.tencent.mm.g.b.a.cm.a;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.a.c;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.LaunchCheckParams;
import com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.UpdateTask;
import com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle;
import com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverWC.1;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.page.aa;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.plugin.appbrand.s.q.a;
import com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.a;
import com.tencent.mm.plugin.appbrand.task.e.a;
import com.tencent.mm.plugin.appbrand.ui.AppBrandEmbedUI;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.plugin.appbrand.widget.b.f.1;
import com.tencent.mm.plugin.appbrand.widget.b.f.10;
import com.tencent.mm.plugin.appbrand.widget.b.f.5;
import com.tencent.mm.plugin.appbrand.widget.b.f.6;
import com.tencent.mm.plugin.appbrand.widget.b.f.7;
import com.tencent.mm.plugin.appbrand.widget.b.f.8;
import com.tencent.mm.plugin.appbrand.widget.b.f.9;
import com.tencent.mm.pluginsdk.model.v;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class o extends com.tencent.luggage.sdk.b.b
  implements com.tencent.mm.plugin.appbrand.launching.j
{
  private volatile com.tencent.mm.plugin.appbrand.permission.e gPo;
  protected AppBrandRemoteTaskController gPp;
  private com.tencent.mm.plugin.appbrand.report.model.n gPq;
  public m gPr;
  public boolean gPs;
  private int gPt;
  private boolean gPu;
  private ap gPv;
  private j gPw;
  private final com.tencent.mm.plugin.appbrand.task.f gPx;

  static
  {
    AppMethodBeat.i(129062);
    com.tencent.mm.plugin.appbrand.j.f.b.inO = new ModularizingPkgRetrieverWC.1();
    t.ev(((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lIU, true));
    AppMethodBeat.o(129062);
  }

  public o(Activity paramActivity, ab paramab)
  {
    super(paramActivity, paramab);
    AppMethodBeat.i(129004);
    this.gPt = 0;
    this.gPv = null;
    this.gPx = new o.9(this);
    this.gPr = new m();
    this.gPp = new AppBrandRemoteTaskController();
    AppBrandRemoteTaskController localAppBrandRemoteTaskController = this.gPp;
    paramab = paramab.atz();
    com.tencent.mm.plugin.appbrand.task.f localf = this.gPx;
    localAppBrandRemoteTaskController.gQX = paramActivity.getClass().getName();
    if ((paramActivity instanceof AppBrandEmbedUI))
      localAppBrandRemoteTaskController.iEJ = ((AppBrandEmbedUI)paramActivity).iFU;
    localAppBrandRemoteTaskController.gOD = paramab;
    localAppBrandRemoteTaskController.gPx = localf;
    this.gNV = bp.dpL();
    AppMethodBeat.o(129004);
  }

  private void a(com.tencent.mm.plugin.appbrand.config.a.a.a parama, a.d paramd)
  {
    AppMethodBeat.i(129033);
    if (this.mFinished)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeWC", "mFinished is true return,mAppId:%s", new Object[] { this.mAppId });
      AppMethodBeat.o(129033);
    }
    while (true)
    {
      return;
      if (xy())
        paramd = null;
      paramd = com.tencent.mm.plugin.appbrand.config.a.a.a(getAppConfig(), paramd);
      com.tencent.mm.plugin.appbrand.config.a.a.t((MMActivity)super.getContext()).a(paramd, parama);
      AppMethodBeat.o(129033);
    }
  }

  private a.d atL()
  {
    AppMethodBeat.i(129032);
    Object localObject = (com.tencent.mm.plugin.appbrand.page.r)super.asV();
    if (localObject == null)
    {
      AppMethodBeat.o(129032);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = ((com.tencent.mm.plugin.appbrand.page.r)localObject).getCurrentPage();
      if (localObject == null)
      {
        AppMethodBeat.o(129032);
        localObject = null;
      }
      else
      {
        localObject = ((com.tencent.mm.plugin.appbrand.page.n)localObject).getPageConfig();
        AppMethodBeat.o(129032);
      }
    }
  }

  private void atN()
  {
    AppMethodBeat.i(129038);
    v.r("weapp_id", ((AppBrandInitConfigWC)super.ya()).appId);
    v.r("weapp_name", ((AppBrandInitConfigWC)super.ya()).cwz);
    v.r("use_private_classloader", Boolean.FALSE);
    AppMethodBeat.o(129038);
  }

  private void nl(int paramInt)
  {
    AppMethodBeat.i(129039);
    int i = 369;
    if (xy())
      i = 777;
    com.tencent.mm.plugin.report.service.h.pYm.a(i, paramInt, 1L, false);
    AppMethodBeat.o(129039);
  }

  public final void a(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(129034);
    if (!this.eMP)
    {
      AppMethodBeat.o(129034);
      return;
    }
    Object localObject1 = (AppBrandInitConfigWC)paramAppBrandInitConfig;
    int i;
    if (!this.eMP)
      i = 0;
    while (true)
    {
      if (i != 0)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeWC", "updateConfig %s, setWillRelaunch", new Object[] { this.mAppId });
        this.gNQ = true;
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppBrandRuntime", "setWillRelaunch");
      }
      super.a(paramAppBrandInitConfig);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeWC", "updateConfig %s, willRestart[%b], willRelaunch[%b], finished[%b], scene[%d]", new Object[] { this.mAppId, Boolean.valueOf(this.gNP), Boolean.valueOf(this.gNQ), Boolean.valueOf(this.mFinished), Integer.valueOf(ya().bQn.scene) });
      if ((!this.gNP) && (!this.mFinished))
      {
        com.tencent.mm.plugin.appbrand.report.quality.g.a(this, true);
        if ((com.tencent.mm.plugin.appbrand.page.r)super.asV() != null)
        {
          paramAppBrandInitConfig = (com.tencent.mm.plugin.appbrand.page.r)super.asV();
          paramAppBrandInitConfig.getReporter().resetSession();
          paramAppBrandInitConfig.isk = false;
          paramAppBrandInitConfig.isl = false;
        }
        localObject2 = (AppBrandInitConfigWC)super.ya();
        paramAppBrandInitConfig = atH();
        localObject1 = ya().bQn;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandTaskUsageRecorder", "updateUsage, appId %s, type %d", new Object[] { ((AppBrandInitConfigWC)localObject2).appId, Integer.valueOf(((AppBrandInitConfigWC)localObject2).gVs) });
        String str = ((AppBrandInitConfigWC)localObject2).xz();
        AppBrandMainProcessService.a(new AppBrandTaskUsageRecorder.UpdateTask(new AppBrandTaskUsageRecorder.LaunchCheckParams((AppBrandInitConfigWC)localObject2, (AppBrandStatObject)localObject1, paramAppBrandInitConfig.hhd.gVu, WxaCommLibRuntimeReader.avQ().gVu, str, ((AppBrandInitConfigWC)localObject2).hgN)));
      }
      AppMethodBeat.o(129034);
      break;
      Object localObject2 = ((AppBrandInitConfigLU)localObject1).bQn;
      boolean bool;
      if ((this.gPu) || (((AppBrandStatObject)localObject2).scene == 1099))
        if (((AppBrandStatObject)localObject2).scene == 1099)
        {
          bool = true;
          label345: this.gPu = bool;
        }
      do
      {
        i = 1;
        break;
        bool = false;
        break label345;
        if ((((AppBrandStatObject)localObject2).scene == 1022) || (((AppBrandStatObject)localObject2).scene == 1001) || (((AppBrandStatObject)localObject2).scene == 1089) || (((AppBrandStatObject)localObject2).scene == 1090) || (((AppBrandStatObject)localObject2).scene == 1038))
        {
          i = 0;
          break;
        }
        localObject2 = (AppBrandInitConfigWC)super.ya();
      }
      while ((!bo.isNullOrNil(((AppBrandInitConfigWC)localObject1).hgC)) || (!bo.isNullOrNil(((AppBrandInitConfigWC)localObject1).bQi)) || (!bo.isNullOrNil(((AppBrandInitConfigWC)localObject2).hgC)) || (!bo.isNullOrNil(((AppBrandInitConfigWC)localObject2).bQi)));
      i = 0;
    }
  }

  protected com.tencent.mm.plugin.appbrand.j.a asX()
  {
    AppMethodBeat.i(129031);
    int i;
    Object localObject;
    if ((atH() != null) && (!bo.ek(atH().hhd.gVx)))
    {
      i = 1;
      if (i == 0)
        break label57;
      localObject = new com.tencent.mm.plugin.appbrand.j.h(this);
      AppMethodBeat.o(129031);
    }
    while (true)
    {
      return localObject;
      i = 0;
      break;
      label57: localObject = new com.tencent.mm.plugin.appbrand.j.b.a(this, (byte)0);
      AppMethodBeat.o(129031);
    }
  }

  protected final p asZ()
  {
    AppMethodBeat.i(129026);
    com.tencent.mm.plugin.appbrand.jsapi.file.al localal = new com.tencent.mm.plugin.appbrand.jsapi.file.al(this, com.tencent.mm.plugin.appbrand.config.d.b(atH()));
    AppMethodBeat.o(129026);
    return localal;
  }

  public final boolean atD()
  {
    AppMethodBeat.i(129006);
    boolean bool = ((AppBrandInitConfigWC)super.ya()).hgJ;
    AppMethodBeat.o(129006);
    return bool;
  }

  protected final void atE()
  {
    AppMethodBeat.i(129014);
    a(com.tencent.mm.plugin.appbrand.networking.a.class, new com.tencent.mm.plugin.appbrand.networking.f());
    a(com.tencent.mm.plugin.appbrand.permission.f.class, new com.tencent.mm.plugin.appbrand.permission.i(this));
    a(com.tencent.mm.plugin.appbrand.permission.g.class, com.tencent.mm.plugin.appbrand.permission.k.ixc);
    a(com.tencent.mm.plugin.appbrand.jsapi.media.b.class, com.tencent.mm.plugin.appbrand.jsapi.media.i.hQA);
    this.gNK.L(com.tencent.mm.plugin.appbrand.networking.b.class);
    a(com.tencent.mm.plugin.appbrand.networking.b.class, new com.tencent.mm.plugin.appbrand.networking.e(this));
    a(com.tencent.mm.plugin.appbrand.widget.g.class, com.tencent.mm.plugin.appbrand.widget.h.iUe);
    AppMethodBeat.o(129014);
  }

  protected final void atF()
  {
    AppMethodBeat.i(129016);
    o localo = a.wI(this.mAppId);
    if ((localo != null) && (this != localo))
      localo.atP();
    this.gPp.DL(this.mAppId);
    AppMethodBeat.o(129016);
  }

  public final com.tencent.mm.plugin.appbrand.jsapi.file.al atG()
  {
    AppMethodBeat.i(138686);
    com.tencent.mm.plugin.appbrand.jsapi.file.al localal = (com.tencent.mm.plugin.appbrand.jsapi.file.al)super.asE();
    AppMethodBeat.o(138686);
    return localal;
  }

  public final AppBrandSysConfigWC atH()
  {
    AppMethodBeat.i(129027);
    AppBrandSysConfigWC localAppBrandSysConfigWC = (AppBrandSysConfigWC)c(AppBrandSysConfigWC.class, false);
    AppMethodBeat.o(129027);
    return localAppBrandSysConfigWC;
  }

  public final AppBrandInitConfigWC atI()
  {
    AppMethodBeat.i(138687);
    AppBrandInitConfigWC localAppBrandInitConfigWC = (AppBrandInitConfigWC)super.ya();
    AppMethodBeat.o(138687);
    return localAppBrandInitConfigWC;
  }

  public final com.tencent.mm.plugin.appbrand.page.r atJ()
  {
    AppMethodBeat.i(138688);
    com.tencent.mm.plugin.appbrand.page.r localr = (com.tencent.mm.plugin.appbrand.page.r)super.asV();
    AppMethodBeat.o(138688);
    return localr;
  }

  public final s atK()
  {
    AppMethodBeat.i(138689);
    s locals = (s)super.xT();
    AppMethodBeat.o(138689);
    return locals;
  }

  public final MMActivity atM()
  {
    AppMethodBeat.i(138691);
    MMActivity localMMActivity = (MMActivity)super.getContext();
    AppMethodBeat.o(138691);
    return localMMActivity;
  }

  public final void atO()
  {
    int i = 0;
    AppMethodBeat.i(129041);
    Object localObject1 = this.gNI;
    Object localObject2 = atH();
    Object localObject3 = new com.tencent.mm.plugin.appbrand.config.h();
    ((com.tencent.mm.plugin.appbrand.config.h)localObject3).cwz = ((AppBrandSysConfigLU)localObject2).cwz;
    ((com.tencent.mm.plugin.appbrand.config.h)localObject3).appId = ((AppBrandSysConfigLU)localObject2).appId;
    ((com.tencent.mm.plugin.appbrand.config.h)localObject3).hgW = ((AppBrandSysConfigLU)localObject2).hgW;
    ((com.tencent.mm.plugin.appbrand.config.h)localObject3).hgX = ((AppBrandSysConfigLU)localObject2).hgX;
    ((com.tencent.mm.plugin.appbrand.config.h)localObject3).hhb = ((AppBrandSysConfigLU)localObject2).hhb;
    ((com.tencent.mm.plugin.appbrand.config.h)localObject3).hhc = ((AppBrandSysConfigLU)localObject2).hhc;
    ((com.tencent.mm.plugin.appbrand.config.h)localObject3).hhd = ((AppBrandSysConfigLU)localObject2).hhd;
    ((com.tencent.mm.plugin.appbrand.config.h)localObject3).hgY = ((AppBrandSysConfigLU)localObject2).hgY;
    ((Collection)localObject1).add(localObject3);
    localObject3 = this.gNI;
    Object localObject4 = ya();
    AppBrandSysConfigLU localAppBrandSysConfigLU = xZ();
    localObject2 = getAppConfig();
    com.tencent.mm.plugin.appbrand.l.a locala = new com.tencent.mm.plugin.appbrand.l.a();
    int k;
    if ((((AppBrandInitConfigLU)localObject4).bQg) || (((AppBrandInitConfigLU)localObject4).xy()))
    {
      j = 1;
      locala.ioe = j;
      if ((localAppBrandSysConfigLU.hhd.gVt != 1) && (localAppBrandSysConfigLU.hhd.gVt != 2))
        break label1033;
      k = 1;
      label193: if (!localAppBrandSysConfigLU.bQf)
        break label1045;
      if ((k != 0) && (localAppBrandSysConfigLU.bQs))
        break label1039;
      j = 1;
      label217: locala.iof = j;
      k = com.tencent.mm.plugin.appbrand.config.d.n(new int[] { localAppBrandSysConfigLU.bQO.hfP.hgs, ((com.tencent.mm.plugin.appbrand.config.a)localObject2).heW.cRx });
      if (k > 0)
        locala.iog = k;
      k = com.tencent.mm.plugin.appbrand.config.d.n(new int[] { localAppBrandSysConfigLU.bQO.hfP.hgp, ((com.tencent.mm.plugin.appbrand.config.a)localObject2).heW.hfj });
      if (k > 0)
        locala.ioh = k;
      k = com.tencent.mm.plugin.appbrand.config.d.n(new int[] { localAppBrandSysConfigLU.bQO.hfP.hgq, ((com.tencent.mm.plugin.appbrand.config.a)localObject2).heW.hfk });
      if (k > 0)
        locala.ioi = k;
      k = com.tencent.mm.plugin.appbrand.config.d.n(new int[] { localAppBrandSysConfigLU.bQO.hfP.hgr, ((com.tencent.mm.plugin.appbrand.config.a)localObject2).heW.hfl });
      if (k > 0)
        locala.ioj = k;
      locala.bQw = localAppBrandSysConfigLU.bQw;
      locala.iok = localAppBrandSysConfigLU.bQz;
      locala.bQx = localAppBrandSysConfigLU.bQx;
      locala.bQy = localAppBrandSysConfigLU.bQy;
      locala.bQF = localAppBrandSysConfigLU.bQF;
      locala.bQG = localAppBrandSysConfigLU.bQG;
      locala.bQH = localAppBrandSysConfigLU.bQH;
      locala.bQI = localAppBrandSysConfigLU.bQI;
      locala.bQJ = localAppBrandSysConfigLU.bQJ;
      if (localAppBrandSysConfigLU.bQO.hfP.mode != 1)
        break label1070;
      if (localAppBrandSysConfigLU.bQO.hfP.hgn != null)
        locala.iol = localAppBrandSysConfigLU.bQO.hfP.hgn;
      label535: locala.mode = localAppBrandSysConfigLU.bQO.hfP.mode;
      locala.ion = com.tencent.mm.plugin.appbrand.config.d.s(this);
      if (!((AppBrandInitConfigLU)localObject4).xy())
        break label1118;
      k = localAppBrandSysConfigLU.bQO.hga;
      label578: locala.hfK = k;
      locala.bQB = localAppBrandSysConfigLU.bQB;
      locala.bQC = localAppBrandSysConfigLU.bQC;
      locala.ioo = com.tencent.mm.plugin.appbrand.config.d.ayy();
      localObject1 = "";
      localObject2 = localObject1;
      if (localAppBrandSysConfigLU.bQO != null)
      {
        localObject2 = localObject1;
        if (localAppBrandSysConfigLU.bQO.hfP != null)
          localObject2 = localAppBrandSysConfigLU.bQO.hfP.hgt;
      }
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
        localObject1 = "servicewechat.com";
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("https://");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("/");
      ((StringBuilder)localObject2).append(localAppBrandSysConfigLU.appId);
      ((StringBuilder)localObject2).append("/");
      ((StringBuilder)localObject2).append(localAppBrandSysConfigLU.hhd.gVu);
      ((StringBuilder)localObject2).append("/page-frame.html");
      locala.referer = ((StringBuilder)localObject2).toString();
      locala.bQf = ((AppBrandInitConfigLU)localObject4).bQf;
      locala.iop = localAppBrandSysConfigLU.hhd.gVt;
      ((Collection)localObject3).add(locala);
      this.gNI.add(com.tencent.mm.plugin.appbrand.config.d.b(atH()));
      localObject1 = this.gNI;
      localObject2 = atH();
      localObject3 = new q.a();
      ((q.a)localObject3).hfX = ((AppBrandSysConfigLU)localObject2).bQO.hfX;
      ((Collection)localObject1).add(localObject3);
      localObject3 = this.gNI;
      localObject1 = xZ();
      localObject4 = getAppConfig();
      localObject2 = new com.tencent.mm.plugin.appbrand.b.a();
      if (!j.a.kR(((com.tencent.mm.plugin.appbrand.config.h)localObject1).hhd.gVt))
        break label1131;
      ((com.tencent.mm.plugin.appbrand.b.a)localObject2).gWs = ((com.tencent.mm.plugin.appbrand.config.a)localObject4).hfb.contains("audio");
      label888: ((Collection)localObject3).add(localObject2);
      localObject1 = atH();
      localObject2 = new com.tencent.mm.plugin.appbrand.performance.a();
      if ((!((AppBrandSysConfigLU)localObject1).bQq) || (((com.tencent.mm.plugin.appbrand.config.h)localObject1).hhd.gVt != 1))
        break label1142;
      j = 1;
      label931: ((com.tencent.mm.plugin.appbrand.performance.a)localObject2).ivy = j;
      if (((com.tencent.mm.plugin.appbrand.config.h)localObject1).hhd.gVt == 0)
        break label1148;
    }
    label1033: label1039: label1045: label1070: label1118: label1131: label1142: label1148: for (int j = 1; ; j = 0)
    {
      ((com.tencent.mm.plugin.appbrand.performance.a)localObject2).ivz = j;
      ((com.tencent.mm.plugin.appbrand.performance.a)localObject2).ivA = ((AppBrandSysConfigLU)localObject1).bQp;
      ((com.tencent.mm.plugin.appbrand.performance.a)localObject2).ivy |= DebuggerShell.ayT();
      j = ((com.tencent.mm.plugin.appbrand.performance.a)localObject2).ivz;
      if (!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED)
      {
        k = i;
        if (!bp.dpL());
      }
      else
      {
        k = 1;
      }
      ((com.tencent.mm.plugin.appbrand.performance.a)localObject2).ivz = (j | k);
      this.gNI.add(localObject2);
      AppMethodBeat.o(129041);
      return;
      j = 0;
      break;
      int m = 0;
      break label193;
      j = 0;
      break label217;
      if ((m == 0) || (!localAppBrandSysConfigLU.bQp))
      {
        j = 1;
        break label217;
      }
      j = 0;
      break label217;
      if ((localAppBrandSysConfigLU.bQO.hfP.mode != 2) || (localAppBrandSysConfigLU.bQO.hfP.hgo == null))
        break label535;
      locala.iom = localAppBrandSysConfigLU.bQO.hfP.hgo;
      break label535;
      m = localAppBrandSysConfigLU.bQO.hfK;
      break label578;
      ((com.tencent.mm.plugin.appbrand.b.a)localObject2).gWs = ((AppBrandSysConfigLU)localObject1).hgY;
      break label888;
      j = 0;
      break label931;
    }
  }

  public final void atP()
  {
    AppMethodBeat.i(129043);
    this.gNT = false;
    this.gNz.j(this);
    super.finish();
    if ((this.gNz instanceof l))
      ((l)this.gNz).atC();
    AppMethodBeat.o(129043);
  }

  protected com.tencent.mm.plugin.appbrand.ui.q ata()
  {
    int i = 1;
    AppMethodBeat.i(129037);
    com.tencent.mm.plugin.appbrand.game.preload.e locale;
    Object localObject;
    if (xy())
    {
      locale = com.tencent.mm.plugin.appbrand.game.preload.e.aBD();
      if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lHn, false) == true)
      {
        j = 1;
        locale.htG = j;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WAGamePreloadStatisManager", "misPreload:%d", new Object[] { Integer.valueOf(locale.htG) });
        localObject = (AppBrandInitConfigWC)super.ya();
        locale.htB = ((AppBrandInitConfigWC)localObject).appId;
        locale.htC = ((AppBrandInitConfigWC)localObject).axy;
        locale.htD = ((AppBrandInitConfigWC)localObject).gVs;
        locale.htE = (((AppBrandInitConfigWC)localObject).bQe + 1000);
        locale.htF = ((AppBrandInitConfigWC)localObject).hgN.igT;
      }
    }
    else
    {
      switch (locale.htD)
      {
      default:
        label160: if (ya().bQn != null)
          locale.gOW = ya().bQn.scene;
        if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lJk, false) == true)
        {
          j = 1;
          label207: locale.htI = j;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WAGamePreloadStatisManager", "mHasSplashScreen:%d", new Object[] { Integer.valueOf(locale.htI) });
          localObject = com.tencent.mm.plugin.appbrand.ui.e.a((MMActivity)super.getContext(), this);
          ((com.tencent.mm.plugin.appbrand.ui.q)localObject).cz(((AppBrandInitConfigWC)super.ya()).iconUrl, ((AppBrandInitConfigWC)super.ya()).cwz);
          if (ya().bQn.scene != 1023)
            break label347;
        }
        break;
      case 0:
      case 1:
      case 2:
      }
    }
    label347: for (int j = i; ; j = 0)
    {
      if (j != 0)
        ((com.tencent.mm.plugin.appbrand.ui.q)localObject).aHT();
      AppMethodBeat.o(129037);
      return localObject;
      j = 0;
      break;
      locale.htD = 1;
      break label160;
      locale.htD = 2;
      break label160;
      locale.htD = 3;
      break label160;
      j = 0;
      break label207;
    }
  }

  public final Looper atd()
  {
    AppMethodBeat.i(129007);
    Looper localLooper;
    if (xy())
    {
      localLooper = new com.tencent.mm.sdk.platformtools.al("AppRunningStateMachineForGameRuntime").oAl.getLooper();
      AppMethodBeat.o(129007);
    }
    while (true)
    {
      return localLooper;
      localLooper = super.atd();
      AppMethodBeat.o(129007);
    }
  }

  protected final void atf()
  {
    AppMethodBeat.i(129019);
    super.atf();
    nl(11);
    AppMethodBeat.o(129019);
  }

  protected final void atg()
  {
    AppMethodBeat.i(129017);
    super.atg();
    AppBrandInitConfigWC localAppBrandInitConfigWC = (AppBrandInitConfigWC)super.ya();
    this.gPr.y(0, System.currentTimeMillis() - localAppBrandInitConfigWC.startTime);
    nl(1);
    com.tencent.mm.plugin.appbrand.performance.c.a(this.mAppId, "ActivityCreate", ((AppBrandInitConfigWC)super.ya()).startTime, System.currentTimeMillis());
    MMToClientEvent.a(this.mAppId, new o.15(this));
    atN();
    new com.tencent.mm.plugin.appbrand.report.b.a(this, (byte)0);
    this.gPr.y(8, System.currentTimeMillis() - ((AppBrandInitConfigWC)super.ya()).startTime);
    nl(2);
    AppMethodBeat.o(129017);
  }

  protected q ath()
  {
    AppMethodBeat.i(129011);
    s locals;
    if (super.yd())
      if (xy())
      {
        locals = com.tencent.mm.plugin.appbrand.task.e.a(this.mAppId, com.tencent.mm.plugin.appbrand.task.g.eB(true));
        localObject = locals;
        if (locals == null)
          localObject = new com.tencent.mm.plugin.appbrand.game.b();
      }
    while (true)
    {
      AppMethodBeat.o(129011);
      return localObject;
      localObject = new com.tencent.mm.plugin.appbrand.debugger.r();
      continue;
      locals = com.tencent.mm.plugin.appbrand.task.e.a(this.mAppId, com.tencent.mm.plugin.appbrand.task.g.eB(xy()));
      if (locals != null)
        break;
      if (xy());
      for (localObject = "WAGame"; ; localObject = "WAService")
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeWC", "[%s] [preload] createService got no preloaded", new Object[] { localObject });
        if (((!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) && (!com.tencent.mm.sdk.platformtools.f.DEBUG) && (!DebuggerShell.ayT())) || (!com.tencent.mm.plugin.appbrand.task.b.aLG()))
          break;
        localObject = new IllegalStateException("[ForcePreload] enabled, but not preload");
        AppMethodBeat.o(129011);
        throw ((Throwable)localObject);
      }
      if (xy())
        localObject = new com.tencent.mm.plugin.appbrand.game.b();
      else
        localObject = new s();
    }
    if (xy());
    for (Object localObject = "WAGame"; ; localObject = "WAService")
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeWC", "[%s] [preload] createService preloaded", new Object[] { localObject });
      localObject = locals;
      break;
    }
  }

  protected com.tencent.mm.plugin.appbrand.page.q ati()
  {
    AppMethodBeat.i(129012);
    try
    {
      com.tencent.mm.plugin.appbrand.report.quality.a.DG(this.mAppId).iDk = bo.anU();
      label19: if (xy());
      for (Object localObject = new com.tencent.mm.plugin.appbrand.game.page.e((MMActivity)super.getContext(), this); ; localObject = new com.tencent.mm.plugin.appbrand.page.r((MMActivity)super.getContext(), this))
      {
        ((com.tencent.mm.plugin.appbrand.page.r)localObject).setDecorWidgetFactory(new com.tencent.mm.plugin.appbrand.page.d());
        AppMethodBeat.o(129012);
        return localObject;
      }
    }
    catch (Throwable localThrowable)
    {
      break label19;
    }
  }

  public final boolean atj()
  {
    AppMethodBeat.i(129024);
    boolean bool;
    if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lJk, false))
    {
      bool = getAppConfig().hfe;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.AppBrandRuntimeWC", "manualHideSplash:%b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(129024);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(129024);
      bool = false;
    }
  }

  protected final void atm()
  {
    AppMethodBeat.i(129023);
    this.gPp.a(this.mAppId, ((AppBrandInitConfigWC)super.ya()).gVs, com.tencent.mm.plugin.appbrand.task.g.c((AppBrandInitConfigWC)super.ya()));
    AppMethodBeat.o(129023);
  }

  protected final void atq()
  {
    AppMethodBeat.i(129008);
    if (com.tencent.mm.plugin.appbrand.ui.i.D(this))
      AppMethodBeat.o(129008);
    while (true)
    {
      return;
      super.atq();
      AppMethodBeat.o(129008);
    }
  }

  public final void close()
  {
    AppMethodBeat.i(129009);
    OpenBusinessViewUtil.m(this);
    if (atD())
    {
      finish();
      AppMethodBeat.o(129009);
      return;
    }
    o.1 local1 = new o.1(this);
    com.tencent.mm.plugin.appbrand.widget.b.f localf = new com.tencent.mm.plugin.appbrand.widget.b.f();
    o.10 local10 = new o.10(this, local1);
    if ((atH() == null) || ((MMActivity)super.getContext() == null))
    {
      com.tencent.mm.sdk.platformtools.ab.w(com.tencent.mm.plugin.appbrand.widget.b.f.TAG, "invalid close state");
      i = 0;
    }
    Object localObject1;
    while (true)
    {
      if (i == 0)
        local1.run();
      AppMethodBeat.o(129009);
      break;
      localObject1 = atH();
      if (!((AppBrandSysConfigWC)localObject1).hhh)
      {
        com.tencent.mm.sdk.platformtools.ab.i(com.tencent.mm.plugin.appbrand.widget.b.f.TAG, "can not show evaluate dialog");
        i = 0;
      }
      else
      {
        long l1 = com.tencent.mm.modelappbrand.b.abw() / 1000L;
        long l2 = System.currentTimeMillis() / 1000L;
        com.tencent.mm.sdk.platformtools.ab.i(com.tencent.mm.plugin.appbrand.widget.b.f.TAG, "app time start:%s, close:%s, least:%s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(((AppBrandSysConfigWC)localObject1).hhi) });
        if (l2 - l1 < ((AppBrandSysConfigWC)localObject1).hhi)
        {
          com.tencent.mm.sdk.platformtools.ab.i(com.tencent.mm.plugin.appbrand.widget.b.f.TAG, "time not enough to show evaluate dialog");
          i = 0;
        }
        else
        {
          localObject2 = (AppBrandInitConfigWC)super.ya();
          localf.userName = ((AppBrandInitConfigWC)localObject2).username;
          if (!bo.isNullOrNil(localf.userName))
            break label264;
          com.tencent.mm.sdk.platformtools.ab.i(com.tencent.mm.plugin.appbrand.widget.b.f.TAG, "username is null, can not show evaluate dialog");
          i = 0;
        }
      }
    }
    label264: Object localObject3 = (MMActivity)super.getContext();
    Object localObject2 = ((AppBrandInitConfigWC)localObject2).cwz;
    localf.dialog = new Dialog((Context)localObject3, 2131493037);
    localf.dialog.setCancelable(true);
    localf.dialog.setCanceledOnTouchOutside(true);
    Object localObject4 = localf.dialog.getWindow();
    if (localObject4 != null)
    {
      ((Window)localObject4).getDecorView().setPadding(0, 0, 0, 0);
      localObject5 = ((Window)localObject4).getAttributes();
      ((WindowManager.LayoutParams)localObject5).gravity = 81;
      ((WindowManager.LayoutParams)localObject5).height = -2;
      ((WindowManager.LayoutParams)localObject5).width = -1;
      ((Window)localObject4).setAttributes((WindowManager.LayoutParams)localObject5);
      ((Window)localObject4).setWindowAnimations(2131493036);
    }
    Object localObject5 = (LinearLayout)LayoutInflater.from(localf.dialog.getContext()).inflate(2130968680, null, false);
    localf.dialog.setContentView((View)localObject5);
    localObject4 = ae.hy(localf.dialog.getContext());
    int i = Math.min(((Point)localObject4).x, ((Point)localObject4).y);
    localObject4 = new FrameLayout.LayoutParams(i, -2);
    ((FrameLayout.LayoutParams)localObject4).gravity = 1;
    ((LinearLayout)localObject5).setLayoutParams((ViewGroup.LayoutParams)localObject4);
    com.tencent.mm.sdk.platformtools.ab.i(com.tencent.mm.plugin.appbrand.widget.b.f.TAG, "createEvaluateDialog, dialog width:%d", new Object[] { Integer.valueOf(i) });
    localf.jch = ((TextView)localf.dialog.findViewById(2131821178));
    localf.jcj = ((LinearLayout)localf.dialog.findViewById(2131821181));
    localf.jci = ((FrameLayout)localf.dialog.findViewById(2131821179));
    ((TextView)localf.dialog.findViewById(2131821180)).setOnClickListener(new f.6(localf, (Context)localObject3));
    localf.jcg = ((RatingBar)localf.dialog.findViewById(2131821177));
    localf.jcg.setOnRatingBarChangeListener(new f.7(localf));
    localf.jcf = ((TextView)localf.dialog.findViewById(2131821176));
    if (!bo.isNullOrNil((String)localObject2))
    {
      localf.jcf.setVisibility(0);
      localf.jcf.setText(((Context)localObject3).getString(2131296617, new Object[] { localObject2 }));
      label652: ((ImageView)localf.dialog.findViewById(2131821175)).setOnClickListener(new f.8(localf));
      localObject3 = (ViewGroup)((LinearLayout)localObject5).getParent();
      if (localObject3 != null)
      {
        ((ViewGroup)localObject3).setOnClickListener(new f.9(localf));
        ((LinearLayout)localObject5).setOnClickListener(new f.10(localf));
      }
      localf.dialog = localf.dialog;
      localf.dialog.setOnCancelListener(new f.1(localf));
      localf.dialog.setOnDismissListener(new f.5(localf, local10));
      localf.jcd = false;
      ((AppBrandSysConfigWC)localObject1).hhh = false;
      if (this != null)
        break label837;
      localObject1 = null;
      label774: localf.appId = ((String)localObject1);
      if (!bo.isNullOrNil(localf.appId))
        break label846;
      com.tencent.mm.sdk.platformtools.ab.e(com.tencent.mm.plugin.appbrand.widget.b.f.TAG, "saveEvaluateReport, no app id");
    }
    while (true)
    {
      localf.dp(1, 1);
      if (localf.dialog != null)
        localf.dialog.show();
      i = 1;
      break;
      localf.jcf.setVisibility(8);
      break label652;
      label837: localObject1 = this.mAppId;
      break label774;
      label846: localObject1 = (AppBrandInitConfigWC)super.ya();
      localf.cvF = "";
      if (localObject1 != null)
        localf.cvF = ((AppBrandInitConfigWC)localObject1).xz();
      localf.scene = 1000;
      if ((localObject1 != null) && (((AppBrandInitConfigLU)localObject1).bQn != null))
        localf.scene = ((AppBrandInitConfigLU)localObject1).bQn.scene;
      localf.csu = "";
      if (((s)super.xT() != null) && (((s)super.xT()).aun() != null))
        localf.csu = ((s)super.xT()).aun().getURL();
    }
  }

  protected final void d(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(138113);
    if (paramAppBrandInitConfig == null)
      ((AppBrandInitConfigWC)super.ya()).resetSession();
    super.d(paramAppBrandInitConfig);
    AppMethodBeat.o(138113);
  }

  public final void nm(int paramInt)
  {
    AppMethodBeat.i(129042);
    com.tencent.mm.plugin.appbrand.ui.q localq = this.gNF;
    if ((localq instanceof com.tencent.mm.plugin.appbrand.launching.j))
      ((com.tencent.mm.plugin.appbrand.launching.j)localq).nm(paramInt);
    AppMethodBeat.o(129042);
  }

  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(129013);
    com.tencent.mm.plugin.appbrand.jsapi.p.h.a(paramConfiguration, this.mAppId);
    AppMethodBeat.o(129013);
  }

  public void onCreate()
  {
    AppMethodBeat.i(129015);
    atF();
    a.b(this);
    boolean bool = WXHardCoderJNI.hcMiniProgramLaunchEnable;
    int i = WXHardCoderJNI.hcMiniProgramLaunchDelay;
    int j = WXHardCoderJNI.hcMiniProgramLaunchCPU;
    int k = WXHardCoderJNI.hcMiniProgramLaunchIO;
    if (WXHardCoderJNI.hcMiniProgramLaunchThr);
    for (int m = com.tencent.mm.kernel.g.RS().doL(); ; m = 0)
    {
      this.gPt = WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcMiniProgramLaunchTimeout, 801, WXHardCoderJNI.hcMiniProgramLaunchAction, "MicroMsg.AppBrandRuntimeWC");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeWC", "hardcoder miniprogram launch launchStartPerformance [%d]", new Object[] { Integer.valueOf(this.gPt) });
      super.onCreate();
      atE();
      com.tencent.mm.plugin.appbrand.report.quality.a.o(this);
      com.tencent.mm.plugin.appbrand.report.quality.g.a(this, false);
      com.tencent.mm.plugin.appbrand.game.f.a locala = com.tencent.mm.plugin.appbrand.game.f.a.aBG();
      Object localObject = this.mAppId;
      bool = xy();
      locala.appId = ((String)localObject);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MBNiReporter", "hy: appId:%s,isGame:%s", new Object[] { localObject, Boolean.valueOf(bool) });
      if (bool)
        g.a((String)localObject, locala.huj);
      a(new i.b()
      {
        public final void prepare()
        {
          AppMethodBeat.i(128997);
          o.b(this);
          AppMethodBeat.o(128997);
        }
      });
      a(new o.12(this));
      a(new i.b()
      {
        public final void prepare()
        {
          AppMethodBeat.i(128999);
          o.b(o.this, this);
          AppMethodBeat.o(128999);
        }
      });
      a(new o.14(this));
      localObject = new j(this);
      this.gPw = ((j)localObject);
      a((i.b)localObject);
      this.gPp.a(this.mAppId, ((AppBrandInitConfigWC)super.ya()).gVs, com.tencent.mm.plugin.appbrand.task.g.c((AppBrandInitConfigWC)super.ya()));
      com.tencent.mm.plugin.appbrand.media.a.a.onCreate(this.mAppId);
      com.tencent.mm.plugin.appbrand.media.record.c.onCreate();
      com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a.k(this);
      com.tencent.mm.plugin.appbrand.backgroundfetch.f.k(this);
      this.gPq = new com.tencent.mm.plugin.appbrand.report.model.n(this);
      this.gPq.iCb = bo.yz();
      com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i.a(this.mAppId, atc(), ya().bQn);
      AppMethodBeat.o(129015);
      return;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(129022);
    super.onDestroy();
    if (this.gPt != 0)
    {
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcMiniProgramLaunchEnable, this.gPt);
      this.gPt = 0;
    }
    if (DebuggerShell.ayT())
    {
      if (this.gPv != null)
        this.gPv.stopTimer();
      com.tencent.mm.sdk.g.d.xDG.execute(new o.2(this));
      com.tencent.mm.plugin.appbrand.performance.b.Dl(this.mAppId);
    }
    AppBrandStickyBannerLogic.a.release(this.mAppId);
    Object localObject1 = AppBrandMusicClientService.ikP;
    ((AppBrandMusicClientService)localObject1).ikO.clear();
    ((AppBrandMusicClientService)localObject1).ikQ = "";
    com.tencent.mm.plugin.appbrand.media.a.a.AO(this.mAppId);
    n.remove(this.mAppId);
    com.tencent.mm.plugin.appbrand.media.record.c.onDestroy();
    com.tencent.mm.plugin.appbrand.permission.d.Dp(this.mAppId);
    Object localObject2 = this.gPp;
    localObject1 = this.mAppId;
    ((AppBrandRemoteTaskController)localObject2).iEK = AppBrandRemoteTaskController.a.iEV;
    ((AppBrandRemoteTaskController)localObject2).mAppId = ((String)localObject1);
    AppBrandMainProcessService.a((MainProcessTask)localObject2);
    localObject2 = (com.tencent.mm.plugin.appbrand.jsapi.file.al)super.asE();
    if (localObject2 != null)
    {
      localObject1 = (com.tencent.mm.plugin.appbrand.appstorage.m)((com.tencent.mm.plugin.appbrand.appstorage.s)localObject2).ae(com.tencent.mm.plugin.appbrand.appstorage.m.class);
      if (localObject1 != null)
        com.tencent.mm.vfs.e.deleteFile(((com.tencent.mm.plugin.appbrand.appstorage.m)localObject1).gXQ + "/dir.lock");
      ((com.tencent.mm.plugin.appbrand.appstorage.s)localObject2).release();
    }
    a.a(this);
    if (this.gPq != null)
      localObject1 = this.gPq;
    try
    {
      localObject2 = n.xa(((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).htn.mAppId);
      ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iBz = com.tencent.mm.plugin.appbrand.report.c.cV(ah.getContext());
      ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).appId = ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).htn.mAppId;
      if (((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).htn.atH() == null)
      {
        i = ((AppBrandInitConfigWC)((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).htn.ya()).axy;
        ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).axy = i;
        ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).css = (((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).htn.gNB.gVs + 1);
        ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).scene = ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).htn.ya().bQn.scene;
        if (!((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCc)
          break label539;
        i = 1;
        label328: ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCd = i;
        if (!((n)localObject2).gPe.get())
          break label544;
      }
      label539: label544: for (int i = 1; ; i = 0)
      {
        ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCe = i;
        ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCf = bo.az(((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCb);
        ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCg = bo.anU();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("report|");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.Report.kv_14576", ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).toString());
        com.tencent.mm.plugin.report.e.pXa.e(14576, new Object[] { ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iBz, ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).axy), Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).css), Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).scene), ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).cvF, Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCd), Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCe), Long.valueOf(((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCf), Long.valueOf(((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).iCg) });
        this.gPq = null;
        this.gPw = null;
        AppMethodBeat.o(129022);
        return;
        i = ((com.tencent.mm.plugin.appbrand.report.model.n)localObject1).htn.atH().hhd.gVu;
        break;
        i = 0;
        break label328;
      }
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrand.Report.kv_14576", "report exp %s", new Object[] { localException });
    }
  }

  protected final void onPause()
  {
    AppMethodBeat.i(129021);
    AppBrandRemoteTaskController localAppBrandRemoteTaskController = this.gPp;
    localAppBrandRemoteTaskController.iEK = AppBrandRemoteTaskController.a.iFd;
    AppBrandMainProcessService.a(localAppBrandRemoteTaskController);
    AppMethodBeat.o(129021);
  }

  public void onReady()
  {
    AppMethodBeat.i(129018);
    super.onReady();
    if (this.gPt != 0)
    {
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcMiniProgramLaunchEnable, this.gPt);
      this.gPt = 0;
    }
    long l1 = System.currentTimeMillis() - ((AppBrandInitConfigWC)super.ya()).startTime;
    com.tencent.mm.plugin.appbrand.report.c.a(l1, this.gPs, xy());
    Object localObject1;
    Object localObject2;
    boolean bool1;
    int i;
    label241: Object localObject3;
    label258: label306: cm localcm;
    label789: Object localObject4;
    if ((AppBrandInitConfigWC)super.ya() != null)
    {
      localObject1 = ((AppBrandInitConfigWC)super.ya()).cwz;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeWC", "onHideSplash: %s, cost: %dms, download : %b", new Object[] { localObject1, Long.valueOf(l1), Boolean.valueOf(this.gPs) });
      l1 = System.currentTimeMillis() - ((AppBrandInitConfigWC)super.ya()).startTime;
      this.gPr.y(5, l1);
      localObject2 = this.gPr;
      bool1 = this.gPs;
      boolean bool2 = ((AppBrandInitConfigWC)super.ya()).hgO;
      boolean bool3 = ((AppStartupPerformanceReportBundle)aa(AppStartupPerformanceReportBundle.class)).igW;
      localObject1 = this.mAppId;
      ((m)localObject2).cD = 0;
      ((m)localObject2).mType = 0;
      if (atH() != null)
      {
        ((m)localObject2).cD = atH().hhd.gVu;
        ((m)localObject2).mType = (atH().hhd.gVt + 1);
      }
      if (!bool1)
        break label1159;
      i = 1;
      ((m)localObject2).gOV = i;
      if (!xy())
        break label1165;
      i = 1;
      ((m)localObject2).gPa = i;
      ((m)localObject2).gOW = ya().bQn.scene;
      ((m)localObject2).gOY = bool2;
      ((m)localObject2).gOZ = bool3;
      localObject3 = new StringBuilder();
      i = 0;
      if (i >= ((m)localObject2).gOU.length)
        break label1200;
      if (localObject2.gOU[i] >= 0L)
        break label1171;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeStartupReporter", "Report Startup Time: abort, illegal value: %d, %d", new Object[] { Integer.valueOf(i), Long.valueOf(localObject2.gOU[i]) });
      AppBrandPerformanceManager.a(this, 202, l1);
      com.tencent.mm.plugin.appbrand.performance.c.gs(((AppBrandInitConfigWC)super.ya()).startTime);
      localObject1 = String.format("{ \"appMd5\": \"%s\" }", new Object[] { atH().hhd.cvZ });
      com.tencent.mm.plugin.appbrand.performance.c.a(this.mAppId, "Native", "startupDone", ((AppBrandInitConfigWC)super.ya()).startTime, System.currentTimeMillis(), (String)localObject1);
      com.tencent.mm.plugin.appbrand.report.quality.a.a(this.mAppId, this);
      if ((DebuggerShell.ayT()) && (this.gPv == null))
      {
        this.gPv = new ap(com.tencent.mm.plugin.appbrand.r.m.aNS().oAl.getLooper(), new o.8(this), true);
        this.gPv.ae(1000L, 1000L);
      }
      if (xy())
      {
        localObject1 = com.tencent.mm.plugin.appbrand.game.preload.d.aBz();
        l1 = bo.anU();
        long l2 = ((AppBrandInitConfigWC)((com.tencent.mm.plugin.appbrand.game.preload.d)localObject1).htn.ya()).startTime;
        com.tencent.mm.plugin.appbrand.game.preload.e.aBD().cY(2001, (int)(l1 - l2));
      }
      localObject1 = this.gPp;
      if (!AppBrandRemoteTaskController.iEP)
      {
        ((AppBrandRemoteTaskController)localObject1).iEK = AppBrandRemoteTaskController.a.iFc;
        AppBrandMainProcessService.a((MainProcessTask)localObject1);
        AppBrandRemoteTaskController.iEP = true;
      }
      if ((com.tencent.mm.plugin.appbrand.jsapi.file.al)super.asE() != null)
      {
        localObject1 = (com.tencent.mm.plugin.appbrand.appstorage.m)((com.tencent.mm.plugin.appbrand.jsapi.file.al)super.asE()).ae(com.tencent.mm.plugin.appbrand.appstorage.m.class);
        com.tencent.mm.vfs.e.b(((com.tencent.mm.plugin.appbrand.appstorage.m)localObject1).gXQ + "/dir.lock", new byte[1], 1);
      }
      localObject2 = com.tencent.mm.plugin.appbrand.report.quality.a.DG(this.mAppId);
      if ((localObject2 != null) && (!xy()))
      {
        com.tencent.mm.plugin.appbrand.report.quality.a.aLz();
        a.f.b.j.p(this, "runtime");
        localcm = new cm();
        localObject3 = com.tencent.mm.plugin.appbrand.report.quality.a.DG(this.mAppId);
        if (localObject3 == null)
          break label1517;
        localcm.hp(((QualitySessionRuntime)localObject3).igT);
        localcm.hq(((QualitySessionRuntime)localObject3).appId);
        localcm.ddd = ((QualitySessionRuntime)localObject3).iDa;
        localcm.dgV = cm.a.hn(((QualitySessionRuntime)localObject3).iCZ);
        localcm.ddz = ((QualitySessionRuntime)localObject3).apptype;
        localcm.cVR = ((QualitySessionRuntime)localObject3).scene;
        localObject1 = (com.tencent.mm.plugin.appbrand.page.r)super.asV();
        a.f.b.j.o(localObject1, "runtime.pageContainer");
        localObject1 = ((com.tencent.mm.plugin.appbrand.page.r)localObject1).getCurrentPage();
        if (localObject1 == null)
          break label1480;
        localObject1 = ((com.tencent.mm.plugin.appbrand.page.n)localObject1).getCurrentPageView();
        if (localObject1 == null)
          break label1480;
        localObject1 = ((u)localObject1).aJz();
        localObject4 = localObject1;
        if (!(localObject1 instanceof aa))
          localObject4 = null;
        localObject1 = (aa)localObject4;
        if (localObject1 == null)
          break label1511;
        if (!((aa)localObject1).isSysKernel())
          break label1485;
        i = 4;
        label822: localcm.dbX = i;
        localObject1 = localObject3;
        label833: com.tencent.mm.plugin.appbrand.report.quality.c.a((QualitySessionRuntime)localObject1, "Null session with " + this.mAppId);
        if (!((com.tencent.mm.plugin.appbrand.page.r)super.asV()).getCurrentPage().getCurrentPageView().gPH)
          break label1531;
        if (!((QualitySessionRuntime)localObject2).iDj)
          break label1522;
        localcm.ddg = 2L;
        label892: localcm.ajK();
      }
      if (localObject2 != null)
      {
        com.tencent.mm.plugin.appbrand.report.quality.a.aLz();
        a.f.b.j.p(this, "runtime");
        localObject3 = new bw();
        localObject4 = com.tencent.mm.plugin.appbrand.report.quality.a.DG(this.mAppId);
        if (localObject4 == null)
          break label1582;
        ((bw)localObject3).gz(((QualitySessionRuntime)localObject4).igT);
        ((bw)localObject3).gA(((QualitySessionRuntime)localObject4).appId);
        ((bw)localObject3).ddd = ((QualitySessionRuntime)localObject4).iDa;
        ((bw)localObject3).dej = bw.a.gX(((QualitySessionRuntime)localObject4).iCZ);
        ((bw)localObject3).ddz = ((QualitySessionRuntime)localObject4).apptype;
        ((bw)localObject3).cVR = ((QualitySessionRuntime)localObject4).scene;
        localObject1 = (s)super.xT();
        if (localObject1 == null)
          break label1540;
        localObject1 = ((s)localObject1).aBx();
        label1022: localObject1 = com.tencent.mm.plugin.appbrand.report.a.d((com.tencent.mm.plugin.appbrand.h.i)localObject1);
        switch (com.tencent.mm.plugin.appbrand.report.quality.d.eQZ[localObject1.ordinal()])
        {
        default:
          i = -1;
          label1075: ((bw)localObject3).dbX = i;
          localObject1 = localObject4;
          label1086: com.tencent.mm.plugin.appbrand.report.quality.c.a((QualitySessionRuntime)localObject1, "Null session with " + this.mAppId);
          if (((s)super.xT()).gPH)
            if (((QualitySessionRuntime)localObject2).iDj)
              ((bw)localObject3).ddg = 2L;
          break;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        }
      }
    }
    while (true)
    {
      ((bw)localObject3).ajK();
      AppMethodBeat.o(129018);
      return;
      localObject1 = "";
      break;
      label1159: i = 0;
      break label241;
      label1165: i = 0;
      break label258;
      label1171: ((StringBuilder)localObject3).append(localObject2.gOU[i]);
      ((StringBuilder)localObject3).append(",");
      i++;
      break label306;
      label1200: localObject4 = (AppBrandInitConfigWC)super.ya();
      if (localObject4 != null)
        i = ((AppBrandInitConfigWC)localObject4).bQe;
      while (true)
      {
        i += 1000;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeStartupReporter", "Report Startup Time: %s, %s, Download: %s, Preload: %s, appServiceType: %s", new Object[] { localObject1, ((StringBuilder)localObject3).toString(), Boolean.valueOf(bool1), Boolean.valueOf(com.tencent.mm.plugin.appbrand.task.e.auw()), Integer.valueOf(i) });
        ((m)localObject2).f((String)localObject1, 1, 0, i);
        ((m)localObject2).f((String)localObject1, 2, 1, i);
        ((m)localObject2).f((String)localObject1, 3, 2, i);
        ((m)localObject2).f((String)localObject1, 4, 3, i);
        ((m)localObject2).f((String)localObject1, 6, 4, i);
        ((m)localObject2).f((String)localObject1, 7, 5, i);
        ((m)localObject2).f((String)localObject1, 23, 6, i);
        ((m)localObject2).f((String)localObject1, 24, 7, i);
        ((m)localObject2).f((String)localObject1, 25, 8, i);
        ((m)localObject2).f((String)localObject1, 26, 9, i);
        ((m)localObject2).f((String)localObject1, 27, 10, i);
        ((m)localObject2).f((String)localObject1, 28, 11, i);
        ((m)localObject2).f((String)localObject1, 29, 12, i);
        ((m)localObject2).f((String)localObject1, 30, 13, i);
        ((m)localObject2).f((String)localObject1, 31, 14, i);
        break;
        i = com.tencent.mm.plugin.appbrand.report.d.Dy((String)localObject1);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntimeStartupReporter", "getServiceTypeForReport null = initConfig! appServiceType:%s", new Object[] { Integer.valueOf(i) });
      }
      label1480: localObject1 = null;
      break label789;
      label1485: if (((aa)localObject1).getIsX5Kernel())
      {
        i = 2;
        break label822;
      }
      if (((aa)localObject1).isXWalkKernel())
      {
        i = 3;
        break label822;
      }
      label1511: i = -1;
      break label822;
      label1517: localObject1 = null;
      break label833;
      label1522: localcm.ddg = 1L;
      break label892;
      label1531: localcm.ddg = 0L;
      break label892;
      label1540: localObject1 = null;
      break label1022;
      i = 1;
      break label1075;
      i = 2;
      break label1075;
      i = 3;
      break label1075;
      i = 4;
      break label1075;
      i = 5;
      break label1075;
      i = 6;
      break label1075;
      label1582: localObject1 = null;
      break label1086;
      ((bw)localObject3).ddg = 1L;
      continue;
      ((bw)localObject3).ddg = 0L;
    }
  }

  protected final void onResume()
  {
    AppMethodBeat.i(129020);
    com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i.a(this.mAppId, atc(), ya().bQn);
    atN();
    AppBrandRemoteTaskController localAppBrandRemoteTaskController = this.gPp;
    String str = this.mAppId;
    int i = ((AppBrandInitConfigWC)super.ya()).gVs;
    localAppBrandRemoteTaskController.iEK = AppBrandRemoteTaskController.a.iEU;
    localAppBrandRemoteTaskController.mAppId = str;
    localAppBrandRemoteTaskController.igj = i;
    AppBrandMainProcessService.a(localAppBrandRemoteTaskController);
    if (this.gNQ)
      ((com.tencent.mm.plugin.appbrand.page.r)super.asV()).getReporter().aIa();
    com.tencent.mm.plugin.appbrand.task.e.DJ(this.mAppId);
    a(new o.16(this), atL());
    str = this.mAppId;
    i = ya().bQn.scene;
    AppBrandIDKeyBatchReport.aKW().izE = 1;
    AppBrandIDKeyBatchReport.aKW().izG = str;
    AppBrandIDKeyBatchReport.aKW().izH = i;
    AppBrandMainProcessService.a(AppBrandIDKeyBatchReport.aKW());
    com.tencent.mm.sdk.g.d.post(new o.17(this), "getCopyPathMenuExpireTime");
    AppBrandMainProcessService.a(new AppBrandMainProcessPrepareTask());
    AppMethodBeat.o(129020);
  }

  public com.tencent.mm.plugin.appbrand.permission.e xY()
  {
    return this.gPo;
  }

  public final boolean xy()
  {
    AppMethodBeat.i(129005);
    boolean bool = ((AppBrandInitConfigWC)super.ya()).xy();
    AppMethodBeat.o(129005);
    return bool;
  }

  public final com.tencent.mm.plugin.appbrand.ui.k yc()
  {
    AppMethodBeat.i(129040);
    com.tencent.mm.plugin.appbrand.performance.b.n(this);
    Object localObject = ((AppStartupPerformanceReportBundle)aa(AppStartupPerformanceReportBundle.class)).igV;
    if (!bo.ek((List)localObject))
    {
      localObject = ((List)localObject).iterator();
      for (long l = 0L; ((Iterator)localObject).hasNext(); l = Math.max(l, ((kv_14609)((Iterator)localObject).next()).iCh));
      com.tencent.mm.plugin.appbrand.performance.b.a(this, l);
    }
    if (DebuggerShell.ayT())
    {
      localObject = null;
      AppMethodBeat.o(129040);
    }
    while (true)
    {
      return localObject;
      localObject = super.yc();
      AppMethodBeat.o(129040);
    }
  }

  public final boolean yd()
  {
    AppMethodBeat.i(138690);
    boolean bool = super.yd();
    AppMethodBeat.o(138690);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o
 * JD-Core Version:    0.6.2
 */