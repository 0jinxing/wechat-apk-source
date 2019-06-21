package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.av;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k extends av
{
  static final String[] gSr;
  static final c.a gSs;

  static
  {
    int i = 0;
    AppMethodBeat.i(102101);
    gSr = new String[] { "appId", "versionType" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[3];
    ((c.a)localObject1).columns = new String[4];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "appId";
    ((c.a)localObject1).xDd.put("appId", "TEXT");
    ((StringBuilder)localObject2).append(" appId TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "versionType";
    ((c.a)localObject1).xDd.put("versionType", "INTEGER");
    ((StringBuilder)localObject2).append(" versionType INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "extJson";
    ((c.a)localObject1).xDd.put("extJson", "TEXT");
    ((StringBuilder)localObject2).append(" extJson TEXT");
    ((c.a)localObject1).columns[3] = "rowid";
    ((c.a)localObject1).sql = ((StringBuilder)localObject2).toString();
    gSs = (c.a)localObject1;
    localObject1 = " PRIMARY KEY (";
    localObject2 = gSr;
    int j = localObject2.length;
    while (i < j)
    {
      localObject3 = localObject2[i];
      localObject1 = (String)localObject1 + ", " + (String)localObject3;
      i++;
    }
    localObject1 = ((String)localObject1).replaceFirst(",", "");
    localObject1 = (String)localObject1 + " )";
    Object localObject3 = new StringBuilder();
    localObject2 = gSs;
    ((c.a)localObject2).sql = (((c.a)localObject2).sql + "," + (String)localObject1);
    AppMethodBeat.o(102101);
  }

  public final c.a Ag()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.k
 * JD-Core Version:    0.6.2
 */