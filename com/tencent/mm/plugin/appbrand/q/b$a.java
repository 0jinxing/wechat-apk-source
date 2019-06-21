package com.tencent.mm.plugin.appbrand.q;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a
{
  public static String n(String[] paramArrayOfString)
  {
    AppMethodBeat.i(57065);
    String str1 = " PRIMARY KEY ( ";
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str2 = paramArrayOfString[j];
      str1 = str1 + ", " + str2;
    }
    paramArrayOfString = str1.replaceFirst(",", "");
    paramArrayOfString = paramArrayOfString + " )";
    paramArrayOfString = "" + "," + paramArrayOfString;
    AppMethodBeat.o(57065);
    return paramArrayOfString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.q.b.a
 * JD-Core Version:    0.6.2
 */