package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;

final class zzaas
{
  private static final zzaaq zzbto;
  private static final zzaaq zzbtp;

  static
  {
    AppMethodBeat.i(3353);
    zzbto = zzuc();
    zzbtp = new zzaar();
    AppMethodBeat.o(3353);
  }

  static zzaaq zzua()
  {
    return zzbto;
  }

  static zzaaq zzub()
  {
    return zzbtp;
  }

  private static zzaaq zzuc()
  {
    AppMethodBeat.i(3352);
    try
    {
      zzaaq localzzaaq = (zzaaq)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      AppMethodBeat.o(3352);
      return localzzaaq;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(3352);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaas
 * JD-Core Version:    0.6.2
 */