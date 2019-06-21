package com.google.b.d;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.c;
import com.google.b.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class j extends r
{
  public final b a(String paramString, a parama, int paramInt1, int paramInt2, Map<c, ?> paramMap)
  {
    AppMethodBeat.i(57326);
    if (parama != a.bxI)
    {
      paramString = new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57326);
      throw paramString;
    }
    paramString = super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    AppMethodBeat.o(57326);
    return paramString;
  }

  public final boolean[] bj(String paramString)
  {
    AppMethodBeat.i(57327);
    if (paramString.length() != 13)
    {
      paramString = new IllegalArgumentException("Requested contents should be 13 digits long, but got " + paramString.length());
      AppMethodBeat.o(57327);
      throw paramString;
    }
    try
    {
      if (!q.r(paramString))
      {
        paramString = new java/lang/IllegalArgumentException;
        paramString.<init>("Contents do not pass checksum");
        AppMethodBeat.o(57327);
        throw paramString;
      }
    }
    catch (d paramString)
    {
      paramString = new IllegalArgumentException("Illegal contents");
      AppMethodBeat.o(57327);
      throw paramString;
    }
    int i = Integer.parseInt(paramString.substring(0, 1));
    int j = i.bAv[i];
    boolean[] arrayOfBoolean = new boolean[95];
    int k = a(arrayOfBoolean, 0, q.bAC, true);
    i = 1;
    k += 0;
    int n;
    while (i <= 6)
    {
      int m = Integer.parseInt(paramString.substring(i, i + 1));
      n = m;
      if ((j >> 6 - i & 0x1) == 1)
        n = m + 10;
      k += a(arrayOfBoolean, k, q.bAF[n], false);
      i++;
    }
    k += a(arrayOfBoolean, k, q.bAD, false);
    for (i = 7; i <= 12; i++)
    {
      n = Integer.parseInt(paramString.substring(i, i + 1));
      k += a(arrayOfBoolean, k, q.bAE[n], true);
    }
    a(arrayOfBoolean, k, q.bAC, true);
    AppMethodBeat.o(57327);
    return arrayOfBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.d.j
 * JD-Core Version:    0.6.2
 */