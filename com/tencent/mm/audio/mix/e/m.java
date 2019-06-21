package com.tencent.mm.audio.mix.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m extends f
{
  protected final byte[] D(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137132);
    for (int i = 0; i < paramInt2; i++)
    {
      float f1 = 1.0F;
      int j = 0;
      if (j < paramInt1)
      {
        if (j == 0)
          f1 = this.cmZ[j][i];
        while (true)
        {
          j++;
          break;
          float f2 = this.cmZ[j][i];
          if ((f1 < 0.0F) && (f2 < 0.0F))
            f1 = f1 + f2 - f1 * f2 / this.MIN_VALUE;
          else if ((f1 > 0.0F) && (f2 > 0.0F))
            f1 = f1 + f2 - f1 * f2 / this.MAX_VALUE;
          else
            f1 += f2;
        }
      }
      j = (int)f1;
      this.cnc[i] = gz(j);
    }
    byte[] arrayOfByte = bM(paramInt3, paramInt2);
    AppMethodBeat.o(137132);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.m
 * JD-Core Version:    0.6.2
 */