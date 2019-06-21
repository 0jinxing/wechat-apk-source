package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ab;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class f extends ab
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(11556);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "brandUserName";
    locala.xDd.put("brandUserName", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" brandUserName TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "brandUserName";
    locala.columns[1] = "userId";
    locala.xDd.put("userId", "TEXT");
    localStringBuilder.append(" userId TEXT");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(11556);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.f
 * JD-Core Version:    0.6.2
 */