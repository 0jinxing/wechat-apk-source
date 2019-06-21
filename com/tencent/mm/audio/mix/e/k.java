package com.tencent.mm.audio.mix.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k extends f
{
  private float A;
  private float B;
  private float cnj;
  private float cnk;
  private float cnl;
  private int cnm;
  private int cnn;

  public k()
  {
    AppMethodBeat.i(137129);
    this.cnj = 128.0F;
    this.cnk = 128.0F;
    this.cnl = 128.0F;
    this.cnm = 44100;
    this.cnn = ((int)(0.02F * this.cnm * 2.0F * 16.0F / 8.0F));
    this.A = (this.cnm / this.cnn);
    this.B = 1.0F;
    AppMethodBeat.o(137129);
  }

  protected final byte[] D(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137130);
    int i = 0;
    if (i < paramInt2)
    {
      int j = 0;
      int k = 0;
      if (k < paramInt1)
      {
        j += this.cmZ[k][i];
        if (j > this.MAX_VALUE)
          this.cnj *= 32768.0F / j;
        while (true)
        {
          k++;
          break;
          if (j < this.MIN_VALUE)
            this.cnj *= 32768.0F / j;
        }
      }
      if (this.cnj >= this.cnk);
      for (this.cnj = ((this.A * (this.cnk + 1.0F) + this.B * this.cnj) / (this.A + this.B)); ; this.cnj = ((this.cnk + this.cnj) / 2.0F))
      {
        this.cnk = this.cnj;
        k = j;
        if ((int)(this.cnj * 128.0F) >> 7 != 128)
          k = (int)(this.cnl * this.cnj / 128.0F * j) / 128;
        this.cnc[i] = gz(k);
        i++;
        break;
      }
    }
    byte[] arrayOfByte = bM(paramInt3, paramInt2);
    AppMethodBeat.o(137130);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.k
 * JD-Core Version:    0.6.2
 */