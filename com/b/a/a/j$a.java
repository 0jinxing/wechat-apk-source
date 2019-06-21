package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j$a
{
  double bDF;
  double bDG;
  double bDH;
  double[] bDI;
  double bDJ;
  double bDK;
  int bDL;
  double bDM;
  double bDN;
  int bDO;
  double bDP;
  double bDQ;
  double bDR;
  int mType;

  protected j$a(int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, int paramInt2, double paramDouble6, int paramInt3, double paramDouble7, double paramDouble8)
  {
    AppMethodBeat.i(55616);
    this.bDI = new double[2];
    this.mType = paramInt1;
    this.bDF = paramDouble1;
    this.bDG = paramDouble2;
    this.bDH = paramDouble3;
    this.bDJ = paramDouble4;
    this.bDK = paramDouble5;
    this.bDL = paramInt2;
    this.bDM = paramDouble6;
    this.bDN = 0.0D;
    this.bDO = paramInt3;
    this.bDP = 0.0D;
    this.bDQ = paramDouble7;
    this.bDR = paramDouble8;
    AppMethodBeat.o(55616);
  }

  public final String toString()
  {
    AppMethodBeat.i(55617);
    String str = String.valueOf(this.mType) + ',' + this.bDF + ',' + this.bDG + ',' + this.bDH + ',' + this.bDJ + ',' + this.bDK + ',' + this.bDL + ',' + this.bDM + ',' + this.bDN + ',' + this.bDO + ',' + this.bDQ + ',' + this.bDR;
    AppMethodBeat.o(55617);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.b.a.a.j.a
 * JD-Core Version:    0.6.2
 */