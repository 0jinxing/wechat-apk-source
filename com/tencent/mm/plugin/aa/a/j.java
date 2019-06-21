package com.tencent.mm.plugin.aa.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.c.b;

public final class j
  implements b<i>
{
  protected i glL;
  public final j.b glM;
  public final a glN;

  public j()
  {
    this(new i());
    AppMethodBeat.i(40630);
    AppMethodBeat.o(40630);
  }

  private j(i parami)
  {
    AppMethodBeat.i(40631);
    this.glM = new j.b(this);
    this.glN = new a();
    this.glL = parami;
    AppMethodBeat.o(40631);
  }

  public final i aoo()
  {
    return this.glL;
  }

  public final class a
    implements com.tencent.mm.vending.h.e<Boolean, com.tencent.mm.vending.j.e<String, Integer, String, Long>>
  {
    public a()
    {
    }

    public final String HZ()
    {
      return "Vending.LOGIC";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.j
 * JD-Core Version:    0.6.2
 */