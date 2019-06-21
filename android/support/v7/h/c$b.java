package android.support.v7.h;

import android.support.v7.widget.RecyclerView.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class c$b
{
  private final c.a YA;
  private final int YB;
  private final int YC;
  private final boolean YD;
  private final List<c.e> Yx;
  private final int[] Yy;
  private final int[] Yz;

  c$b(c.a parama, List<c.e> paramList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean)
  {
    this.Yx = paramList;
    this.Yy = paramArrayOfInt1;
    this.Yz = paramArrayOfInt2;
    Arrays.fill(this.Yy, 0);
    Arrays.fill(this.Yz, 0);
    this.YA = parama;
    this.YB = parama.fV();
    this.YC = parama.fW();
    this.YD = paramBoolean;
    if (this.Yx.isEmpty());
    for (parama = null; ; parama = (c.e)this.Yx.get(0))
    {
      if ((parama == null) || (parama.x != 0) || (parama.y != 0))
      {
        parama = new c.e();
        parama.x = 0;
        parama.y = 0;
        parama.YG = false;
        parama.size = 0;
        parama.YL = false;
        this.Yx.add(0, parama);
      }
      fX();
      return;
    }
  }

  private void a(List<c.c> paramList, d paramd, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.YD)
      paramd.G(paramInt1, paramInt2);
    do
    {
      return;
      paramInt2--;
    }
    while (paramInt2 < 0);
    int i = this.Yz[(paramInt3 + paramInt2)] & 0x1F;
    Iterator localIterator;
    switch (i)
    {
    default:
      throw new IllegalStateException("unknown flag for pos " + (paramInt2 + paramInt3) + " " + Long.toBinaryString(i));
    case 0:
      paramd.G(paramInt1, 1);
      localIterator = paramList.iterator();
    case 4:
    case 8:
      while (localIterator.hasNext())
      {
        c.c localc = (c.c)localIterator.next();
        localc.YF += 1;
        continue;
        int j = this.Yz[(paramInt3 + paramInt2)] >> 5;
        paramd.I(b(paramList, j, true).YF, paramInt1);
        if (i == 4)
          paramd.a(paramInt1, 1, this.YA.L(j, paramInt3 + paramInt2));
      }
    case 16:
    }
    while (true)
    {
      paramInt2--;
      break;
      paramList.add(new c.c(paramInt3 + paramInt2, paramInt1, false));
    }
  }

  private static c.c b(List<c.c> paramList, int paramInt, boolean paramBoolean)
  {
    for (int i = paramList.size() - 1; i >= 0; i--)
    {
      c.c localc1 = (c.c)paramList.get(i);
      if ((localc1.YE == paramInt) && (localc1.YG == paramBoolean))
      {
        paramList.remove(i);
        paramInt = i;
        localc2 = localc1;
        if (paramInt >= paramList.size())
          break label121;
        localc2 = (c.c)paramList.get(paramInt);
        int j = localc2.YF;
        if (paramBoolean);
        for (i = 1; ; i = -1)
        {
          localc2.YF = (i + j);
          paramInt++;
          break;
        }
      }
    }
    c.c localc2 = null;
    label121: return localc2;
  }

  private void b(List<c.c> paramList, d paramd, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.YD)
      paramd.H(paramInt1, paramInt2);
    do
    {
      return;
      paramInt2--;
    }
    while (paramInt2 < 0);
    int i = this.Yy[(paramInt3 + paramInt2)] & 0x1F;
    Iterator localIterator;
    switch (i)
    {
    default:
      throw new IllegalStateException("unknown flag for pos " + (paramInt2 + paramInt3) + " " + Long.toBinaryString(i));
    case 0:
      paramd.H(paramInt1 + paramInt2, 1);
      localIterator = paramList.iterator();
    case 4:
    case 8:
      while (localIterator.hasNext())
      {
        c.c localc = (c.c)localIterator.next();
        localc.YF -= 1;
        continue;
        int j = this.Yy[(paramInt3 + paramInt2)] >> 5;
        localc = b(paramList, j, false);
        paramd.I(paramInt1 + paramInt2, localc.YF - 1);
        if (i == 4)
          paramd.a(localc.YF - 1, 1, this.YA.L(paramInt3 + paramInt2, j));
      }
    case 16:
    }
    while (true)
    {
      paramInt2--;
      break;
      paramList.add(new c.c(paramInt3 + paramInt2, paramInt1 + paramInt2, true));
    }
  }

  private boolean b(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = 8;
    int j;
    int k;
    int m;
    c.e locale;
    int i2;
    if (paramBoolean)
    {
      j = paramInt2 - 1;
      k = paramInt1;
      m = paramInt2 - 1;
      paramInt2 = j;
      if (paramInt3 < 0)
        break label279;
      locale = (c.e)this.Yx.get(paramInt3);
      int n = locale.x;
      int i1 = locale.size;
      j = locale.y;
      i2 = locale.size;
      if (!paramBoolean)
        break label175;
      paramInt2 = k - 1;
      label82: if (paramInt2 < n + i1)
        break label260;
      if (!this.YA.J(paramInt2, m))
        break label169;
      if (!this.YA.K(paramInt2, m))
        break label164;
      paramInt1 = 8;
      label120: this.Yz[m] = (paramInt2 << 5 | 0x10);
      this.Yy[paramInt2] = (paramInt1 | m << 5);
      paramBoolean = true;
    }
    while (true)
    {
      return paramBoolean;
      m = paramInt1 - 1;
      k = paramInt1 - 1;
      break;
      label164: paramInt1 = 4;
      break label120;
      label169: paramInt2--;
      break label82;
      label175: paramInt2--;
      while (true)
      {
        if (paramInt2 < j + i2)
          break label260;
        if (this.YA.J(m, paramInt2))
        {
          if (this.YA.K(m, paramInt2));
          for (paramInt3 = i; ; paramInt3 = 4)
          {
            this.Yy[(paramInt1 - 1)] = (paramInt2 << 5 | 0x10);
            this.Yz[paramInt2] = (paramInt3 | paramInt1 - 1 << 5);
            paramBoolean = true;
            break;
          }
        }
        paramInt2--;
      }
      label260: k = locale.x;
      paramInt2 = locale.y;
      paramInt3--;
      break;
      label279: paramBoolean = false;
    }
  }

  private void fX()
  {
    int i = this.YB;
    int j = this.YC;
    for (int k = this.Yx.size() - 1; k >= 0; k--)
    {
      c.e locale = (c.e)this.Yx.get(k);
      int m = locale.x;
      int n = locale.size;
      int i1 = locale.y;
      int i2 = locale.size;
      int i3;
      if (this.YD)
      {
        while (true)
        {
          i3 = j;
          if (i <= m + n)
            break;
          if (this.Yy[(i - 1)] == 0)
            b(i, j, k, false);
          i--;
        }
        while (i3 > i1 + i2)
        {
          if (this.Yz[(i3 - 1)] == 0)
            b(i, i3, k, true);
          i3--;
        }
      }
      j = 0;
      if (j < locale.size)
      {
        i3 = locale.x + j;
        i2 = locale.y + j;
        if (this.YA.K(i3, i2));
        for (i = 1; ; i = 2)
        {
          this.Yy[i3] = (i2 << 5 | i);
          this.Yz[i2] = (i | i3 << 5);
          j++;
          break;
        }
      }
      i = locale.x;
      j = locale.y;
    }
  }

  public final void a(d paramd)
  {
    ArrayList localArrayList;
    int i;
    int j;
    if ((paramd instanceof b))
    {
      paramd = (b)paramd;
      localArrayList = new ArrayList();
      i = this.YB;
      j = this.YC;
    }
    for (int k = this.Yx.size() - 1; ; k--)
    {
      if (k < 0)
        break label238;
      c.e locale = (c.e)this.Yx.get(k);
      int m = locale.size;
      int n = locale.x + m;
      int i1 = locale.y + m;
      if (n < i)
        b(localArrayList, paramd, n, i - n, n);
      if (i1 < j)
        a(localArrayList, paramd, n, j - i1, i1);
      j = m - 1;
      while (true)
        if (j >= 0)
        {
          if ((this.Yy[(locale.x + j)] & 0x1F) == 2)
            paramd.a(locale.x + j, 1, this.YA.L(locale.x + j, locale.y + j));
          j--;
          continue;
          paramd = new b(paramd);
          break;
        }
      i = locale.x;
      j = locale.y;
    }
    label238: paramd.fU();
  }

  public final void a(RecyclerView.a parama)
  {
    a(new a(parama));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.h.c.b
 * JD-Core Version:    0.6.2
 */