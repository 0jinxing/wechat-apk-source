package com.tencent.mm.plugin.webview.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fm;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends fm
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(5623);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "appIdKey";
    locala.xDd.put("appIdKey", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" appIdKey TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "appIdKey";
    locala.columns[2] = "value";
    locala.xDd.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "weight";
    locala.xDd.put("weight", "TEXT");
    localStringBuilder.append(" weight TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "expireTime";
    locala.xDd.put("expireTime", "LONG");
    localStringBuilder.append(" expireTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "timeStamp";
    locala.xDd.put("timeStamp", "LONG");
    localStringBuilder.append(" timeStamp LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "size";
    locala.xDd.put("size", "LONG");
    localStringBuilder.append(" size LONG");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(5623);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.b.a
 * JD-Core Version:    0.6.2
 */