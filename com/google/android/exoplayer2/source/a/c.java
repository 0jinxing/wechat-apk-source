package com.google.android.exoplayer2.source.a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.f;
import com.google.android.exoplayer2.h.i;
import com.google.android.exoplayer2.i.v;
import java.util.Arrays;

public abstract class c extends a
{
  private volatile boolean bhf;
  public byte[] data;
  private int limit;

  public c(f paramf, i parami, Format paramFormat, int paramInt, Object paramObject, byte[] paramArrayOfByte)
  {
    super(paramf, parami, 3, paramFormat, paramInt, paramObject, -9223372036854775807L, -9223372036854775807L);
    this.data = paramArrayOfByte;
  }

  protected abstract void f(byte[] paramArrayOfByte, int paramInt);

  public final void se()
  {
    this.bhf = true;
  }

  public final boolean sf()
  {
    return this.bhf;
  }

  public final void sg()
  {
    int i = 0;
    while (true)
    {
      try
      {
        this.aSF.a(this.bib);
        this.limit = 0;
        if ((i == -1) || (this.bhf))
          break;
        if (this.data == null)
        {
          this.data = new byte[16384];
          int j = this.aSF.read(this.data, this.limit, 16384);
          i = j;
          if (j == -1)
            continue;
          this.limit += j;
          i = j;
          continue;
        }
      }
      finally
      {
        v.a(this.aSF);
      }
      if (this.data.length < this.limit + 16384)
        this.data = Arrays.copyOf(this.data, this.data.length + 16384);
    }
    if (!this.bhf)
      f(this.data, this.limit);
    v.a(this.aSF);
  }

  public final long ss()
  {
    return this.limit;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.a.c
 * JD-Core Version:    0.6.2
 */