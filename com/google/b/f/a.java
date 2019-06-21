package com.google.b.f;

import com.google.b.f.b.f;
import com.google.b.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class a
  implements g
{
  private static com.google.b.b.b a(f paramf, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(57259);
    paramf = paramf.bBU;
    if (paramf == null)
    {
      paramf = new IllegalStateException();
      AppMethodBeat.o(57259);
      throw paramf;
    }
    int i = paramf.width;
    int j = paramf.height;
    int k = (paramInt3 << 1) + i;
    int m = (paramInt3 << 1) + j;
    paramInt1 = Math.max(paramInt1, k);
    paramInt3 = Math.max(paramInt2, m);
    int n = Math.min(paramInt1 / k, paramInt3 / m);
    m = (paramInt1 - i * n) / 2;
    paramInt2 = (paramInt3 - j * n) / 2;
    com.google.b.b.b localb = new com.google.b.b.b(paramInt1, paramInt3);
    for (paramInt1 = 0; paramInt1 < j; paramInt1++)
    {
      paramInt3 = 0;
      k = m;
      while (paramInt3 < i)
      {
        if (paramf.bH(paramInt3, paramInt1) == 1)
          localb.p(k, paramInt2, n, n);
        paramInt3++;
        k += n;
      }
      paramInt2 += n;
    }
    AppMethodBeat.o(57259);
    return localb;
  }

  public final com.google.b.b.b a(String paramString, com.google.b.a parama, int paramInt1, int paramInt2, Map<com.google.b.c, ?> paramMap)
  {
    AppMethodBeat.i(57258);
    if (paramString.isEmpty())
    {
      paramString = new IllegalArgumentException("Found empty contents");
      AppMethodBeat.o(57258);
      throw paramString;
    }
    if (parama != com.google.b.a.bxM)
    {
      paramString = new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57258);
      throw paramString;
    }
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      paramString = new IllegalArgumentException("Requested dimensions are too small: " + paramInt1 + 'x' + paramInt2);
      AppMethodBeat.o(57258);
      throw paramString;
    }
    parama = com.google.b.f.a.a.bBf;
    int i = 4;
    com.google.b.a locala = parama;
    int j = i;
    if (paramMap != null)
    {
      if (paramMap.containsKey(com.google.b.c.bxT))
        parama = com.google.b.f.a.a.valueOf(paramMap.get(com.google.b.c.bxT).toString());
      locala = parama;
      j = i;
      if (paramMap.containsKey(com.google.b.c.bxY))
      {
        j = Integer.parseInt(paramMap.get(com.google.b.c.bxY).toString());
        locala = parama;
      }
    }
    paramString = a(com.google.b.f.b.c.a(paramString, locala, paramMap), paramInt1, paramInt2, j);
    AppMethodBeat.o(57258);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.b.f.a
 * JD-Core Version:    0.6.2
 */