package com.tencent.mm.audio.mix.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends f
{
  protected final byte[] D(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137086);
    for (int i = 0; i < paramInt2; i++)
    {
      int j = 1;
      int k = 0;
      if (k < paramInt1)
      {
        if (k == 0);
        for (j = this.cmZ[k][i]; ; j = (int)((j + this.cmZ[k][i]) / Math.sqrt(2.0D)))
        {
          k++;
          break;
        }
      }
      this.cnc[i] = gz(j);
    }
    byte[] arrayOfByte = bM(paramInt3, paramInt2);
    AppMethodBeat.o(137086);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.b
 * JD-Core Version:    0.6.2
 */