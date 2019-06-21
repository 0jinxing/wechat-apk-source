package com.tencent.mm.plugin.wear.model.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.e.r;

public final class a extends c
{
  public final String getName()
  {
    return "RequestLogTask";
  }

  protected final void send()
  {
    AppMethodBeat.i(26442);
    com.tencent.mm.plugin.wear.model.a.cUn();
    r.b(20009, null, false);
    com.tencent.mm.plugin.wear.model.a.cUn();
    r.b(20017, null, false);
    AppMethodBeat.o(26442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.a
 * JD-Core Version:    0.6.2
 */