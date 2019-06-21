package com.tencent.mm.plugin.expt.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bi;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends bi
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(73607);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "exptKey";
    locala.xDd.put("exptKey", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" exptKey TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "exptKey";
    locala.columns[1] = "exptId";
    locala.xDd.put("exptId", "INTEGER");
    localStringBuilder.append(" exptId INTEGER");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(73607);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.e.a
 * JD-Core Version:    0.6.2
 */