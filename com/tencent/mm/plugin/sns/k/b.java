package com.tencent.mm.plugin.sns.k;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class b
  implements com.tencent.mm.vending.c.b<a>
{
  protected a rNo;
  public final b.a rNp;
  public final b.b rNq;

  public b()
  {
    this(new a());
    AppMethodBeat.i(40541);
    AppMethodBeat.o(40541);
  }

  private b(a parama)
  {
    AppMethodBeat.i(40542);
    this.rNp = new b.a(this);
    this.rNq = new b.b(this);
    this.rNo = parama;
    AppMethodBeat.o(40542);
  }

  public final a cvE()
  {
    return this.rNo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.k.b
 * JD-Core Version:    0.6.2
 */