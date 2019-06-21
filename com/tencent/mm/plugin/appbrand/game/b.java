package com.tencent.mm.plugin.appbrand.game;

import android.content.SharedPreferences;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.debugger.t;
import com.tencent.mm.plugin.appbrand.debugger.u;
import com.tencent.mm.plugin.appbrand.game.c.a.1;
import com.tencent.mm.plugin.appbrand.h.l;
import com.tencent.mm.plugin.appbrand.h.z;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.plugin.appbrand.report.quality.e;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.s.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.c;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends s
{
  private com.tencent.mm.plugin.appbrand.debugger.n hku = null;
  private volatile boolean hqm = false;
  private volatile boolean hqn = false;
  private volatile boolean hqo = false;
  private volatile boolean hqp = false;
  private volatile boolean hqq = false;

  private boolean aAs()
  {
    AppMethodBeat.i(130016);
    boolean bool;
    if (ah.doC() != null)
    {
      int i = ah.doC().getInt("appbrandgame_use_commandbuffer", -1);
      if (i != -1)
        if (i != 0)
        {
          AppMethodBeat.o(130016);
          bool = true;
        }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(130016);
      bool = false;
      continue;
      Object localObject;
      if (this.gOq != null)
      {
        localObject = this.gOq.getAppConfig();
        if (((com.tencent.mm.plugin.appbrand.config.a)localObject).hfa)
        {
          bool = ((com.tencent.mm.plugin.appbrand.config.a)localObject).heZ;
          AppMethodBeat.o(130016);
        }
      }
      else
      {
        localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.b.eGM;
        localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.ll("100466");
        if ((localObject == null) || (!((c)localObject).isValid()))
        {
          AppMethodBeat.o(130016);
          bool = false;
        }
        else if (bo.getInt((String)((c)localObject).dru().get("useCommandBuffer"), 0) == 1)
        {
          AppMethodBeat.o(130016);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(130016);
          bool = false;
        }
      }
    }
  }

  private boolean aAt()
  {
    AppMethodBeat.i(130017);
    if (!this.hqp)
    {
      this.hqq = aAs();
      this.hqp = true;
    }
    boolean bool = this.hqq;
    AppMethodBeat.o(130017);
    return bool;
  }

  private void aAu()
  {
    AppMethodBeat.i(130025);
    ab.i("MicroMsg.WAGameAppService", "WAGameAppService.initImpl mServiceReady = [%b], mRendererReady = [%b]", new Object[] { Boolean.valueOf(this.hqn), Boolean.valueOf(this.hqm) });
    if ((!this.hqn) || (!this.hqm))
      AppMethodBeat.o(130025);
    while (true)
    {
      return;
      if (!isRunning())
      {
        ab.i("MicroMsg.WAGameAppService", "WAGameAppService.initImpl !isRunning, skip");
        AppMethodBeat.o(130025);
      }
      else
      {
        ab.i("MicroMsg.WAGameAppService", "WAGameAppService.initImpl start");
        aud();
        aAx();
        if (!aut())
          aAw();
        atZ();
        AppMethodBeat.o(130025);
      }
    }
  }

  private void aAv()
  {
    AppMethodBeat.i(130029);
    String str1 = com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/android.js") + com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/NativeGlobal-WAGame.js");
    String str2 = str1;
    if (aAt())
      str2 = str1 + com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/commandbuffer.js");
    com.tencent.mm.plugin.appbrand.s.n.a(aBx(), str2, new b.3(this));
    AppMethodBeat.o(130029);
  }

  private void aAw()
  {
    AppMethodBeat.i(130030);
    if ((!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) && (!com.tencent.mm.sdk.platformtools.f.DEBUG))
      AppMethodBeat.o(130030);
    while (true)
    {
      return;
      ab.c("MicroMsg.WAGameAppService", "damon warns: This is only for test!!!!", new Object[0]);
      String str = aw.a(getRuntime(), "game.js");
      com.tencent.mm.plugin.appbrand.s.o.a(this, aBx(), "game.js", str, o.a.iRA, new b.4(this));
      AppMethodBeat.o(130030);
    }
  }

  private void aAx()
  {
    AppMethodBeat.i(130031);
    if (this.hqo)
      AppMethodBeat.o(130031);
    while (true)
    {
      return;
      this.hqo = true;
      ab.i("MicroMsg.WAGameAppService", "Inject WAGame to MainContext");
      aAv();
      String str1 = WxaCommLibRuntimeReader.xu("WAGame.js");
      String str2 = "v" + WxaCommLibRuntimeReader.avQ().gVu;
      com.tencent.mm.plugin.report.service.h.pYm.a(778L, 13L, 1L, false);
      long l = System.currentTimeMillis();
      boolean bool = atU();
      if (str1 == null);
      b.5 local5;
      for (int i = 0; ; i = str1.length())
      {
        local5 = new b.5(this, bool, l, i);
        if ((getRuntime() == null) || (!getRuntime().yd()))
          break label170;
        str1 = ";(function(global) { var protectedConsole = global.console; Object.defineProperty(global, 'console', { get() { return protectedConsole; }, set() { } }); })(this);".concat(String.valueOf(str1));
        com.tencent.mm.plugin.appbrand.s.o.b(this, aBx(), "WAGame.js", str1, o.a.iRz, local5);
        AppMethodBeat.o(130031);
        break;
      }
      label170: com.tencent.mm.plugin.appbrand.s.o.a(this, aBx(), "WAGame.js", "WAGame.js", str2, str1, o.a.iRz, local5);
      AppMethodBeat.o(130031);
    }
  }

  public final void atV()
  {
    AppMethodBeat.i(130034);
    ab.i("MicroMsg.WAGameAppService", "start preload");
    auj();
    a(aBx());
    aAx();
    ab.i("MicroMsg.WAGameAppService", "WAGameAppService preloaded.");
    AppMethodBeat.o(130034);
  }

  public final com.tencent.mm.plugin.appbrand.h.i aua()
  {
    Object localObject1 = null;
    AppMethodBeat.i(130014);
    ab.i("MicroMsg.WAGameAppService", "createJsRuntime");
    long l = System.currentTimeMillis();
    if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lHR, false));
    for (Object localObject2 = z.aBv(); ; localObject2 = null)
    {
      if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lHQ, false));
      for (Object localObject3 = com.tencent.mm.plugin.appbrand.r.d.Ec("wxa_library/v8_snapshot.bin"); ; localObject3 = null)
      {
        localObject3 = new com.tencent.mm.plugin.appbrand.h.b((String)localObject2, (byte[])localObject3);
        localObject2 = new d(this, (com.tencent.mm.plugin.appbrand.h.q)((com.tencent.mm.plugin.appbrand.h.i)localObject3).af(com.tencent.mm.plugin.appbrand.h.q.class));
        ((com.tencent.mm.plugin.appbrand.h.i)localObject3).setJsExceptionHandler(new b.1(this));
        ((d)localObject2).hqv = aAt();
        ((com.tencent.mm.plugin.appbrand.h.i)localObject3).addJavascriptInterface(localObject2, "WeixinJSContext");
        com.tencent.mm.plugin.appbrand.s.n.a((com.tencent.mm.plugin.appbrand.h.i)localObject3, String.format(";(function(){let interface = %s;let alloc = interface.alloc;let allocNativeGlobal = interface.allocNativeGlobal;interface.alloc = function(injectNativeGlobal) {if(injectNativeGlobal){return allocNativeGlobal();}else{return alloc();}}})();", new Object[] { "WeixinJSContext" }), new d.1((d)localObject2));
        ((d)localObject2).asH();
        ab.i("MicroMsg.WAGameAppService", "[damonlei] createJsRuntime cost [%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        com.tencent.mm.plugin.appbrand.report.quality.a.aLz();
        localObject2 = localObject1;
        if (atU())
          localObject2 = com.tencent.mm.plugin.appbrand.task.g.iFg;
        com.tencent.mm.plugin.appbrand.report.quality.b.a((com.tencent.mm.plugin.appbrand.task.g)localObject2, getAppId(), l, com.tencent.mm.plugin.appbrand.report.a.d((com.tencent.mm.plugin.appbrand.h.i)localObject3));
        AppMethodBeat.o(130014);
        return localObject3;
      }
    }
  }

  public final Map<String, m> aub()
  {
    AppMethodBeat.i(130015);
    Map localMap = com.tencent.mm.plugin.appbrand.game.e.f.aAK();
    AppMethodBeat.o(130015);
    return localMap;
  }

  public final boolean aui()
  {
    return true;
  }

  public final void auk()
  {
    AppMethodBeat.i(130019);
    if (this.gPR == null)
      AppMethodBeat.o(130019);
    while (true)
    {
      return;
      Object localObject1 = this.gPR.hqb;
      Object localObject2 = new WeakReference(getRuntime());
      localObject1 = (com.tencent.magicbrush.handler.glfont.h)((MBRuntime)localObject1).getFontHandler();
      localObject2 = new a.1((WeakReference)localObject2);
      ((com.tencent.magicbrush.handler.glfont.h)localObject1).bSW = ((com.tencent.magicbrush.handler.glfont.b)localObject2);
      if (((com.tencent.magicbrush.handler.glfont.h)localObject1).bTn != null)
        ((com.tencent.magicbrush.handler.glfont.h)localObject1).bTn.bSW = ((com.tencent.magicbrush.handler.glfont.b)localObject2);
      com.tencent.magicbrush.a.a.a(new com.tencent.mm.plugin.appbrand.game.c.a.a((byte)0));
      com.tencent.magicbrush.handler.glfont.a.a(new com.tencent.mm.plugin.appbrand.game.c.a.b());
      com.tencent.mm.plugin.appbrand.game.c.b.a(this.gPR.hqb, getRuntime(), true);
      AppMethodBeat.o(130019);
    }
  }

  public final void aul()
  {
    AppMethodBeat.i(130018);
    if (this.gPR == null)
    {
      super.aul();
      AppMethodBeat.o(130018);
    }
    while (true)
    {
      return;
      this.gPR.hqd = aAt();
      this.gPR.hqh = new b.a(this, (byte)0);
      this.gPR.hqc = true;
      this.gPR.hqe = true;
      this.gPR.hqi.allow_antialias_ = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lIA, false);
      this.gPR.hqi.allow_opengl3 = ((Boolean)com.tencent.mm.plugin.appbrand.game.a.b.hqB.Uw()).booleanValue();
      super.aul();
      AppMethodBeat.o(130018);
    }
  }

  public final void auo()
  {
    AppMethodBeat.i(130024);
    Object localObject;
    com.tencent.mm.plugin.appbrand.h.i locali;
    if ((getRuntime() != null) && (getRuntime().yd()))
    {
      al.d(new b.2(this));
      localObject = (l)aBx().af(l.class);
      if (localObject != null)
        ((l)localObject).Ce("xdebug");
      if (this.gPH)
        locali = aBx();
    }
    try
    {
      URL localURL = new java/net/URL;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localURL.<init>("https://usr/" + "break.js");
      locali.a(localURL, "breakprogram();", null);
      AppMethodBeat.o(130024);
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      while (true)
        AppMethodBeat.o(130024);
    }
  }

  public final void aup()
  {
    AppMethodBeat.i(130021);
    Object localObject = aBx();
    if (localObject == null)
      AppMethodBeat.o(130021);
    while (true)
    {
      return;
      localObject = (com.tencent.mm.plugin.appbrand.h.n)((com.tencent.mm.plugin.appbrand.h.i)localObject).af(com.tencent.mm.plugin.appbrand.h.n.class);
      if (localObject != null)
        ((com.tencent.mm.plugin.appbrand.h.n)localObject).setThreadPriority(-8);
      AppMethodBeat.o(130021);
    }
  }

  public final boolean aut()
  {
    AppMethodBeat.i(130035);
    boolean bool;
    if ((com.tencent.mm.sdk.platformtools.f.DEBUG) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED))
    {
      bool = ((Boolean)com.tencent.mm.plugin.appbrand.game.a.d.hqL.Uw()).booleanValue();
      AppMethodBeat.o(130035);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(130035);
    }
  }

  public final void cleanup()
  {
    AppMethodBeat.i(130026);
    super.cleanup();
    a.a locala;
    if (this.gPR != null)
      locala = this.gPR.hqj;
    try
    {
      locala.bUA.get();
      if (this.hku != null)
        this.hku.destroy();
      AppMethodBeat.o(130026);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        c.c.a("MagicBrush.SyncTask", localInterruptedException, "await failed", new Object[0]);
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
        c.c.a("MagicBrush.SyncTask", localExecutionException, "execute failed", new Object[0]);
    }
  }

  public final void dw(boolean paramBoolean)
  {
    AppMethodBeat.i(130020);
    ab.i("MicroMsg.WAGameAppService", "onRuntimeResume");
    super.dw(paramBoolean);
    if (this.hku != null)
      this.hku.hjW.bringToFront();
    AppMethodBeat.o(130020);
  }

  public final MBRuntime getMBRuntime()
  {
    if (this.gPR == null);
    for (MBRuntime localMBRuntime = null; ; localMBRuntime = this.gPR.hqb)
      return localMBRuntime;
  }

  public final void h(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(130027);
    super.h(paramJSONObject);
    b(paramJSONObject, "isIsolateContext", Boolean.valueOf(aut()));
    AppMethodBeat.o(130027);
  }

  public final void i(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(130028);
    super.i(paramJSONObject);
    AppBrandSysConfigWC localAppBrandSysConfigWC = getRuntime().atH();
    Object localObject = paramJSONObject.optJSONObject("wxAppInfo");
    if (localObject == null)
      localObject = new JSONObject();
    while (true)
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        i = 0;
        if (i < localAppBrandSysConfigWC.bQO.hgb.length)
        {
          localJSONArray.put(localAppBrandSysConfigWC.bQO.hgb[i]);
          i++;
        }
        else
        {
          b((JSONObject)localObject, "subContextImgDomain", localJSONArray);
          b(paramJSONObject, "wxAppInfo", localObject);
          localObject = getMBRuntime();
          if (localObject != null)
          {
            i = ((MBRuntime)localObject).getSystemDisplayWidth();
            j = ((MBRuntime)localObject).getSystemDisplayHeight();
            ab.i("MicroMsg.WAGameAppService", "dm.widthPixels %d, dm.heightPixels %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            if (com.tencent.mm.plugin.appbrand.config.a.a.t(getRuntime()))
            {
              ab.i("MicroMsg.WAGameAppService", "screen in right orientation");
              b(paramJSONObject, "screenWidth", Integer.valueOf(i));
              b(paramJSONObject, "screenHeight", Integer.valueOf(j));
              b(paramJSONObject, "devicePixelRatio", Float.valueOf(com.tencent.mm.bz.a.getDensity(getContext())));
              AppMethodBeat.o(130028);
              return;
            }
            ab.w("MicroMsg.WAGameAppService", "screen in reverse orientation");
            b(paramJSONObject, "screenWidth", Integer.valueOf(j));
            b(paramJSONObject, "screenHeight", Integer.valueOf(i));
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        continue;
        int j = 0;
        int i = 0;
      }
  }

  public final void m(com.tencent.mm.plugin.appbrand.i arg1)
  {
    AppMethodBeat.i(130022);
    super.m(???);
    ??? = com.tencent.mm.plugin.appbrand.report.quality.a.DG(getAppId());
    com.tencent.magicbrush.a locala;
    if ((??? != null) && (???.iDh.aLA()))
    {
      ??? = getMBRuntime();
      if (??? != null)
        locala = ???.getInspector();
    }
    while (true)
    {
      synchronized (locala.bSg)
      {
        if (locala.bSg.mNativeInst == 0L)
        {
          AppMethodBeat.o(130022);
          return;
        }
        locala.bSg.nativeSetEnableInspectFpsVariance(locala.bSg.mNativeInst, true);
        AppMethodBeat.o(130022);
      }
      AppMethodBeat.o(130022);
    }
  }

  public final void wO()
  {
    AppMethodBeat.i(130023);
    ab.i("MicroMsg.WAGameAppService", "WAGameAppService.init");
    this.hqn = true;
    aAu();
    AppMethodBeat.o(130023);
  }

  public final String xc(String paramString)
  {
    AppMethodBeat.i(130033);
    if ((getRuntime() != null) && (getRuntime().yd()))
    {
      paramString = t.a(paramString, getRuntime());
      AppMethodBeat.o(130033);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(130033);
    }
  }

  public final void xd(String paramString)
  {
    AppMethodBeat.i(130032);
    ab.i("MicroMsg.WAGameAppService", "hy: do nothing in game service when called from modularizing helper");
    AppMethodBeat.o(130032);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b
 * JD-Core Version:    0.6.2
 */