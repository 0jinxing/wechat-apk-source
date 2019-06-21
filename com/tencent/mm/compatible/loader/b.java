package com.tencent.mm.compatible.loader;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b<E>
{
  static final Object Li;
  boolean Lj;
  long[] Lk;
  Object[] Ll;
  int mSize;

  static
  {
    AppMethodBeat.i(51925);
    Li = new Object();
    AppMethodBeat.o(51925);
  }

  static int b(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    int i = paramInt + 0;
    int j = -1;
    while (i - j > 1)
    {
      int k = (i + j) / 2;
      if (paramArrayOfLong[k] < paramLong)
        j = k;
      else
        i = k;
    }
    if (i == paramInt + 0)
      paramInt = paramInt + 0 ^ 0xFFFFFFFF;
    while (true)
    {
      return paramInt;
      paramInt = i;
      if (paramArrayOfLong[i] != paramLong)
        paramInt = i ^ 0xFFFFFFFF;
    }
  }

  public final void put(long paramLong, E paramE)
  {
    AppMethodBeat.i(51924);
    int i = b(this.Lk, this.mSize, paramLong);
    if (i >= 0)
    {
      this.Ll[i] = paramE;
      AppMethodBeat.o(51924);
    }
    while (true)
    {
      return;
      int j = i ^ 0xFFFFFFFF;
      if ((j < this.mSize) && (this.Ll[j] == Li))
      {
        this.Lk[j] = paramLong;
        this.Ll[j] = paramE;
        AppMethodBeat.o(51924);
      }
      else
      {
        i = j;
        Object localObject1;
        Object localObject2;
        if (this.Lj)
        {
          i = j;
          if (this.mSize >= this.Lk.length)
          {
            int k = this.mSize;
            long[] arrayOfLong = this.Lk;
            localObject1 = this.Ll;
            i = 0;
            int m;
            for (j = 0; i < k; j = m)
            {
              localObject2 = localObject1[i];
              m = j;
              if (localObject2 != Li)
              {
                if (i != j)
                {
                  arrayOfLong[j] = arrayOfLong[i];
                  localObject1[j] = localObject2;
                }
                m = j + 1;
              }
              i++;
            }
            this.Lj = false;
            this.mSize = j;
            i = b(this.Lk, this.mSize, paramLong) ^ 0xFFFFFFFF;
          }
        }
        if (this.mSize >= this.Lk.length)
        {
          j = a.idealIntArraySize(this.mSize + 1);
          localObject1 = new long[j];
          localObject2 = new Object[j];
          System.arraycopy(this.Lk, 0, localObject1, 0, this.Lk.length);
          System.arraycopy(this.Ll, 0, localObject2, 0, this.Ll.length);
          this.Lk = ((long[])localObject1);
          this.Ll = ((Object[])localObject2);
        }
        if (this.mSize - i != 0)
        {
          localObject2 = this.Lk;
          System.arraycopy(localObject2, i, localObject2, i + 1, this.mSize - i);
          localObject2 = this.Ll;
          System.arraycopy(localObject2, i, localObject2, i + 1, this.mSize - i);
        }
        this.Lk[i] = paramLong;
        this.Ll[i] = paramE;
        this.mSize += 1;
        AppMethodBeat.o(51924);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.b
 * JD-Core Version:    0.6.2
 */