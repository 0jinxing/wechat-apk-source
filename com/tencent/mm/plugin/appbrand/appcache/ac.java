package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dn;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class ac extends dn
{
  static final String[] gSr;
  static final c.a gSs;

  static
  {
    int i = 0;
    AppMethodBeat.i(129409);
    gSr = new String[] { "appId", "type" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[4];
    ((c.a)localObject1).columns = new String[5];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "appId";
    ((c.a)localObject1).xDd.put("appId", "TEXT");
    ((StringBuilder)localObject2).append(" appId TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "type";
    ((c.a)localObject1).xDd.put("type", "INTEGER");
    ((StringBuilder)localObject2).append(" type INTEGER");
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
    localObject2 = " PRIMARY KEY (";
    localObject1 = gSr;
    int j = localObject1.length;
    while (i < j)
    {
      localObject3 = localObject1[i];
      localObject2 = (String)localObject2 + ", " + (String)localObject3;
      i++;
    }
    localObject2 = ((String)localObject2).replaceFirst(",", "");
    localObject2 = (String)localObject2 + " )";
    localObject1 = new StringBuilder();
    Object localObject3 = gSs;
    ((c.a)localObject3).sql = (((c.a)localObject3).sql + "," + (String)localObject2);
    AppMethodBeat.o(129409);
  }

  public final c.a Ag()
  {
    return gSs;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ac
 * JD-Core Version:    0.6.2
 */