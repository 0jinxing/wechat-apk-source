package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.a.b;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.f.c;

final class a$2 extends c
{
  a$2(a parama)
  {
  }

  public final String getName()
  {
    return "SyncFileTask";
  }

  public final void send()
  {
    AppMethodBeat.i(26266);
    if (this.tXC.tXt.cUt() != null)
      this.tXC.tXt.cUt().cUz();
    r.b(20009, null, false);
    r.b(20017, null, false);
    AppMethodBeat.o(26266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.a.2
 * JD-Core Version:    0.6.2
 */