package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bfg;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.vending.h.e;

public final class r$c
  implements e<bfg, com.tencent.mm.vending.j.c<Integer, Integer>>
{
  public r$c(r paramr)
  {
  }

  public final String HZ()
  {
    return "Vending.UI";
  }

  public final com.tencent.mm.vending.g.c<bfg> ge(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(45272);
    com.tencent.mm.vending.g.c localc = f.D(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2)).c(this);
    AppMethodBeat.o(45272);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.r.c
 * JD-Core Version:    0.6.2
 */