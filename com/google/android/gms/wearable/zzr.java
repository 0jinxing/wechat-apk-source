package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzl;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzr
  implements Runnable
{
  zzr(WearableListenerService.zzd paramzzd, zzl paramzzl)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71488);
    this.zzao.zzak.onNotificationReceived(this.zzat);
    AppMethodBeat.o(71488);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.zzr
 * JD-Core Version:    0.6.2
 */