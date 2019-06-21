package com.tencent.mm.plugin.appbrand.s;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j
{
  private long iRu;
  private long iRv;
  private j.a iRw;

  public j()
  {
  }

  public j(long paramLong, j.a parama)
  {
    this.iRu = paramLong;
    this.iRw = parama;
  }

  private boolean aOa()
  {
    AppMethodBeat.i(126636);
    boolean bool;
    if (System.currentTimeMillis() - this.iRv < this.iRu)
    {
      bool = true;
      AppMethodBeat.o(126636);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(126636);
    }
  }

  public final boolean l(Object[] paramArrayOfObject)
  {
    boolean bool = false;
    AppMethodBeat.i(126637);
    if (aOa())
      AppMethodBeat.o(126637);
    while (true)
    {
      return bool;
      if (this.iRw == null)
      {
        AppMethodBeat.o(126637);
      }
      else
      {
        bool = this.iRw.j(paramArrayOfObject);
        if (bool)
          this.iRv = System.currentTimeMillis();
        AppMethodBeat.o(126637);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.j
 * JD-Core Version:    0.6.2
 */