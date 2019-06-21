package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.j;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c extends j
{
  public static c.a hcb;
  static final String[] hcc;

  static
  {
    int i = 0;
    AppMethodBeat.i(129770);
    hcc = new String[] { "username", "fetchType" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[7];
    ((c.a)localObject1).columns = new String[8];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "username";
    ((c.a)localObject1).xDd.put("username", "TEXT");
    ((StringBuilder)localObject2).append(" username TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "fetchType";
    ((c.a)localObject1).xDd.put("fetchType", "INTEGER");
    ((StringBuilder)localObject2).append(" fetchType INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "updateTime";
    ((c.a)localObject1).xDd.put("updateTime", "LONG");
    ((StringBuilder)localObject2).append(" updateTime LONG");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "path";
    ((c.a)localObject1).xDd.put("path", "TEXT");
    ((StringBuilder)localObject2).append(" path TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[4] = "query";
    ((c.a)localObject1).xDd.put("query", "TEXT");
    ((StringBuilder)localObject2).append(" query TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[5] = "scene";
    ((c.a)localObject1).xDd.put("scene", "INTEGER");
    ((StringBuilder)localObject2).append(" scene INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[6] = "data";
    ((c.a)localObject1).xDd.put("data", "TEXT");
    ((StringBuilder)localObject2).append(" data TEXT");
    ((c.a)localObject1).columns[7] = "rowid";
    ((c.a)localObject1).sql = ((StringBuilder)localObject2).toString();
    hcb = (c.a)localObject1;
    localObject2 = " PRIMARY KEY ( ";
    localObject1 = hcc;
    int j = localObject1.length;
    while (i < j)
    {
      localObject3 = localObject1[i];
      localObject2 = (String)localObject2 + ", " + (String)localObject3;
      i++;
    }
    localObject2 = ((String)localObject2).replaceFirst(",", "");
    localObject1 = (String)localObject2 + " )";
    Object localObject3 = new StringBuilder();
    localObject2 = hcb;
    ((c.a)localObject2).sql = (((c.a)localObject2).sql + "," + (String)localObject1);
    AppMethodBeat.o(129770);
  }

  public final c.a Ag()
  {
    return hcb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.c
 * JD-Core Version:    0.6.2
 */