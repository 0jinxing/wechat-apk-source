package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.u;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n extends u
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(27350);
    c.a locala = new c.a();
    locala.xDb = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "flag";
    locala.xDd.put("flag", "LONG default '0' ");
    localStringBuilder.append(" flag LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "appId";
    locala.xDd.put("appId", "TEXT default '' ");
    localStringBuilder.append(" appId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "sortId";
    locala.xDd.put("sortId", "INTEGER default '0' ");
    localStringBuilder.append(" sortId INTEGER default '0' ");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(27350);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.n
 * JD-Core Version:    0.6.2
 */