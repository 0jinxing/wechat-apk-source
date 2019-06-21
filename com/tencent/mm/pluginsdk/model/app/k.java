package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;

public final class k extends com.tencent.mm.sdk.e.j<com.tencent.mm.af.j>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(79328);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(com.tencent.mm.af.j.ccO, "AppMessage") };
    AppMethodBeat.o(79328);
  }

  public k(e parame)
  {
    super(parame, com.tencent.mm.af.j.ccO, "AppMessage", null);
  }

  public final com.tencent.mm.af.j ma(long paramLong)
  {
    AppMethodBeat.i(79327);
    com.tencent.mm.af.j localj = new com.tencent.mm.af.j();
    localj.field_msgId = paramLong;
    if (super.b(localj, new String[0]))
      AppMethodBeat.o(79327);
    while (true)
    {
      return localj;
      localj = null;
      AppMethodBeat.o(79327);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.k
 * JD-Core Version:    0.6.2
 */