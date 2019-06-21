package com.tencent.mm.audio.mix.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n extends f
{
  protected final byte[] D(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137133);
    for (int i = 0; i < paramInt2; i++)
    {
      int j = 0;
      int k = 0;
      while (j < paramInt1)
      {
        k += this.cmZ[j][i];
        j++;
      }
      this.cnc[i] = ((short)(short)(k / paramInt1));
    }
    byte[] arrayOfByte = bM(paramInt3, paramInt2);
    AppMethodBeat.o(137133);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.n
 * JD-Core Version:    0.6.2
 */