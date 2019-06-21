package com.tencent.tinker.lib.util;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;

final class TinkerJobIntentService$f extends JobServiceEngine
  implements TinkerJobIntentService.b
{
  final TinkerJobIntentService ACh;
  JobParameters bWJ;
  final Object mLock = new Object();

  TinkerJobIntentService$f(TinkerJobIntentService paramTinkerJobIntentService)
  {
    super(paramTinkerJobIntentService);
    this.ACh = paramTinkerJobIntentService;
  }

  public final TinkerJobIntentService.e dSi()
  {
    Object localObject1 = null;
    synchronized (this.mLock)
    {
      if (this.bWJ == null);
      JobWorkItem localJobWorkItem;
      do
      {
        return localObject1;
        localJobWorkItem = this.bWJ.dequeueWork();
      }
      while (localJobWorkItem == null);
      localJobWorkItem.getIntent().setExtrasClassLoader(this.ACh.getClassLoader());
      localObject1 = new a(localJobWorkItem);
    }
  }

  public final boolean onStartJob(JobParameters paramJobParameters)
  {
    this.bWJ = paramJobParameters;
    this.ACh.bb(false);
    return true;
  }

  public final boolean onStopJob(JobParameters paramJobParameters)
  {
    paramJobParameters = this.ACh;
    if (paramJobParameters.ACf != null)
      paramJobParameters.ACf.cancel(paramJobParameters.Ed);
    paramJobParameters.mStopped = true;
    synchronized (this.mLock)
    {
      this.bWJ = null;
      return true;
    }
  }

  public final IBinder zj()
  {
    return getBinder();
  }

  final class a
    implements TinkerJobIntentService.e
  {
    final JobWorkItem bWK;

    a(JobWorkItem arg2)
    {
      Object localObject;
      this.bWK = localObject;
    }

    public final void complete()
    {
      synchronized (TinkerJobIntentService.f.this.mLock)
      {
        if (TinkerJobIntentService.f.this.bWJ != null)
          TinkerJobIntentService.f.this.bWJ.completeWork(this.bWK);
        return;
      }
    }

    public final Intent getIntent()
    {
      return this.bWK.getIntent();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.util.TinkerJobIntentService.f
 * JD-Core Version:    0.6.2
 */