package com.tencent.mm.plugin.aa.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.c.b;

public final class l
  implements b<k>
{
  protected k gma;
  public final l.a gmb;
  public final l.b gmc;

  public l()
  {
    this(new k());
    AppMethodBeat.i(40637);
    AppMethodBeat.o(40637);
  }

  private l(k paramk)
  {
    AppMethodBeat.i(40638);
    this.gmb = new l.a(this);
    this.gmc = new l.b(this);
    this.gma = paramk;
    AppMethodBeat.o(40638);
  }

  public final k aop()
  {
    return this.gma;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.l
 * JD-Core Version:    0.6.2
 */