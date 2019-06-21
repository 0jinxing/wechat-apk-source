package com.tencent.mm.plugin.record.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dv;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class j extends dv
  implements c
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(57136);
    c.a locala = new c.a();
    locala.xDb = new Field[10];
    locala.columns = new String[11];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.xDd.put("localId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" localId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "localId";
    locala.columns[1] = "msgId";
    locala.xDd.put("msgId", "LONG default '-1' ");
    localStringBuilder.append(" msgId LONG default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "oriMsgId";
    locala.xDd.put("oriMsgId", "LONG default '-1' ");
    localStringBuilder.append(" oriMsgId LONG default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "toUser";
    locala.xDd.put("toUser", "TEXT default '' ");
    localStringBuilder.append(" toUser TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "title";
    locala.xDd.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "desc";
    locala.xDd.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "dataProto";
    locala.xDd.put("dataProto", "BLOB");
    localStringBuilder.append(" dataProto BLOB");
    localStringBuilder.append(", ");
    locala.columns[7] = "type";
    locala.xDd.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "status";
    locala.xDd.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "favFrom";
    locala.xDd.put("favFrom", "TEXT");
    localStringBuilder.append(" favFrom TEXT");
    locala.columns[10] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(57136);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final int cez()
  {
    return this.field_localId;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.a.j
 * JD-Core Version:    0.6.2
 */