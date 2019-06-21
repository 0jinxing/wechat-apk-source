package com.tencent.mm.plugin.wallet_index.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_index.c.l;
import com.tencent.mm.protocal.protobuf.auh;
import com.tencent.mm.protocal.protobuf.aui;
import com.tencent.mm.wallet_core.c.t;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  String kWz;
  public int mCount;
  int peo;
  public String tQX;
  public String tQY;
  public ArrayList<String> tRA;
  public String tRB;
  public int tRC;
  List<String> tRD;
  boolean tRE;
  public String tRF;
  public String tRG;
  public auh tRe;
  public aui tRf;
  public String tRw;
  public ArrayList<String> tRz;

  public c()
  {
    AppMethodBeat.i(48227);
    this.tRz = new ArrayList();
    this.tRA = new ArrayList();
    this.mCount = 1;
    this.tRB = null;
    this.tRC = 0;
    this.tQY = null;
    this.tQX = null;
    this.tRw = null;
    this.tRD = new ArrayList();
    this.kWz = null;
    this.tRE = false;
    AppMethodBeat.o(48227);
  }

  public final m a(com.tencent.mm.plugin.wallet_index.b.a.c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(48228);
    int i;
    if (paramBoolean)
    {
      i = 2;
      if (!this.tRE)
        break label128;
      if (!cSX())
      {
        this.tRe.wyp = paramc.mSignature;
        this.tRe.wym = paramc.tQV;
        this.tRe.pdz = paramc.tQY;
        this.tRe.wma = paramc.tQX;
        this.tRe.pho = paramc.kWz;
        this.tRe.wyo = paramc.tQW;
      }
      paramc = new l(this.peo, i, paramc.kWz, this.tRf, this.tRe);
      AppMethodBeat.o(48228);
    }
    while (true)
    {
      return paramc;
      i = 1;
      break;
      label128: paramc = new t(paramc.kWz, i, this.peo, this.mCount, paramc.tQV, paramc.tQW, paramc.mSignature, paramc.tQX, paramc.tQY);
      AppMethodBeat.o(48228);
    }
  }

  public final boolean cSX()
  {
    if (this.peo == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.c
 * JD-Core Version:    0.6.2
 */