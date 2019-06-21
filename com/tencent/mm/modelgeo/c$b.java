package com.tencent.mm.modelgeo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.az.a;

final class c$b
  implements az.a
{
  private Addr fBB = null;

  public c$b(c paramc)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(78106);
    boolean bool;
    if (c.a(this.fBC) == null)
    {
      bool = false;
      AppMethodBeat.o(78106);
    }
    while (true)
    {
      return bool;
      if ((this.fBB == null) || (this.fBB.fBg == null) || (this.fBB.fBg.equals("")))
        this.fBB = c.c(c.a(this.fBC).lat, c.a(this.fBC).lng, c.b(this.fBC));
      bool = true;
      AppMethodBeat.o(78106);
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(78107);
    c.c(this.fBC);
    c.a(this.fBC, this.fBB);
    AppMethodBeat.o(78107);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.c.b
 * JD-Core Version:    0.6.2
 */