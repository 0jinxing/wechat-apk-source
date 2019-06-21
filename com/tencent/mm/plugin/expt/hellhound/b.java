package com.tencent.mm.plugin.expt.hellhound;

import android.app.Application;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.b.a;
import com.tencent.mm.plugin.expt.a.b.b;
import com.tencent.mm.plugin.expt.hellhound.core.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  implements com.tencent.mm.plugin.expt.a.b
{
  public static void d(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(73338);
    if (paramg == null)
      AppMethodBeat.o(73338);
    while (true)
    {
      return;
      if (!a.bqj())
      {
        ab.w("HellhoundService", "habbyge-mali, IHellhoundService Close !!!");
        AppMethodBeat.o(73338);
      }
      else
      {
        ab.i("HellhoundService", "habbyge-mali, IHellhoundService Start !!!");
        com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.expt.a.b.class, new b());
        com.tencent.mm.plugin.expt.a.b localb = (com.tencent.mm.plugin.expt.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.b.class);
        localb.a(new b.1());
        localb.a(new b.2());
        com.tencent.mm.plugin.expt.hellhound.core.a.bqm();
        com.tencent.mm.plugin.expt.hellhound.core.a.a(new b.3());
        localb.f(paramg.cc);
        com.tencent.mm.plugin.expt.hellhound.a.a.b.s(104, "", "");
        AppMethodBeat.o(73338);
      }
    }
  }

  public final void a(b.a parama)
  {
    AppMethodBeat.i(73339);
    com.tencent.mm.plugin.expt.hellhound.core.a locala = com.tencent.mm.plugin.expt.hellhound.core.a.bqm();
    if (com.tencent.mm.plugin.expt.hellhound.core.a.bqn())
      locala.lMk.a(parama);
    AppMethodBeat.o(73339);
  }

  public final void a(b.b paramb)
  {
    AppMethodBeat.i(73340);
    com.tencent.mm.plugin.expt.hellhound.a.a.b.bqF().lMP = paramb;
    AppMethodBeat.o(73340);
  }

  public final void f(Application paramApplication)
  {
    AppMethodBeat.i(73341);
    com.tencent.mm.plugin.expt.hellhound.core.a locala = com.tencent.mm.plugin.expt.hellhound.core.a.bqm();
    ab.i("Hellhound", "habbyge-Hellhound.startMonitor()");
    if (com.tencent.mm.plugin.expt.hellhound.core.a.bqn())
      locala.lMk.g(paramApplication);
    AppMethodBeat.o(73341);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.b
 * JD-Core Version:    0.6.2
 */