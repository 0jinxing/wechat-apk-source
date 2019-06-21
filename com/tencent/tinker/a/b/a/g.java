package com.tencent.tinker.a.b.a;

import java.io.EOFException;

public final class g extends a
{
  final short[] Azg;

  public g(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null)
      throw new NullPointerException("array == null");
    this.Azg = paramArrayOfShort;
  }

  public final int read()
  {
    try
    {
      int i = this.Azg[this.akp];
      dSc();
      return i & 0xFFFF;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
    }
    throw new EOFException();
  }

  public final int readInt()
  {
    return read() | read() << 16;
  }

  public final long readLong()
  {
    return read() | read() << 16 | read() << 32 | read() << 48;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.b.a.g
 * JD-Core Version:    0.6.2
 */