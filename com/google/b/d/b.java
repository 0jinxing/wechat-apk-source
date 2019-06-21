package com.google.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends o
{
  private static final char[] bAk = { 65, 66, 67, 68 };
  private static final char[] bAl = { 84, 78, 42, 69 };
  private static final char[] bAm = { 47, 58, 43, 46 };
  private static final char bAn = (char)bAk[0];

  public final boolean[] bj(String paramString)
  {
    AppMethodBeat.i(57172);
    String str;
    int i;
    if (paramString.length() < 2)
    {
      str = bAn + paramString + bAn;
      i = 20;
      j = 1;
      label46: if (j >= str.length() - 1)
        break label363;
      if ((!Character.isDigit(str.charAt(j))) && (str.charAt(j) != '-') && (str.charAt(j) != '$'))
        break label301;
      i += 9;
    }
    boolean bool2;
    while (true)
    {
      j++;
      break label46;
      char c1 = Character.toUpperCase(paramString.charAt(0));
      char c2 = Character.toUpperCase(paramString.charAt(paramString.length() - 1));
      boolean bool1 = a.a(bAk, c1);
      bool2 = a.a(bAk, c2);
      boolean bool3 = a.a(bAl, c1);
      boolean bool4 = a.a(bAl, c2);
      if (bool1)
      {
        str = paramString;
        if (bool2)
          break;
        paramString = new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(57172);
        throw paramString;
      }
      if (bool3)
      {
        str = paramString;
        if (bool4)
          break;
        paramString = new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(57172);
        throw paramString;
      }
      if ((bool2) || (bool4))
      {
        paramString = new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(57172);
        throw paramString;
      }
      str = bAn + paramString + bAn;
      break;
      label301: if (!a.a(bAm, str.charAt(j)))
        break label322;
      i += 10;
    }
    label322: paramString = new IllegalArgumentException("Cannot encode : '" + str.charAt(j) + '\'');
    AppMethodBeat.o(57172);
    throw paramString;
    label363: paramString = new boolean[str.length() - 1 + i];
    int k = 0;
    int j = 0;
    if (k < str.length())
    {
      m = Character.toUpperCase(str.charAt(k));
      if (k != 0)
      {
        i = m;
        if (k != str.length() - 1)
          break label467;
      }
      switch (m)
      {
      default:
        i = m;
        label467: m = 0;
        label470: if (m < a.bAh.length)
          if (i != a.bAh[m])
            break;
        break;
      case 84:
      case 78:
      case 42:
      case 69:
      }
    }
    for (int m = a.bAi[m]; ; m = 0)
    {
      int n = 0;
      bool2 = true;
      i = 0;
      while (true)
      {
        label505: if (n >= 7)
          break label597;
        paramString[j] = bool2;
        j++;
        if (((m >> 6 - n & 0x1) == 0) || (i == 1))
        {
          if (!bool2);
          for (bool2 = true; ; bool2 = false)
          {
            n++;
            i = 0;
            break label505;
            i = 65;
            break;
            i = 66;
            break;
            i = 67;
            break;
            i = 68;
            break;
            m++;
            break label470;
          }
        }
        i++;
      }
      label597: if (k < str.length() - 1)
      {
        paramString[j] = 0;
        j++;
      }
      while (true)
      {
        k++;
        break;
        AppMethodBeat.o(57172);
        return paramString;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.b.d.b
 * JD-Core Version:    0.6.2
 */