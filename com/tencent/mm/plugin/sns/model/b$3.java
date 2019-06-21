package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;

public final class b$3
  implements Runnable
{
  public b$3(b paramb, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36101);
    if (b.b(this.qHQ) != null)
    {
      Iterator localIterator = b.b(this.qHQ).iterator();
      while (localIterator.hasNext())
      {
        b.a locala = (b.a)localIterator.next();
        if (locala != null)
          locala.fW(this.IN, this.bSt);
      }
    }
    AppMethodBeat.o(36101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.b.3
 * JD-Core Version:    0.6.2
 */