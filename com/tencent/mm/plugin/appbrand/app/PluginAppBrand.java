package com.tencent.mm.plugin.appbrand.app;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.Keep;
import com.tencent.luggage.bridge.a.a.1;
import com.tencent.luggage.bridge.a.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.vz;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.aj;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.appbrand.appcache.s;
import com.tencent.mm.plugin.appbrand.appcache.z;
import com.tencent.mm.plugin.appbrand.appstorage.x.a;
import com.tencent.mm.plugin.appbrand.appstorage.x.b;
import com.tencent.mm.plugin.appbrand.appusage.ad;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.am;
import com.tencent.mm.plugin.appbrand.appusage.o;
import com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC;
import com.tencent.mm.plugin.appbrand.config.g.1;
import com.tencent.mm.plugin.appbrand.config.n;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.launching.an;
import com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ao;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Keep
public final class PluginAppBrand extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.c, aj, com.tencent.mm.plugin.appbrand.a.c
{
  public static final String TAG = "MicroMsg.PluginAppBrand";
  private final com.tencent.mm.plugin.appbrand.s.f singletonRegistry;
  private com.tencent.mm.sdk.b.c<vz> xWebViewInitCompleteEventIListener;

  static
  {
    AppMethodBeat.i(129236);
    com.tencent.mm.compatible.util.k.a("appbrandcommon", PluginAppBrand.class.getClassLoader());
    com.tencent.mm.compatible.util.k.a("wechatzstd", PluginAppBrand.class.getClassLoader());
    AppMethodBeat.o(129236);
  }

  public PluginAppBrand()
  {
    AppMethodBeat.i(129226);
    this.xWebViewInitCompleteEventIListener = new PluginAppBrand.1(this);
    this.singletonRegistry = new com.tencent.mm.plugin.appbrand.s.f();
    AppMethodBeat.o(129226);
  }

  private void initJSONABTestGetter()
  {
    AppMethodBeat.i(129235);
    com.tencent.mm.aa.h.a(new PluginAppBrand.6(this));
    AppMethodBeat.o(129235);
  }

