package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;

public final class v
{
  private static v lwR = null;
  public al fPG;
  final HashMap<Long, Integer> lwS;

  private v()
  {
    AppMethodBeat.i(19630);
    this.lwS = new HashMap();
    this.fPG = new al();
    AppMethodBeat.o(19630);
  }

  public static v bpz()
  {
    AppMethodBeat.i(19631);
    if (lwR == null)
      lwR = new v();
    v localv = lwR;
    AppMethodBeat.o(19631);
    return localv;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.v
 * JD-Core Version:    0.6.2
 */