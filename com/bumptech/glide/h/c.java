package com.bumptech.glide.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream
{
  private final long aHW;
  private int aHX;

  private c(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    this.aHW = paramLong;
  }

  public static InputStream b(InputStream paramInputStream, long paramLong)
  {
    AppMethodBeat.i(92559);
    paramInputStream = new c(paramInputStream, paramLong);
    AppMethodBeat.o(92559);
    return paramInputStream;
  }

  private int dl(int paramInt)
  {
    AppMethodBeat.i(92564);
    if (paramInt >= 0)
      this.aHX += paramInt;
    while (this.aHW - this.aHX <= 0L)
    {
      AppMethodBeat.o(92564);
      return paramInt;
    }
    IOException localIOException = new IOException("Failed to read all expected data, expected: " + this.aHW + ", but read: " + this.aHX);
    AppMethodBeat.o(92564);
    throw localIOException;
  }

  public final int available()
  {
    try
    {
      AppMethodBeat.i(92560);
      int i = (int)Math.max(this.aHW - this.aHX, this.in.available());
      AppMethodBeat.o(92560);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int read()
  {
    try
    {
      AppMethodBeat.i(92561);
      int i = super.read();
      if (i >= 0);
      for (int j = 1; ; j = -1)
      {
        dl(j);
        AppMethodBeat.o(92561);
        return i;
      }
    }
    finally
    {
    }
  }

  public final int read(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(92562);
    int i = read(paramArrayOfByte, 0, paramArrayOfByte.length);
    AppMethodBeat.o(92562);
    return i;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(92563);
      paramInt1 = dl(super.read(paramArrayOfByte, paramInt1, paramInt2));
      AppMethodBeat.o(92563);
      return paramInt1;
    }
    finally
    {
      paramArrayOfByte = finally;
    }
    throw paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.c
 * JD-Core Version:    0.6.2
 */