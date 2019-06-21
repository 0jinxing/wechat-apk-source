package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.vending.h.e;
import com.tencent.mm.vending.j.d;

public final class aa
  implements b<z>
{
  protected z tgo;
  public final aa.c tgp;
  public final aa.a tgq;
  public final aa.b tgr;
  public final d tgs;

  public aa()
  {
    this(new z());
    AppMethodBeat.i(45326);
    AppMethodBeat.o(45326);
  }

  public aa(z paramz)
  {
    AppMethodBeat.i(45327);
    this.tgp = new aa.c(this);
    this.tgq = new aa.a(this);
    this.tgr = new aa.b(this);
    this.tgs = new d();
    this.tgo = paramz;
    AppMethodBeat.o(45327);
  }

  public final class d
    implements e<Void, d<Integer, Integer, Integer>>
  {
    public d()
    {
    }

    public final String HZ()
    {
      return "Vending.UI";
    }

    public final c<Void> gf(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(45324);
      c localc = f.h(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(1)).c(this);
      AppMethodBeat.o(45324);
      return localc;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.aa
 * JD-Core Version:    0.6.2
 */