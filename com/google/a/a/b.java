package com.google.a.a;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class b
{
  private final byte[] buffer;
  final int limit;
  int position;

  b(byte[] paramArrayOfByte, int paramInt)
  {
    this.buffer = paramArrayOfByte;
    this.position = 0;
    this.limit = (paramInt + 0);
  }

  private void av(long paramLong)
  {
    while (true)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        fu((int)paramLong);
        return;
      }
      fu((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }

  private static int aw(long paramLong)
  {
    int i;
    if ((0xFFFFFF80 & paramLong) == 0L)
      i = 1;
    while (true)
    {
      return i;
      if ((0xFFFFC000 & paramLong) == 0L)
        i = 2;
      else if ((0xFFE00000 & paramLong) == 0L)
        i = 3;
      else if ((0xF0000000 & paramLong) == 0L)
        i = 4;
      else if ((0x0 & paramLong) == 0L)
        i = 5;
      else if ((0x0 & paramLong) == 0L)
        i = 6;
      else if ((0x0 & paramLong) == 0L)
        i = 7;
      else if ((0x0 & paramLong) == 0L)
        i = 8;
      else if ((0x0 & paramLong) == 0L)
        i = 9;
      else
        i = 10;
    }
  }

  public static int b(int paramInt, e parame)
  {
    paramInt = fv(paramInt);
    int i = parame.vq();
    return paramInt + (i + fx(i));
  }

  public static int bf(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      int i = fx(paramString.length);
      int j = paramString.length;
      return j + i;
    }
    catch (UnsupportedEncodingException paramString)
    {
    }
    throw new RuntimeException("UTF-8 not supported.");
  }

  public static int bs(int paramInt1, int paramInt2)
  {
    return fv(paramInt1) + ft(paramInt2);
  }

  public static int bt(int paramInt1, int paramInt2)
  {
    return fv(paramInt1) + fx(paramInt2);
  }

  private void bu(int paramInt1, int paramInt2)
  {
    fw(g.bv(paramInt1, paramInt2));
  }

  public static int c(int paramInt, byte[] paramArrayOfByte)
  {
    return fv(paramInt) + (fx(paramArrayOfByte.length) + paramArrayOfByte.length);
  }

  public static int f(int paramInt, String paramString)
  {
    return fv(paramInt) + bf(paramString);
  }

  public static int ft(int paramInt)
  {
    if (paramInt >= 0);
    for (paramInt = fx(paramInt); ; paramInt = 10)
      return paramInt;
  }

  private void fu(int paramInt)
  {
    int i = (byte)paramInt;
    if (this.position == this.limit)
      throw new a(this.position, this.limit);
    byte[] arrayOfByte = this.buffer;
    paramInt = this.position;
    this.position = (paramInt + 1);
    arrayOfByte[paramInt] = ((byte)i);
  }

  private static int fv(int paramInt)
  {
    return fx(g.bv(paramInt, 0));
  }

  private void fw(int paramInt)
  {
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        fu(paramInt);
        return;
      }
      fu(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }

  public static int fx(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0)
      paramInt = 1;
    while (true)
    {
      return paramInt;
      if ((paramInt & 0xFFFFC000) == 0)
        paramInt = 2;
      else if ((0xFFE00000 & paramInt) == 0)
        paramInt = 3;
      else if ((0xF0000000 & paramInt) == 0)
        paramInt = 4;
      else
        paramInt = 5;
    }
  }

  public static int n(int paramInt, long paramLong)
  {
    return fv(paramInt) + aw(paramLong);
  }

  public static int o(int paramInt, long paramLong)
  {
    return fv(paramInt) + aw(paramLong);
  }

  private void q(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.limit - this.position >= paramInt)
    {
      System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, paramInt);
      this.position += paramInt;
      return;
    }
    throw new a(this.position, this.limit);
  }

  public final void a(int paramInt, e parame)
  {
    bu(paramInt, 2);
    fw(parame.vp());
    parame.a(this);
  }

  public final void b(int paramInt, byte[] paramArrayOfByte)
  {
    bu(paramInt, 2);
    fw(paramArrayOfByte.length);
    q(paramArrayOfByte, paramArrayOfByte.length);
  }

  public final void bq(int paramInt1, int paramInt2)
  {
    bu(paramInt1, 0);
    if (paramInt2 >= 0)
      fw(paramInt2);
    while (true)
    {
      return;
      av(paramInt2);
    }
  }

  public final void br(int paramInt1, int paramInt2)
  {
    bu(paramInt1, 0);
    fw(paramInt2);
  }

  public final void e(int paramInt, String paramString)
  {
    bu(paramInt, 2);
    paramString = paramString.getBytes("UTF-8");
    fw(paramString.length);
    q(paramString, paramString.length);
  }

  public final void l(int paramInt, long paramLong)
  {
    bu(paramInt, 0);
    av(paramLong);
  }

  public final void m(int paramInt, long paramLong)
  {
    bu(paramInt, 0);
    av(paramLong);
  }

  public static final class a extends IOException
  {
    a(int paramInt1, int paramInt2)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.a.a.b
 * JD-Core Version:    0.6.2
 */