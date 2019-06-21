package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.be;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i extends be
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(62856);
    c.a locala = new c.a();
    locala.xDb = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "productID";
    locala.xDd.put("productID", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" productID TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "productID";
    locala.columns[1] = "content";
    locala.xDd.put("content", "BLOB default '' ");
    localStringBuilder.append(" content BLOB default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "lan";
    locala.xDd.put("lan", "TEXT default '' ");
    localStringBuilder.append(" lan TEXT default '' ");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(62856);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.i
 * JD-Core Version:    0.6.2
 */