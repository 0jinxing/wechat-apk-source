package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzaap<T>
  implements zzaav<T>
{
  private final zzaal zzbtk;
  private final zzabj<?, ?> zzbtl;
  private final boolean zzbtm;
  private final zzzj<?> zzbtn;

  private zzaap(zzabj<?, ?> paramzzabj, zzzj<?> paramzzzj, zzaal paramzzaal)
  {
    AppMethodBeat.i(3348);
    this.zzbtl = paramzzabj;
    this.zzbtm = paramzzzj.zza(paramzzaal);
    this.zzbtn = paramzzzj;
    this.zzbtk = paramzzaal;
    AppMethodBeat.o(3348);
  }

  static <T> zzaap<T> zza(zzabj<?, ?> paramzzabj, zzzj<?> paramzzzj, zzaal paramzzaal)
  {
    AppMethodBeat.i(3349);
    paramzzabj = new zzaap(paramzzabj, paramzzzj, paramzzaal);
    AppMethodBeat.o(3349);
    return paramzzabj;
  }

  public final boolean equals(T paramT1, T paramT2)
  {
    AppMethodBeat.i(3350);
    boolean bool;
    if (!this.zzbtl.zzu(paramT1).equals(this.zzbtl.zzu(paramT2)))
    {
      bool = false;
      AppMethodBeat.o(3350);
    }
    while (true)
    {
      return bool;
      if (this.zzbtm)
      {
        bool = this.zzbtn.zzs(paramT1).equals(this.zzbtn.zzs(paramT2));
        AppMethodBeat.o(3350);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(3350);
      }
    }
  }

  public final int hashCode(T paramT)
  {
    AppMethodBeat.i(3351);
    int i = this.zzbtl.zzu(paramT).hashCode();
    int j = i;
    if (this.zzbtm)
      j = i * 53 + this.zzbtn.zzs(paramT).hashCode();
    AppMethodBeat.o(3351);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaap
 * JD-Core Version:    0.6.2
 */