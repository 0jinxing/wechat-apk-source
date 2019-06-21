package com.google.android.gms.common.data;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzd
  implements TextFilterable.StringFilter
{
  public final boolean matches(String paramString1, String paramString2)
  {
    AppMethodBeat.i(61201);
    boolean bool = paramString1.startsWith(paramString2);
    AppMethodBeat.o(61201);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.zzd
 * JD-Core Version:    0.6.2
 */