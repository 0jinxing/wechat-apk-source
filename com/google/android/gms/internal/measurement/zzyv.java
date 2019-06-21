package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzyv
{
  private static final Class<?> zzbqv;
  private static final boolean zzbqw;

  static
  {
    AppMethodBeat.i(3547);
    zzbqv = zzfh("libcore.io.Memory");
    if (zzfh("org.robolectric.Robolectric") != null);
    for (boolean bool = true; ; bool = false)
    {
      zzbqw = bool;
      AppMethodBeat.o(3547);
      return;
    }
  }

  private static <T> Class<T> zzfh(String paramString)
  {
    AppMethodBeat.i(3546);
    try
    {
      paramString = Class.forName(paramString);
      AppMethodBeat.o(3546);
      return paramString;
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(3546);
      }
    }
  }

  static boolean zzsv()
  {
    if ((zzbqv != null) && (!zzbqw));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static Class<?> zzsw()
  {
    return zzbqv;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzyv
 * JD-Core Version:    0.6.2
 */