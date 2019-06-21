package com.tencent.mm.audio.mix.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class o extends f
{
  protected final byte[] D(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137134);
    for (int i = 0; i < paramInt2; i++)
    {
      int j = 0;
      for (int k = 0; k < paramInt1; k++)
        j += this.cmZ[k][i];
      this.cnc[i] = gz(j);
    }
    byte[] arrayOfByte = bM(paramInt3, paramInt2);
    AppMethodBeat.o(137134);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.o
 * JD-Core Version:    0.6.2
 */