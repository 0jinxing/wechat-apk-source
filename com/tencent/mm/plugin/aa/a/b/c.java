package com.tencent.mm.plugin.aa.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.b;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c extends b
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(40666);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "billNo";
    locala.xDd.put("billNo", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" billNo TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "billNo";
    locala.columns[1] = "insertmsg";
    locala.xDd.put("insertmsg", "INTEGER");
    localStringBuilder.append(" insertmsg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "localMsgId";
    locala.xDd.put("localMsgId", "LONG");
    localStringBuilder.append(" localMsgId LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "status";
    locala.xDd.put("status", "INTEGER default '-1' ");
    localStringBuilder.append(" status INTEGER default '-1' ");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(40666);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.b.c
 * JD-Core Version:    0.6.2
 */