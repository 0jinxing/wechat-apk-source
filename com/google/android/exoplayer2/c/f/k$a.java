package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.c.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$a
{
  private final m aTw;
  long bbJ;
  long bbR;
  boolean bbS;
  boolean bcI;
  int bcJ;
  boolean bcK;
  boolean bcL;
  boolean bcM;
  boolean bcN;
  long bck;
  long bcl;
  boolean bco;

  public k$a(m paramm)
  {
    this.aTw = paramm;
  }

  final void eh(int paramInt)
  {
    AppMethodBeat.i(95127);
    if (this.bbS);
    for (int i = 1; ; i = 0)
    {
      int j = (int)(this.bck - this.bbR);
      this.aTw.a(this.bbJ, i, j, paramInt, null);
      AppMethodBeat.o(95127);
      return;
    }
  }

  public final void g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (this.bcK)
    {
      int i = paramInt1 + 2 - this.bcJ;
      if (i >= paramInt2)
        break label55;
      if ((paramArrayOfByte[i] & 0x80) == 0)
        break label49;
      bool = true;
      this.bcL = bool;
      this.bcK = false;
    }
    while (true)
    {
      return;
      label49: bool = false;
      break;
      label55: this.bcJ += paramInt2 - paramInt1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.k.a
 * JD-Core Version:    0.6.2
 */