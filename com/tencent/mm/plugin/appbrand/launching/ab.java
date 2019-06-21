package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cr;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class ab extends cr
{
  public static final c.a gSs;

  static
  {
    AppMethodBeat.i(94157);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "launchPB";
    locala.xDd.put("launchPB", "BLOB");
    localStringBuilder.append(" launchPB BLOB");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    gSs = locala;
    AppMethodBeat.o(94157);
  }

  public final c.a Ag()
  {
    return gSs;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ab
 * JD-Core Version:    0.6.2
 */