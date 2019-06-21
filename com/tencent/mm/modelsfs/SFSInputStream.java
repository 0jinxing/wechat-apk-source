package com.tencent.mm.modelsfs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;

public class SFSInputStream extends InputStream
{
  private long aMp = 0L;
  private long mNativePtr;

  public SFSInputStream(long paramLong)
  {
    this.mNativePtr = paramLong;
  }

  private static native int nativeClose(long paramLong);

  private static native int nativeRead(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  private static native long nativeSeek(long paramLong1, long paramLong2, int paramInt);

  private static native long nativeSize(long paramLong);

  public int available()
  {
    AppMethodBeat.i(93255);
    IOException localIOException;
    if (this.mNativePtr == 0L)
    {
      localIOException = new IOException("Stream already closed.");
      AppMethodBeat.o(93255);
      throw localIOException;
    }
    long l1 = nativeSize(this.mNativePtr);
    if (l1 < 0L)
    {
      localIOException = new IOException(SFSContext.nativeErrorMessage());
      AppMethodBeat.o(93255);
      throw localIOException;
    }
    long l2 = nativeSeek(this.mNativePtr, 0L, 1);
    if (l2 < 0L)
    {
      localIOException = new IOException(SFSContext.nativeErrorMessage());
      AppMethodBeat.o(93255);
      throw localIOException;
    }
    int i = (int)(l1 - l2);
    AppMethodBeat.o(93255);
    return i;
  }

  public void close()
  {
    AppMethodBeat.i(93256);
    if (this.mNativePtr == 0L)
      AppMethodBeat.o(93256);
    while (true)
    {
      return;
      if (nativeClose(this.mNativePtr) == -1)
      {
        IOException localIOException = new IOException(SFSContext.nativeErrorMessage());
        AppMethodBeat.o(93256);
        throw localIOException;
      }
      this.mNativePtr = 0L;
      AppMethodBeat.o(93256);
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(93262);
    if (this.mNativePtr != 0L)
      close();
    super.finalize();
    AppMethodBeat.o(93262);
  }

  public void mark(int paramInt)
  {
    AppMethodBeat.i(93257);
    if (this.mNativePtr == 0L)
      AppMethodBeat.o(93257);
    while (true)
    {
      return;
      this.aMp = nativeSeek(this.mNativePtr, 0L, 1);
      AppMethodBeat.o(93257);
    }
  }

  public boolean markSupported()
  {
    return true;
  }

  public int read()
  {
    int i = -1;
    AppMethodBeat.i(93259);
    if (this.mNativePtr == 0L)
    {
      localObject = new IOException("Stream already closed.");
      AppMethodBeat.o(93259);
      throw ((Throwable)localObject);
    }
    Object localObject = new byte[1];
    int j;
    do
      j = nativeRead(this.mNativePtr, (byte[])localObject, 0, 1);
    while (j == 0);
    if (j == -1)
      AppMethodBeat.o(93259);
    while (true)
    {
      return i;
      i = localObject[0];
      AppMethodBeat.o(93259);
    }
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(93260);
    if (this.mNativePtr == 0L)
    {
      paramArrayOfByte = new IOException("Stream already closed.");
      AppMethodBeat.o(93260);
      throw paramArrayOfByte;
    }
    if (((paramInt1 | paramInt2) < 0) || (paramInt1 > paramArrayOfByte.length) || (paramArrayOfByte.length - paramInt1 < paramInt2))
    {
      paramArrayOfByte = new ArrayIndexOutOfBoundsException("length = " + paramArrayOfByte.length + ", offset = " + paramInt1 + ", count = " + paramInt2);
      AppMethodBeat.o(93260);
      throw paramArrayOfByte;
    }
    paramInt1 = nativeRead(this.mNativePtr, paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 == 0)
    {
      AppMethodBeat.o(93260);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      if (paramInt1 == -1)
      {
        paramArrayOfByte = new IOException(SFSContext.nativeErrorMessage());
        AppMethodBeat.o(93260);
        throw paramArrayOfByte;
      }
      AppMethodBeat.o(93260);
    }
  }

  public void reset()
  {
    AppMethodBeat.i(93258);
    IOException localIOException;
    if (this.mNativePtr == 0L)
    {
      localIOException = new IOException("Stream already closed.");
      AppMethodBeat.o(93258);
      throw localIOException;
    }
    if (this.aMp < 0L)
    {
      localIOException = new IOException("Previous call to mark() failed.");
      AppMethodBeat.o(93258);
      throw localIOException;
    }
    if (nativeSeek(this.mNativePtr, this.aMp, 0) != this.aMp)
    {
      localIOException = new IOException("Seeking to previous position failed.");
      AppMethodBeat.o(93258);
      throw localIOException;
    }
    AppMethodBeat.o(93258);
  }

  public long skip(long paramLong)
  {
    AppMethodBeat.i(93261);
    IOException localIOException;
    if (this.mNativePtr == 0L)
    {
      localIOException = new IOException("Stream already closed.");
      AppMethodBeat.o(93261);
      throw localIOException;
    }
    if (paramLong < 0L)
    {
      localIOException = new IOException("byteCount < 0: ".concat(String.valueOf(paramLong)));
      AppMethodBeat.o(93261);
      throw localIOException;
    }
    long l = nativeSeek(this.mNativePtr, 0L, 1);
    paramLong = nativeSeek(this.mNativePtr, paramLong, 1);
    if ((l == -1L) || (paramLong == -1L))
    {
      localIOException = new IOException(SFSContext.nativeErrorMessage());
      AppMethodBeat.o(93261);
      throw localIOException;
    }
    AppMethodBeat.o(93261);
    return paramLong - l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.SFSInputStream
 * JD-Core Version:    0.6.2
 */