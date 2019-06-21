package com.google.android.gms.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzg
  implements DeferredLifecycleHelper.zza
{
  zzg(DeferredLifecycleHelper paramDeferredLifecycleHelper)
  {
  }

  public final int getState()
  {
    return 5;
  }

  public final void zza(LifecycleDelegate paramLifecycleDelegate)
  {
    AppMethodBeat.i(61641);
    DeferredLifecycleHelper.zzb(this.zzabg).onResume();
    AppMethodBeat.o(61641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.zzg
 * JD-Core Version:    0.6.2
 */