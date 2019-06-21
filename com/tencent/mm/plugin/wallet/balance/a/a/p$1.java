package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Vector;

final class p$1
  implements Runnable
{
  p$1(p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45246);
    Iterator localIterator = p.a(this.tfy).iterator();
    while (localIterator.hasNext())
      ((p.a)localIterator.next()).cMI();
    AppMethodBeat.o(45246);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.p.1
 * JD-Core Version:    0.6.2
 */