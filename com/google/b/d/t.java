package com.google.b.d;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class t extends r
{
  public final b a(String paramString, a parama, int paramInt1, int paramInt2, Map<c, ?> paramMap)
  {
    AppMethodBeat.i(57155);
    if (parama != a.bxQ)
    {
      paramString = new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57155);
      throw paramString;
    }
    paramString = super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    AppMethodBeat.o(57155);
    return paramString;
  }

  public final boolean[] bj(String paramString)
  {
    AppMethodBeat.i(57156);
    if (paramString.length() != 8)
    {
      paramString = new IllegalArgumentException("Requested contents should be 8 digits long, but got " + paramString.length());
      AppMethodBeat.o(57156);
      throw paramString;
    }
    int i = Integer.parseInt(paramString.substring(7, 8));
    int j = s.bAG[i];
    boolean[] arrayOfBoolean = new boolean[51];
    int k = a(arrayOfBoolean, 0, q.bAC, true);
    i = 1;
    k += 0;
    while (i <= 6)
    {
      int m = Integer.parseInt(paramString.substring(i, i + 1));
      int n = m;
      if ((j >> 6 - i & 0x1) == 1)
        n = m + 10;
      k += a(arrayOfBoolean, k, q.bAF[n], false);
      i++;
    }
    a(arrayOfBoolean, k, q.bAA, false);
    AppMethodBeat.o(57156);
    return arrayOfBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.b.d.t
 * JD-Core Version:    0.6.2
 */