package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k
  implements Cloneable
{
  long value;

  public k(long paramLong)
  {
    this.value = paramLong;
  }

  public k(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, (byte)0);
  }

  private k(byte[] paramArrayOfByte, byte paramByte)
  {
    AppMethodBeat.i(125705);
    this.value = (paramArrayOfByte[3] << 24 & 0xFF000000);
    this.value += (paramArrayOfByte[2] << 16 & 0xFF0000);
    this.value += (paramArrayOfByte[1] << 8 & 0xFF00);
    this.value += (paramArrayOfByte[0] & 0xFF);
    AppMethodBeat.o(125705);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null)
    {
      if ((paramObject instanceof k))
        break label19;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label19: bool2 = bool1;
      if (this.value == ((k)paramObject).value)
        bool2 = true;
    }
  }

  public final byte[] getBytes()
  {
    return new byte[] { (byte)(int)(this.value & 0xFF), (byte)(int)((this.value & 0xFF00) >> 8), (byte)(int)((this.value & 0xFF0000) >> 16), (byte)(int)((this.value & 0xFF000000) >> 24) };
  }

  public final int hashCode()
  {
    return (int)this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.k
 * JD-Core Version:    0.6.2
 */