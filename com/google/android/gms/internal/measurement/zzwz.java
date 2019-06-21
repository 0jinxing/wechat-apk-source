package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzwz extends zzws<Double>
{
  zzwz(zzxc paramzzxc, String paramString, Double paramDouble)
  {
    super(paramzzxc, paramString, paramDouble, null);
  }

  private final Double zzfb(String paramString)
  {
    AppMethodBeat.i(69769);
    try
    {
      double d = Double.parseDouble(paramString);
      paramString = Double.valueOf(d);
      AppMethodBeat.o(69769);
      return paramString;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        String str = this.zzbnh;
        new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(paramString).length()).append("Invalid double value for ").append(str).append(": ").append(paramString);
        paramString = null;
        AppMethodBeat.o(69769);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzwz
 * JD-Core Version:    0.6.2
 */