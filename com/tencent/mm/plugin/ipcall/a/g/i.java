package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i extends cm
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(21936);
    c.a locala = new c.a();
    locala.xDb = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "countryCode";
    locala.xDd.put("countryCode", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" countryCode INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "countryCode";
    locala.columns[1] = "callTimeCount";
    locala.xDd.put("callTimeCount", "LONG");
    localStringBuilder.append(" callTimeCount LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "lastCallTime";
    locala.xDd.put("lastCallTime", "LONG");
    localStringBuilder.append(" lastCallTime LONG");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(21936);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.i
 * JD-Core Version:    0.6.2
 */