package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bd;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class g extends bd
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(62849);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "designerIDAndType";
    locala.xDd.put("designerIDAndType", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" designerIDAndType TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "designerIDAndType";
    locala.columns[1] = "content";
    locala.xDd.put("content", "BLOB default '' ");
    localStringBuilder.append(" content BLOB default '' ");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(62849);
  }

  public final c.a Ag()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.g
 * JD-Core Version:    0.6.2
 */