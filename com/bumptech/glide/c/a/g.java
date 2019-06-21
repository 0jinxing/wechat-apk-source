package com.bumptech.glide.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream
{
  private static final byte[] azm = { -1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0 };
  private static final int azn = 29;
  private static final int azo = 31;
  private final byte azp;
  private int position;

  public g(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream);
    AppMethodBeat.i(91710);
    if ((paramInt < -1) || (paramInt > 8))
    {
      paramInputStream = new IllegalArgumentException("Cannot add invalid orientation: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(91710);
      throw paramInputStream;
    }
    this.azp = ((byte)(byte)paramInt);
    AppMethodBeat.o(91710);
  }

  public final void mark(int paramInt)
  {
    AppMethodBeat.i(91711);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(91711);
    throw localUnsupportedOperationException;
  }

  public final boolean markSupported()
  {
    return false;
  }

  public final int read()
  {
    AppMethodBeat.i(91712);
    int i;
    if ((this.position < 2) || (this.position > azo))
      i = super.read();
    while (true)
    {
      if (i != -1)
        this.position += 1;
      AppMethodBeat.o(91712);
      return i;
      if (this.position == azo)
        i = this.azp;
      else
        i = azm[(this.position - 2)] & 0xFF;
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91713);
    if (this.position > azo)
      paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    while (true)
    {
      if (paramInt1 > 0)
        this.position += paramInt1;
      AppMethodBeat.o(91713);
      return paramInt1;
      if (this.position == azo)
      {
        paramArrayOfByte[paramInt1] = ((byte)this.azp);
        paramInt1 = 1;
      }
      else if (this.position < 2)
      {
        paramInt1 = super.read(paramArrayOfByte, paramInt1, 2 - this.position);
      }
      else
      {
        paramInt2 = Math.min(azo - this.position, paramInt2);
        System.arraycopy(azm, this.position - 2, paramArrayOfByte, paramInt1, paramInt2);
        paramInt1 = paramInt2;
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(91715);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(91715);
    throw localUnsupportedOperationException;
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(91714);
    paramLong = super.skip(paramLong);
    if (paramLong > 0L)
      this.position = ((int)(this.position + paramLong));
    AppMethodBeat.o(91714);
    return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.g
 * JD-Core Version:    0.6.2
 */