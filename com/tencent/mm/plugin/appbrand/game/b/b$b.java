package com.tencent.mm.plugin.appbrand.game.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class b$b extends com.tencent.mm.plugin.fts.a.a.a
{
  private int hrb;
  private List<String> idList;

  public b$b(b paramb, List paramList)
  {
    this.idList = paramList;
  }

  public final String aAo()
  {
    AppMethodBeat.i(130069);
    String str = String.format("{insertSize: %d}", new Object[] { Integer.valueOf(this.hrb) });
    AppMethodBeat.o(130069);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(130068);
    boolean bool;
    if (bo.ek(this.idList))
    {
      bool = false;
      AppMethodBeat.o(130068);
    }
    while (true)
    {
      return bool;
      this.hrb = this.idList.size();
      ab.i("MicroMsg.FTS.FTS5SearchMiniGameLogic", "inserted MiniGame info id listSize:%d", new Object[] { Integer.valueOf(this.hrb) });
      this.hqZ.hqX.beginTransaction();
      Iterator localIterator = this.idList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.hqZ.hqX.b(c.mCh, str);
        com.tencent.mm.plugin.appbrand.game.b.a.b localb = i.As(str);
        if ((localb != null) && (!bo.isNullOrNil(localb.field_AppName)))
        {
          long l = System.currentTimeMillis();
          str = bo.nullAsNil(localb.field_RecordId);
          int i = str.hashCode();
          this.hqZ.hqX.a(458752, 1, i, str, l, localb.field_AppName);
          this.hqZ.hqX.a(458752, 2, i, str, l, d.aL(localb.field_AppName, false));
          this.hqZ.hqX.a(458752, 3, i, str, l, d.aL(localb.field_AppName, true));
          ab.v("MicroMsg.FTS.FTS5SearchMiniGameLogic", "inserted MiniGame info id = %s, name = %s", new Object[] { str, localb.field_AppName });
        }
        else
        {
          ab.i("MicroMsg.FTS.FTS5SearchMiniGameLogic", "inserted miniGame info is null. id:%s", new Object[] { str });
        }
      }
      this.hqZ.hqX.commit();
      bool = true;
      AppMethodBeat.o(130068);
    }
  }

  public final String getName()
  {
    return "InsertMiniGameTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.b.b
 * JD-Core Version:    0.6.2
 */