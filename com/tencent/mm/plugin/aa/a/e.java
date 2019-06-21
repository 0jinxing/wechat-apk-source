package com.tencent.mm.plugin.aa.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.c.b;

public final class e
  implements b<d>
{
  protected d glE;
  public final e.a glF;

  public e()
  {
    this(new d());
    AppMethodBeat.i(40603);
    AppMethodBeat.o(40603);
  }

  private e(d paramd)
  {
    AppMethodBeat.i(40604);
    this.glF = new e.a(this);
    this.glE = paramd;
    AppMethodBeat.o(40604);
  }

  public final d aok()
  {
    return this.glE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.e
 * JD-Core Version:    0.6.2
 */