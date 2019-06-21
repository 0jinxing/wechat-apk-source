package com.google.android.gms.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzf
  implements DeferredLifecycleHelper.zza
{
  zzf(DeferredLifecycleHelper paramDeferredLifecycleHelper)
  {
  }

  public final int getState()
  {
    return 4;
  }

  public final void zza(LifecycleDelegate paramLifecycleDelegate)
  {
    AppMethodBeat.i(61640);
    DeferredLifecycleHelper.zzb(this.zzabg).onStart();
    AppMethodBeat.o(61640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.zzf
 * JD-Core Version:    0.6.2
 */