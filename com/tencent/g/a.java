package com.tencent.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class a
  implements com.tencent.g.b.a
{
  private g AHy;
  private boolean alP = true;

  protected a(g paramg)
  {
    this.AHy = paramg;
  }

  public final void t(String paramString, Object paramObject)
  {
    AppMethodBeat.i(127741);
    if (!this.alP)
      AppMethodBeat.o(127741);
    while (true)
    {
      return;
      f localf = f.dSG();
      if (paramObject == null)
      {
        paramString = new h("TpfServiceCenter|registerService|name or service should not be null");
        AppMethodBeat.o(127741);
        throw paramString;
      }
      synchronized (localf.AHE)
      {
        localf.AHC.put(paramString, paramObject);
        AppMethodBeat.o(127741);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.g.a
 * JD-Core Version:    0.6.2
 */