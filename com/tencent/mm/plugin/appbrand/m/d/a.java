package com.tencent.mm.plugin.appbrand.m.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.m.a.e;
import com.tencent.mm.plugin.appbrand.m.a.e.a;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.r;
import com.tencent.mm.plugin.appbrand.r.a;
import com.tencent.mm.plugin.appbrand.r.b;

public final class a extends e
{
  private r.b iqj;

  public a(e.a parama, q paramq)
  {
    super(parama, paramq);
  }

  public final void aIV()
  {
    AppMethodBeat.i(102205);
    this.iqj = new a.1(this);
    r.a.gPN.a(this.gMN, this.iqj);
    AppMethodBeat.o(102205);
  }

  public final int getType()
  {
    return 1;
  }

  public final void removeListener()
  {
    AppMethodBeat.i(102206);
    r.a.gPN.b(this.gMN, this.iqj);
    AppMethodBeat.o(102206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.d.a
 * JD-Core Version:    0.6.2
 */