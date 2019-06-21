package com.tencent.mm.plugin.appbrand.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class b$d extends a
{
  private int hpR;

  b$d(b paramb)
  {
  }

  public final String aAo()
  {
    AppMethodBeat.i(129963);
    String str = String.format("{updateSize: %d}", new Object[] { Integer.valueOf(this.hpR) });
    AppMethodBeat.o(129963);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(129962);
    Object localObject = i.aAr();
    if (((List)localObject).isEmpty())
    {
      ab.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp recent usage list is nil.");
      AppMethodBeat.o(129962);
    }
    while (true)
    {
      return true;
      this.hpR = ((List)localObject).size();
      this.hpQ.hpO.beginTransaction();
      this.hpQ.hpO.s(com.tencent.mm.plugin.fts.a.c.mCg);
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (AppBrandRecentTaskInfo)localIterator.next();
        String str = bo.nullAsNil(((AppBrandRecentTaskInfo)localObject).euD);
        int i = str.hashCode();
        long l = System.currentTimeMillis();
        this.hpQ.hpO.a(393216, 1, i, str, l, ((AppBrandRecentTaskInfo)localObject).appName);
        this.hpQ.hpO.a(393216, 2, i, str, l, d.aL(((AppBrandRecentTaskInfo)localObject).appName, false));
        this.hpQ.hpO.a(393216, 3, i, str, l, d.aL(((AppBrandRecentTaskInfo)localObject).appName, true));
      }
      this.hpQ.hpO.commit();
      AppMethodBeat.o(129962);
    }
  }

  public final String getName()
  {
    return "UpdateWeAppIndexTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.b.d
 * JD-Core Version:    0.6.2
 */