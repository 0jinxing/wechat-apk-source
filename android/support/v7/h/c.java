package android.support.v7.h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class c
{
  private static final Comparator<c.e> Yw = new c.1();

  public static c.b a(c.a parama)
  {
    return a(parama, true);
  }

  public static c.b a(c.a parama, boolean paramBoolean)
  {
    int i = parama.fV();
    int j = parama.fW();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.add(new c.d(i, j));
    i = i + j + Math.abs(i - j);
    int[] arrayOfInt1 = new int[i * 2];
    int[] arrayOfInt2 = new int[i * 2];
    ArrayList localArrayList3 = new ArrayList();
    while (!localArrayList2.isEmpty())
    {
      c.d locald1 = (c.d)localArrayList2.remove(localArrayList2.size() - 1);
      c.e locale = a(parama, locald1.YH, locald1.YI, locald1.YJ, locald1.YK, arrayOfInt1, arrayOfInt2, i);
      if (locale != null)
      {
        if (locale.size > 0)
          localArrayList1.add(locale);
        locale.x += locald1.YH;
        locale.y += locald1.YJ;
        c.d locald2;
        if (localArrayList3.isEmpty())
        {
          locald2 = new c.d();
          label215: locald2.YH = locald1.YH;
          locald2.YJ = locald1.YJ;
          if (!locale.YL)
            break label360;
          locald2.YI = locale.x;
          locald2.YK = locale.y;
          label263: localArrayList2.add(locald2);
          if (!locale.YL)
            break label455;
          if (!locale.YG)
            break label418;
          locald1.YH = (locale.x + locale.size + 1);
          locald1.YJ = (locale.y + locale.size);
        }
        while (true)
        {
          localArrayList2.add(locald1);
          break;
          locald2 = (c.d)localArrayList3.remove(localArrayList3.size() - 1);
          break label215;
          label360: if (locale.YG)
          {
            locald2.YI = (locale.x - 1);
            locald2.YK = locale.y;
            break label263;
          }
          locald2.YI = locale.x;
          locald2.YK = (locale.y - 1);
          break label263;
          label418: locald1.YH = (locale.x + locale.size);
          locald1.YJ = (locale.y + locale.size + 1);
          continue;
          label455: locald1.YH = (locale.x + locale.size);
          locald1.YJ = (locale.y + locale.size);
        }
      }
      localArrayList3.add(locald1);
    }
    Collections.sort(localArrayList1, Yw);
    return new c.b(parama, localArrayList1, arrayOfInt1, arrayOfInt2, paramBoolean);
  }

  private static c.e a(c.a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt5)
  {
    int i = paramInt2 - paramInt1;
    int j = paramInt4 - paramInt3;
    if ((paramInt2 - paramInt1 <= 0) || (paramInt4 - paramInt3 <= 0))
    {
      parama = null;
      return parama;
    }
    int k = i - j;
    int m = (i + j + 1) / 2;
    Arrays.fill(paramArrayOfInt1, paramInt5 - m - 1, paramInt5 + m + 1, 0);
    Arrays.fill(paramArrayOfInt2, paramInt5 - m - 1 + k, paramInt5 + m + 1 + k, i);
    if (k % 2 != 0)
      paramInt4 = 1;
    label644: for (int n = 0; ; n++)
    {
      if (n > m)
        break label650;
      boolean bool;
      int i2;
      for (int i1 = -n; ; i1 += 2)
      {
        if (i1 > n)
          break label373;
        if ((i1 == -n) || ((i1 != n) && (paramArrayOfInt1[(paramInt5 + i1 - 1)] < paramArrayOfInt1[(paramInt5 + i1 + 1)])))
          paramInt2 = paramArrayOfInt1[(paramInt5 + i1 + 1)];
        for (bool = false; ; bool = true)
        {
          for (i2 = paramInt2 - i1; (paramInt2 < i) && (i2 < j) && (parama.J(paramInt1 + paramInt2, paramInt3 + i2)); i2++)
            paramInt2++;
          paramInt4 = 0;
          break;
          paramInt2 = paramArrayOfInt1[(paramInt5 + i1 - 1)] + 1;
        }
        paramArrayOfInt1[(paramInt5 + i1)] = paramInt2;
        if ((paramInt4 != 0) && (i1 >= k - n + 1) && (i1 <= k + n - 1) && (paramArrayOfInt1[(paramInt5 + i1)] >= paramArrayOfInt2[(paramInt5 + i1)]))
        {
          parama = new c.e();
          parama.x = paramArrayOfInt2[(paramInt5 + i1)];
          parama.y = (parama.x - i1);
          parama.size = (paramArrayOfInt1[(paramInt5 + i1)] - paramArrayOfInt2[(paramInt5 + i1)]);
          parama.YG = bool;
          parama.YL = false;
          break;
        }
      }
      label373: for (i1 = -n; ; i1 += 2)
      {
        if (i1 > n)
          break label644;
        int i3 = i1 + k;
        if ((i3 == n + k) || ((i3 != -n + k) && (paramArrayOfInt2[(paramInt5 + i3 - 1)] < paramArrayOfInt2[(paramInt5 + i3 + 1)])))
          paramInt2 = paramArrayOfInt2[(paramInt5 + i3 - 1)];
        for (bool = false; ; bool = true)
        {
          int i4 = paramInt2 - i3;
          i2 = paramInt2;
          for (paramInt2 = i4; (i2 > 0) && (paramInt2 > 0) && (parama.J(paramInt1 + i2 - 1, paramInt3 + paramInt2 - 1)); paramInt2--)
            i2--;
          paramInt2 = paramArrayOfInt2[(paramInt5 + i3 + 1)] - 1;
        }
        paramArrayOfInt2[(paramInt5 + i3)] = i2;
        if ((paramInt4 == 0) && (i1 + k >= -n) && (i1 + k <= n) && (paramArrayOfInt1[(paramInt5 + i3)] >= paramArrayOfInt2[(paramInt5 + i3)]))
        {
          parama = new c.e();
          parama.x = paramArrayOfInt2[(paramInt5 + i3)];
          parama.y = (parama.x - i3);
          parama.size = (paramArrayOfInt1[(paramInt5 + i3)] - paramArrayOfInt2[(paramInt5 + i3)]);
          parama.YG = bool;
          parama.YL = true;
          break;
        }
      }
    }
    label650: throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.h.c
 * JD-Core Version:    0.6.2
 */