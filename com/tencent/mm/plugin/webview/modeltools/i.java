package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fo;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i extends fo
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(7021);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "host";
    locala.xDd.put("host", "TEXT");
    localStringBuilder.append(" host TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "expireTime";
    locala.xDd.put("expireTime", "LONG");
    localStringBuilder.append(" expireTime LONG");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(7021);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.i
 * JD-Core Version:    0.6.2
 */