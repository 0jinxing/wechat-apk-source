package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzaw;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzt
  implements Runnable
{
  zzt(WearableListenerService.zzd paramzzd, zzaw paramzzaw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71490);
    this.zzav.zza(this.zzao.zzak);
    this.zzav.zza(WearableListenerService.zzc(this.zzao.zzak));
    AppMethodBeat.o(71490);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.zzt
 * JD-Core Version:    0.6.2
 */