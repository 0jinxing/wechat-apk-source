package com.bumptech.glide.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

final class b
  implements Closeable
{
  final Charset axR;
  private byte[] buf;
  int end;
  private final InputStream in;
  private int pos;

  public b(InputStream paramInputStream, Charset paramCharset)
  {
    this(paramInputStream, paramCharset, (byte)0);
  }

  private b(InputStream paramInputStream, Charset paramCharset, byte paramByte)
  {
    AppMethodBeat.i(51807);
    if ((paramInputStream == null) || (paramCharset == null))
    {
      paramInputStream = new NullPointerException();
      AppMethodBeat.o(51807);
      throw paramInputStream;
    }
    if (!paramCharset.equals(c.US_ASCII))
    {
      paramInputStream = new IllegalArgumentException("Unsupported encoding");
      AppMethodBeat.o(51807);
      throw paramInputStream;
    }
    this.in = paramInputStream;
    this.axR = paramCharset;
    this.buf = new byte[8192];
    AppMethodBeat.o(51807);
  }

  private void lS()
  {
    AppMethodBeat.i(51810);
    int i = this.in.read(this.buf, 0, this.buf.length);
    if (i == -1)
    {
      EOFException localEOFException = new EOFException();
      AppMethodBeat.o(51810);
      throw localEOFException;
    }
    this.pos = 0;
    this.end = i;
    AppMethodBeat.o(51810);
  }

  public final void close()
  {
    AppMethodBeat.i(51808);
    synchronized (this.in)
    {
      if (this.buf != null)
      {
        this.buf = null;
        this.in.close();
      }
      AppMethodBeat.o(51808);
      return;
    }
  }

  public final String readLine()
  {
    AppMethodBeat.i(51809);
    synchronized (this.in)
    {
      if (this.buf == null)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("LineReader is closed");
        AppMethodBeat.o(51809);
        throw localIOException;
      }
    }
    if (this.pos >= this.end)
      lS();
    for (int i = this.pos; i != this.end; i++)
      if (this.buf[i] == 10)
      {
        if ((i != this.pos) && (this.buf[(i - 1)] == 13));
        for (int j = i - 1; ; j = i)
        {
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>(this.buf, this.pos, j - this.pos, this.axR.name());
          this.pos = (i + 1);
          AppMethodBeat.o(51809);
          return localObject2;
        }
      }
    Object localObject2 = new com/bumptech/glide/a/b$1;
    ((b.1)localObject2).<init>(this, this.end - this.pos + 80);
    label296: 
    while (true)
    {
      ((ByteArrayOutputStream)localObject2).write(this.buf, this.pos, this.end - this.pos);
      this.end = -1;
      lS();
      for (i = this.pos; ; i++)
      {
        if (i == this.end)
          break label296;
        if (this.buf[i] == 10)
        {
          if (i != this.pos)
            ((ByteArrayOutputStream)localObject2).write(this.buf, this.pos, i - this.pos);
          this.pos = (i + 1);
          localObject2 = ((ByteArrayOutputStream)localObject2).toString();
          AppMethodBeat.o(51809);
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.a.b
 * JD-Core Version:    0.6.2
 */