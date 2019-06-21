package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class l
  implements h
{
  private m aTw;
  private int aUy;
  private boolean bbH;
  private long bbJ;
  private final com.google.android.exoplayer2.i.l bcO;
  private int sampleSize;

  public l()
  {
    AppMethodBeat.i(95133);
    this.bcO = new com.google.android.exoplayer2.i.l(10);
    AppMethodBeat.o(95133);
  }

  public final void a(g paramg, v.d paramd)
  {
    AppMethodBeat.i(95134);
    paramd.rz();
    this.aTw = paramg.dM(paramd.rA());
    this.aTw.f(Format.k(paramd.rB(), "application/id3"));
    AppMethodBeat.o(95134);
  }

  public final void d(long paramLong, boolean paramBoolean)
  {
    if (!paramBoolean);
    while (true)
    {
      return;
      this.bbH = true;
      this.bbJ = paramLong;
      this.sampleSize = 0;
      this.aUy = 0;
    }
  }

  public final void rn()
  {
    this.bbH = false;
  }

  public final void ro()
  {
    AppMethodBeat.i(95136);
    if ((!this.bbH) || (this.sampleSize == 0) || (this.aUy != this.sampleSize))
      AppMethodBeat.o(95136);
    while (true)
    {
      return;
      this.aTw.a(this.bbJ, 1, this.sampleSize, 0, null);
      this.bbH = false;
      AppMethodBeat.o(95136);
    }
  }

  public final void t(com.google.android.exoplayer2.i.l paraml)
  {
    AppMethodBeat.i(95135);
    if (!this.bbH)
      AppMethodBeat.o(95135);
    while (true)
    {
      return;
      int i = paraml.tB();
      int j;
      if (this.aUy < 10)
      {
        j = Math.min(i, 10 - this.aUy);
        System.arraycopy(paraml.data, paraml.position, this.bcO.data, this.aUy, j);
        if (j + this.aUy == 10)
        {
          this.bcO.setPosition(0);
          if ((73 != this.bcO.readUnsignedByte()) || (68 != this.bcO.readUnsignedByte()) || (51 != this.bcO.readUnsignedByte()))
          {
            this.bbH = false;
            AppMethodBeat.o(95135);
            continue;
          }
          this.bcO.eM(3);
          this.sampleSize = (this.bcO.tH() + 10);
        }
      }
      else
      {
        j = Math.min(i, this.sampleSize - this.aUy);
        this.aTw.a(paraml, j);
        this.aUy = (j + this.aUy);
        AppMethodBeat.o(95135);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.l
 * JD-Core Version:    0.6.2
 */