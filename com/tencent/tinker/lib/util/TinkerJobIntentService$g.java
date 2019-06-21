package com.tencent.tinker.lib.util;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

final class TinkerJobIntentService$g extends TinkerJobIntentService.h
{
  private final JobInfo bWM;
  private final JobScheduler bWN;

  TinkerJobIntentService$g(Context paramContext, ComponentName paramComponentName, int paramInt)
  {
    super(paramComponentName);
    fV(paramInt);
    this.bWM = new JobInfo.Builder(paramInt, this.mComponentName).setOverrideDeadline(0L).build();
    this.bWN = ((JobScheduler)paramContext.getApplicationContext().getSystemService("jobscheduler"));
  }

  final void m(Intent paramIntent)
  {
    this.bWN.enqueue(this.bWM, new JobWorkItem(paramIntent));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.util.TinkerJobIntentService.g
 * JD-Core Version:    0.6.2
 */