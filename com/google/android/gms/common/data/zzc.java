package com.google.android.gms.common.data;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzc
  implements TextFilterable.StringFilter
{
  public final boolean matches(String paramString1, String paramString2)
  {
    AppMethodBeat.i(61200);
    boolean bool = paramString1.contains(paramString2);
    AppMethodBeat.o(61200);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.zzc
 * JD-Core Version:    0.6.2
 */