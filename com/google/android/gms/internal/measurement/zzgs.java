package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgs
  implements Runnable
{
  zzgs(zzgn paramzzgn, zzed paramzzed)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69114);
    zzgn.zza(this.zzanf).zzkx();
    zzjr localzzjr = zzgn.zza(this.zzanf);
    zzed localzzed = this.zzang;
    zzdz localzzdz = localzzjr.zzcb(localzzed.packageName);
    if (localzzdz != null)
      localzzjr.zzb(localzzed, localzzdz);
    AppMethodBeat.o(69114);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgs
 * JD-Core Version:    0.6.2
 */