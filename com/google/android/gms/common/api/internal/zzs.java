package com.google.android.gms.common.api.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.locks.Lock;

final class zzs
  implements Runnable
{
  zzs(zzr paramzzr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(60973);
    zzr.zza(this.zzgc).lock();
    try
    {
      zzr.zzb(this.zzgc);
      return;
    }
    finally
    {
      zzr.zza(this.zzgc).unlock();
      AppMethodBeat.o(60973);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzs
 * JD-Core Version:    0.6.2
 */