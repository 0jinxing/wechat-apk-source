package com.tencent.mm.plugin.boots.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.e;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends e
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(105575);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.xDd.put("key", "INTEGER PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" key INTEGER PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.xDc = "key";
    locala.columns[1] = "mau";
    locala.xDd.put("mau", "INTEGER");
    localStringBuilder.append(" mau INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "dau";
    locala.xDd.put("dau", "INTEGER");
    localStringBuilder.append(" dau INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "useTime";
    locala.xDd.put("useTime", "LONG");
    localStringBuilder.append(" useTime LONG");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(105575);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.boots.a.a
 * JD-Core Version:    0.6.2
 */