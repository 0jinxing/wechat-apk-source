package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ar;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class af extends ar
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(29023);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "labelID";
    locala.xDd.put("labelID", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" labelID INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "labelID";
    locala.columns[1] = "labelName";
    locala.xDd.put("labelName", "TEXT");
    localStringBuilder.append(" labelName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "labelPYFull";
    locala.xDd.put("labelPYFull", "TEXT");
    localStringBuilder.append(" labelPYFull TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "labelPYShort";
    locala.xDd.put("labelPYShort", "TEXT");
    localStringBuilder.append(" labelPYShort TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "createTime";
    locala.xDd.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "isTemporary";
    locala.xDd.put("isTemporary", "INTEGER");
    localStringBuilder.append(" isTemporary INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(29023);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.af
 * JD-Core Version:    0.6.2
 */