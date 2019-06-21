package com.tencent.mm.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
{
  public static String vo(String paramString)
  {
    AppMethodBeat.i(58717);
    if ((paramString == null) || ("".equals(paramString.trim())))
      AppMethodBeat.o(58717);
    while (true)
    {
      return paramString;
      paramString = paramString.toCharArray();
      StringBuffer localStringBuffer = new StringBuffer();
      int i = 0;
      int j = paramString.length;
      while (i < j)
      {
        String str = SpellMap.r(paramString[i]);
        if (str != null)
          localStringBuffer.append(str);
        i++;
      }
      paramString = localStringBuffer.toString();
      AppMethodBeat.o(58717);
    }
  }

  public static String vp(String paramString)
  {
    AppMethodBeat.i(58718);
    if ((paramString == null) || ("".equals(paramString.trim())))
      AppMethodBeat.o(58718);
    while (true)
    {
      return paramString;
      char[] arrayOfChar = paramString.toCharArray();
      StringBuffer localStringBuffer = new StringBuffer();
      int i = arrayOfChar.length;
      for (int j = 0; j < i; j++)
        if (!Character.isSpace(arrayOfChar[j]))
        {
          paramString = SpellMap.r(arrayOfChar[j]);
          if ((paramString != null) && (paramString.length() > 0))
            localStringBuffer.append(paramString.charAt(0));
        }
      paramString = localStringBuffer.toString().toUpperCase();
      AppMethodBeat.o(58718);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.g
 * JD-Core Version:    0.6.2
 */