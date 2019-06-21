package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzb
  implements DeferredLifecycleHelper.zza
{
  zzb(DeferredLifecycleHelper paramDeferredLifecycleHelper, Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
  }

  public final int getState()
  {
    return 0;
  }

  public final void zza(LifecycleDelegate paramLifecycleDelegate)
  {
    AppMethodBeat.i(61636);
    DeferredLifecycleHelper.zzb(this.zzabg).onInflate(this.val$activity, this.zzabh, this.zzabi);
    AppMethodBeat.o(61636);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.zzb
 * JD-Core Version:    0.6.2
 */