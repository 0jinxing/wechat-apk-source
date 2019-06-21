package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzaae
  implements zzaak
{
  public final boolean zzd(Class<?> paramClass)
  {
    return false;
  }

  public final zzaaj zze(Class<?> paramClass)
  {
    AppMethodBeat.i(3335);
    paramClass = new IllegalStateException("This should never be called.");
    AppMethodBeat.o(3335);
    throw paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaae
 * JD-Core Version:    0.6.2
 */