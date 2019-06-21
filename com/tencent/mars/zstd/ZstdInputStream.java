package com.tencent.mars.zstd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZstdInputStream extends FilterInputStream
{
  private static final int srcBuffSize = (int)recommendedDInSize();
  private byte[] dict = null;
  private long dstPos = 0L;
  private ZstdDictDecompress fastDict = null;
  private boolean frameFinished = true;
  private boolean isClosed = false;
  private boolean isContinuous = false;
  private byte[] src = null;
  private long srcPos = 0L;
  private long srcSize = 0L;
  private long stream;

  public ZstdInputStream(InputStream paramInputStream)
  {
    super(paramInputStream);
    if (this.src == null)
      throw new IOException("Error allocating the input buffer of size " + srcBuffSize);
    this.stream = createDStream();
  }

  private static native long createDStream();

  private native int decompressStream(long paramLong, byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2);

  private static native int freeDStream(long paramLong);

  private native int initDStream(long paramLong);

  private native int initDStreamWithDict(long paramLong, byte[] paramArrayOfByte, int paramInt);

  private native int initDStreamWithFastDict(long paramLong, ZstdDictDecompress paramZstdDictDecompress);

  private static native long recommendedDInSize();

  private static native long recommendedDOutSize();

  public int available()
  {
    if (this.isClosed)
      throw new IOException("Stream closed");
    if (this.srcSize - this.srcPos > 0L);
    for (int i = (int)(this.srcSize - this.srcPos); ; i = this.in.available())
      return i;
  }

  public void close()
  {
    if (this.isClosed);
    while (true)
    {
      return;
      freeDStream(this.stream);
      this.in.close();
      this.isClosed = true;
    }
  }

  protected void finalize()
  {
    close();
  }

  public boolean getContinuous()
  {
    return this.isContinuous;
  }

  public boolean markSupported()
  {
    return false;
  }

  public int read()
  {
    byte[] arrayOfByte = new byte[1];
    int i = read(arrayOfByte, 0, 1);
    int j = i;
    if (i > 0)
      j = arrayOfByte[0] & 0xFF;
    return j;
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.isClosed)
      throw new IOException("Stream closed");
    if (this.frameFinished)
    {
      if (this.fastDict != null)
        i = initDStreamWithFastDict(this.stream, this.fastDict);
      while (Zstd.isError(i))
      {
        throw new IOException("Decompression error: " + Zstd.getErrorName(i));
        if (this.dict != null)
          i = initDStreamWithDict(this.stream, this.dict, this.dict.length);
        else
          i = initDStream(this.stream);
      }
    }
    if ((paramInt1 < 0) || (paramInt2 > paramArrayOfByte.length - paramInt1))
      throw new IndexOutOfBoundsException("Requested lenght " + paramInt2 + " from offset " + paramInt1 + " in buffer of size " + paramArrayOfByte.length);
    int j = paramInt1 + paramInt2;
    this.dstPos = paramInt1;
    int i = paramInt2;
    if (this.dstPos < j)
    {
      if (this.srcSize - this.srcPos != 0L)
        break label306;
      this.srcSize = this.in.read(this.src, 0, srcBuffSize);
      this.srcPos = 0L;
      if (this.srcSize >= 0L)
        break label301;
      this.srcSize = 0L;
      if (!this.frameFinished)
        break label271;
      i = -1;
    }
    while (true)
    {
      return i;
      label271: if (this.isContinuous)
      {
        i = (int)(this.dstPos - paramInt1);
      }
      else
      {
        throw new IOException("Read error or truncated source");
        label301: this.frameFinished = false;
        label306: i = decompressStream(this.stream, paramArrayOfByte, j, this.src, (int)this.srcSize);
        if (Zstd.isError(i))
          throw new IOException("Decompression error: " + Zstd.getErrorName(i));
        if (i != 0)
          break;
        this.frameFinished = true;
        i = (int)(this.dstPos - paramInt1);
      }
    }
  }

  public ZstdInputStream setContinuous(boolean paramBoolean)
  {
    this.isContinuous = paramBoolean;
    return this;
  }

  public ZstdInputStream setDict(ZstdDictDecompress paramZstdDictDecompress)
  {
    if (!this.frameFinished)
      throw new IOException("Change of parameter on initialized stream");
    this.fastDict = paramZstdDictDecompress;
    this.dict = null;
    return this;
  }

  public ZstdInputStream setDict(byte[] paramArrayOfByte)
  {
    if (!this.frameFinished)
      throw new IOException("Change of parameter on initialized stream");
    this.dict = paramArrayOfByte;
    this.fastDict = null;
    return this;
  }

  public long skip(long paramLong)
  {
    long l = 0L;
    if (this.isClosed)
      throw new IOException("Stream closed");
    if (paramLong <= 0L);
    for (paramLong = l; ; paramLong -= l)
    {
      return paramLong;
      int i = (int)Math.min(recommendedDOutSize(), paramLong);
      byte[] arrayOfByte = new byte[i];
      int j;
      for (l = paramLong; l > 0L; l -= j)
      {
        j = read(arrayOfByte, 0, (int)Math.min(i, l));
        if (j < 0)
          break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.zstd.ZstdInputStream
 * JD-Core Version:    0.6.2
 */