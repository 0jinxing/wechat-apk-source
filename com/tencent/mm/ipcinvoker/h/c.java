package com.tencent.mm.ipcinvoker.h;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public static final String P(String paramString1, String paramString2)
  {
    AppMethodBeat.i(114129);
    if ((!paramString1.contains(":")) && (paramString1.length() > 0))
      AppMethodBeat.o(114129);
    while (true)
    {
      return paramString1;
      paramString1 = paramString1.split(":");
      if ((paramString1[0] != null) && (paramString1[0].length() > 0))
      {
        paramString1 = paramString1[0];
        AppMethodBeat.o(114129);
      }
      else
      {
        AppMethodBeat.o(114129);
        paramString1 = paramString2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.h.c
 * JD-Core Version:    0.6.2
 */