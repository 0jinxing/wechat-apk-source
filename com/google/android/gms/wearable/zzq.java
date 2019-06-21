package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzah;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzq
  implements Runnable
{
  zzq(WearableListenerService.zzd paramzzd, zzah paramzzah)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71487);
    this.zzao.zzak.onCapabilityChanged(this.zzas);
    AppMethodBeat.o(71487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.zzq
 * JD-Core Version:    0.6.2
 */