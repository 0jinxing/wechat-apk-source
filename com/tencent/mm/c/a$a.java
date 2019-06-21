package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
{
  static final long cdd;
  public int cde = 0;

  static
  {
    AppMethodBeat.i(125699);
    cdd = "Micromsg".hashCode();
    AppMethodBeat.o(125699);
  }

  public a$a(int paramInt)
  {
    this.cde = paramInt;
  }

  public static a C(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(125700);
    long l;
    int i;
    if (paramArrayOfByte.length == 8)
    {
      l = 0L;
      i = 0;
      if (i >= paramArrayOfByte.length)
        if (l >> 32 != cdd)
          break label72;
    }
    label72: for (paramArrayOfByte = new a((int)l); ; paramArrayOfByte = null)
    {
      AppMethodBeat.o(125700);
      return paramArrayOfByte;
      l |= (paramArrayOfByte[i] & 0xFF) << i * 8;
      i++;
      break;
    }
  }

  static byte[] aL(long paramLong)
  {
    byte[] arrayOfByte = new byte[8];
    for (int i = 0; ; i++)
    {
      if (i >= 8)
        return arrayOfByte;
      arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> i * 8 & 0xFF));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.a.a
 * JD-Core Version:    0.6.2
 */