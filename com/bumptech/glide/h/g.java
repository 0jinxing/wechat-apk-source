package com.bumptech.glide.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream
{
  private int aIc = -2147483648;

  public g(InputStream paramInputStream)
  {
    super(paramInputStream);
  }

  private long r(long paramLong)
  {
    long l;
    if (this.aIc == 0)
      l = -1L;
    while (true)
    {
      return l;
      l = paramLong;
      if (this.aIc != -2147483648)
      {
        l = paramLong;
        if (paramLong > this.aIc)
          l = this.aIc;
      }
    }
  }

  private void s(long paramLong)
  {
    if ((this.aIc != -2147483648) && (paramLong != -1L))
      this.aIc = ((int)(this.aIc - paramLong));
  }

  public final int available()
  {
    AppMethodBeat.i(92591);
    int i;
    if (this.aIc == -2147483648)
    {
      i = super.available();
      AppMethodBeat.o(92591);
    }
    while (true)
    {
      return i;
      i = Math.min(this.aIc, super.available());
      AppMethodBeat.o(92591);
    }
  }

  public final void mark(int paramInt)
  {
    try
    {
      AppMethodBeat.i(92586);
      super.mark(paramInt);
      this.aIc = paramInt;
      AppMethodBeat.o(92586);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int read()
  {
    AppMethodBeat.i(92587);
    int i;
    if (r(1L) == -1L)
    {
      i = -1;
      AppMethodBeat.o(92587);
    }
    while (true)
    {
      return i;
      i = super.read();
      s(1L);
      AppMethodBeat.o(92587);
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(92588);
    paramInt2 = (int)r(paramInt2);
    if (paramInt2 == -1)
    {
      AppMethodBeat.o(92588);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
      s(paramInt1);
      AppMethodBeat.o(92588);
    }
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(92589);
      super.reset();
      this.aIc = -2147483648;
      AppMethodBeat.o(92589);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(92590);
    paramLong = r(paramLong);
    if (paramLong == -1L)
    {
      paramLong = 0L;
      AppMethodBeat.o(92590);
    }
    while (true)
    {
      return paramLong;
      paramLong = super.skip(paramLong);
      s(paramLong);
      AppMethodBeat.o(92590);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.g
 * JD-Core Version:    0.6.2
 */