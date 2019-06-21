package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzwx extends zzws<Integer>
{
  zzwx(zzxc paramzzxc, String paramString, Integer paramInteger)
  {
    super(paramzzxc, paramString, paramInteger, null);
  }

  private final Integer zzfa(String paramString)
  {
    AppMethodBeat.i(69766);
    try
    {
      int i = Integer.parseInt(paramString);
      paramString = Integer.valueOf(i);
      AppMethodBeat.o(69766);
      return paramString;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        String str = this.zzbnh;
        new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(paramString).length()).append("Invalid integer value for ").append(str).append(": ").append(paramString);
        paramString = null;
        AppMethodBeat.o(69766);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzwx
 * JD-Core Version:    0.6.2
 */