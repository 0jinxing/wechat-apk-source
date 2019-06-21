package com.tencent.mm.plugin.location.ui.impl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.protocal.protobuf.bhu;

public final class f
{
  public double bDG;
  public double bDH;
  public String mName;
  public String nQA;
  public String nQB;
  public int nQC;
  public String nQp;
  public String nQq;
  public String nQr;
  public String nQs;
  public String nQt;
  public String nQu;
  public String nQv;
  public String nQw;
  public String nQx;
  public String nQy;
  public Addr nQz;
  public int type;

  public f()
  {
    this.nQC = -1;
  }

  public f(bhu parambhu, String paramString)
  {
    AppMethodBeat.i(113667);
    this.nQC = -1;
    this.mName = parambhu.Name;
    this.nQp = parambhu.wKW;
    this.bDH = parambhu.vNH;
    this.bDG = parambhu.vNI;
    this.nQq = parambhu.wKX;
    this.nQr = parambhu.oRb;
    this.nQs = parambhu.wKY;
    this.nQt = parambhu.guO;
    this.nQu = parambhu.guP;
    this.nQv = parambhu.wcl;
    this.nQw = parambhu.wcm;
    this.nQx = parambhu.wKZ;
    this.nQA = paramString;
    this.nQz = new Addr();
    this.nQz.fBg = this.nQp;
    this.nQz.fBi = this.nQu;
    this.nQz.fBj = this.nQu;
    this.nQz.fBk = this.nQv;
    this.nQz.fBm = this.nQx;
    this.nQz.fBp = this.mName;
    this.nQz.fBh = this.nQt;
    this.nQz.fBs = ((float)parambhu.vNH);
    this.nQz.fBr = ((float)parambhu.vNI);
    this.type = 0;
    AppMethodBeat.o(113667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.f
 * JD-Core Version:    0.6.2
 */