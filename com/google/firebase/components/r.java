package com.google.firebase.components;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class r
{
  public static void c(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(10631);
    if (!paramBoolean)
    {
      paramString = new IllegalStateException(paramString);
      AppMethodBeat.o(10631);
      throw paramString;
    }
    AppMethodBeat.o(10631);
  }

  public static <T> T zza(T paramT, String paramString)
  {
    AppMethodBeat.i(10630);
    if (paramT == null)
    {
      paramT = new NullPointerException(paramString);
      AppMethodBeat.o(10630);
      throw paramT;
    }
    AppMethodBeat.o(10630);
    return paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.r
 * JD-Core Version:    0.6.2
 */