  static boolean isAppBrandProcess()
  {
    AppMethodBeat.i(129233);
    try
    {
      String str1 = com.tencent.mm.sdk.platformtools.ah.getPackageName();
      String str2 = ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).eHT;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      bool = str2.startsWith(str1 + ":appbrand");
      AppMethodBeat.o(129233);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(129233);
      }
    }
  }

  static boolean isSupportProcess()
  {
    AppMethodBeat.i(129234);
    try
    {
      bool = "com.tencent.mm:support".equals(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).eHT);
      AppMethodBeat.o(129234);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(129234);
      }
    }
  }

  public final void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(129231);
    if (isAppBrandProcess())
      com.tencent.mm.kernel.g.RQ().a(new PluginAppBrand.2(this));
    AppMethodBeat.o(129231);
  }

  public final void dependency()
  {
    AppMethodBeat.i(129230);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    dependsOn(com.tencent.mm.plugin.appbrand.compat.a.c.class);
    AppMethodBeat.o(129230);
  }

  public final void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(129232);
    ab.d("MicroMsg.PluginAppBrand", "current process name = %s, isMainThread %b", new Object[] { ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).eHT, Boolean.valueOf(al.isMainThread()) });
    com.tencent.mm.kernel.g.a(IBSPatchJNIService.class, new com.tencent.mm.kernel.c.e(new BSPatchJNIWrapper()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.service.e.class, new com.tencent.mm.kernel.c.e(new an()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.modelappbrand.e.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.dynamic.a.c()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.modelappbrand.g.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.dynamic.a.d()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.service.f.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.launching.b.g()));
    Object localObject1;
    if (paramg.SG())
    {
      localObject1 = x.b.gYG;
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.appstorage.a.a.class, (com.tencent.mm.kernel.c.a)localObject1);
      com.tencent.mm.plugin.appbrand.game.c.c.axy();
      initJSONABTestGetter();
      localObject1 = new g();
      if (com.tencent.luggage.bridge.a.a.bOP == null)
        break label683;
      com.tencent.luggage.g.d.e("Luggage.LuggageBoot", "do not setup more than once.");
    }
    while (true)
    {
      if (!paramg.SG())
        break label703;
      com.tencent.mm.kernel.g.RQ().a(new PluginAppBrand.3(this));
      paramg = com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.c.iZz;
      com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.c.init(com.tencent.mm.sdk.platformtools.ah.getContext());
      com.tencent.mm.plugin.w.c.qwS.a(new com.tencent.mm.plugin.appbrand.ag());
      com.tencent.mm.plugin.w.c.qwS.a(new com.tencent.mm.plugin.appbrand.ah());
      com.tencent.mm.kernel.g.a(PluginAppBrand.a.class, new com.tencent.mm.kernel.c.e(new PluginAppBrand.a()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.widget.recentview.d.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.widget.b()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.modelappbrand.i.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.share.a.a()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.ui.banner.e.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.ui.banner.a()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.service.a.class, new com.tencent.mm.kernel.c.e(new d()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.service.d.class, new com.tencent.mm.kernel.c.e(new n()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.service.g.class, new com.tencent.mm.kernel.c.e(new c()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.a.d.class, new com.tencent.mm.kernel.c.e(new h()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.widget.a.a.class, new com.tencent.mm.kernel.c.e(new i()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.service.i.class, new com.tencent.mm.kernel.c.e(new am()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.service.c.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.game.c()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.modelappbrand.k.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.i.e()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.modelappbrand.j.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.i.a()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.service.b.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.s.i()));
      com.tencent.mm.pluginsdk.cmd.b.a(new com.tencent.mm.plugin.appbrand.b(), new String[] { "//wagame", "//enable_appbrand_monkey_test", "//disable_appbrand_monkey_test", "//appbrand_predownload_trigger", "//callsearchshowoutwxaapp", "//getsearchshowoutwxaapp", "//appbrandtest", "//wxafts", "//wxatest", "//xweb_video", "//localwxalibrary" });
      com.tencent.mm.pluginsdk.cmd.b.a(new com.tencent.mm.plugin.appbrand.dynamic.c.a(), new String[] { "//widget" });
      com.tencent.mm.kernel.g.RQ().a(new PluginAppBrand.4(this));
      if (DebuggerShell.ayU())
        com.tencent.mm.kernel.g.a(DebuggerShell.class, new DebuggerShell());
      z.a(new s());
      AppMethodBeat.o(129232);
      return;
      localObject1 = x.a.gYE;
      break;
      label683: com.tencent.luggage.bridge.a.a.bOP = (a.b)localObject1;
      ((a.b)localObject1).a(new a.1());
    }
    label703: Object localObject2;
    if ((com.tencent.mm.sdk.platformtools.ah.doF()) || (com.tencent.mm.sdk.platformtools.ah.doG()) || (isAppBrandProcess()))
    {
      com.tencent.mm.plugin.appbrand.report.model.j.aLp();
      com.tencent.mm.ipcinvoker.g.lh("com.tencent.mm:tools");
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.appusage.ag.class, new com.tencent.mm.kernel.c.e(new o()));
      com.tencent.mm.kernel.g.a(af.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.appusage.g()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.widget.recentview.d.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.widget.b()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.backgroundfetch.h.class, new com.tencent.mm.kernel.c.e(new AppBrandBackgroundFetchDataStorageIPC()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.service.a.class, new com.tencent.mm.kernel.c.e(new e()));
      com.tencent.mm.plugin.appbrand.launching.precondition.i.cR(com.tencent.mm.sdk.platformtools.ah.getContext());
      localObject2 = this.singletonRegistry;
      localObject1 = paramg.cc;
      ab.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.AppSingletonRegistry ");
      ((Application)localObject1).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
      localObject1 = this.singletonRegistry;
      localObject2 = paramg.cc;
      ((com.tencent.mm.plugin.appbrand.s.f)localObject1).iRo = true;
      ((com.tencent.mm.plugin.appbrand.s.f)localObject1).app = ((Application)localObject2);
      localObject1 = this.singletonRegistry;
      localObject2 = com.tencent.mm.plugin.appbrand.s.a.a.iRU;
      ab.i("MicroMsg.AppSingletonRegistry", "registerAppSingleton() called with: singleton = [%s]", new Object[] { localObject2 });
      ((com.tencent.mm.plugin.appbrand.s.f)localObject1).iRm.offer(localObject2);
    }
    if ((com.tencent.mm.sdk.platformtools.ah.doF()) || (com.tencent.mm.sdk.platformtools.ah.doG()))
    {
      com.tencent.mm.plugin.appbrand.dynamic.widget.b.initialize();
      ao.a(new PluginAppBrand.5(this));
    }
    while (true)
    {
      if (com.tencent.mm.sdk.platformtools.ah.doF())
        com.tencent.mm.aa.h.initialize();
      AppMethodBeat.o(129232);
      break;
      if (isAppBrandProcess())
      {
        AppBrandProcessSuicideLogic.e(paramg.cc);
        try
        {
          localObject1 = MultiProcessSharedPreferences.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.getContext(), "pref_appbrand_process", 4);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = com.tencent.mm.sdk.platformtools.ah.getProcessName() + ":start_time";
          SharedPreferences.Editor localEditor = ((SharedPreferences)localObject1).edit();
          if (((SharedPreferences)localObject1).contains((String)localObject2))
          {
            localEditor.remove((String)localObject2);
            com.tencent.mm.plugin.report.e.pXa.a(365L, 2L, 1L, false);
          }
          com.tencent.mm.plugin.report.e.pXa.a(365L, 4L, 1L, false);
          localEditor.putLong((String)localObject2, System.currentTimeMillis());
          localEditor.commit();
          ab.v("MicroMsg.AppBrandReporter", "onProcessStart");
          KVCommCrossProcessReceiver.cgk();
          com.tencent.mm.plugin.appbrand.task.a.b.e(paramg.cc);
        }
        catch (Throwable localThrowable)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.AppBrandReporter", localThrowable, "onProcessStart()", new Object[0]);
        }
      }
      else if (isSupportProcess())
      {
        com.tencent.mm.plugin.appbrand.dynamic.h.e.cC(com.tencent.mm.sdk.platformtools.ah.getContext());
        com.tencent.mm.aa.h.initialize();
      }
    }
  }

  final f getCore()
  {
    AppMethodBeat.i(129228);
    f localf = (f)q.Y(f.class);
    AppMethodBeat.o(129228);
    return localf;
  }

  public final List<ai> getDataTransferList()
  {
    AppMethodBeat.i(129227);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(new g.1(new com.tencent.mm.plugin.appbrand.config.g()));
    localLinkedList.add(new ad());
    localLinkedList.add(new com.tencent.mm.plugin.appbrand.appusage.e());
    AppMethodBeat.o(129227);
    return localLinkedList;
  }

  public final void installed()
  {
    AppMethodBeat.i(129229);
    alias(com.tencent.mm.plugin.appbrand.a.c.class);
    this.xWebViewInitCompleteEventIListener.dnU();
    AppMethodBeat.o(129229);
  }

  public final String name()
  {
    return "plugin-appbrand";
  }

  public final void onAccountInitialized(e.c paramc)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.PluginAppBrand
 * JD-Core Version:    0.6.2
 */