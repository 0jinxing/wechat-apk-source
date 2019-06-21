package com.tencent.mm.plugin.freewifi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bv;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class e extends bv
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(20885);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "id";
    locala.xDd.put("id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "id";
    locala.columns[1] = "protocolNumber";
    locala.xDd.put("protocolNumber", "INTEGER");
    localStringBuilder.append(" protocolNumber INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "logContent";
    locala.xDd.put("logContent", "TEXT");
    localStringBuilder.append(" logContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "createTime";
    locala.xDd.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(20885);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.g.e
 * JD-Core Version:    0.6.2
 */