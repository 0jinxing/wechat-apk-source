package com.tencent.mm.plugin.order.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.di;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends di
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(43792);
    c.a locala = new c.a();
    locala.xDb = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.xDd.put("msgId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" msgId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "msgId";
    locala.columns[1] = "msgContentXml";
    locala.xDd.put("msgContentXml", "TEXT");
    localStringBuilder.append(" msgContentXml TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "isRead";
    locala.xDd.put("isRead", "TEXT");
    localStringBuilder.append(" isRead TEXT");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(43792);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.b.a
 * JD-Core Version:    0.6.2
 */