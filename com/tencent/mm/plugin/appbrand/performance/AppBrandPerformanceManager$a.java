package com.tencent.mm.plugin.appbrand.performance;

import android.os.Build.VERSION;
import android.os.Process;
import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public class AppBrandPerformanceManager$a
  implements Runnable
{
  private volatile boolean OH;
  protected final b ivC;
  private volatile double ivD;
  private volatile int ivE;
  private volatile boolean ivF;
  protected volatile boolean ivG;
  private e ivH;
  f ivI;
  f.a ivJ;
  private g.c ivK;
  protected final String mAppId;
  volatile boolean mPaused;

  public AppBrandPerformanceManager$a(b paramb)
  {
    AppMethodBeat.i(102219);
    this.ivD = 0.0D;
    this.ivE = 4;
    this.OH = true;
    this.mPaused = false;
    this.ivF = false;
    this.ivG = false;
    this.ivJ = new AppBrandPerformanceManager.a.2(this);
    this.ivK = new AppBrandPerformanceManager.a.3(this);
    this.ivC = paramb;
    this.mAppId = paramb.mAppId;
    this.ivH = new e(Process.myPid());
    this.ivG = false;
    if (aKj())
    {
      this.ivI = new f();
      this.ivI.mInterval = 100L;
      this.ivI.ivJ = this.ivJ;
    }
    AppMethodBeat.o(102219);
  }

  static boolean aKj()
  {
    if (Build.VERSION.SDK_INT >= 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void aKk()
  {
    AppMethodBeat.i(102222);
    int i = bo.gX(ah.getContext());
    AppBrandPerformanceManager.a(this.ivC, 102, i + "m");
    c.a(this.mAppId, "Hardware", "MEMORY", i);
    AppMethodBeat.o(102222);
  }

  protected void aKl()
  {
    if (!this.ivG);
  }

  protected void aKm()
  {
    if (!this.ivG);
  }

  protected void aKn()
  {
  }

  protected void aKo()
  {
  }

  protected void aKp()
  {
  }

  public void run()
  {
    AppMethodBeat.i(102223);
    if (this.ivC.mFinished)
    {
      AppMethodBeat.o(102223);
      return;
    }
    Object localObject;
    if ((this.OH) && (!this.mPaused))
    {
      double d = this.ivH.aKs();
      AppBrandPerformanceManager.a(this.ivC, 101, (int)d + "%");
      c.a(this.mAppId, "Hardware", "CPU", d);
      aKk();
      aKl();
      aKm();
      aKn();
      aKo();
      aKp();
      this.ivE += 1;
      if (this.ivE >= 4)
      {
        this.ivE = 0;
        localObject = this.ivC.xZ();
        if (localObject != null)
        {
          if (((AppBrandSysConfigLU)localObject).hhe != 1)
            break label214;
          localObject = new GetStorageSizeTask();
          ((GetStorageSizeTask)localObject).appId = this.mAppId;
          ((GetStorageSizeTask)localObject).hww = new AppBrandPerformanceManager.a.1(this, (GetStorageSizeTask)localObject);
          ((GetStorageSizeTask)localObject).aBV();
          AppBrandMainProcessService.a((MainProcessTask)localObject);
        }
      }
    }
    while (true)
    {
      if (this.OH)
        m.aNS().m(this, 3000L);
      AppMethodBeat.o(102223);
      break;
      label214: b localb = this.ivC;
      localObject = com.tencent.mm.plugin.appbrand.appstorage.f.gXv;
      AppBrandPerformanceManager.a(localb, 401, bo.ga(com.tencent.mm.plugin.appbrand.appstorage.f.xT(this.mAppId)));
    }
  }

  public final void start()
  {
    AppMethodBeat.i(102220);
    this.OH = true;
    m.aNS().aa(this);
    g.a(this.mAppId, this.ivK);
    if ((aKj()) && (this.ivI != null))
      this.ivI.start();
    AppMethodBeat.o(102220);
  }

  public final void stop()
  {
    AppMethodBeat.i(102221);
    this.OH = false;
    g.b(this.mAppId, this.ivK);
    if ((aKj()) && (this.ivI != null))
      this.ivI.stop();
    AppMethodBeat.o(102221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager.a
 * JD-Core Version:    0.6.2
 */