package com.tencent.mm.plugin.downloader.d;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class k
{
  private static int F(ByteBuffer paramByteBuffer)
  {
    int i = -1;
    I(paramByteBuffer);
    int j = paramByteBuffer.capacity();
    int k;
    if (j < 22)
    {
      k = i;
      return k;
    }
    int m = Math.min(j - 22, 65535);
    for (int n = 0; ; n++)
    {
      k = i;
      if (n >= m)
        break;
      k = j - 22 - n;
      if ((paramByteBuffer.getInt(k) == 101010256) && (f(paramByteBuffer, k + 20) == n))
        break;
    }
  }

  public static long G(ByteBuffer paramByteBuffer)
  {
    I(paramByteBuffer);
    return g(paramByteBuffer, paramByteBuffer.position() + 16);
  }

  public static long H(ByteBuffer paramByteBuffer)
  {
    I(paramByteBuffer);
    return g(paramByteBuffer, paramByteBuffer.position() + 12);
  }

  private static void I(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.order() != ByteOrder.LITTLE_ENDIAN)
      throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
  }

  private static Pair<ByteBuffer, Long> a(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    Object localObject = null;
    if ((paramInt < 0) || (paramInt > 65535))
      throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(paramInt)));
    long l = paramRandomAccessFile.length();
    if (l < 22L)
      paramRandomAccessFile = localObject;
    while (true)
    {
      return paramRandomAccessFile;
      ByteBuffer localByteBuffer = ByteBuffer.allocate((int)Math.min(paramInt, l - 22L) + 22);
      localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      l -= localByteBuffer.capacity();
      paramRandomAccessFile.seek(l);
      paramRandomAccessFile.readFully(localByteBuffer.array(), localByteBuffer.arrayOffset(), localByteBuffer.capacity());
      paramInt = F(localByteBuffer);
      paramRandomAccessFile = localObject;
      if (paramInt != -1)
      {
        localByteBuffer.position(paramInt);
        paramRandomAccessFile = localByteBuffer.slice();
        paramRandomAccessFile.order(ByteOrder.LITTLE_ENDIAN);
        paramRandomAccessFile = Pair.create(paramRandomAccessFile, Long.valueOf(l + paramInt));
      }
    }
  }

  private static void b(ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    if ((paramLong < 0L) || (paramLong > 4294967295L))
      throw new IllegalArgumentException("uint32 value of out range: ".concat(String.valueOf(paramLong)));
    paramByteBuffer.putInt(paramByteBuffer.position() + paramInt, (int)paramLong);
  }

  public static void c(ByteBuffer paramByteBuffer, long paramLong)
  {
    I(paramByteBuffer);
    b(paramByteBuffer, paramByteBuffer.position() + 16, paramLong);
  }

  public static final boolean c(RandomAccessFile paramRandomAccessFile, long paramLong)
  {
    boolean bool = false;
    paramLong -= 20L;
    if (paramLong < 0L);
    while (true)
    {
      return bool;
      paramRandomAccessFile.seek(paramLong);
      if (paramRandomAccessFile.readInt() == 1347094023)
        bool = true;
    }
  }

  public static int f(ByteBuffer paramByteBuffer, int paramInt)
  {
    return paramByteBuffer.getShort(paramInt) & 0xFFFF;
  }

  static Pair<ByteBuffer, Long> f(RandomAccessFile paramRandomAccessFile)
  {
    Object localObject;
    if (paramRandomAccessFile.length() < 22L)
      localObject = null;
    while (true)
    {
      return localObject;
      Pair localPair = a(paramRandomAccessFile, 0);
      localObject = localPair;
      if (localPair == null)
        localObject = a(paramRandomAccessFile, 65535);
    }
  }

  private static long g(ByteBuffer paramByteBuffer, int paramInt)
  {
    return paramByteBuffer.getInt(paramInt) & 0xFFFFFFFF;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.k
 * JD-Core Version:    0.6.2
 */