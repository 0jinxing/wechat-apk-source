package com.tencent.mm.openim.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.de;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends de
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(78981);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "acctTypeId";
    locala.xDd.put("acctTypeId", "TEXT");
    localStringBuilder.append(" acctTypeId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "language";
    locala.xDd.put("language", "TEXT");
    localStringBuilder.append(" language TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "accTypeRec";
    locala.xDd.put("accTypeRec", "BLOB");
    localStringBuilder.append(" accTypeRec BLOB");
    localStringBuilder.append(", ");
    locala.columns[3] = "updateTime";
    locala.xDd.put("updateTime", "LONG default '0' ");
    localStringBuilder.append(" updateTime LONG default '0' ");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(78981);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.e.a
 * JD-Core Version:    0.6.2
 */