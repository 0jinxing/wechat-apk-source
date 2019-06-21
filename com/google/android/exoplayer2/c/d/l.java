package com.google.android.exoplayer2.c.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class l
{
  public int aZA;
  public long[] aZB;
  public int[] aZC;
  public int[] aZD;
  public int[] aZE;
  public long[] aZF;
  public boolean[] aZG;
  public boolean aZH;
  public boolean[] aZI;
  public k aZJ;
  public int aZK;
  public com.google.android.exoplayer2.i.l aZL;
  public boolean aZM;
  public long aZN;
  public c aZw;
  public long aZx;
  public long aZy;
  public long aZz;
  public int sampleCount;

  public final void bd(int paramInt1, int paramInt2)
  {
    this.aZA = paramInt1;
    this.sampleCount = paramInt2;
    if ((this.aZC == null) || (this.aZC.length < paramInt1))
    {
      this.aZB = new long[paramInt1];
      this.aZC = new int[paramInt1];
    }
    if ((this.aZD == null) || (this.aZD.length < paramInt2))
    {
      paramInt1 = paramInt2 * 125 / 100;
      this.aZD = new int[paramInt1];
      this.aZE = new int[paramInt1];
      this.aZF = new long[paramInt1];
      this.aZG = new boolean[paramInt1];
      this.aZI = new boolean[paramInt1];
    }
  }

  public final void ea(int paramInt)
  {
    AppMethodBeat.i(95014);
    if ((this.aZL == null) || (this.aZL.limit < paramInt))
      this.aZL = new com.google.android.exoplayer2.i.l(paramInt);
    this.aZK = paramInt;
    this.aZH = true;
    this.aZM = true;
    AppMethodBeat.o(95014);
  }

  public final long eb(int paramInt)
  {
    return this.aZF[paramInt] + this.aZE[paramInt];
  }

  public final void q(com.google.android.exoplayer2.i.l paraml)
  {
    AppMethodBeat.i(95015);
    paraml.readBytes(this.aZL.data, 0, this.aZK);
    this.aZL.setPosition(0);
    this.aZM = false;
    AppMethodBeat.o(95015);
  }

  public final void reset()
  {
    this.aZA = 0;
    this.aZN = 0L;
    this.aZH = false;
    this.aZM = false;
    this.aZJ = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.l
 * JD-Core Version:    0.6.2
 */