package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzfo;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzn
  implements Runnable
{
  zzn(WearableListenerService.zzd paramzzd, zzfo paramzzfo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71484);
    this.zzao.zzak.onPeerConnected(this.zzaq);
    AppMethodBeat.o(71484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.zzn
 * JD-Core Version:    0.6.2
 */