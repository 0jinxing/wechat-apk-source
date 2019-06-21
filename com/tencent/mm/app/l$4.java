package com.tencent.mm.app;

import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageStats;
import com.tencent.mm.sdk.platformtools.ab;

final class l$4 extends IPackageStatsObserver.Stub
{
  public final void onGetStatsCompleted(PackageStats arg1, boolean paramBoolean)
  {
    if (??? != null);
    try
    {
      l.Bt()[0] = ???.cacheSize;
      l.Bt()[1] = ???.dataSize;
      l.Bt()[2] = ???.codeSize;
      ab.i("MicroMsg.MMCrashReporter", "onGetStatsCompleted succeeded[%b] cacheSize :%d ,dataSize :%d ,codeSize :%d ", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(???.cacheSize), Long.valueOf(???.dataSize), Long.valueOf(???.codeSize) });
    }
    catch (Throwable )
    {
      synchronized (l.Bt())
      {
        while (true)
        {
          l.Bt().notify();
          return;
          ab.i("MicroMsg.MMCrashReporter", "onGetStatsCompleted pStats is null succeeded[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
        }
        ??? = ???;
        ab.printErrStackTrace("MicroMsg.MMCrashReporter", ???, "onGetStatsCompleted", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.l.4
 * JD-Core Version:    0.6.2
 */