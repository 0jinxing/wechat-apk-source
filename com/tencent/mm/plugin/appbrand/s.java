package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.graphics.Point;
import android.util.Pair;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.br;
import com.tencent.mm.g.b.a.br.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.game.a.1;
import com.tencent.mm.plugin.appbrand.game.a.b;
import com.tencent.mm.plugin.appbrand.game.a.c;
import com.tencent.mm.plugin.appbrand.h.t;
import com.tencent.mm.plugin.appbrand.h.v;
import com.tencent.mm.plugin.appbrand.h.z;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.model.e;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.plugin.appbrand.s.o.a;
import com.tencent.mm.plugin.appbrand.s.u;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.udp.libmmudp.UdpNative;
import com.tencent.mm.udp.libmmudp.UdpNative.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public class s extends com.tencent.luggage.sdk.a.a.b
  implements com.tencent.mm.plugin.appbrand.j.g
{
  protected o gOq;
  private volatile boolean gPO;
  private volatile boolean gPP;
  private volatile boolean gPQ;
  protected com.tencent.mm.plugin.appbrand.game.a gPR;
  private com.tencent.mm.plugin.appbrand.m.b.a gPS;
  private final LinkedList<Runnable> gPT;

  static
  {
    AppMethodBeat.i(129114);
    com.tencent.mm.plugin.appbrand.game.c.d.axy();
    AppMethodBeat.o(129114);
  }

  public s()
  {
    AppMethodBeat.i(129083);
    this.gPO = false;
    this.gPP = false;
    this.gPQ = false;
    this.gPS = null;
    this.gPT = new LinkedList();
    if ((bp.dpL()) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED))
      bool = true;
    this.gNV = bool;
    AppMethodBeat.o(129083);
  }

  private void auq()
  {
    AppMethodBeat.i(129104);
    String str1;
    int i;
    if (!this.gPQ)
    {
      aBx().setJsExceptionHandler(new s.8(this));
      str1 = com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/android.js");
      str2 = str1;
      if (this.gPS != null)
        str2 = str1 + this.gPS.aIW();
      if (this.gPR != null)
      {
        str2 = str2 + com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/NativeGlobal-WAService.js");
        com.tencent.mm.plugin.appbrand.s.n.a(aBx(), str2, new s.9(this));
        str1 = WxaCommLibRuntimeReader.xu("WAService.js");
        str2 = "v" + WxaCommLibRuntimeReader.avQ().gVu;
        final long l = System.currentTimeMillis();
        final boolean bool = atU();
        if (str1 != null)
          break label276;
        i = 0;
        label160: com.tencent.mm.plugin.appbrand.s.o.a(this, aBx(), "WAService.js", "WAService.js", str2, str1, o.a.iRz, new n.a()
        {
          public final void lo(String paramAnonymousString)
          {
            int i = 0;
            AppMethodBeat.i(129080);
            ab.e("MicroMsg.AppBrandService", "Inject SDK Service Script Failed: %s, wx.version = %s", new Object[] { paramAnonymousString, WxaCommLibRuntimeReader.avP().avk() });
            com.tencent.mm.plugin.report.service.h.pYm.a(370L, 6L, 1L, false);
            com.tencent.mm.plugin.appbrand.report.c.br(s.this.getAppId(), 24);
            int j = -1;
            if (s.this.gOq != null)
            {
              i = s.this.gOq.atH().hhd.gVu;
              j = s.this.gOq.atH().hhd.gVt;
            }
            com.tencent.mm.plugin.appbrand.report.c.a(s.this.getAppId(), i, j, 370, 6);
            AppMethodBeat.o(129080);
          }

          public final void onSuccess(String paramAnonymousString)
          {
            AppMethodBeat.i(129079);
            ab.i("MicroMsg.AppBrandService", "Inject SDK Service Script Successwx.version = %s", new Object[] { WxaCommLibRuntimeReader.avP().avk() });
            if ((s.this.atU()) || (s.this.isRunning()))
            {
              com.tencent.mm.plugin.appbrand.report.quality.a.aLz();
              com.tencent.mm.plugin.appbrand.report.quality.b.a(bool, s.this.getAppId(), l, "WAService.js", this.gQf);
            }
            com.tencent.mm.plugin.report.service.h.pYm.a(370L, 7L, 1L, false);
            AppMethodBeat.o(129079);
          }
        });
        com.tencent.mm.plugin.report.service.h.pYm.a(370L, 5L, 1L, false);
        this.gPQ = true;
      }
    }
    else
    {
      if (this.gOq == null)
        break label285;
    }
    label276: label285: for (String str2 = aur(); ; str2 = null)
    {
      if (!bo.isNullOrNil(str2))
        com.tencent.mm.plugin.appbrand.s.n.a(aBx(), str2, new n.a()
        {
          public final void lo(String paramAnonymousString)
          {
            AppMethodBeat.i(129082);
            ab.e("MicroMsg.AppBrandService", "Inject performanceJs Script Failed");
            AppMethodBeat.o(129082);
          }

          public final void onSuccess(String paramAnonymousString)
          {
            AppMethodBeat.i(129081);
            ab.i("MicroMsg.AppBrandService", "Inject performanceJs Script Success");
            AppMethodBeat.o(129081);
          }
        });
      AppMethodBeat.o(129104);
      return;
      str2 = str2 + com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/NativeGlobal-Dummy.js");
      break;
      i = str1.length();
      break label160;
    }
  }

  private String aur()
  {
    AppMethodBeat.i(129105);
    String str = null;
    if (AppBrandPerformanceManager.b(getRuntime()))
      str = WxaCommLibRuntimeReader.xu("WAPerf.js");
    AppMethodBeat.o(129105);
    return str;
  }

  private void aus()
  {
    AppMethodBeat.i(129106);
    if (this.gPO)
      AppMethodBeat.o(129106);
    while (true)
    {
      return;
      if (this.gPP)
      {
        AppMethodBeat.o(129106);
      }
      else
      {
        u.a(getRuntime(), aBx());
        String str = aw.a(getRuntime(), "app-service.js");
        if (bo.isNullOrNil(str))
        {
          AppMethodBeat.o(129106);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(370L, 9L, 1L, false);
          long l = System.currentTimeMillis();
          com.tencent.mm.plugin.appbrand.s.o.a(getRuntime(), aBx(), "app-service.js", "app-service.js" + "_" + getAppId(), getRuntime().atH().hhd.cvZ, str, o.a.iRA, new s.2(this, str, l));
          this.gPP = true;
          AppMethodBeat.o(129106);
        }
      }
    }
  }

  protected final void a(com.tencent.mm.plugin.appbrand.h.i parami)
  {
    AppMethodBeat.i(129086);
    ab.i("MicroMsg.AppBrandService", "createUdpBinding");
    if (UdpNative.instance().hasInit())
    {
      ab.i("MicroMsg.AppBrandService", "createUdpBinding hasInit");
      AppMethodBeat.o(129086);
    }
    while (true)
    {
      return;
      if (parami == null)
      {
        ab.e("MicroMsg.AppBrandService", "createUdpBinding jsruntime is null");
        AppMethodBeat.o(129086);
      }
      else
      {
        com.tencent.mm.udp.libmmudp.a.yB();
        final com.tencent.mm.plugin.appbrand.h.n localn = (com.tencent.mm.plugin.appbrand.h.n)parami.af(com.tencent.mm.plugin.appbrand.h.n.class);
        if (localn == null)
        {
          ab.e("MicroMsg.AppBrandService", "createUdpBinding jsThreadHandler is null");
          AppMethodBeat.o(129086);
        }
        else
        {
          localn.f(new s.4(this, parami, new UdpNative.b()
          {
            public final void xe(String paramAnonymousString)
            {
              AppMethodBeat.i(129064);
              localn.f(new s.1.1(this, paramAnonymousString));
              AppMethodBeat.o(129064);
            }
          }));
          AppMethodBeat.o(129086);
        }
      }
    }
  }

  protected void atV()
  {
    AppMethodBeat.i(129094);
    auj();
    a(aBx());
    auq();
    AppMethodBeat.o(129094);
  }

  protected final void atW()
  {
    AppMethodBeat.i(129099);
    ab.i("MicroMsg.AppBrandService", "dl: onRuntimePause, dispatch AppBrandOnAppEnterBackgroundEvent ");
    new com.tencent.mm.plugin.appbrand.page.h()
    {
      public final p s(Map<String, Object> paramAnonymousMap)
      {
        AppMethodBeat.i(129072);
        paramAnonymousMap = new JSONObject(paramAnonymousMap);
        o localo = s.this.getRuntime();
        try
        {
          Object localObject = e.l((com.tencent.mm.plugin.appbrand.page.w)localo.asV().getCurrentPage().getCurrentPageView());
          int i = ((Integer)((Pair)localObject).first).intValue();
          localObject = (String)((Pair)localObject).second;
          paramAnonymousMap.put("targetAction", i);
          paramAnonymousMap.put("targetPagePath", localObject);
          paramAnonymousMap.put("usedState", ((o)localo).ya().bQn.iAo);
          super.AL(paramAnonymousMap.toString());
          AppMethodBeat.o(129072);
          return this;
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillEventOnAppEnterBackground ex = %s", new Object[] { localException });
        }
      }
    }
    .A(getRuntime());
    try
    {
      Object localObject = aBx();
      if (localObject != null)
      {
        localObject = (com.tencent.mm.plugin.appbrand.h.n)((com.tencent.mm.plugin.appbrand.h.i)localObject).af(com.tencent.mm.plugin.appbrand.h.n.class);
        if (localObject != null)
          ((com.tencent.mm.plugin.appbrand.h.n)localObject).setThreadPriority(10);
        AppMethodBeat.o(129099);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandService", localThrowable, "[NOT CRASH]", new Object[0]);
        AppMethodBeat.o(129099);
      }
    }
  }

  protected final w atY()
  {
    AppMethodBeat.i(129090);
    x localx = new x(this);
    AppMethodBeat.o(129090);
    return localx;
  }

  public com.tencent.mm.plugin.appbrand.h.i aua()
  {
    Object localObject1 = null;
    AppMethodBeat.i(129091);
    long l = System.currentTimeMillis();
    if (getContext() == null)
      ah.getContext();
    if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHR, false));
    for (Object localObject2 = z.aBv(); ; localObject2 = null)
    {
      if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHQ, false));
      for (Object localObject3 = com.tencent.mm.plugin.appbrand.r.d.Ec("wxa_library/v8_snapshot.bin"); ; localObject3 = null)
      {
        int i = WxaCommLibRuntimeReader.avQ().gVu;
        ac.aux();
        localObject3 = t.d(i, (String)localObject2, (byte[])localObject3);
        if ((localObject3 instanceof v))
        {
          this.gPS = new com.tencent.mm.plugin.appbrand.m.a();
          localObject2 = this.gPS;
          ab.i("MicroMsg.AppBrandNodeJSInstallHelper", "whenCreateJsRuntime");
          ((com.tencent.mm.plugin.appbrand.m.b.a)localObject2).iqc = new com.tencent.mm.plugin.appbrand.m.d(this, (com.tencent.mm.plugin.appbrand.h.i)localObject3);
          ((com.tencent.mm.plugin.appbrand.h.i)localObject3).addJavascriptInterface(((com.tencent.mm.plugin.appbrand.m.b.a)localObject2).iqc, "gJavaBroker");
        }
        for (i = 1; ; i = 0)
        {
          localObject2 = (com.tencent.mm.plugin.appbrand.h.q)((com.tencent.mm.plugin.appbrand.h.i)localObject3).af(com.tencent.mm.plugin.appbrand.h.q.class);
          if ((localObject2 != null) && ((ac.aux()) || (i != 0)))
          {
            localObject2 = new f(this, (com.tencent.mm.plugin.appbrand.h.q)localObject2);
            ((com.tencent.mm.plugin.appbrand.h.i)localObject3).addJavascriptInterface(localObject2, "WeixinJSContext");
            ((f)localObject2).asH();
            this.gPO = true;
          }
          a((com.tencent.mm.plugin.appbrand.h.i)localObject3);
          com.tencent.mm.plugin.appbrand.report.quality.a.aLz();
          localObject2 = localObject1;
          if (atU())
            localObject2 = com.tencent.mm.plugin.appbrand.task.g.iFf;
          com.tencent.mm.plugin.appbrand.report.quality.b.a((com.tencent.mm.plugin.appbrand.task.g)localObject2, getAppId(), l, com.tencent.mm.plugin.appbrand.report.a.d((com.tencent.mm.plugin.appbrand.h.i)localObject3));
          AppMethodBeat.o(129091);
          return localObject3;
        }
      }
    }
  }

  public Map<String, com.tencent.mm.plugin.appbrand.jsapi.m> aub()
  {
    AppMethodBeat.i(129093);
    Map localMap = com.tencent.mm.plugin.appbrand.jsapi.q.aCh();
    AppMethodBeat.o(129093);
    return localMap;
  }

  protected void aud()
  {
    AppMethodBeat.i(129095);
    super.aud();
    u.a(this.gOq, aBx());
    auo();
    if (this.gPH)
      super.bo("onWxConfigReady", "");
    AppMethodBeat.o(129095);
  }

  public final String auf()
  {
    return "https://lib/";
  }

  public final String aug()
  {
    return "https://usr/";
  }

  protected boolean aui()
  {
    AppMethodBeat.i(129084);
    boolean bool = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIz, true);
    AppMethodBeat.o(129084);
    return bool;
  }

  protected final void auj()
  {
    AppMethodBeat.i(129085);
    if (this.gPR != null)
    {
      bool = true;
      ab.i("MicroMsg.AppBrandService", "setup magicbrush. loaded?[%b]", new Object[] { Boolean.valueOf(bool) });
      if (this.gPR == null)
        break label54;
      AppMethodBeat.o(129085);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label54: if (aui())
        break label79;
      ab.i("MicroMsg.AppBrandService", "setup magicbrush, done. expt closed");
      AppMethodBeat.o(129085);
    }
    label79: long l1 = bo.yz();
    aCd();
    this.gPR = new com.tencent.mm.plugin.appbrand.game.a();
    aul();
    Object localObject1 = this.gPR;
    Object localObject2 = getContext();
    if (((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqf == null)
    {
      localObject2 = new IllegalStateException("JsRuntime invalid");
      AppMethodBeat.o(129085);
      throw ((Throwable)localObject2);
    }
    if (((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqg == null)
    {
      localObject2 = new IllegalStateException("JsThreadHandler invalid");
      AppMethodBeat.o(129085);
      throw ((Throwable)localObject2);
    }
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqi.device_pixel_ratio_ = com.tencent.magicbrush.d.a.getDensity((Context)localObject2);
    Point localPoint = com.tencent.magicbrush.d.a.aA((Context)localObject2);
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqi.screen_width_ = localPoint.x;
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqi.screen_height_ = localPoint.y;
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqi.use_command_buffer = ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqd;
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqi.adjust_thread_priority = ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqc;
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqi.enable_request_animation_frame = ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqe;
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqi.gc_factor = com.tencent.mm.plugin.appbrand.game.a.c.hqH.cD((Context)localObject2);
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqi.enable_wxbindcanvastexture = com.tencent.mm.plugin.appbrand.game.a.f.aAE();
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqb = new MBRuntime(((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqi);
    if (((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqh != null)
      ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqb.registerEventListener(((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqh);
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqb.registerEventListener(new a.b((com.tencent.mm.plugin.appbrand.game.a)localObject1));
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqb.setJsThreadHandler(((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqg);
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqb.init();
    ((com.tencent.mm.plugin.appbrand.game.a)localObject1).hqg.f(new a.1((com.tencent.mm.plugin.appbrand.game.a)localObject1));
    com.tencent.mm.plugin.appbrand.report.quality.a.aLz();
    boolean bool = atU();
    localObject1 = getAppId();
    localObject2 = new br();
    if (!bool)
    {
      localObject1 = com.tencent.mm.plugin.appbrand.report.quality.a.DG((String)localObject1);
      if (localObject1 != null)
      {
        ((br)localObject2).gq(((QualitySessionRuntime)localObject1).appId);
        ((br)localObject2).gp(((QualitySessionRuntime)localObject1).igT);
        ((br)localObject2).ddH = br.a.gS(((QualitySessionRuntime)localObject1).iCZ);
        ((br)localObject2).ddz = ((QualitySessionRuntime)localObject1).apptype;
        ((br)localObject2).cVR = ((QualitySessionRuntime)localObject1).scene;
      }
    }
    else
    {
      ((br)localObject2).dA(l1);
      ((br)localObject2).GX();
      ((br)localObject2).dz(((br)localObject2).ddC - ((br)localObject2).ddB);
      if (!bool)
        break label557;
    }
    label557: for (long l2 = 1L; ; l2 = 0L)
    {
      ((br)localObject2).ddI = l2;
      ((br)localObject2).ajK();
      ab.i("MicroMsg.AppBrandService", "setup magicbrush, done. cost?[%d]", new Object[] { Long.valueOf(bo.az(l1)) });
      AppMethodBeat.o(129085);
      break;
    }
  }

  protected void auk()
  {
    AppMethodBeat.i(129087);
    if (this.gPR != null)
      com.tencent.mm.plugin.appbrand.game.c.b.a(this.gPR.hqb, getRuntime(), false);
    AppMethodBeat.o(129087);
  }

  protected void aul()
  {
    AppMethodBeat.i(129088);
    if (this.gPR != null)
    {
      com.tencent.mm.plugin.appbrand.game.a locala = this.gPR;
      Object localObject = aBx();
      locala.hqf = ((com.tencent.mm.plugin.appbrand.h.i)localObject);
      if (((com.tencent.mm.plugin.appbrand.h.i)localObject).af(com.tencent.mm.plugin.appbrand.h.s.class) == null)
      {
        localObject = new IllegalArgumentException("JsRuntime not support addon: V8");
        AppMethodBeat.o(129088);
        throw ((Throwable)localObject);
      }
      if (((com.tencent.mm.plugin.appbrand.h.i)localObject).af(com.tencent.mm.plugin.appbrand.h.n.class) == null)
      {
        localObject = new IllegalArgumentException("JsRuntime not support addon: JsThread");
        AppMethodBeat.o(129088);
        throw ((Throwable)localObject);
      }
      if (((com.tencent.mm.plugin.appbrand.h.i)localObject).af(com.tencent.mm.plugin.appbrand.h.m.class) == null)
      {
        localObject = new IllegalArgumentException("JsRuntime not support addon: DestroyListener");
        AppMethodBeat.o(129088);
        throw ((Throwable)localObject);
      }
      locala.hqg = new a.c((com.tencent.mm.plugin.appbrand.h.i)localObject, (byte)0);
    }
    AppMethodBeat.o(129088);
  }

  public final MBRuntime aum()
  {
    Object localObject = null;
    if (this.gPR == null);
    while (true)
    {
      return localObject;
      try
      {
        MBRuntime localMBRuntime = this.gPR.hqb;
        localObject = localMBRuntime;
      }
      catch (NullPointerException localNullPointerException)
      {
      }
    }
  }

  public final com.tencent.mm.plugin.appbrand.page.w aun()
  {
    AppMethodBeat.i(129089);
    com.tencent.mm.plugin.appbrand.page.w localw = (com.tencent.mm.plugin.appbrand.page.w)super.ac(com.tencent.mm.plugin.appbrand.page.w.class);
    AppMethodBeat.o(129089);
    return localw;
  }

  public void auo()
  {
  }

  protected void aup()
  {
    AppMethodBeat.i(129098);
    Object localObject = aBx();
    if (localObject == null)
      AppMethodBeat.o(129098);
    while (true)
    {
      return;
      localObject = (com.tencent.mm.plugin.appbrand.h.n)((com.tencent.mm.plugin.appbrand.h.i)localObject).af(com.tencent.mm.plugin.appbrand.h.n.class);
      if (localObject != null)
        ((com.tencent.mm.plugin.appbrand.h.n)localObject).setThreadPriority(-2);
      AppMethodBeat.o(129098);
    }
  }

  public boolean aut()
  {
    return this.gPO;
  }

  public void cleanup()
  {
    AppMethodBeat.i(129092);
    if (this.gPR != null)
    {
      localObject = this.gPR;
      ((com.tencent.mm.plugin.appbrand.h.m)((com.tencent.mm.plugin.appbrand.game.a)localObject).hqf.af(com.tencent.mm.plugin.appbrand.h.m.class)).a(((com.tencent.mm.plugin.appbrand.game.a)localObject).hqj);
    }
    Object localObject = aBx();
    ab.i("MicroMsg.AppBrandService", "destoryUdpBinding");
    if (!UdpNative.instance().hasInit())
      ab.i("MicroMsg.AppBrandService", "destoryUdpBinding not Init");
    while (true)
    {
      super.cleanup();
      this.gOq = null;
      if (this.gPS == null)
        break label199;
      localObject = this.gPS;
      ab.i("MicroMsg.AppBrandNodeJSInstallHelper", "whenCleanUp");
      if (((com.tencent.mm.plugin.appbrand.m.b.a)localObject).iqc != null)
        break;
      localObject = new IllegalStateException("You had not called whenCreateJsRuntime!");
      AppMethodBeat.o(129092);
      throw ((Throwable)localObject);
      if (localObject == null)
      {
        ab.e("MicroMsg.AppBrandService", "destoryUdpBinding jsruntime is null");
      }
      else
      {
        localObject = (com.tencent.mm.plugin.appbrand.h.n)((com.tencent.mm.plugin.appbrand.h.i)localObject).af(com.tencent.mm.plugin.appbrand.h.n.class);
        if (localObject == null)
          ab.e("MicroMsg.AppBrandService", "destoryUdpBinding jsThreadHandler is null");
        else
          ((com.tencent.mm.plugin.appbrand.h.n)localObject).f(new s.5(this));
      }
    }
    ((com.tencent.mm.plugin.appbrand.m.b.a)localObject).iqc.aIS();
    label199: AppMethodBeat.o(129092);
  }

  protected void dw(boolean paramBoolean)
  {
    AppMethodBeat.i(129100);
    ab.i("MicroMsg.AppBrandService", "dl:onRuntimeResume, dispatch AppBrandOnAppEnterForegroundEvent");
    if (getRuntime() == null)
    {
      ab.w("MicroMsg.AppBrandService", "onRuntimeResume, getRuntime == NULL");
      AppMethodBeat.o(129100);
    }
    while (true)
    {
      return;
      new s.7(this, paramBoolean).a(getRuntime(), paramBoolean);
      try
      {
        aup();
        AppMethodBeat.o(129100);
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandService", localThrowable, "[NOT CRASH]", new Object[0]);
        AppMethodBeat.o(129100);
      }
    }
  }

  public o getRuntime()
  {
    AppMethodBeat.i(129108);
    o localo = (o)super.xL();
    AppMethodBeat.o(129108);
    return localo;
  }

  public void h(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(129101);
    super.h(paramJSONObject);
    b(paramJSONObject, "clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.vxo));
    if (getClass() == s.class)
      b(paramJSONObject, "isIsolateContext", Boolean.valueOf(this.gPO));
    b(paramJSONObject, "JSEngineName", t.b(aBx()));
    com.tencent.mm.plugin.appbrand.e.d.a(com.tencent.mm.plugin.appbrand.u.a.aSj(), paramJSONObject);
    com.tencent.mm.plugin.appbrand.e.d.b(com.tencent.mm.plugin.appbrand.u.a.aSk(), paramJSONObject);
    AppMethodBeat.o(129101);
  }

  protected void i(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(129103);
    b(paramJSONObject, "debug", Boolean.valueOf(this.gOq.atH().bQp));
    JSONObject localJSONObject1 = new JSONObject();
    b(localJSONObject1, "scene", Integer.valueOf(this.gOq.ya().bQn.scene));
    Object localObject = this.gOq.atc();
    b(localJSONObject1, "path", com.tencent.luggage.g.h.bO((String)localObject));
    b(localJSONObject1, "query", new JSONObject(com.tencent.luggage.g.h.bP((String)localObject)));
    b(localJSONObject1, "referrerInfo", this.gOq.atI().hgF.ayF());
    b(localJSONObject1, "shareInfo", this.gOq.atI().xA());
    e.a(this.gOq, localJSONObject1);
    AppBrandSysConfigWC localAppBrandSysConfigWC = this.gOq.atH();
    JSONObject localJSONObject2 = new JSONObject();
    b(localJSONObject2, "maxRequestConcurrent", Integer.valueOf(localAppBrandSysConfigWC.bQw));
    b(localJSONObject2, "maxUploadConcurrent", Integer.valueOf(localAppBrandSysConfigWC.bQx));
    b(localJSONObject2, "maxDownloadConcurrent", Integer.valueOf(localAppBrandSysConfigWC.bQy));
    b(localJSONObject2, "maxWebsocketConnect", Integer.valueOf(localAppBrandSysConfigWC.bQz));
    b(localJSONObject2, "maxWorkerConcurrent", Integer.valueOf(localAppBrandSysConfigWC.bQA));
    try
    {
      localObject = paramJSONObject.optJSONObject("env");
      if (localObject == null)
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
        paramJSONObject.put("env", localObject);
        ((JSONObject)localObject).put("USER_DATA_PATH", "wxfile://usr");
        ((JSONObject)localObject).put("OPEN_DATA_PATH", "wxfile://opendata");
        int i;
        if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lJk, false) == true)
          i = 1;
        while (true)
        {
          ((JSONObject)localObject).put("HAS_SPLASHSCREEN", i);
          b(paramJSONObject, "appLaunchInfo", localJSONObject1);
          b(paramJSONObject, "wxAppInfo", localJSONObject2);
          b(paramJSONObject, "isPluginMiniProgram", Boolean.valueOf(getRuntime().atD()));
          b(paramJSONObject, "envVersion", com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.ot(this.gOq.atI().gVs).name().toLowerCase());
          localObject = new JSONObject();
          try
          {
            localJSONObject1 = new org/json/JSONObject;
            localJSONObject1.<init>(this.gOq.atI().bQk);
            localObject = localJSONObject1;
            try
            {
              label426: if (!bo.isNullOrNil(localAppBrandSysConfigWC.bQu))
              {
                localJSONObject2 = new org/json/JSONObject;
                localJSONObject2.<init>();
                localJSONObject1 = new org/json/JSONObject;
                localJSONObject1.<init>(localAppBrandSysConfigWC.bQu);
                localJSONObject2.put("jsonInfo", localJSONObject1);
                b((JSONObject)localObject, "operationInfo", localJSONObject2);
              }
              b(paramJSONObject, "appContactInfo", localObject);
              b(paramJSONObject, "accountInfo", this.gOq.atI().xB());
              AppMethodBeat.o(129103);
              return;
              i = 0;
            }
            catch (Exception localException1)
            {
              while (true)
                ab.e("MicroMsg.AppBrandService", "postProcessConfig, put operationInfo to appContactInfo fail", new Object[] { localException1 });
            }
          }
          catch (Exception localException2)
          {
            break label426;
          }
        }
      }
    }
    catch (Exception localException3)
    {
      while (true);
    }
  }

  public void m(i parami)
  {
    AppMethodBeat.i(129097);
    this.gOq = ((o)parami);
    super.m(parami);
    this.hvM = new com.tencent.mm.plugin.appbrand.permission.a(this.gOq, this);
    auj();
    a(aBx());
    auk();
    try
    {
      aup();
      AppMethodBeat.o(129097);
      return;
    }
    catch (Throwable parami)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandService", parami, "[NOT CRASH]", new Object[0]);
        AppMethodBeat.o(129097);
      }
    }
  }

  protected void wO()
  {
    AppMethodBeat.i(129096);
    try
    {
      aup();
      aud();
      auq();
      aus();
      localLinkedList = new LinkedList();
    }
    catch (Throwable localThrowable)
    {
      synchronized (this.gPT)
      {
        LinkedList localLinkedList;
        localLinkedList.addAll(this.gPT);
        ??? = localLinkedList.iterator();
        while (((Iterator)???).hasNext())
        {
          ((Runnable)((Iterator)???).next()).run();
          continue;
          localThrowable = localThrowable;
          ab.printErrStackTrace("MicroMsg.AppBrandService", localThrowable, "[NOT CRASH]", new Object[0]);
        }
      }
    }
    atZ();
    AppMethodBeat.o(129096);
  }

  public final JSONObject xW()
  {
    AppMethodBeat.i(129102);
    JSONObject localJSONObject = super.xW();
    i(localJSONObject);
    AppMethodBeat.o(129102);
    return localJSONObject;
  }

  public void xd(String arg1)
  {
    AppMethodBeat.i(129107);
    s.3 local3 = new s.3(this, ???);
    if (isRunning())
    {
      local3.run();
      AppMethodBeat.o(129107);
    }
    while (true)
    {
      return;
      synchronized (this.gPT)
      {
        this.gPT.add(local3);
        AppMethodBeat.o(129107);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s
 * JD-Core Version:    0.6.2
 */