package com.tencent.mm.plugin.appbrand.game.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class b$d extends com.tencent.mm.plugin.fts.a.a.a
{
  private int hpR;

  b$d(b paramb)
  {
  }

  public final String aAo()
  {
    AppMethodBeat.i(130072);
    String str = String.format("{updateSize: %d}", new Object[] { Integer.valueOf(this.hpR) });
    AppMethodBeat.o(130072);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(130071);
    Object localObject = i.aAG();
    if ((localObject == null) || (((List)localObject).isEmpty()))
    {
      ab.i("MicroMsg.FTS.FTS5SearchMiniGameLogic", "MiniGame search list is nil.");
      AppMethodBeat.o(130071);
    }
    while (true)
    {
      return true;
      this.hpR = ((List)localObject).size();
      this.hqZ.hqX.beginTransaction();
      this.hqZ.hqX.s(c.mCh);
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.game.b.a.b localb = (com.tencent.mm.plugin.appbrand.game.b.a.b)localIterator.next();
        if ((localb == null) || (bo.isNullOrNil(localb.field_AppName)))
        {
          ab.i("MicroMsg.FTS.FTS5SearchMiniGameLogic", "UpdateMiniGameIndexTask appname is null");
          this.hpR -= 1;
        }
        else
        {
          localObject = bo.nullAsNil(localb.field_RecordId);
          int i = ((String)localObject).hashCode();
          long l = System.currentTimeMillis();
          this.hqZ.hqX.a(458752, 1, i, (String)localObject, l, localb.field_AppName);
          this.hqZ.hqX.a(458752, 2, i, (String)localObject, l, d.aL(localb.field_AppName, false));
          this.hqZ.hqX.a(458752, 3, i, (String)localObject, l, d.aL(localb.field_AppName, true));
        }
      }
      this.hqZ.hqX.commit();
      ab.i("MicroMsg.FTS.FTS5SearchMiniGameLogic", "update MiniGame info id listSize:%d", new Object[] { Integer.valueOf(this.hpR) });
      AppMethodBeat.o(130071);
    }
  }

  public final String getName()
  {
    return "UpdateMiniGameIndexTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.b.d
 * JD-Core Version:    0.6.2
 */