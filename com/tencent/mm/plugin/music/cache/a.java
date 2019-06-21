package com.tencent.mm.plugin.music.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public int Lp;
  private byte[] buffer;
  public int mSize;
  public com.tencent.mm.plugin.music.g.a.a oKV;
  public d oKW;
  public h oKX;
  public int oKY;
  public int oKZ;

  public a(com.tencent.mm.plugin.music.g.a.a parama)
  {
    AppMethodBeat.i(137398);
    this.buffer = new byte[81920];
    this.Lp = -1;
    this.mSize = 0;
    this.oKY = -1;
    this.oKZ = 0;
    this.oKV = parama;
    AppMethodBeat.o(137398);
  }

  public final boolean bTx()
  {
    int i = 0;
    boolean bool = false;
    while (true)
    {
      d locald;
      int j;
      try
      {
        AppMethodBeat.i(137399);
        if ((this.Lp < 0) || (this.mSize <= 0))
        {
          ab.e("MicroMsg.Music.FileBytesCacheMgr", "flushBufferAll(), mOffset:%d, mSize:%d", new Object[] { Integer.valueOf(this.Lp), Integer.valueOf(this.mSize) });
          AppMethodBeat.o(137399);
          return bool;
        }
        byte[] arrayOfByte = new byte[this.mSize];
        System.arraycopy(this.buffer, 0, arrayOfByte, 0, this.mSize);
        this.oKX.c(arrayOfByte, this.Lp, this.mSize);
        locald = this.oKW;
        j = this.Lp;
        k = this.mSize;
        if ((j < 0) || (k < 0) || (j > locald.gjQ) || (j + k > locald.gjQ))
        {
          ab.i("MicroMsg.Music.IndexBitMgr", "getWriteBuffIndexRange offset %d, size %d, fileLength %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(locald.gjQ) });
          ab.e("MicroMsg.Music.IndexBitMgr", "getWriteBuffRange invalid parameter!");
          arrayOfByte = null;
          if (arrayOfByte != null)
            break label416;
          ab.e("MicroMsg.Music.FileBytesCacheMgr", "flushBufferAll, range is null");
          AppMethodBeat.o(137399);
          continue;
        }
      }
      finally
      {
      }
      int[] arrayOfInt = new int[2];
      arrayOfInt[1] = -1;
      arrayOfInt[0] = -1;
      int m = j + k;
      int n = locald.getIndex(j);
      int i1 = locald.getIndex(m);
      for (int k = n; k <= i1; k++)
        if ((k * 8192 >= j) && ((k + 1) * 8192 <= m))
        {
          if (arrayOfInt[0] == -1)
            arrayOfInt[0] = k;
          if (arrayOfInt[0] > k)
            arrayOfInt[0] = k;
          if (arrayOfInt[1] == -1)
            arrayOfInt[1] = k;
          if (arrayOfInt[1] < k)
            arrayOfInt[1] = k;
        }
      if ((m == locald.gjQ) && (((i1 == 0) && (j == 0)) || ((i1 > 0) && (j <= i1 * 8192))))
      {
        ab.i("MicroMsg.Music.IndexBitMgr", "write to file end!");
        arrayOfInt[0] = n;
        arrayOfInt[1] = i1;
      }
      continue;
      label416: if ((arrayOfInt[0] == -1) || (arrayOfInt[1] == -1))
      {
        ab.d("MicroMsg.Music.FileBytesCacheMgr", "flushBufferAll range[0]:%d, range[1]:%d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]) });
        AppMethodBeat.o(137399);
      }
      else
      {
        for (k = arrayOfInt[0]; k <= arrayOfInt[1]; k++)
          this.oKW.zz(k);
        n = arrayOfInt[0];
        k = i;
        if (n > 0)
        {
          n--;
          k = i;
          if (!this.oKW.zy(n))
          {
            k = i;
            if (this.oKY + this.oKZ == this.Lp)
            {
              k = i;
              if (this.mSize > 0)
              {
                k = i;
                if (this.oKZ >= 8192)
                {
                  ab.i("MicroMsg.Music.FileBytesCacheMgr", "isCanSavePreviousIndex, save index :%d", new Object[] { Integer.valueOf(n) });
                  k = 1;
                }
              }
            }
          }
        }
        if (k != 0)
          this.oKW.zz(arrayOfInt[0] - 1);
        this.oKW.bTE();
        AppMethodBeat.o(137399);
        bool = true;
      }
    }
  }

  public final void d(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(137401);
      paramInt2 -= this.Lp;
      this.mSize = (paramInt2 + paramInt3);
      System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, paramInt2, paramInt3);
      AppMethodBeat.o(137401);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
    }
    throw paramArrayOfByte;
  }

  public final void u(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(137400);
      paramInt1 -= this.Lp;
      this.mSize = (paramInt1 + paramInt2);
      System.arraycopy(paramArrayOfByte, 0, this.buffer, paramInt1, paramInt2);
      AppMethodBeat.o(137400);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
    }
    throw paramArrayOfByte;
  }

  public final boolean zu(int paramInt)
  {
    try
    {
      if (this.Lp <= paramInt)
      {
        int i = this.Lp;
        if (paramInt <= i + 81920)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final boolean zv(int paramInt)
  {
    try
    {
      if (this.Lp <= paramInt)
      {
        int i = this.Lp;
        int j = this.mSize;
        if (paramInt <= i + j)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final void zw(int paramInt)
  {
    try
    {
      this.oKY = this.Lp;
      this.oKZ = this.mSize;
      this.Lp = paramInt;
      this.mSize = 0;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.a
 * JD-Core Version:    0.6.2
 */