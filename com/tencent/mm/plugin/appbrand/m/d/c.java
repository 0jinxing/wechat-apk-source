package com.tencent.mm.plugin.appbrand.m.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.m.a.e;
import com.tencent.mm.plugin.appbrand.m.a.e.a;
import com.tencent.mm.plugin.appbrand.q;

public final class c extends e
{
  private c.a iqn;

  public c(e.a parama, q paramq)
  {
    super(parama, paramq);
  }

  public final void aIV()
  {
    AppMethodBeat.i(102211);
    this.iqn = new c.1(this);
    this.gMN.getRuntime().gNN.a(this.iqn);
    AppMethodBeat.o(102211);
  }

  public final int getType()
  {
    return 2;
  }

  public final void removeListener()
  {
    AppMethodBeat.i(102212);
    if (this.iqn == null)
      AppMethodBeat.o(102212);
    while (true)
    {
      return;
      if (this.gMN.getRuntime() == null)
      {
        AppMethodBeat.o(102212);
      }
      else
      {
        com.tencent.mm.plugin.appbrand.b.c localc = this.gMN.getRuntime().gNN;
        if (localc == null)
        {
          AppMethodBeat.o(102212);
        }
        else
        {
          localc.b(this.iqn);
          AppMethodBeat.o(102212);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.d.c
 * JD-Core Version:    0.6.2
 */