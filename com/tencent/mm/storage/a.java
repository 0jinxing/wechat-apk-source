package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends c
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(118201);
    c.a locala = new c.a();
    locala.xDb = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "abtestkey";
    locala.xDd.put("abtestkey", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" abtestkey TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "abtestkey";
    locala.columns[1] = "value";
    locala.xDd.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "expId";
    locala.xDd.put("expId", "TEXT");
    localStringBuilder.append(" expId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "sequence";
    locala.xDd.put("sequence", "LONG");
    localStringBuilder.append(" sequence LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "prioritylevel";
    locala.xDd.put("prioritylevel", "INTEGER");
    localStringBuilder.append(" prioritylevel INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "startTime";
    locala.xDd.put("startTime", "LONG");
    localStringBuilder.append(" startTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "endTime";
    locala.xDd.put("endTime", "LONG");
    localStringBuilder.append(" endTime LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "noReport";
    locala.xDd.put("noReport", "INTEGER");
    localStringBuilder.append(" noReport INTEGER");
    locala.columns[8] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(118201);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean isValid()
  {
    AppMethodBeat.i(118200);
    long l = bo.anT();
    boolean bool;
    if ((l >= this.field_startTime) && (l < this.field_endTime))
    {
      bool = true;
      AppMethodBeat.o(118200);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118200);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.a
 * JD-Core Version:    0.6.2
 */