package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzak
  implements Runnable
{
  zzak(zzaj paramzzaj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(60749);
    zzaj.zzb(this.zzhv).cancelAvailabilityErrorNotifications(zzaj.zza(this.zzhv));
    AppMethodBeat.o(60749);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzak
 * JD-Core Version:    0.6.2
 */