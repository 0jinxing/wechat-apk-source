package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzfe;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzm
  implements Runnable
{
  zzm(WearableListenerService.zzd paramzzd, zzfe paramzzfe)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71483);
    this.zzao.zzak.onMessageReceived(this.zzap);
    AppMethodBeat.o(71483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.zzm
 * JD-Core Version:    0.6.2
 */