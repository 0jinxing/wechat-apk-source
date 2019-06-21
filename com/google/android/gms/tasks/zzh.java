package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzh
  implements Runnable
{
  zzh(zzg paramzzg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57392);
    synchronized (zzg.zza(this.zzafr))
    {
      if (zzg.zzb(this.zzafr) != null)
        zzg.zzb(this.zzafr).onCanceled();
      AppMethodBeat.o(57392);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzh
 * JD-Core Version:    0.6.2
 */