package com.google.android.gms.common.data;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zze
  implements TextFilterable.StringFilter
{
  public final boolean matches(String paramString1, String paramString2)
  {
    AppMethodBeat.i(61202);
    boolean bool;
    if (!paramString1.startsWith(paramString2))
    {
      paramString2 = String.valueOf(paramString2);
      if (paramString2.length() != 0)
      {
        paramString2 = " ".concat(paramString2);
        if (!paramString1.contains(paramString2))
          break label62;
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(61202);
    }
    while (true)
    {
      return bool;
      paramString2 = new String(" ");
      break;
      label62: bool = false;
      AppMethodBeat.o(61202);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.zze
 * JD-Core Version:    0.6.2
 */