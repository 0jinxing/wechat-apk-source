package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.model.c;

public final class u
{
  private static u lwO = null;
  private c lwP;
  private f lwQ;

  public static void a(m paramm)
  {
    AppMethodBeat.i(19628);
    bpy().lqX = paramm;
    AppMethodBeat.o(19628);
  }

  private static u bpw()
  {
    AppMethodBeat.i(19626);
    if (lwO == null)
      lwO = new u();
    u localu = lwO;
    AppMethodBeat.o(19626);
    return localu;
  }

  public static f bpx()
  {
    AppMethodBeat.i(19627);
    if (bpw().lwQ == null)
      bpw().lwQ = new f();
    f localf = bpw().lwQ;
    AppMethodBeat.o(19627);
    return localf;
  }

  public static c bpy()
  {
    AppMethodBeat.i(19629);
    if (bpw().lwP == null)
      bpw().lwP = c.boB();
    c localc = bpw().lwP;
    AppMethodBeat.o(19629);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.u
 * JD-Core Version:    0.6.2
 */