package com.google.b.a;

import com.google.b.b.b;
import com.google.b.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.charset.Charset;
import java.util.Map;

public final class a
  implements g
{
  private static final Charset byj;

  static
  {
    AppMethodBeat.i(57191);
    byj = Charset.forName("ISO-8859-1");
    AppMethodBeat.o(57191);
  }

  private static b a(com.google.b.a.a.a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57190);
    b localb = parama.byn;
    if (localb == null)
    {
      parama = new IllegalStateException();
      AppMethodBeat.o(57190);
      throw parama;
    }
    int i = localb.width;
    int j = localb.height;
    paramInt1 = Math.max(paramInt1, i);
    int k = Math.max(paramInt2, j);
    int m = Math.min(paramInt1 / i, k / j);
    int n = (paramInt1 - i * m) / 2;
    paramInt2 = (k - j * m) / 2;
    parama = new b(paramInt1, k);
    for (paramInt1 = 0; paramInt1 < j; paramInt1++)
    {
      k = n;
      int i1 = 0;
      while (i1 < i)
      {
        if (localb.bB(i1, paramInt1))
          parama.p(k, paramInt2, m, m);
        i1++;
        k += m;
      }
      paramInt2 += m;
    }
    AppMethodBeat.o(57190);
    return parama;
  }

  public final b a(String paramString, com.google.b.a parama, int paramInt1, int paramInt2, Map<com.google.b.c, ?> paramMap)
  {
    AppMethodBeat.i(57189);
    Charset localCharset1 = byj;
    int i = 33;
    int j = 0;
    Charset localCharset2 = localCharset1;
    int k = i;
    int m = j;
    if (paramMap != null)
    {
      if (paramMap.containsKey(com.google.b.c.bxU))
        localCharset1 = Charset.forName(paramMap.get(com.google.b.c.bxU).toString());
      if (paramMap.containsKey(com.google.b.c.bxT))
        i = Integer.parseInt(paramMap.get(com.google.b.c.bxT).toString());
      localCharset2 = localCharset1;
      k = i;
      m = j;
      if (paramMap.containsKey(com.google.b.c.byc))
      {
        m = Integer.parseInt(paramMap.get(com.google.b.c.byc).toString());
        k = i;
        localCharset2 = localCharset1;
      }
    }
    if (parama != com.google.b.a.bxB)
    {
      paramString = new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57189);
      throw paramString;
    }
    paramString = a(com.google.b.a.a.c.n(paramString.getBytes(localCharset2), k, m), paramInt1, paramInt2);
    AppMethodBeat.o(57189);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.b.a.a
 * JD-Core Version:    0.6.2
 */