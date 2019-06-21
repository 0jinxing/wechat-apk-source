package com.tencent.mm.audio.mix.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j extends f
{
  private float cnh = 1.0F;
  private boolean cni = true;

  protected final byte[] D(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137128);
    this.cni = true;
    int i = 0;
    if (i < paramInt2)
    {
      int j = 0;
      for (int k = 0; k < paramInt1; k++)
        j += this.cmZ[k][i];
      boolean bool = this.cni;
      while (true)
      {
        k = (int)(this.cnh * j);
        if (k > this.MAX_VALUE)
        {
          this.cnh = (this.MAX_VALUE / j);
          if (this.cnh < 1.0F)
            this.cnh -= (1.0F - this.cnh) / 16.0F;
          bool = false;
          j = k;
        }
        else
        {
          if (k >= this.MIN_VALUE)
            break;
          this.cnh = (this.MIN_VALUE / j);
          if (this.cnh < 1.0F)
            this.cnh -= (1.0F - this.cnh) / 16.0F;
          bool = false;
          j = k;
        }
      }
      if ((bool) && (j < this.MAX_VALUE) && (j > this.MIN_VALUE))
        if (this.cnh >= 1.0F)
          break label274;
      label274: for (this.cnh += (1.0F - this.cnh) / 16.0F; ; this.cnh = 1.0F)
      {
        this.cni = false;
        if (i == paramInt2 / 2)
          this.cni = true;
        this.cnc[i] = gz(k);
        i++;
        break;
      }
    }
    byte[] arrayOfByte = bM(paramInt3, paramInt2);
    AppMethodBeat.o(137128);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.j
 * JD-Core Version:    0.6.2
 */