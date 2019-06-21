package com.google.b.d;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.c;
import com.google.b.g;
import java.util.Map;

public abstract class o
  implements g
{
  protected static int a(boolean[] paramArrayOfBoolean, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    int k = 0;
    int m = paramInt;
    paramInt = j;
    if (paramInt < i)
    {
      int n = paramArrayOfInt[paramInt];
      j = 0;
      while (j < n)
      {
        paramArrayOfBoolean[m] = paramBoolean;
        j++;
        m++;
      }
      k += n;
      if (!paramBoolean);
      for (paramBoolean = true; ; paramBoolean = false)
      {
        paramInt++;
        break;
      }
    }
    return k;
  }

  private static b a(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramArrayOfBoolean.length;
    int j = i + paramInt3;
    int k = Math.max(paramInt1, j);
    paramInt3 = Math.max(1, paramInt2);
    j = k / j;
    paramInt1 = (k - i * j) / 2;
    b localb = new b(k, paramInt3);
    paramInt2 = 0;
    while (paramInt2 < i)
    {
      if (paramArrayOfBoolean[paramInt2] != 0)
        localb.p(paramInt1, 0, j, paramInt3);
      paramInt2++;
      paramInt1 += j;
    }
    return localb;
  }

  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map<c, ?> paramMap)
  {
    if (paramString.isEmpty())
      throw new IllegalArgumentException("Found empty contents");
    if ((paramInt1 < 0) || (paramInt2 < 0))
      throw new IllegalArgumentException("Negative size is not allowed. Input: " + paramInt1 + 'x' + paramInt2);
    int i = vI();
    int j = i;
    if (paramMap != null)
    {
      j = i;
      if (paramMap.containsKey(c.bxY))
        j = Integer.parseInt(paramMap.get(c.bxY).toString());
    }
    return a(bj(paramString), paramInt1, paramInt2, j);
  }

  public abstract boolean[] bj(String paramString);

  public int vI()
  {
    return 10;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.b.d.o
 * JD-Core Version:    0.6.2
 */