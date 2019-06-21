package com.tencent.mm.modelsfs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class f
{
  public static String s(String paramString, long paramLong)
  {
    AppMethodBeat.i(93201);
    if (paramLong == 0L)
    {
      paramString = String.format(paramString + ";?enc=%d", new Object[] { Long.valueOf(314159265L) });
      AppMethodBeat.o(93201);
    }
    while (true)
    {
      return paramString;
      paramString = String.format(paramString + ";?enc=%d", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(93201);
    }
  }

  public static boolean th(String paramString)
  {
    AppMethodBeat.i(93200);
    boolean bool;
    if (paramString.lastIndexOf(";?enc=") > 0)
    {
      bool = true;
      AppMethodBeat.o(93200);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(93200);
    }
  }

  public static String ti(String paramString)
  {
    AppMethodBeat.i(93202);
    int i = paramString.lastIndexOf(";?enc=");
    if (i > 0)
    {
      paramString = paramString.substring(0, i);
      AppMethodBeat.o(93202);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(93202);
    }
  }

  public static long tj(String paramString)
  {
    AppMethodBeat.i(93203);
    int i = paramString.lastIndexOf(";?enc=");
    long l;
    if (i > 0)
    {
      l = bo.anl(paramString.substring(i + 6));
      AppMethodBeat.o(93203);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(93203);
    }
  }

  public static String tk(String paramString)
  {
    AppMethodBeat.i(93204);
    int i = paramString.lastIndexOf(";?enc=");
    if (i > 0)
    {
      paramString = paramString.substring(i + 6).trim();
      AppMethodBeat.o(93204);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(93204);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.f
 * JD-Core Version:    0.6.2
 */