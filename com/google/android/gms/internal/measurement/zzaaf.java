package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzaaf
  implements zzaak
{
  private zzaak[] zzbtf;

  zzaaf(zzaak[] paramArrayOfzzaak)
  {
    this.zzbtf = paramArrayOfzzaak;
  }

  public final boolean zzd(Class<?> paramClass)
  {
    boolean bool = false;
    AppMethodBeat.i(3336);
    zzaak[] arrayOfzzaak = this.zzbtf;
    int i = arrayOfzzaak.length;
    int j = 0;
    if (j < i)
      if (arrayOfzzaak[j].zzd(paramClass))
      {
        bool = true;
        AppMethodBeat.o(3336);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(3336);
    }
  }

  public final zzaaj zze(Class<?> paramClass)
  {
    AppMethodBeat.i(3337);
    for (zzaak localzzaak : this.zzbtf)
      if (localzzaak.zzd(paramClass))
      {
        paramClass = localzzaak.zze(paramClass);
        AppMethodBeat.o(3337);
        return paramClass;
      }
    paramClass = String.valueOf(paramClass.getName());
    if (paramClass.length() != 0);
    for (paramClass = "No factory is available for message type: ".concat(paramClass); ; paramClass = new String("No factory is available for message type: "))
    {
      paramClass = new UnsupportedOperationException(paramClass);
      AppMethodBeat.o(3337);
      throw paramClass;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaaf
 * JD-Core Version:    0.6.2
 */