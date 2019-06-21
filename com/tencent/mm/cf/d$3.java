package com.tencent.mm.cf;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$3
  implements Runnable
{
  d$3(d paramd, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76905);
    d locald = this.ydO;
    if (this.jDT == 4);
    for (String str = "/data/anr/"; ; str = d.ydJ)
    {
      d.a(locald, str);
      AppMethodBeat.o(76905);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cf.d.3
 * JD-Core Version:    0.6.2
 */