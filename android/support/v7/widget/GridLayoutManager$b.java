package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class GridLayoutManager$b
{
  final SparseIntArray ald = new SparseIntArray();
  private boolean ale = false;

  public int aa(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = bU(paramInt1);
    if (j == paramInt2)
    {
      paramInt1 = i;
      return paramInt1;
    }
    int k;
    int m;
    int n;
    if ((this.ale) && (this.ald.size() > 0))
    {
      k = this.ald.size() - 1;
      m = 0;
      while (m <= k)
      {
        n = m + k >>> 1;
        if (this.ald.keyAt(n) < paramInt1)
          m = n + 1;
        else
          k = n - 1;
      }
      m--;
      if ((m >= 0) && (m < this.ald.size()))
      {
        m = this.ald.keyAt(m);
        if (m < 0)
          break label241;
        k = this.ald.get(m) + bU(m);
        n = m + 1;
        m = k;
        k = n;
      }
    }
    while (true)
    {
      label165: if (k < paramInt1)
      {
        int i1 = bU(k);
        n = m + i1;
        if (n == paramInt2)
          m = 0;
        while (true)
        {
          k++;
          break label165;
          m = -1;
          break;
          m = i1;
          if (n <= paramInt2)
            m = n;
        }
      }
      paramInt1 = i;
      if (m + j > paramInt2)
        break;
      paramInt1 = m;
      break;
      label241: k = 0;
      m = 0;
    }
  }

  final int ab(int paramInt1, int paramInt2)
  {
    int i;
    if (!this.ale)
      i = aa(paramInt1, paramInt2);
    while (true)
    {
      return i;
      int j = this.ald.get(paramInt1, -1);
      i = j;
      if (j == -1)
      {
        i = aa(paramInt1, paramInt2);
        this.ald.put(paramInt1, i);
      }
    }
  }

  public final int ac(int paramInt1, int paramInt2)
  {
    int i = bU(paramInt1);
    int j = 0;
    int k = 0;
    int m = 0;
    int n;
    if (j < paramInt1)
    {
      n = bU(j);
      m += n;
      if (m == paramInt2)
      {
        m = k + 1;
        k = 0;
      }
    }
    while (true)
    {
      j++;
      n = k;
      k = m;
      m = n;
      break;
      if (m > paramInt2)
      {
        m = k + 1;
        k = n;
        continue;
        paramInt1 = k;
        if (m + i > paramInt2)
          paramInt1 = k + 1;
        return paramInt1;
      }
      else
      {
        n = m;
        m = k;
        k = n;
      }
    }
  }

  public abstract int bU(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayoutManager.b
 * JD-Core Version:    0.6.2
 */