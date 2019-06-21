package com.tencent.mars.zstd;

import java.io.Closeable;

public class ZstdDictDecompress
  implements Closeable
{
  private long nativePtr = 0L;

  public ZstdDictDecompress(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public ZstdDictDecompress(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte.length < 0)
      throw new IllegalArgumentException("Dictionary buffer is to short");
    init(paramArrayOfByte, paramInt1, paramInt2);
    if (this.nativePtr == 0L)
      throw new IllegalStateException("ZSTD_createDDict failed");
  }

  private native void free();

  private native void init(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public void close()
  {
    free();
    this.nativePtr = 0L;
  }

  protected void finalize()
  {
    close();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mars.zstd.ZstdDictDecompress
 * JD-Core Version:    0.6.2
 */