package com.google.b.d;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class k extends r
{
  public final b a(String paramString, a parama, int paramInt1, int paramInt2, Map<c, ?> paramMap)
  {
    AppMethodBeat.i(57227);
    if (parama != a.bxH)
    {
      paramString = new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57227);
      throw paramString;
    }
    paramString = super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    AppMethodBeat.o(57227);
    return paramString;
  }

  public final boolean[] bj(String paramString)
  {
    AppMethodBeat.i(57228);
    if (paramString.length() != 8)
    {
      paramString = new IllegalArgumentException("Requested contents should be 8 digits long, but got " + paramString.length());
      AppMethodBeat.o(57228);
      throw paramString;
    }
    boolean[] arrayOfBoolean = new boolean[67];
    int i = a(arrayOfBoolean, 0, q.bAC, true) + 0;
    int k;
    for (int j = 0; j <= 3; j++)
    {
      k = Integer.parseInt(paramString.substring(j, j + 1));
      i += a(arrayOfBoolean, i, q.bAE[k], false);
    }
    i += a(arrayOfBoolean, i, q.bAD, false);
    for (j = 4; j <= 7; j++)
    {
      k = Integer.parseInt(paramString.substring(j, j + 1));
      i += a(arrayOfBoolean, i, q.bAE[k], true);
    }
    a(arrayOfBoolean, i, q.bAC, true);
    AppMethodBeat.o(57228);
    return arrayOfBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.b.d.k
 * JD-Core Version:    0.6.2
 */