package com.tencent.mm.booter;

import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.network.aa;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public class KeepAliveService extends JobService
{
  public static long ebQ;

  static
  {
    AppMethodBeat.i(57765);
    if (com.tencent.mm.compatible.util.d.iW(23))
    {
      ebQ = 590000L;
      AppMethodBeat.o(57765);
    }
    while (true)
    {
      return;
      ebQ = 50000L;
      AppMethodBeat.o(57765);
    }
  }

  public static boolean Ik()
  {
    boolean bool = false;
    AppMethodBeat.i(57764);
    if (a.Mz().getBoolean("keepaliveserviceswitch", false))
      ab.i("MicroMsg.KeepAliveService", "scheduleCoreScheduleJob(), time = %d", new Object[] { Long.valueOf(ebQ) });
    while (true)
    {
      try
      {
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(ah.getContext(), KeepAliveService.class);
        JobInfo.Builder localBuilder = new android/app/job/JobInfo$Builder;
        localBuilder.<init>(1, localComponentName);
        localBuilder.setMinimumLatency(0L);
        localBuilder.setOverrideDeadline(10L);
        localBuilder.setRequiredNetworkType(1);
        localBuilder.setRequiresDeviceIdle(false);
        localBuilder.setRequiresCharging(false);
        ((JobScheduler)ah.getContext().getSystemService("jobscheduler")).schedule(localBuilder.build());
        AppMethodBeat.o(57764);
        bool = true;
        return bool;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.KeepAliveService", "scheduleKeepAliveJob() Exception:%s" + localException.getMessage());
        continue;
      }
      AppMethodBeat.o(57764);
    }
  }

  public boolean onStartJob(JobParameters paramJobParameters)
  {
    AppMethodBeat.i(57762);
    ab.i("MicroMsg.KeepAliveService", "onStartJob()");
    if (aa.ano() == null)
    {
      ab.i("MicroMsg.KeepAliveService", "onStarJob() MMPushCore.getAutoAuth() == null");
      b.c(ah.getContext(), "jobservice", true);
    }
    new Handler().postDelayed(new KeepAliveService.1(this, paramJobParameters), ebQ);
    ab.i("MicroMsg.KeepAliveService", "onReceive() delay publish PushKeepAliveEvent");
    com.tencent.mm.sdk.g.d.xDG.q(new KeepAliveService.2(this), 60000L);
    AppMethodBeat.o(57762);
    return true;
  }

  public boolean onStopJob(JobParameters paramJobParameters)
  {
    AppMethodBeat.i(57763);
    ab.i("MicroMsg.KeepAliveService", "onStopJob()");
    AppMethodBeat.o(57763);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.KeepAliveService
 * JD-Core Version:    0.6.2
 */