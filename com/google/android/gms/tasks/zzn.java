package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzn
  implements Runnable
{
  zzn(zzm paramzzm, Task paramTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57401);
    synchronized (zzm.zza(this.zzafx))
    {
      if (zzm.zzb(this.zzafx) != null)
        zzm.zzb(this.zzafx).onSuccess(this.zzafn.getResult());
      AppMethodBeat.o(57401);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzn
 * JD-Core Version:    0.6.2
 */