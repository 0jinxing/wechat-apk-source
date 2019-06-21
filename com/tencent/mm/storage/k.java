package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.w;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k extends w
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(29010);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgListDataId";
    locala.xDd.put("msgListDataId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" msgListDataId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "msgListDataId";
    locala.columns[1] = "sessionName";
    locala.xDd.put("sessionName", "TEXT default '' ");
    localStringBuilder.append(" sessionName TEXT default '' ");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(29010);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.k
 * JD-Core Version:    0.6.2
 */