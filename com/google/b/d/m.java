package com.google.b.d;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class m extends o
{
  private static final int[] bAA = { 3, 1, 1 };
  private static final int[] bAx = { 1, 1, 1, 1 };

  public final b a(String paramString, a parama, int paramInt1, int paramInt2, Map<c, ?> paramMap)
  {
    AppMethodBeat.i(57317);
    if (parama != a.bxJ)
    {
      paramString = new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57317);
      throw paramString;
    }
    paramString = super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    AppMethodBeat.o(57317);
    return paramString;
  }

  public final boolean[] bj(String paramString)
  {
    AppMethodBeat.i(57318);
    int i = paramString.length();
    if (i % 2 != 0)
    {
      paramString = new IllegalArgumentException("The length of the input should be even");
      AppMethodBeat.o(57318);
      throw paramString;
    }
    if (i > 80)
    {
      paramString = new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(i)));
      AppMethodBeat.o(57318);
      throw paramString;
    }
    boolean[] arrayOfBoolean = new boolean[i * 9 + 9];
    int j = a(arrayOfBoolean, 0, bAx, true);
    for (int k = 0; k < i; k += 2)
    {
      int m = Character.digit(paramString.charAt(k), 10);
      int n = Character.digit(paramString.charAt(k + 1), 10);
      int[] arrayOfInt = new int[18];
      for (int i1 = 0; i1 < 5; i1++)
      {
        arrayOfInt[(i1 * 2)] = l.bAz[m][i1];
        arrayOfInt[(i1 * 2 + 1)] = l.bAz[n][i1];
      }
      j += a(arrayOfBoolean, j, arrayOfInt, true);
    }
    a(arrayOfBoolean, j, bAA, true);
    AppMethodBeat.o(57318);
    return arrayOfBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.b.d.m
 * JD-Core Version:    0.6.2
 */