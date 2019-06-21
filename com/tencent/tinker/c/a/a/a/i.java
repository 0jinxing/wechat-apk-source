package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.o;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.a.t.a.a;
import com.tencent.tinker.c.a.c.c;
import java.util.Arrays;

public abstract class i<T extends Comparable<T>>
{
  protected final com.tencent.tinker.a.a.i Azk;
  protected final com.tencent.tinker.c.a.b.a Azm;
  private final c Azn;

  public i(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami, c paramc)
  {
    this.Azm = parama;
    this.Azk = parami;
    this.Azn = paramc;
  }

  private int[] RK(int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      j = o.a(this.Azm.AAj) + j;
      arrayOfInt[i] = j;
      i++;
    }
    return arrayOfInt;
  }

  private static int a(int paramInt, T paramT)
  {
    if ((paramT instanceof t.a.a))
      paramInt = ((t.a.a)paramT).off;
    return paramInt;
  }

  protected abstract T a(com.tencent.tinker.a.a.a.a parama);

  protected T a(com.tencent.tinker.c.a.c.a parama, T paramT)
  {
    return paramT;
  }

  protected void a(c paramc, int paramInt1, int paramInt2)
  {
  }

  protected void a(c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  protected abstract t.a c(com.tencent.tinker.a.a.i parami);

  protected abstract int e(T paramT);

  public final void execute()
  {
    int[] arrayOfInt1 = RK(o.b(this.Azm.AAj));
    int[] arrayOfInt2 = RK(o.b(this.Azm.AAj));
    int[] arrayOfInt3 = RK(o.b(this.Azm.AAj));
    Object localObject = c(this.Azk);
    i.e locale;
    int i;
    if (((t.a)localObject).exists())
    {
      locale = this.Azk.a((t.a)localObject);
      i = ((t.a)localObject).size;
    }
    while (true)
    {
      int j = arrayOfInt1.length;
      int k = arrayOfInt2.length;
      int m = arrayOfInt3.length;
      int n = 0;
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      while ((n < i) || (i1 < i + k - j))
        if ((i3 < k) && (arrayOfInt2[i3] == i1))
        {
          e(a(this.Azm.AAj));
          i1++;
          i3++;
        }
        else if ((i2 < m) && (arrayOfInt3[i2] == i1))
        {
          e(a(this.Azm.AAj));
          i1++;
          i2++;
        }
        else if (Arrays.binarySearch(arrayOfInt1, n) >= 0)
        {
          localObject = a(locale);
          a(this.Azn, n, a(n, (Comparable)localObject));
          n++;
          i4++;
        }
        else if (Arrays.binarySearch(arrayOfInt3, n) >= 0)
        {
          localObject = a(locale);
          a(this.Azn, n, a(n, (Comparable)localObject));
          n++;
        }
        else if (n < i)
        {
          localObject = a(this.Azn, a(locale));
          int i5 = e((Comparable)localObject);
          a(this.Azn, n, a(n, (Comparable)localObject), i1, i5);
          n++;
          i1++;
        }
      if ((i3 != k) || (i4 != j) || (i2 != m))
        throw new IllegalStateException(String.format("bad patch operation sequence. addCounter: %d, addCount: %d, delCounter: %d, delCount: %d, replaceCounter: %d, replaceCount:%d", new Object[] { Integer.valueOf(i3), Integer.valueOf(k), Integer.valueOf(i4), Integer.valueOf(j), Integer.valueOf(i2), Integer.valueOf(m) }));
      return;
      i = 0;
      locale = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.a.a.i
 * JD-Core Version:    0.6.2
 */