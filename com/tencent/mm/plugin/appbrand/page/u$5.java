package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.e;
import com.tencent.mm.plugin.appbrand.jsapi.g;
import java.util.Iterator;
import java.util.Set;

final class u$5
  implements Runnable
{
  u$5(u paramu)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87163);
    this.ita.aBa();
    Iterator localIterator = this.ita.iqN.hvU.iterator();
    while (localIterator.hasNext())
      ((f.e)localIterator.next()).onReady();
    AppMethodBeat.o(87163);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.5
 * JD-Core Version:    0.6.2
 */