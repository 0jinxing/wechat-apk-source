package com.tencent.mm.plugin.fav.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class b$b extends com.tencent.mm.plugin.fts.a.a.a
{
  private long mgM;

  public b$b(b paramb, long paramLong)
  {
    this.mgM = paramLong;
  }

  public final String aAo()
  {
    AppMethodBeat.i(5305);
    String str = String.format("{favItemId: %d}", new Object[] { Long.valueOf(this.mgM) });
    AppMethodBeat.o(5305);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(5304);
    ab.d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "start to delete favorite item");
    long l = this.mgM;
    this.mgH.mgE.c(c.mCd, l);
    AppMethodBeat.o(5304);
    return true;
  }

  public final String getName()
  {
    return "DeleteFavItemTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.a.b.b
 * JD-Core Version:    0.6.2
 */