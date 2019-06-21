package com.tencent.mm.plugin.appbrand.appcache.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.r;
import com.tencent.mm.plugin.appbrand.q.b.a;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends r
  implements com.tencent.mm.plugin.appbrand.q.b
{
  static final c.a fjX;
  static final String[] gSr;

  static
  {
    AppMethodBeat.i(129503);
    gSr = new String[] { "appId", "version" };
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "version";
    locala.xDd.put("version", "INTEGER");
    localStringBuilder.append(" version INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "source";
    locala.xDd.put("source", "INTEGER default '0' ");
    localStringBuilder.append(" source INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "hitCount";
    locala.xDd.put("hitCount", "INTEGER default '0' ");
    localStringBuilder.append(" hitCount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "reportId";
    locala.xDd.put("reportId", "INTEGER default '0' ");
    localStringBuilder.append(" reportId INTEGER default '0' ");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    fjX = locala;
    localStringBuilder = new StringBuilder();
    locala = fjX;
    locala.sql += b.a.n(gSr);
    AppMethodBeat.o(129503);
  }

  public final c.a Ag()
  {
    return fjX;
  }

  public final String[] getKeys()
  {
    return gSr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.d.b
 * JD-Core Version:    0.6.2
 */