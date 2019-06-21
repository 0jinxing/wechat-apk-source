package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ay;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class e extends ay
{
  public static c.a fjX;

  static
  {
    AppMethodBeat.i(70649);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "id";
    locala.xDd.put("id", "TEXT");
    localStringBuilder.append(" id TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "cacheKey";
    locala.xDd.put("cacheKey", "TEXT");
    localStringBuilder.append(" cacheKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "data";
    locala.xDd.put("data", "TEXT");
    localStringBuilder.append(" data TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "interval";
    locala.xDd.put("interval", "INTEGER");
    localStringBuilder.append(" interval INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "updateTime";
    locala.xDd.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    fjX = locala;
    AppMethodBeat.o(70649);
  }

  public final c.a Ag()
  {
    return fjX;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.e
 * JD-Core Version:    0.6.2
 */