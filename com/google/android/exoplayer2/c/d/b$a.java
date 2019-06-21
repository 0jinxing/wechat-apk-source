package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a
{
  public int aXH;
  private final boolean aXI;
  private final l aXJ;
  private final l aXK;
  private int aXL;
  private int aXM;
  public int index;
  public final int length;
  public long xb;

  public b$a(l paraml1, l paraml2, boolean paramBoolean)
  {
    AppMethodBeat.i(94941);
    this.aXK = paraml1;
    this.aXJ = paraml2;
    this.aXI = paramBoolean;
    paraml2.setPosition(12);
    this.length = paraml2.tI();
    paraml1.setPosition(12);
    this.aXM = paraml1.tI();
    if (paraml1.readInt() == 1);
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      a.checkState(paramBoolean, "first_chunk must be 1");
      this.index = -1;
      AppMethodBeat.o(94941);
      return;
    }
  }

  public final boolean rf()
  {
    AppMethodBeat.i(94942);
    int i = this.index + 1;
    this.index = i;
    boolean bool;
    if (i == this.length)
    {
      bool = false;
      AppMethodBeat.o(94942);
      return bool;
    }
    long l;
    if (this.aXI)
    {
      l = this.aXJ.tK();
      label49: this.xb = l;
      if (this.index == this.aXL)
      {
        this.aXH = this.aXK.tI();
        this.aXK.eM(4);
        i = this.aXM - 1;
        this.aXM = i;
        if (i <= 0)
          break label136;
      }
    }
    label136: for (i = this.aXK.tI() - 1; ; i = -1)
    {
      this.aXL = i;
      bool = true;
      AppMethodBeat.o(94942);
      break;
      l = this.aXJ.cM();
      break label49;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.b.a
 * JD-Core Version:    0.6.2
 */