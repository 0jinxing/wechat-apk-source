package com.tencent.tinker.d.a;

import java.nio.ByteOrder;

public final class c extends b
{
  private final ByteOrder AFn;
  private final byte[] buffer;
  private final int byteCount;
  private final int offset;
  private int position;

  private c(byte[] paramArrayOfByte, int paramInt, ByteOrder paramByteOrder)
  {
    this.buffer = paramArrayOfByte;
    this.offset = 0;
    this.byteCount = paramInt;
    this.AFn = paramByteOrder;
  }

  public static b a(byte[] paramArrayOfByte, int paramInt, ByteOrder paramByteOrder)
  {
    return new c(paramArrayOfByte, paramInt, paramByteOrder);
  }

  public final void dSu()
  {
    this.position += 4;
  }

  public final int readInt()
  {
    byte[] arrayOfByte = this.buffer;
    int i = this.offset + this.position;
    int j;
    int k;
    int m;
    if (this.AFn == ByteOrder.BIG_ENDIAN)
    {
      j = i + 1;
      k = arrayOfByte[i];
      i = j + 1;
      j = arrayOfByte[j];
      m = arrayOfByte[i];
    }
    for (i = (arrayOfByte[(i + 1)] & 0xFF) << 0 | ((k & 0xFF) << 24 | (j & 0xFF) << 16 | (m & 0xFF) << 8); ; i = (arrayOfByte[(k + 1)] & 0xFF) << 24 | ((i & 0xFF) << 0 | (m & 0xFF) << 8 | (j & 0xFF) << 16))
    {
      this.position += 4;
      return i;
      j = i + 1;
      i = arrayOfByte[i];
      k = j + 1;
      m = arrayOfByte[j];
      j = arrayOfByte[k];
    }
  }

  public final short readShort()
  {
    byte[] arrayOfByte = this.buffer;
    int i = this.offset + this.position;
    int j;
    if (this.AFn == ByteOrder.BIG_ENDIAN)
    {
      j = arrayOfByte[i];
      i = (short)(arrayOfByte[(i + 1)] & 0xFF | j << 8);
    }
    for (int k = i; ; k = i)
    {
      this.position += 2;
      return k;
      j = arrayOfByte[(i + 1)];
      i = (short)(arrayOfByte[i] & 0xFF | j << 8);
    }
  }

  public final void seek(int paramInt)
  {
    this.position = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.d.a.c
 * JD-Core Version:    0.6.2
 */