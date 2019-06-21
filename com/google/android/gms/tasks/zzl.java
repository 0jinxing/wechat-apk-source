package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzl
  implements Runnable
{
  zzl(zzk paramzzk, Task paramTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57398);
    synchronized (zzk.zza(this.zzafv))
    {
      if (zzk.zzb(this.zzafv) != null)
        zzk.zzb(this.zzafv).onFailure(this.zzafn.getException());
      AppMethodBeat.o(57398);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzl
 * JD-Core Version:    0.6.2
 */