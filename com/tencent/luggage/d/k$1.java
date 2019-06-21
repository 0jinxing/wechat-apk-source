package com.tencent.luggage.d;

import com.tencent.luggage.bridge.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$1
  implements l
{
  k$1(k paramk, a parama)
  {
  }

  public final void a(com.tencent.luggage.bridge.k paramk)
  {
    AppMethodBeat.i(90813);
    k localk = this.bPI;
    a locala = this.bPH;
    paramk = new k.2(localk, locala, paramk);
    localk.xp().a(locala.name(), paramk);
    AppMethodBeat.o(90813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.k.1
 * JD-Core Version:    0.6.2
 */