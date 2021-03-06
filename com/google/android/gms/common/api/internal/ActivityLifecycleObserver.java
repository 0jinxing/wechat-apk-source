package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;

@KeepForSdkWithMembers
public abstract class ActivityLifecycleObserver
{
  public static final ActivityLifecycleObserver of(Activity paramActivity)
  {
    return new zza(paramActivity);
  }

  public abstract ActivityLifecycleObserver onStopCallOnce(Runnable paramRunnable);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.ActivityLifecycleObserver
 * JD-Core Version:    0.6.2
 */