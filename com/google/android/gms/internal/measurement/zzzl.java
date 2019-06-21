package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;

final class zzzl
{
  private static final zzzj<?> zzbrq;
  private static final zzzj<?> zzbrr;

  static
  {
    AppMethodBeat.i(3571);
    zzbrq = new zzzk();
    zzbrr = zztf();
    AppMethodBeat.o(3571);
  }

  private static zzzj<?> zztf()
  {
    AppMethodBeat.i(3569);
    try
    {
      zzzj localzzzj = (zzzj)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      AppMethodBeat.o(3569);
      return localzzzj;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(3569);
      }
    }
  }

  static zzzj<?> zztg()
  {
    return zzbrq;
  }

  static zzzj<?> zzth()
  {
    AppMethodBeat.i(3570);
    if (zzbrr == null)
    {
      localObject = new IllegalStateException("Protobuf runtime is not correctly loaded.");
      AppMethodBeat.o(3570);
      throw ((Throwable)localObject);
    }
    Object localObject = zzbrr;
    AppMethodBeat.o(3570);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzzl
 * JD-Core Version:    0.6.2
 */