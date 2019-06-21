package com.bumptech.glide.c.a;

import com.bumptech.glide.c.b.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;

public final class c extends OutputStream
{
  private b awk;
  private byte[] buffer;
  private int index;
  private final OutputStream out;

  public c(OutputStream paramOutputStream, b paramb)
  {
    this(paramOutputStream, paramb, (byte)0);
  }

  private c(OutputStream paramOutputStream, b paramb, byte paramByte)
  {
    AppMethodBeat.i(91696);
    this.out = paramOutputStream;
    this.awk = paramb;
    this.buffer = ((byte[])paramb.a(65536, [B.class));
    AppMethodBeat.o(91696);
  }

  private void flushBuffer()
  {
    AppMethodBeat.i(91701);
    if (this.index > 0)
    {
      this.out.write(this.buffer, 0, this.index);
      this.index = 0;
    }
    AppMethodBeat.o(91701);
  }

  private void mi()
  {
    AppMethodBeat.i(91702);
    if (this.index == this.buffer.length)
      flushBuffer();
    AppMethodBeat.o(91702);
  }

  public final void close()
  {
    AppMethodBeat.i(91703);
    try
    {
      flush();
      this.out.close();
      if (this.buffer != null)
      {
        this.awk.put(this.buffer);
        this.buffer = null;
      }
      AppMethodBeat.o(91703);
      return;
    }
    finally
    {
      this.out.close();
      AppMethodBeat.o(91703);
    }
  }

  public final void flush()
  {
    AppMethodBeat.i(91700);
    flushBuffer();
    this.out.flush();
    AppMethodBeat.o(91700);
  }

  public final void write(int paramInt)
  {
    AppMethodBeat.i(91697);
    byte[] arrayOfByte = this.buffer;
    int i = this.index;
    this.index = (i + 1);
    arrayOfByte[i] = ((byte)(byte)paramInt);
    mi();
    AppMethodBeat.o(91697);
  }

  public final void write(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(91698);
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
    AppMethodBeat.o(91698);
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91699);
    int i = 0;
    int j = paramInt2 - i;
    int k = paramInt1 + i;
    if ((this.index == 0) && (j >= this.buffer.length))
    {
      this.out.write(paramArrayOfByte, k, j);
      AppMethodBeat.o(91699);
    }
    while (true)
    {
      return;
      j = Math.min(j, this.buffer.length - this.index);
      System.arraycopy(paramArrayOfByte, k, this.buffer, this.index, j);
      this.index += j;
      k = i + j;
      mi();
      i = k;
      if (k < paramInt2)
        break;
      AppMethodBeat.o(91699);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.c
 * JD-Core Version:    0.6.2
 */