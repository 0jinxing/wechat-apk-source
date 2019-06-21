package com.google.b.d;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class f extends o
{
  private static void b(int paramInt, int[] paramArrayOfInt)
  {
    int i = 0;
    if (i < 9)
    {
      if ((1 << 8 - i & paramInt) == 0);
      for (int j = 1; ; j = 2)
      {
        paramArrayOfInt[i] = j;
        i++;
        break;
      }
    }
  }

  public final b a(String paramString, a parama, int paramInt1, int paramInt2, Map<c, ?> paramMap)
  {
    AppMethodBeat.i(57225);
    if (parama != a.bxD)
    {
      paramString = new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57225);
      throw paramString;
    }
    paramString = super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    AppMethodBeat.o(57225);
    return paramString;
  }

  public final boolean[] bj(String paramString)
  {
    AppMethodBeat.i(57226);
    int i = paramString.length();
    if (i > 80)
    {
      paramString = new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(i)));
      AppMethodBeat.o(57226);
      throw paramString;
    }
    int[] arrayOfInt1 = new int[9];
    int j = i + 25;
    int m;
    for (int k = 0; k < i; k++)
    {
      m = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(paramString.charAt(k));
      if (m < 0)
      {
        paramString = new IllegalArgumentException("Bad contents: ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(57226);
        throw paramString;
      }
      b(e.bAi[m], arrayOfInt1);
      for (m = 0; m < 9; m++)
        j += arrayOfInt1[m];
    }
    boolean[] arrayOfBoolean = new boolean[j];
    b(e.bAu, arrayOfInt1);
    k = a(arrayOfBoolean, 0, arrayOfInt1, true);
    int[] arrayOfInt2 = new int[1];
    arrayOfInt2[0] = 1;
    j = k + a(arrayOfBoolean, k, arrayOfInt2, false);
    for (k = 0; k < i; k++)
    {
      m = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(paramString.charAt(k));
      b(e.bAi[m], arrayOfInt1);
      j += a(arrayOfBoolean, j, arrayOfInt1, true);
      j += a(arrayOfBoolean, j, arrayOfInt2, false);
    }
    b(e.bAu, arrayOfInt1);
    a(arrayOfBoolean, j, arrayOfInt1, true);
    AppMethodBeat.o(57226);
    return arrayOfBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.b.d.f
 * JD-Core Version:    0.6.2
 */