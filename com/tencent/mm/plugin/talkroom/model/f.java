package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class f
{
  private long eDK;
  int nwu;
  long nwv;
  private int sxV;
  private long sxW;
  int sxX = 0;
  private int sxY;
  long sxZ;
  int sya;
  int syb;
  private int syc;
  private int syd;
  private int sye;
  int syf;
  int syg;
  public int syh = 0;
  private int syi;
  private int syj;
  private int syk;
  private int syl;
  private int sym;
  private int syn;
  private int syo;
  private int syp;
  private int syq;
  String syr;
  int sys;
  int syt;
  long syu;
  int syv;
  long syw;
  long syx;
  boolean syy;
  boolean syz;

  public final void Fs(int paramInt)
  {
    AppMethodBeat.i(25795);
    if (this.syu == 0L)
      AppMethodBeat.o(25795);
    while (true)
    {
      return;
      this.sxV = paramInt;
      this.sxW = bo.az(this.syu);
      AppMethodBeat.o(25795);
    }
  }

  public final void cEp()
  {
    AppMethodBeat.i(25796);
    if (this.syu == 0L)
      AppMethodBeat.o(25796);
    while (true)
    {
      return;
      this.eDK = bo.az(this.syu);
      AppMethodBeat.o(25796);
    }
  }

  public final void cEq()
  {
    AppMethodBeat.i(25797);
    if (this.syu == 0L)
      AppMethodBeat.o(25797);
    while (true)
    {
      return;
      this.sxY = ((int)(bo.az(this.syu) / 1000L));
      AppMethodBeat.o(25797);
    }
  }

  public final void cEr()
  {
    this.sye += 1;
  }

  public final void cEs()
  {
    AppMethodBeat.i(25798);
    if (this.syx == 0L)
    {
      AppMethodBeat.o(25798);
      return;
    }
    long l = bo.az(this.syx) / 1000L;
    if (l < 2L)
      this.syi += 1;
    while (true)
    {
      this.syx = 0L;
      AppMethodBeat.o(25798);
      break;
      if (l < 6L)
        this.syj += 1;
      else if (l < 11L)
        this.syk += 1;
      else if (l < 21L)
        this.syl += 1;
      else if (l < 31L)
        this.sym += 1;
      else if (l < 41L)
        this.syn += 1;
      else if (l < 51L)
        this.syo += 1;
      else if (l < 61L)
        this.syp += 1;
      else
        this.syq += 1;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(25799);
    String str = this.sxV + "," + this.sxW + "," + this.eDK + "," + this.sxX + "," + this.sxY + "," + this.sxZ + "," + this.sya + "," + this.syb + "," + this.syc + "," + this.syd + "," + this.sye + "," + this.syf + "," + this.syg + "," + this.syh + "," + this.syi + "," + this.syj + "," + this.syk + "," + this.syl + "," + this.sym + "," + this.syn + "," + this.syo + "," + this.syp + "," + this.syq + "," + this.syr + "," + this.nwu + "," + this.nwv + "," + this.sys + "," + this.syt;
    AppMethodBeat.o(25799);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.f
 * JD-Core Version:    0.6.2
 */