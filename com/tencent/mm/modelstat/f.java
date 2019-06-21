package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a.c;

public final class f
{
  private static f fSQ = null;
  public com.tencent.mm.a.f<String, Long> fSR;
  public String fSS;

  private f()
  {
    AppMethodBeat.i(78732);
    this.fSR = new c(10);
    AppMethodBeat.o(78732);
  }

  public static f akh()
  {
    AppMethodBeat.i(78731);
    if (fSQ == null)
      fSQ = new f();
    f localf = fSQ;
    AppMethodBeat.o(78731);
    return localf;
  }

  public final void u(String paramString, long paramLong)
  {
    AppMethodBeat.i(78733);
    if (this.fSR != null)
    {
      this.fSS = paramString;
      this.fSR.put(paramString, Long.valueOf(paramLong));
    }
    AppMethodBeat.o(78733);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.f
 * JD-Core Version:    0.6.2
 */