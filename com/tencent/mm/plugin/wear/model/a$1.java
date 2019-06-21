package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.f.c;

final class a$1 extends c
{
  a$1(a parama)
  {
  }

  public final String getName()
  {
    return "PhoneStartTask";
  }

  public final void send()
  {
    AppMethodBeat.i(26265);
    r.b(20001, null, false);
    r.b(20008, null, false);
    AppMethodBeat.o(26265);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.a.1
 * JD-Core Version:    0.6.2
 */