package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import java.util.HashMap;
import java.util.HashSet;

final class a$e extends com.tencent.mm.plugin.fts.a.a.a
{
  private boolean eBp = false;
  private String edV;

  public a$e(a parama, String paramString)
  {
    this.edV = paramString;
  }

  public final String aAo()
  {
    AppMethodBeat.i(136673);
    String str = String.format("{username: %s isSkipped: %b}", new Object[] { this.edV, Boolean.valueOf(this.eBp) });
    AppMethodBeat.o(136673);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136672);
    ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "Insert Contact %s", new Object[] { this.edV });
    ad localad = a.d(this.mFK).MU(this.edV);
    if ((localad != null) && (localad.field_username.length() > 0) && (this.mFK.H(localad)))
      this.mFK.I(localad);
    while (true)
    {
      a.b(this.mFK).remove(this.edV);
      a.c(this.mFK).remove(this.edV);
      AppMethodBeat.o(136672);
      return true;
      this.eBp = true;
    }
  }

  public final String getName()
  {
    return "InsertContactTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.e
 * JD-Core Version:    0.6.2
 */