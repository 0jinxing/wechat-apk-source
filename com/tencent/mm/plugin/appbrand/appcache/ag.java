package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dt;
import com.tencent.mm.plugin.appbrand.q.b;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class ag extends dt
  implements b
{
  static final c.a fjX;
  static final String[] gSr;

  static
  {
    int i = 0;
    AppMethodBeat.i(59451);
    gSr = new String[] { "appId", "appVersion" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[5];
    ((c.a)localObject1).columns = new String[6];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "appId";
    ((c.a)localObject1).xDd.put("appId", "TEXT");
    ((StringBuilder)localObject2).append(" appId TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "appVersion";
    ((c.a)localObject1).xDd.put("appVersion", "INTEGER");
    ((StringBuilder)localObject2).append(" appVersion INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "decryptKey";
    ((c.a)localObject1).xDd.put("decryptKey", "TEXT");
    ((StringBuilder)localObject2).append(" decryptKey TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "pkgMd5";
    ((c.a)localObject1).xDd.put("pkgMd5", "TEXT");
    ((StringBuilder)localObject2).append(" pkgMd5 TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[4] = "reportId";
    ((c.a)localObject1).xDd.put("reportId", "INTEGER");
    ((StringBuilder)localObject2).append(" reportId INTEGER");
    ((c.a)localObject1).columns[5] = "rowid";
    ((c.a)localObject1).sql = ((StringBuilder)localObject2).toString();
    fjX = (c.a)localObject1;
    localObject1 = " PRIMARY KEY ( ";
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
    localObject2 = fjX;
    ((c.a)localObject2).sql = (((c.a)localObject2).sql + "," + (String)localObject1);
    AppMethodBeat.o(59451);
  }

  public final c.a Ag()
  {
    return fjX;
  }

  public final String[] getKeys()
  {
    return gSr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ag
 * JD-Core Version:    0.6.2
 */