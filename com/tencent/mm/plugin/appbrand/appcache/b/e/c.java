package com.tencent.mm.plugin.appbrand.appcache.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dp;
import com.tencent.mm.plugin.appbrand.q.b;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c extends dp
  implements b
{
  static final c.a fjX;
  static final String[] gSr;

  static
  {
    int i = 0;
    AppMethodBeat.i(129510);
    gSr = new String[] { "appId", "type", "version" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[11];
    ((c.a)localObject1).columns = new String[12];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "appId";
    ((c.a)localObject1).xDd.put("appId", "TEXT");
    ((StringBuilder)localObject2).append(" appId TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "version";
    ((c.a)localObject1).xDd.put("version", "INTEGER");
    ((StringBuilder)localObject2).append(" version INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "type";
    ((c.a)localObject1).xDd.put("type", "INTEGER");
    ((StringBuilder)localObject2).append(" type INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "retryTimes";
    ((c.a)localObject1).xDd.put("retryTimes", "INTEGER");
    ((StringBuilder)localObject2).append(" retryTimes INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[4] = "retriedCount";
    ((c.a)localObject1).xDd.put("retriedCount", "INTEGER");
    ((StringBuilder)localObject2).append(" retriedCount INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[5] = "retryInterval";
    ((c.a)localObject1).xDd.put("retryInterval", "LONG");
    ((StringBuilder)localObject2).append(" retryInterval LONG");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[6] = "networkType";
    ((c.a)localObject1).xDd.put("networkType", "INTEGER");
    ((StringBuilder)localObject2).append(" networkType INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[7] = "pkgMd5";
    ((c.a)localObject1).xDd.put("pkgMd5", "TEXT");
    ((StringBuilder)localObject2).append(" pkgMd5 TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[8] = "lastRetryTime";
    ((c.a)localObject1).xDd.put("lastRetryTime", "LONG");
    ((StringBuilder)localObject2).append(" lastRetryTime LONG");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[9] = "firstTimeTried";
    ((c.a)localObject1).xDd.put("firstTimeTried", "INTEGER");
    ((StringBuilder)localObject2).append(" firstTimeTried INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[10] = "reportId";
    ((c.a)localObject1).xDd.put("reportId", "INTEGER");
    ((StringBuilder)localObject2).append(" reportId INTEGER");
    ((c.a)localObject1).columns[11] = "rowid";
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
    localObject2 = (String)localObject1 + " )";
    Object localObject3 = new StringBuilder();
    localObject1 = fjX;
    ((c.a)localObject1).sql = (((c.a)localObject1).sql + "," + (String)localObject2);
    AppMethodBeat.o(129510);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.e.c
 * JD-Core Version:    0.6.2
 */