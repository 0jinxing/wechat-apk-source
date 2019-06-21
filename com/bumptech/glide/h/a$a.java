package com.bumptech.glide.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

final class a$a extends InputStream
{
  private int aHV = -1;
  private final ByteBuffer byteBuffer;

  a$a(ByteBuffer paramByteBuffer)
  {
    this.byteBuffer = paramByteBuffer;
  }

  public final int available()
  {
    AppMethodBeat.i(92542);
    int i = this.byteBuffer.remaining();
    AppMethodBeat.o(92542);
    return i;
  }

  public final void mark(int paramInt)
  {
    try
    {
      AppMethodBeat.i(92544);
      this.aHV = this.byteBuffer.position();
      AppMethodBeat.o(92544);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean markSupported()
  {
    return true;
  }

  public final int read()
  {
    AppMethodBeat.i(92543);
    int i;
    if (!this.byteBuffer.hasRemaining())
    {
      i = -1;
      AppMethodBeat.o(92543);
    }
    while (true)
    {
      return i;
      i = this.byteBuffer.get();
      AppMethodBeat.o(92543);
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92545);
    if (!this.byteBuffer.hasRemaining())
    {
      paramInt1 = -1;
      AppMethodBeat.o(92545);
    }
    while (true)
    {
      return paramInt1;
      paramInt2 = Math.min(paramInt2, available());
      this.byteBuffer.get(paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(92545);
      paramInt1 = paramInt2;
    }
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(92546);
      if (this.aHV == -1)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("Cannot reset to unset mark position");
        AppMethodBeat.o(92546);
        throw localIOException;
      }
    }
    finally
    {
    }
    this.byteBuffer.position(this.aHV);
    AppMethodBeat.o(92546);
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(92547);
    if (!this.byteBuffer.hasRemaining())
    {
      paramLong = -1L;
      AppMethodBeat.o(92547);
    }
    while (true)
    {
      return paramLong;
      paramLong = Math.min(paramLong, available());
      this.byteBuffer.position((int)(this.byteBuffer.position() + paramLong));
      AppMethodBeat.o(92547);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.a.a
 * JD-Core Version:    0.6.2
 */