package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$b<_Resp extends btd> extends m
{
  f eIc;
  final m fsA;
  b fsB;
  com.tencent.mm.vending.g.b fsC;
  a fsD;
  private k fsE;
  final long mStartTime;

  public a$b(a parama)
  {
    AppMethodBeat.i(58151);
    this.eIc = null;
    this.fsA = this;
    this.mStartTime = bo.anU();
    this.fsE = new a.b.1(this);
    this.fsD = parama;
    AppMethodBeat.o(58151);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(58152);
    this.eIc = paramf;
    int i = a(parame, this.fsB, this.fsE);
    ab.i("MicroMsg.Cgi", "Start doScene:%d func:%d netid:%d time:%d", new Object[] { Integer.valueOf(this.fsA.hashCode()), Integer.valueOf(this.fsB.fsI), Integer.valueOf(i), Long.valueOf(bo.anU() - this.mStartTime) });
    if (i < 0)
      com.tencent.mm.vending.g.f.a(this.fsC, new Object[] { a.a.a(3, -1, "", (btd)this.fsB.fsH.fsP, this, this.fsD) });
    AppMethodBeat.o(58152);
    return i;
  }

  protected final int acn()
  {
    return 1;
  }

  public final int getType()
  {
    return this.fsB.fsI;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.a.b
 * JD-Core Version:    0.6.2
 */