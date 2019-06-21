package com.tencent.mm.plugin.appbrand.report.quality;

import android.os.Handler;
import android.os.Looper;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.performance.f;
import java.util.Random;

final class a$2
  implements Runnable
{
  a$2(QualitySessionRuntime paramQualitySessionRuntime, AppBrandSysConfigWC paramAppBrandSysConfigWC)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132676);
    if (this.iCE.htn.mFinished)
      AppMethodBeat.o(132676);
    while (true)
    {
      return;
      e locale = this.iCE.iDh;
      Object localObject1 = this.iCE;
      AppBrandSysConfigWC localAppBrandSysConfigWC = this.iCF;
      d.i("MicroMsg.AppBrandRuntimeEventReporter", "AppBrandRuntimeEventReporter.mayStart");
      int i = ((QualitySessionRuntime)localObject1).htn.atI().uin;
      double d1 = localAppBrandSysConfigWC.bQO.hgc;
      double d2 = new Random(i ^ System.nanoTime()).nextDouble();
      boolean bool;
      if (d2 <= d1)
      {
        bool = true;
        label100: d.i("MicroMsg.AppBrandRuntimeEventReporter", "shouldEnableReport() returned: [%b], localRandom = [%f] serverPercent = [%f]", new Object[] { Boolean.valueOf(bool), Double.valueOf(d2), Double.valueOf(d1) });
        if (!bool);
      }
      else
      {
        try
        {
          locale.iCK = ((QualitySessionRuntime)localObject1);
          if (locale.handler == null)
          {
            Handler localHandler = new android/os/Handler;
            localHandler.<init>(Looper.getMainLooper());
            locale.handler = localHandler;
            locale.iCJ.ciy = (localAppBrandSysConfigWC.bQO.hgd * 1000);
            locale.handler.post(locale.iCJ);
          }
          if (!((QualitySessionRuntime)localObject1).hrs)
          {
            localObject1 = new com/tencent/mm/plugin/appbrand/performance/f;
            ((f)localObject1).<init>();
            locale.iCL = ((f)localObject1);
            locale.iCL.mInterval = 200L;
            locale.iCL.ivJ = null;
            locale.iCL.start();
          }
          AppMethodBeat.o(132676);
          continue;
          bool = false;
          break label100;
        }
        finally
        {
          AppMethodBeat.o(132676);
        }
      }
      AppMethodBeat.o(132676);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.a.2
 * JD-Core Version:    0.6.2
 */