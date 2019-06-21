package com.tencent.mm.plugin.wepkg.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b extends InputStream
{
  private long size;
  private a uXU;

  public b(File paramFile, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(63614);
    this.size = paramLong2;
    this.uXU = new a(new FileInputStream(paramFile));
    lX(paramLong1);
    this.uXU.dgF();
    AppMethodBeat.o(63614);
  }

  private long dgG()
  {
    return this.size - this.uXU.count;
  }

  private long lW(long paramLong)
  {
    AppMethodBeat.i(63620);
    paramLong = Math.min(dgG(), paramLong);
    AppMethodBeat.o(63620);
    return paramLong;
  }

  private void lX(long paramLong)
  {
    AppMethodBeat.i(63621);
    long l2;
    for (long l1 = 0L; l1 < paramLong; l1 += l2)
    {
      l2 = this.uXU.skip(paramLong - l1);
      if (l2 <= 0L)
        break;
    }
    if (l1 < paramLong)
    {
      IOException localIOException = new IOException("could not seek pos ".concat(String.valueOf(paramLong)));
      AppMethodBeat.o(63621);
      throw localIOException;
    }
    AppMethodBeat.o(63621);
  }

  public final int available()
  {
    AppMethodBeat.i(63619);
    int i = (int)lW(this.uXU.available());
    AppMethodBeat.o(63619);
    return i;
  }

  public final int read()
  {
    AppMethodBeat.i(63615);
    int i;
    if (dgG() <= 0L)
    {
      i = 1;
      if (i == 0)
        break label34;
      i = -1;
      AppMethodBeat.o(63615);
    }
    while (true)
    {
      return i;
      i = 0;
      break;
      label34: i = this.uXU.read();
      AppMethodBeat.o(63615);
    }
  }

  public final int read(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(63616);
    int i = read(paramArrayOfByte, 0, paramArrayOfByte.length);
    AppMethodBeat.o(63616);
    return i;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(63617);
    long l = lW(paramInt2);
    if ((l == 0L) && (paramInt2 > 0))
    {
      paramInt1 = -1;
      AppMethodBeat.o(63617);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = this.uXU.read(paramArrayOfByte, paramInt1, (int)l);
      AppMethodBeat.o(63617);
    }
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(63618);
    paramLong = this.uXU.skip(lW(paramLong));
    AppMethodBeat.o(63618);
    return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.d.b
 * JD-Core Version:    0.6.2
 */