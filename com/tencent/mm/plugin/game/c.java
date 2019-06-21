package com.tencent.mm.plugin.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.plugin.game.model.aw;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.k;

public final class c
{
  com.tencent.mm.sdk.b.c egQ;
  com.tencent.mm.sdk.b.c lOc;
  bz.a luy;
  aw mSR;
  com.tencent.mm.sdk.b.c mSS;
  com.tencent.mm.sdk.b.c mST;
  com.tencent.mm.sdk.b.c mSU;
  com.tencent.mm.sdk.b.c mSV;
  com.tencent.mm.sdk.b.c mSW;
  com.tencent.mm.sdk.b.c mSX;
  com.tencent.mm.sdk.b.c mSY;
  com.tencent.mm.sdk.b.c mSZ;
  d mTa;
  com.tencent.mm.sdk.b.c mTb;
  com.tencent.mm.sdk.b.c mTc;
  com.tencent.mm.sdk.b.c mTd;
  com.tencent.mm.sdk.b.c mTe;
  com.tencent.mm.sdk.b.c mTf;

  public c()
  {
    AppMethodBeat.i(111166);
    this.mSR = new aw();
    this.luy = new c.1(this);
    this.mSS = new c.10(this);
    this.mST = new c.11(this);
    this.mSU = new c.12(this);
    this.mSV = new c.13(this);
    this.mSW = new c.14(this);
    this.mSX = new c.15(this);
    this.mSY = new c.16(this);
    this.mSZ = new c.17(this);
    this.mTa = new d()
    {
      public final b NJ(String paramAnonymousString)
      {
        AppMethodBeat.i(111136);
        gy localgy = new gy();
        localgy.cBG.ctq = paramAnonymousString;
        AppMethodBeat.o(111136);
        return localgy;
      }

      public final k bCU()
      {
        AppMethodBeat.i(111137);
        r localr = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY();
        AppMethodBeat.o(111137);
        return localr;
      }
    };
    this.egQ = new c.3(this);
    this.mTb = new c.4(this);
    this.mTc = new c.5(this);
    this.mTd = new c.6(this);
    this.mTe = new c.7(this);
    this.lOc = new c.8(this);
    this.mTf = new c.9(this);
    AppMethodBeat.o(111166);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.c
 * JD-Core Version:    0.6.2
 */