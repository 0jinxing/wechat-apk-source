package com.google.b.c;

import com.google.b.c;
import com.google.b.c.a.e;
import com.google.b.c.a.i;
import com.google.b.c.a.j;
import com.google.b.c.a.k;
import com.google.b.c.a.l;
import com.google.b.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class a
  implements g
{
  private static com.google.b.b.b a(e parame, k paramk)
  {
    AppMethodBeat.i(57275);
    int i = paramk.vE();
    int j = paramk.vF();
    com.google.b.f.b.b localb = new com.google.b.f.b.b(paramk.vG(), paramk.vH());
    int k = 0;
    int m = 0;
    int i1;
    boolean bool;
    if (k < j)
    {
      if (k % paramk.bzZ != 0)
        break label418;
      n = 0;
      i1 = 0;
      if (n < paramk.vG())
      {
        if (n % 2 == 0);
        for (bool = true; ; bool = false)
        {
          localb.set(i1, m, bool);
          i1++;
          n++;
          break;
        }
      }
    }
    label415: label418: for (int n = m + 1; ; n = m)
    {
      i1 = 0;
      m = 0;
      label117: if (i1 < i)
      {
        int i2 = m;
        if (i1 % paramk.bzY == 0)
        {
          localb.set(m, n, true);
          i2 = m + 1;
        }
        if (parame.bzG[(parame.bzF * k + i1)] == 1)
        {
          bool = true;
          localb.set(i2, n, bool);
          m = i2 + 1;
          if (i1 % paramk.bzY != paramk.bzY - 1)
            break label415;
          if (k % 2 != 0)
            break label244;
          bool = true;
          localb.set(m, n, bool);
          m++;
        }
      }
      while (true)
      {
        label175: label218: i1++;
        break label117;
        bool = false;
        break label175;
        label244: bool = false;
        break label218;
        i1 = n + 1;
        if (k % paramk.bzZ == paramk.bzZ - 1)
        {
          n = 0;
          m = 0;
          while (n < paramk.vG())
          {
            localb.set(m, i1, true);
            m++;
            n++;
          }
        }
        for (m = i1 + 1; ; m = i1)
        {
          k++;
          break;
          n = localb.width;
          i1 = localb.height;
          parame = new com.google.b.b.b(n, i1);
          parame.clear();
          for (m = 0; m < n; m++)
            for (k = 0; k < i1; k++)
              if (localb.bH(m, k) == 1)
                parame.set(m, k);
          AppMethodBeat.o(57275);
          return parame;
        }
      }
    }
  }

  public final com.google.b.b.b a(String paramString, com.google.b.a parama, int paramInt1, int paramInt2, Map<c, ?> paramMap)
  {
    AppMethodBeat.i(57274);
    if (paramString.isEmpty())
    {
      paramString = new IllegalArgumentException("Found empty contents");
      AppMethodBeat.o(57274);
      throw paramString;
    }
    if (parama != com.google.b.a.bxG)
    {
      paramString = new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57274);
      throw paramString;
    }
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      paramString = new IllegalArgumentException("Requested dimensions are too small: " + paramInt1 + 'x' + paramInt2);
      AppMethodBeat.o(57274);
      throw paramString;
    }
    parama = l.bAd;
    Object localObject;
    if (paramMap != null)
    {
      localObject = (l)paramMap.get(c.bxV);
      if (localObject != null)
        parama = (com.google.b.a)localObject;
      localObject = (com.google.b.b)paramMap.get(c.bxW);
      if (localObject != null)
      {
        paramMap = (com.google.b.b)paramMap.get(c.bxX);
        if (paramMap == null);
      }
    }
    while (true)
    {
      paramString = j.a(paramString, parama, (com.google.b.b)localObject, paramMap);
      parama = k.a(paramString.length(), parama, (com.google.b.b)localObject, paramMap);
      paramString = new e(i.a(paramString, parama), parama.vE(), parama.vF());
      paramString.vw();
      paramString = a(paramString, parama);
      AppMethodBeat.o(57274);
      return paramString;
      paramMap = null;
      continue;
      localObject = null;
      break;
      paramMap = null;
      localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.c.a
 * JD-Core Version:    0.6.2
 */