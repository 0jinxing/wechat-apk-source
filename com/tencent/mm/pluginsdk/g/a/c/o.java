package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.network.n;
import java.util.Collection;
import java.util.Iterator;

public final class o
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.kernel.b.c
{
  public static final o vfu;
  private final n kzM;
  private final com.tencent.mm.sdk.b.c vfv;

  static
  {
    AppMethodBeat.i(79609);
    vfu = new o();
    AppMethodBeat.o(79609);
  }

  public o()
  {
    AppMethodBeat.i(79606);
    this.kzM = new o.1(this);
    this.vfv = new o.2(this);
    AppMethodBeat.o(79606);
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(79607);
    paramc = r.diz().iterator();
    while (paramc.hasNext())
      ((g)paramc.next()).cYt();
    com.tencent.mm.kernel.g.RO().a(this.kzM);
    this.vfv.dnU();
    AppMethodBeat.o(79607);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(79608);
    com.tencent.mm.kernel.g.RO().b(this.kzM);
    this.vfv.dead();
    Iterator localIterator = r.diz().iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).onAccountRelease();
    AppMethodBeat.o(79608);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.o
 * JD-Core Version:    0.6.2
 */