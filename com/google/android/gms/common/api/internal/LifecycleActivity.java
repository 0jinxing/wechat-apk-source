package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

@KeepForSdk
public class LifecycleActivity
{
  private final Object zzkz;

  public LifecycleActivity(Activity paramActivity)
  {
    AppMethodBeat.i(89480);
    Preconditions.checkNotNull(paramActivity, "Activity must not be null");
    this.zzkz = paramActivity;
    AppMethodBeat.o(89480);
  }

  public final boolean zzbv()
  {
    return this.zzkz instanceof FragmentActivity;
  }

  public final boolean zzbw()
  {
    return this.zzkz instanceof Activity;
  }

  public final Activity zzbx()
  {
    return (Activity)this.zzkz;
  }

  public final FragmentActivity zzby()
  {
    return (FragmentActivity)this.zzkz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.LifecycleActivity
 * JD-Core Version:    0.6.2
 */