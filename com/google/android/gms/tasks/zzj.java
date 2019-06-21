package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzj
  implements Runnable
{
  zzj(zzi paramzzi, Task paramTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57395);
    synchronized (zzi.zza(this.zzaft))
    {
      if (zzi.zzb(this.zzaft) != null)
        zzi.zzb(this.zzaft).onComplete(this.zzafn);
      AppMethodBeat.o(57395);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzj
 * JD-Core Version:    0.6.2
 */