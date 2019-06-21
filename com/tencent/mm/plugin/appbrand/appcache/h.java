package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ao;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class h extends ao
{
  static final String[] gSr;
  static final c.a gSs;

  static
  {
    int i = 0;
    AppMethodBeat.i(129334);
    gSr = new String[] { "appId", "version" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[4];
    ((c.a)localObject1).columns = new String[5];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "appId";
    ((c.a)localObject1).xDd.put("appId", "TEXT");
    ((StringBuilder)localObject2).append(" appId TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "version";
    ((c.a)localObject1).xDd.put("version", "INTEGER");
    ((StringBuilder)localObject2).append(" version INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "hit";
    ((c.a)localObject1).xDd.put("hit", "INTEGER");
    ((StringBuilder)localObject2).append(" hit INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "hitTimeMS";
    ((c.a)localObject1).xDd.put("hitTimeMS", "LONG");
    ((StringBuilder)localObject2).append(" hitTimeMS LONG");
    ((c.a)localObject1).columns[4] = "rowid";
    ((c.a)localObject1).sql = ((StringBuilder)localObject2).toString();
    gSs = (c.a)localObject1;
    localObject1 = " PRIMARY KEY (";
    localObject2 = gSr;
    int j = localObject2.length;
    while (i < j)
    {
      str = localObject2[i];
      localObject1 = (String)localObject1 + ", " + str;
      i++;
    }
    localObject1 = ((String)localObject1).replaceFirst(",", "");
    String str = (String)localObject1 + " )";
    localObject1 = new StringBuilder();
    localObject2 = gSs;
    ((c.a)localObject2).sql = (((c.a)localObject2).sql + "," + str);
    AppMethodBeat.o(129334);
  }

  public final c.a Ag()
  {
    return gSs;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.h
 * JD-Core Version:    0.6.2
 */