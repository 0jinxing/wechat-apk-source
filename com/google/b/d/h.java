package com.google.b.d;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class h extends o
{
  private static int a(boolean[] paramArrayOfBoolean, int paramInt, int[] paramArrayOfInt)
  {
    int i = 0;
    if (i < 9)
    {
      if (paramArrayOfInt[i] != 0);
      for (int j = 1; ; j = 0)
      {
        paramArrayOfBoolean[paramInt] = j;
        i++;
        paramInt++;
        break;
      }
    }
    return 9;
  }

  private static void b(int paramInt, int[] paramArrayOfInt)
  {
    int i = 0;
    if (i < 9)
    {
      if ((1 << 8 - i & paramInt) == 0);
      for (int j = 0; ; j = 1)
      {
        paramArrayOfInt[i] = j;
        i++;
        break;
      }
    }
  }

  private static int l(String paramString, int paramInt)
  {
    AppMethodBeat.i(57175);
    int i = 0;
    int j = paramString.length() - 1;
    int k = 1;
    while (j >= 0)
    {
      i += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(paramString.charAt(j)) * k;
      int m = k + 1;
      k = m;
      if (m > paramInt)
        k = 1;
      j--;
    }
    AppMethodBeat.o(57175);
    return i % 47;
  }

  public final b a(String paramString, a parama, int paramInt1, int paramInt2, Map<c, ?> paramMap)
  {
    AppMethodBeat.i(57173);
    if (parama != a.bxE)
    {
      paramString = new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57173);
      throw paramString;
    }
    paramString = super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    AppMethodBeat.o(57173);
    return paramString;
  }

  public final boolean[] bj(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(57174);
    int j = paramString.length();
    if (j > 80)
    {
      paramString = new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(j)));
      AppMethodBeat.o(57174);
      throw paramString;
    }
    int[] arrayOfInt = new int[9];
    boolean[] arrayOfBoolean = new boolean[(paramString.length() + 2 + 2) * 9 + 1];
    b(g.bAi[47], arrayOfInt);
    int k = a(arrayOfBoolean, 0, arrayOfInt);
    while (i < j)
    {
      int m = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(paramString.charAt(i));
      b(g.bAi[m], arrayOfInt);
      k += a(arrayOfBoolean, k, arrayOfInt);
      i++;
    }
    i = l(paramString, 20);
    b(g.bAi[i], arrayOfInt);
    k += a(arrayOfBoolean, k, arrayOfInt);
    i = l(paramString + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(i), 15);
    b(g.bAi[i], arrayOfInt);
    k = a(arrayOfBoolean, k, arrayOfInt) + k;
    b(g.bAi[47], arrayOfInt);
    arrayOfBoolean[(k + a(arrayOfBoolean, k, arrayOfInt))] = true;
    AppMethodBeat.o(57174);
    return arrayOfBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.d.h
 * JD-Core Version:    0.6.2
 */