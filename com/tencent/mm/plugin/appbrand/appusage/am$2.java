package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.anx;
import com.tencent.mm.protocal.protobuf.bzq;
import java.util.Iterator;
import java.util.LinkedList;

final class am$2
  implements Iterator<Object[]>
{
  final Object[] haV;
  final Iterator<bzq> haY;

  am$2(am paramam, anx paramanx)
  {
    AppMethodBeat.i(129726);
    this.haV = new Object[3];
    this.haY = this.haZ.wss.iterator();
    AppMethodBeat.o(129726);
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(129727);
    boolean bool = this.haY.hasNext();
    AppMethodBeat.o(129727);
    return bool;
  }

  public final void remove()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.am.2
 * JD-Core Version:    0.6.2
 */