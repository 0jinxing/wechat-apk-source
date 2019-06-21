package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzww extends zzws<Long>
{
  zzww(zzxc paramzzxc, String paramString, Long paramLong)
  {
    super(paramzzxc, paramString, paramLong, null);
  }

  private final Long zzez(String paramString)
  {
    AppMethodBeat.i(69764);
    try
    {
      long l = Long.parseLong(paramString);
      paramString = Long.valueOf(l);
      AppMethodBeat.o(69764);
      return paramString;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        String str = this.zzbnh;
        new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(paramString).length()).append("Invalid long value for ").append(str).append(": ").append(paramString);
        paramString = null;
        AppMethodBeat.o(69764);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzww
 * JD-Core Version:    0.6.2
 */