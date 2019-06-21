package com.tencent.mm.plugin.appbrand.h;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113930);
    synchronized (this.ieV)
    {
      m.a locala1 = a.b(this.ieV);
      if (locala1 != null)
        locala1.onDestroy();
      AppMethodBeat.o(113930);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.a.2
 * JD-Core Version:    0.6.2
 */