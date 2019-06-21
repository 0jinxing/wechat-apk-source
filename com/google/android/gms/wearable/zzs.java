package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzi;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzs
  implements Runnable
{
  zzs(WearableListenerService.zzd paramzzd, zzi paramzzi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71489);
    this.zzao.zzak.onEntityUpdate(this.zzau);
    AppMethodBeat.o(71489);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.zzs
 * JD-Core Version:    0.6.2
 */