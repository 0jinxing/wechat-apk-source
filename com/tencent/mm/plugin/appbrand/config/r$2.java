package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public final class r$2
  implements Runnable
{
  public r$2(List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129906);
    Iterator localIterator = this.hhF.iterator();
    while (localIterator.hasNext())
      r.aa((String)localIterator.next(), true);
    AppMethodBeat.o(129906);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.r.2
 * JD-Core Version:    0.6.2
 */