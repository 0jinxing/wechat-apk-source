package com.tencent.mm.plugin.websearch.widget.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ft;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends ft
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(91457);
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appid";
    locala.xDd.put("appid", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" appid TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "appid";
    locala.columns[1] = "jsExceptionCount";
    locala.xDd.put("jsExceptionCount", "INTEGER");
    localStringBuilder.append(" jsExceptionCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "crashCount";
    locala.xDd.put("crashCount", "INTEGER");
    localStringBuilder.append(" crashCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "beginTimestamp";
    locala.xDd.put("beginTimestamp", "LONG");
    localStringBuilder.append(" beginTimestamp LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "pkgVersion";
    locala.xDd.put("pkgVersion", "INTEGER");
    localStringBuilder.append(" pkgVersion INTEGER");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(91457);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.a
 * JD-Core Version:    0.6.2
 */