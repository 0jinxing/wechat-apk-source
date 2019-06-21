package com.tencent.mm.plugin.appbrand.game.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class b$a extends com.tencent.mm.plugin.fts.a.a.a
{
  private int hra;
  private List<String> idList;

  public b$a(b paramb, List paramList)
  {
    this.idList = paramList;
  }

  public final String aAo()
  {
    AppMethodBeat.i(130067);
    String str = String.format("{deleteSize: %d}", new Object[] { Integer.valueOf(this.hra) });
    AppMethodBeat.o(130067);
    return str;
  }

  public final boolean execute()
  {
    boolean bool = false;
    AppMethodBeat.i(130066);
    if (bo.ek(this.idList))
      AppMethodBeat.o(130066);
    while (true)
    {
      return bool;
      this.hra = this.idList.size();
      ab.v("MicroMsg.FTS.FTS5SearchMiniGameLogic", "delete MiniGame info id listSize:%d", new Object[] { Integer.valueOf(this.hra) });
      Iterator localIterator = this.idList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.hqZ.hqX.b(c.mCh, str);
      }
      AppMethodBeat.o(130066);
      bool = true;
    }
  }

  public final String getName()
  {
    return "DeleteMiniGameTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.b.a
 * JD-Core Version:    0.6.2
 */