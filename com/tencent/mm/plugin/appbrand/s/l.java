package com.tencent.mm.plugin.appbrand.s;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class l
{
  private static String[][] iRx = { arrayOfString1, arrayOfString2, { "\"", "\\\"" }, arrayOfString3, arrayOfString4, { "\b", "\\b" }, arrayOfString5, arrayOfString6 };

  static
  {
    String[] arrayOfString1 = { "\\", "\\\\" };
    String[] arrayOfString2 = { "'", "\\'" };
    String[] arrayOfString3 = { "\n", "\\n" };
    String[] arrayOfString4 = { "\t", "\\t" };
    String[] arrayOfString5 = { "\f", "\\f" };
    String[] arrayOfString6 = { "\r", "\\r" };
  }

  public static String Ej(String paramString)
  {
    AppMethodBeat.i(87424);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(87424);
    while (true)
    {
      return paramString;
      for (String[] arrayOfString1 : iRx)
        paramString = paramString.replace(arrayOfString1[0], arrayOfString1[1]);
      AppMethodBeat.o(87424);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.l
 * JD-Core Version:    0.6.2
 */