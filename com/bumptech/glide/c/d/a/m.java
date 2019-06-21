package com.bumptech.glide.c.d.a;

import com.bumptech.glide.c.b.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class m extends FilterInputStream
{
  private final b azx;
  private volatile byte[] buf;
  private int count;
  private int marklimit;
  private int markpos;
  private int pos;

  public m(InputStream paramInputStream, b paramb)
  {
    this(paramInputStream, paramb, (byte)0);
  }

  private m(InputStream paramInputStream, b paramb, byte paramByte)
  {
    super(paramInputStream);
    AppMethodBeat.i(92248);
    this.markpos = -1;
    this.azx = paramb;
    this.buf = ((byte[])paramb.a(65536, [B.class));
    AppMethodBeat.o(92248);
  }

  private int a(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(92253);
    if ((this.markpos == -1) || (this.pos - this.markpos >= this.marklimit))
    {
      i = paramInputStream.read(paramArrayOfByte);
      if (i > 0)
      {
        this.markpos = -1;
        this.pos = 0;
        this.count = i;
      }
      AppMethodBeat.o(92253);
      return i;
    }
    int j;
    byte[] arrayOfByte;
    if ((this.markpos == 0) && (this.marklimit > paramArrayOfByte.length) && (this.count == paramArrayOfByte.length))
    {
      j = paramArrayOfByte.length * 2;
      i = j;
      if (j > this.marklimit)
        i = this.marklimit;
      arrayOfByte = (byte[])this.azx.a(i, [B.class);
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
      this.buf = arrayOfByte;
      this.azx.put(paramArrayOfByte);
      label152: this.pos -= this.markpos;
      this.markpos = 0;
      this.count = 0;
      j = paramInputStream.read(arrayOfByte, this.pos, arrayOfByte.length - this.pos);
      if (j > 0)
        break label254;
    }
    label254: for (int i = this.pos; ; i = this.pos + j)
    {
      this.count = i;
      AppMethodBeat.o(92253);
      i = j;
      break;
      arrayOfByte = paramArrayOfByte;
      if (this.markpos <= 0)
        break label152;
      System.arraycopy(paramArrayOfByte, this.markpos, paramArrayOfByte, 0, paramArrayOfByte.length - this.markpos);
      arrayOfByte = paramArrayOfByte;
      break label152;
    }
  }

  private static IOException nv()
  {
    AppMethodBeat.i(92250);
    IOException localIOException = new IOException("BufferedInputStream is closed");
    AppMethodBeat.o(92250);
    throw localIOException;
  }

  public final int available()
  {
    try
    {
      AppMethodBeat.i(92249);
      Object localObject1 = this.in;
      if ((this.buf == null) || (localObject1 == null))
      {
        localObject1 = nv();
        AppMethodBeat.o(92249);
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
    }
    int i = this.count;
    int j = this.pos;
    int k = localObject2.available();
    AppMethodBeat.o(92249);
    return k + (i - j);
  }

  public final void close()
  {
    AppMethodBeat.i(92252);
    if (this.buf != null)
    {
      this.azx.put(this.buf);
      this.buf = null;
    }
    InputStream localInputStream = this.in;
    this.in = null;
    if (localInputStream != null)
      localInputStream.close();
    AppMethodBeat.o(92252);
  }

  public final void mark(int paramInt)
  {
    try
    {
      AppMethodBeat.i(92254);
      this.marklimit = Math.max(this.marklimit, paramInt);
      this.markpos = this.pos;
      AppMethodBeat.o(92254);
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

  public final void nw()
  {
    try
    {
      this.marklimit = this.buf.length;
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
    int i = -1;
    byte[] arrayOfByte;
    try
    {
      AppMethodBeat.i(92255);
      arrayOfByte = this.buf;
      Object localObject1 = this.in;
      if ((arrayOfByte == null) || (localObject1 == null))
      {
        localObject1 = nv();
        AppMethodBeat.o(92255);
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
    }
    if ((this.pos >= this.count) && (a(localInputStream, arrayOfByte) == -1))
      AppMethodBeat.o(92255);
    while (true)
    {
      return i;
      Object localObject2 = arrayOfByte;
      if (arrayOfByte != this.buf)
      {
        arrayOfByte = this.buf;
        localObject2 = arrayOfByte;
        if (arrayOfByte == null)
        {
          localObject2 = nv();
          AppMethodBeat.o(92255);
          throw ((Throwable)localObject2);
        }
      }
      if (this.count - this.pos > 0)
      {
        i = this.pos;
        this.pos = (i + 1);
        i = localObject2[i] & 0xFF;
        AppMethodBeat.o(92255);
      }
      else
      {
        AppMethodBeat.o(92255);
      }
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject1;
    try
    {
      AppMethodBeat.i(92256);
      localObject1 = this.buf;
      if (localObject1 == null)
      {
        paramArrayOfByte = nv();
        AppMethodBeat.o(92256);
        throw paramArrayOfByte;
      }
    }
    finally
    {
    }
    if (paramInt2 == 0)
    {
      paramInt2 = 0;
      AppMethodBeat.o(92256);
      return paramInt2;
    }
    InputStream localInputStream = this.in;
    if (localInputStream == null)
    {
      paramArrayOfByte = nv();
      AppMethodBeat.o(92256);
      throw paramArrayOfByte;
    }
    int i;
    if (this.pos < this.count)
    {
      if (this.count - this.pos >= paramInt2);
      for (i = paramInt2; ; i = this.count - this.pos)
      {
        System.arraycopy(localObject1, this.pos, paramArrayOfByte, paramInt1, i);
        this.pos += i;
        if ((i != paramInt2) && (localInputStream.available() != 0))
          break label161;
        AppMethodBeat.o(92256);
        paramInt2 = i;
        break;
      }
      label161: paramInt1 += i;
      i = paramInt2 - i;
    }
    while (true)
    {
      if ((this.markpos == -1) && (i >= localObject1.length))
      {
        int j = localInputStream.read(paramArrayOfByte, paramInt1, i);
        k = j;
        localObject2 = localObject1;
        if (j != -1)
          break label370;
        if (i == paramInt2)
        {
          AppMethodBeat.o(92256);
          paramInt2 = -1;
          break;
          i = paramInt2;
          continue;
        }
        paramInt2 -= i;
        AppMethodBeat.o(92256);
        break;
      }
      if (a(localInputStream, (byte[])localObject1) == -1)
      {
        if (i == paramInt2)
        {
          AppMethodBeat.o(92256);
          paramInt2 = -1;
          break;
        }
        paramInt2 -= i;
        AppMethodBeat.o(92256);
        break;
      }
      Object localObject2 = localObject1;
      if (localObject1 != this.buf)
      {
        localObject1 = this.buf;
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          paramArrayOfByte = nv();
          AppMethodBeat.o(92256);
          throw paramArrayOfByte;
        }
      }
      if (this.count - this.pos >= i);
      for (int k = i; ; k = this.count - this.pos)
      {
        System.arraycopy(localObject2, this.pos, paramArrayOfByte, paramInt1, k);
        this.pos += k;
        label370: i -= k;
        if (i != 0)
          break label404;
        AppMethodBeat.o(92256);
        break;
      }
      label404: if (localInputStream.available() == 0)
      {
        paramInt2 -= i;
        AppMethodBeat.o(92256);
        break;
      }
      paramInt1 += k;
      localObject1 = localObject2;
    }
  }

  public final void release()
  {
    try
    {
      AppMethodBeat.i(92251);
      if (this.buf != null)
      {
        this.azx.put(this.buf);
        this.buf = null;
      }
      AppMethodBeat.o(92251);
      return;
    }
    finally
    {
    }
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(92257);
      if (this.buf == null)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("Stream is closed");
        AppMethodBeat.o(92257);
        throw localIOException;
      }
    }
    finally
    {
    }
    if (-1 == this.markpos)
    {
      m.a locala = new com/bumptech/glide/c/d/a/m$a;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("Mark has been invalidated, pos: ");
      locala.<init>(this.pos + " markLimit: " + this.marklimit);
      AppMethodBeat.o(92257);
      throw locala;
    }
    this.pos = this.markpos;
    AppMethodBeat.o(92257);
  }

  public final long skip(long paramLong)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(92258);
        if (paramLong < 1L)
        {
          paramLong = 0L;
          AppMethodBeat.o(92258);
          return paramLong;
        }
        Object localObject1 = this.buf;
        if (localObject1 == null)
        {
          localObject1 = nv();
          AppMethodBeat.o(92258);
          throw ((Throwable)localObject1);
        }
      }
      finally
      {
      }
      InputStream localInputStream = this.in;
      IOException localIOException;
      if (localInputStream == null)
      {
        localIOException = nv();
        AppMethodBeat.o(92258);
        throw localIOException;
      }
      if (this.count - this.pos >= paramLong)
      {
        this.pos = ((int)(this.pos + paramLong));
        AppMethodBeat.o(92258);
      }
      else
      {
        long l = this.count - this.pos;
        this.pos = this.count;
        if ((this.markpos != -1) && (paramLong <= this.marklimit))
        {
          if (a(localInputStream, localIOException) == -1)
          {
            AppMethodBeat.o(92258);
            paramLong = l;
          }
          else if (this.count - this.pos >= paramLong - l)
          {
            this.pos = ((int)(this.pos + paramLong - l));
            AppMethodBeat.o(92258);
          }
          else
          {
            paramLong = l + this.count - this.pos;
            this.pos = this.count;
            AppMethodBeat.o(92258);
          }
        }
        else
        {
          paramLong = l + localInputStream.skip(paramLong - l);
          AppMethodBeat.o(92258);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.m
 * JD-Core Version:    0.6.2
 */