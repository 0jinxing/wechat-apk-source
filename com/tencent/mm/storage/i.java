package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.v;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i extends v
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(29002);
    c.a locala = new c.a();
    locala.xDb = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "deviceId";
    locala.xDd.put("deviceId", "TEXT default '' ");
    localStringBuilder.append(" deviceId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "sessionName";
    locala.xDd.put("sessionName", "TEXT default '' ");
    localStringBuilder.append(" sessionName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "moveTime";
    locala.xDd.put("moveTime", "BLOB default '' ");
    localStringBuilder.append(" moveTime BLOB default '' ");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(29002);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.i
 * JD-Core Version:    0.6.2
 */