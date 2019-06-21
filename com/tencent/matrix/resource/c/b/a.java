package com.tencent.matrix.resource.c.b;

import com.tencent.matrix.resource.c.a.b;
import com.tencent.matrix.resource.c.a.c;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class a
{
  public static b a(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    a(paramInputStream, arrayOfByte, paramInt);
    return new b(arrayOfByte);
  }

  public static Object a(InputStream paramInputStream, c paramc, int paramInt)
  {
    switch (1.bXO[paramc.ordinal()])
    {
    default:
      paramInputStream = null;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      return paramInputStream;
      paramInputStream = a(paramInputStream, paramInt);
      continue;
      if (paramInputStream.read() != 0);
      for (boolean bool = true; ; bool = false)
      {
        paramInputStream = Boolean.valueOf(bool);
        break;
      }
      paramInputStream = Character.valueOf((char)l(paramInputStream));
      continue;
      paramInputStream = Float.valueOf(Float.intBitsToFloat(m(paramInputStream)));
      continue;
      paramInputStream = Double.valueOf(Double.longBitsToDouble(n(paramInputStream)));
      continue;
      paramInputStream = Byte.valueOf((byte)paramInputStream.read());
      continue;
      paramInputStream = Short.valueOf(l(paramInputStream));
      continue;
      paramInputStream = Integer.valueOf(m(paramInputStream));
      continue;
      paramInputStream = Long.valueOf(n(paramInputStream));
    }
  }

  public static void a(InputStream paramInputStream, byte[] paramArrayOfByte, long paramLong)
  {
    int i = 0;
    while (i < paramLong)
    {
      int j = paramInputStream.read(paramArrayOfByte, i, (int)(paramLong - i));
      if (j < 0)
        throw new EOFException();
      i += j;
    }
  }

  public static void a(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt >>> 8 & 0xFF);
    paramOutputStream.write(paramInt & 0xFF);
  }

  public static void a(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write(new byte[] { (byte)(int)(paramLong >>> 56), (byte)(int)(paramLong >>> 48), (byte)(int)(paramLong >>> 40), (byte)(int)(paramLong >>> 32), (byte)(int)(paramLong >>> 24), (byte)(int)(paramLong >>> 16), (byte)(int)(paramLong >>> 8), (byte)(int)paramLong }, 0, 8);
  }

  public static void a(OutputStream paramOutputStream, b paramb)
  {
    paramOutputStream.write(paramb.bXC);
  }

  public static int b(InputStream paramInputStream, c paramc, int paramInt)
  {
    paramInt = paramc.getSize(paramInt);
    d(paramInputStream, paramInt);
    return paramInt;
  }

  public static void b(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt >>> 24 & 0xFF);
    paramOutputStream.write(paramInt >>> 16 & 0xFF);
    paramOutputStream.write(paramInt >>> 8 & 0xFF);
    paramOutputStream.write(paramInt & 0xFF);
  }

  public static void b(OutputStream paramOutputStream, long paramLong)
  {
    byte[] arrayOfByte = new byte[4096];
    for (int i = 0; i < paramLong >> 12; i++)
      paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(arrayOfByte, 0, (int)(0xFFF & paramLong));
  }

  public static String c(InputStream paramInputStream, long paramLong)
  {
    byte[] arrayOfByte = new byte[(int)paramLong];
    a(paramInputStream, arrayOfByte, paramLong);
    return new String(arrayOfByte, Charset.forName("UTF-8"));
  }

  public static void d(InputStream paramInputStream, long paramLong)
  {
    long l2;
    for (long l1 = 0L; l1 < paramLong; l1 += l2)
    {
      l2 = paramInputStream.skip(paramLong - l1);
      if (l2 < 0L)
        throw new EOFException();
    }
  }

  public static short l(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    int j = paramInputStream.read();
    if ((i | j) < 0)
      throw new EOFException();
    return (short)(i << 8 | j);
  }

  public static int m(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    int j = paramInputStream.read();
    int k = paramInputStream.read();
    int m = paramInputStream.read();
    if ((i | j | k | m) < 0)
      throw new EOFException();
    return (i << 24) + (j << 16) + (k << 8) + m;
  }

  public static long n(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte[8];
    a(paramInputStream, arrayOfByte, 8L);
    long l1 = arrayOfByte[0];
    long l2 = arrayOfByte[1] & 0xFF;
    long l3 = arrayOfByte[2] & 0xFF;
    long l4 = arrayOfByte[3] & 0xFF;
    long l5 = arrayOfByte[4] & 0xFF;
    long l6 = (arrayOfByte[5] & 0xFF) << 16;
    long l7 = (arrayOfByte[6] & 0xFF) << 8;
    return (arrayOfByte[7] & 0xFF) + ((l1 << 56) + (l2 << 48) + (l3 << 40) + (l4 << 32) + (l5 << 24) + l6 + l7);
  }

  public static String o(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = paramInputStream.read(); i != 0; i = paramInputStream.read())
      localStringBuilder.append((char)i);
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.c.b.a
 * JD-Core Version:    0.6.2
 */