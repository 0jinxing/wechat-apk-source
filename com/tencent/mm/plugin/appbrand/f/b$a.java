package com.tencent.mm.plugin.appbrand.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a extends a
{
  private String id;

  public b$a(b paramb, String paramString)
  {
    this.id = paramString;
  }

  public final String aAo()
  {
    AppMethodBeat.i(129958);
    String str = String.format("{id: %s}", new Object[] { this.id });
    AppMethodBeat.o(129958);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(129957);
    ab.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "delete we app info id=%s", new Object[] { this.id });
    this.hpQ.hpO.b(com.tencent.mm.plugin.fts.a.c.mCg, this.id);
    AppMethodBeat.o(129957);
    return true;
  }

  public final String getName()
  {
    return "DeleteWeAppTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.b.a
 * JD-Core Version:    0.6.2
 */