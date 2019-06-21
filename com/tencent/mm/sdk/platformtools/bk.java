package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class bk
{
  private static final HashMap<String, String> xBO;

  static
  {
    AppMethodBeat.i(52280);
    xBO = new HashMap();
    AppMethodBeat.o(52280);
  }

  public static String getProperty(String paramString)
  {
    AppMethodBeat.i(52278);
    paramString = (String)xBO.get(paramString);
    AppMethodBeat.o(52278);
    return paramString;
  }

  public static void setProperty(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52279);
    xBO.put(paramString1, paramString2);
    AppMethodBeat.o(52279);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bk
 * JD-Core Version:    0.6.2
 */