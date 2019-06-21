package com.tencent.mm.plugin.appbrand.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$b extends a
{
  private String id;
  private String name;

  public b$b(b paramb, String paramString)
  {
    this.id = paramString;
  }

  public final String aAo()
  {
    AppMethodBeat.i(129960);
    String str = String.format("{name: %s id: %s}", new Object[] { this.name, this.id });
    AppMethodBeat.o(129960);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(129959);
    this.hpQ.hpO.beginTransaction();
    this.hpQ.hpO.b(com.tencent.mm.plugin.fts.a.c.mCg, this.id);
    AppBrandRecentTaskInfo localAppBrandRecentTaskInfo = i.An(this.id);
    if (localAppBrandRecentTaskInfo != null)
    {
      long l = System.currentTimeMillis();
      String str = bo.nullAsNil(localAppBrandRecentTaskInfo.euD);
      int i = str.hashCode();
      this.hpQ.hpO.a(393216, 1, i, str, l, localAppBrandRecentTaskInfo.appName);
      this.hpQ.hpO.a(393216, 2, i, str, l, d.aL(localAppBrandRecentTaskInfo.appName, false));
      this.hpQ.hpO.a(393216, 3, i, str, l, d.aL(localAppBrandRecentTaskInfo.appName, true));
      this.name = localAppBrandRecentTaskInfo.appName;
      ab.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "inserted we app info id = %s", new Object[] { str });
    }
    this.hpQ.hpO.commit();
    AppMethodBeat.o(129959);
    return true;
  }

  public final String getName()
  {
    return "InsertWeAppTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.b.b
 * JD-Core Version:    0.6.2
 */