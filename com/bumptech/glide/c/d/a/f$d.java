package com.bumptech.glide.c.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

final class f$d
  implements f.c
{
  private final InputStream aEZ;

  f$d(InputStream paramInputStream)
  {
    this.aEZ = paramInputStream;
  }

  public final int nn()
  {
    AppMethodBeat.i(92203);
    int i = this.aEZ.read();
    int j = this.aEZ.read();
    AppMethodBeat.o(92203);
    return i << 8 & 0xFF00 | j & 0xFF;
  }

  public final short no()
  {
    AppMethodBeat.i(92204);
    short s = (short)(this.aEZ.read() & 0xFF);
    AppMethodBeat.o(92204);
    return s;
  }

  public final int np()
  {
    AppMethodBeat.i(92207);
    int i = this.aEZ.read();
    AppMethodBeat.o(92207);
    return i;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(92206);
    int i = paramInt;
    while (i > 0)
    {
      int j = this.aEZ.read(paramArrayOfByte, paramInt - i, i);
      if (j == -1)
        break;
      i -= j;
    }
    AppMethodBeat.o(92206);
    return paramInt - i;
  }

  public final long skip(long paramLong)
  {
    long l1 = 0L;
    AppMethodBeat.i(92205);
    if (paramLong < 0L)
    {
      AppMethodBeat.o(92205);
      paramLong = l1;
    }
    while (true)
    {
      return paramLong;
      l1 = paramLong;
      while (l1 > 0L)
      {
        long l2 = this.aEZ.skip(l1);
        if (l2 > 0L)
        {
          l1 -= l2;
        }
        else
        {
          if (this.aEZ.read() == -1)
            break;
          l1 -= 1L;
        }
      }
      paramLong -= l1;
      AppMethodBeat.o(92205);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.f.d
 * JD-Core Version:    0.6.2
 */