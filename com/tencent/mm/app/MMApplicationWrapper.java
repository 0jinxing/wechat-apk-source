package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ac.c;
import com.tencent.mm.boot.a.a;
import com.tencent.mm.booter.d;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.b.h.2;
import com.tencent.mm.kernel.b.h.3;
import com.tencent.mm.kernel.b.h.4;
import com.tencent.mm.kernel.b.h.5;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.splash.m;
import com.tencent.mm.vfs.FileSystemManager;
import com.tencent.tinker.entry.ApplicationLifeCycle;
import com.tencent.tinker.entry.ApplicationLike;

public class MMApplicationWrapper
  implements ApplicationLifeCycle
{
  private static final String TAG = "MicroMsg.MMApplicationWrapper";
  public Application app;
  private final ApplicationLike lifeCycle;
  private final long processInitTimestamp;
  private h profile;
  private String thisProcess;

  public MMApplicationWrapper(ApplicationLike paramApplicationLike, String paramString)
  {
    AppMethodBeat.i(137959);
    this.profile = null;
    this.processInitTimestamp = System.currentTimeMillis();
    com.tencent.mm.blink.a.q(paramApplicationLike.getApplicationStartMillisTime(), paramApplicationLike.getApplicationStartElapsedTime());
    this.app = paramApplicationLike.getApplication();
    this.lifeCycle = paramApplicationLike;
    this.thisProcess = paramString;
    AppMethodBeat.o(137959);
  }

  private void setupXLogDebugger(h paramh)
  {
    AppMethodBeat.i(137961);
    d locald = paramh.ecL;
    if (paramh.SG())
    {
      locald.jE("MM");
      AppMethodBeat.o(137961);
    }
    while (true)
    {
      return;
      if (paramh.lQ(":push"))
      {
        locald.jE("PUSH");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":tools"))
      {
        locald.jE("TOOL");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":toolsmp"))
      {
        locald.jE("TOOLSMP");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":sandbox"))
      {
        locald.jE("SANDBOX");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":exdevice"))
      {
        locald.jE("EXDEVICE");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":patch"))
      {
        locald.jE("PATCH");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":appbrand0"))
      {
        locald.jE("APPBRAND0");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":appbrand1"))
      {
        locald.jE("APPBRAND1");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":appbrand2"))
      {
        locald.jE("APPBRAND2");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":appbrand3"))
      {
        locald.jE("APPBRAND3");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":appbrand4"))
      {
        locald.jE("APPBRAND4");
        AppMethodBeat.o(137961);
      }
      else if (paramh.lQ(":TMAssistantDownloadSDKService"))
      {
        locald.jE("TMSDK");
        AppMethodBeat.o(137961);
      }
      else
      {
        if (paramh.lQ(":dexopt"))
          locald.jE("DEXOPT");
        AppMethodBeat.o(137961);
      }
    }
  }

  public void onBaseContextAttached(Context paramContext)
  {
    AppMethodBeat.i(137960);
    com.tencent.mm.kernel.a.a.eKP = SystemClock.elapsedRealtime();
    com.tencent.mm.kernel.a.a.eKO = System.currentTimeMillis();
    this.profile = new h(this.thisProcess, this.app, this.lifeCycle);
    this.profile.eMp.eMq = this.processInitTimestamp;
    FileSystemManager.setContext(this.profile.cc);
    p.By();
    k.a("stlport_shared", paramContext.getClassLoader());
    k.a("c++_shared", paramContext.getClassLoader());
    k.a(com.tencent.mm.xlog.app.a.Aiz, paramContext.getClassLoader());
    this.profile.ecL = d.bo(this.profile.cc);
    setupXLogDebugger(this.profile);
    com.tencent.mm.splash.a.h(this.app);
    ab.v("PreventAccessModification", "profile %s", new Object[] { w.cfw });
    if (!p.cX(this.thisProcess))
      w.a(this.profile, "com.tencent.mm.app.WeChatSplashStartup");
    while (true)
    {
      q.G(a.a.class);
      q.cY("com.tencent.mm.boot");
      AppMethodBeat.o(137960);
      return;
      ab.i("MicroMsg.MMApplicationWrapper", "is plain process. load nothing");
      w.a(this.profile, null);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(137964);
    if (this.profile != null)
    {
      h localh = this.profile;
      localh.eMA.a(new h.5(localh, paramConfiguration));
    }
    AppMethodBeat.o(137964);
  }

  public void onCreate()
  {
    AppMethodBeat.i(137962);
    c.c(this.app);
    m.drr();
    AppMethodBeat.o(137962);
  }

  public void onLowMemory()
  {
    AppMethodBeat.i(137965);
    if (this.profile != null)
    {
      h localh = this.profile;
      localh.eMA.a(new h.2(localh));
    }
    AppMethodBeat.o(137965);
  }

  public void onTerminate()
  {
    AppMethodBeat.i(137963);
    if (this.profile != null)
    {
      h localh = this.profile;
      localh.eMA.a(new h.4(localh));
    }
    AppMethodBeat.o(137963);
  }

  public void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(137966);
    if (this.profile != null)
    {
      h localh = this.profile;
      localh.eMA.a(new h.3(localh, paramInt));
    }
    AppMethodBeat.o(137966);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.MMApplicationWrapper
 * JD-Core Version:    0.6.2
 */