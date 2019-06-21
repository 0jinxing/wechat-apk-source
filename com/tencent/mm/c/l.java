package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class l
  implements Cloneable
{
  public int value;

  public l(int paramInt)
  {
    this.value = paramInt;
  }

  public l(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, (byte)0);
  }

  private l(byte[] paramArrayOfByte, byte paramByte)
  {
    AppMethodBeat.i(125698);
    this.value = (paramArrayOfByte[1] << 8 & 0xFF00);
    this.value += (paramArrayOfByte[0] & 0xFF);
    AppMethodBeat.o(125698);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null)
    {
      if ((paramObject instanceof l))
        break label19;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label19: bool2 = bool1;
      if (this.value == ((l)paramObject).value)
        bool2 = true;
    }
  }

  public final byte[] getBytes()
  {
    return new byte[] { (byte)(this.value & 0xFF), (byte)((this.value & 0xFF00) >> 8) };
  }

  public final int hashCode()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.l
 * JD-Core Version:    0.6.2
 */