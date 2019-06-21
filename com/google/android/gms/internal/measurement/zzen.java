package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzen
  implements Runnable
{
  zzen(zzem paramzzem, zzhi paramzzhi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68697);
    this.zzafk.zzgd();
    if (zzgg.isMainThread())
    {
      this.zzafk.zzgd().zzc(this);
      AppMethodBeat.o(68697);
    }
    while (true)
    {
      return;
      boolean bool = this.zzafl.zzef();
      zzem.zza(this.zzafl, 0L);
      if (bool)
        this.zzafl.run();
      AppMethodBeat.o(68697);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzen
 * JD-Core Version:    0.6.2
 */