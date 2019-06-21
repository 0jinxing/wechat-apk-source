package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dm;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class aa extends dm
{
  static final String[] gSr;
  static final c.a gSs;

  static
  {
    int i = 0;
    AppMethodBeat.i(129406);
    gSr = new String[] { "key", "version" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[4];
    ((c.a)localObject1).columns = new String[5];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "key";
    ((c.a)localObject1).xDd.put("key", "TEXT");
    ((StringBuilder)localObject2).append(" key TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "version";
    ((c.a)localObject1).xDd.put("version", "INTEGER");
    ((StringBuilder)localObject2).append(" version INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "scene";
    ((c.a)localObject1).xDd.put("scene", "INTEGER");
    ((StringBuilder)localObject2).append(" scene INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "updateTime";
    ((c.a)localObject1).xDd.put("updateTime", "LONG");
    ((StringBuilder)localObject2).append(" updateTime LONG");
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
    Object localObject3 = new StringBuilder();
    localObject1 = gSs;
    ((c.a)localObject1).sql = (((c.a)localObject1).sql + "," + (String)localObject2);
    AppMethodBeat.o(129406);
  }

  public final c.a Ag()
  {
    return gSs;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.aa
 * JD-Core Version:    0.6.2
 */