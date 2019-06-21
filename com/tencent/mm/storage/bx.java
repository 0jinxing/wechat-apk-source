package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ev;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class bx extends ev
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(59016);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "tableHash";
    locala.xDd.put("tableHash", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" tableHash INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "tableHash";
    locala.columns[1] = "tableSQLMD5";
    locala.xDd.put("tableSQLMD5", "TEXT");
    localStringBuilder.append(" tableSQLMD5 TEXT");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(59016);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bx
 * JD-Core Version:    0.6.2
 */