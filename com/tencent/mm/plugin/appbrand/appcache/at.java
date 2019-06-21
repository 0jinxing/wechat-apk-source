package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.q;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class at extends q
{
  static final c.a fjX;
  public static final String[] gUR;

  static
  {
    int i = 0;
    AppMethodBeat.i(101723);
    gUR = new String[] { "appId", "version", "debugType" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[10];
    ((c.a)localObject1).columns = new String[11];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "appId";
    ((c.a)localObject1).xDd.put("appId", "TEXT");
    ((StringBuilder)localObject2).append(" appId TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "version";
    ((c.a)localObject1).xDd.put("version", "INTEGER");
    ((StringBuilder)localObject2).append(" version INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "versionMd5";
    ((c.a)localObject1).xDd.put("versionMd5", "TEXT");
    ((StringBuilder)localObject2).append(" versionMd5 TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "versionState";
    ((c.a)localObject1).xDd.put("versionState", "INTEGER");
    ((StringBuilder)localObject2).append(" versionState INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[4] = "pkgPath";
    ((c.a)localObject1).xDd.put("pkgPath", "TEXT");
    ((StringBuilder)localObject2).append(" pkgPath TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[5] = "createTime";
    ((c.a)localObject1).xDd.put("createTime", "LONG");
    ((StringBuilder)localObject2).append(" createTime LONG");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[6] = "debugType";
    ((c.a)localObject1).xDd.put("debugType", "INTEGER default '0' ");
    ((StringBuilder)localObject2).append(" debugType INTEGER default '0' ");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[7] = "downloadURL";
    ((c.a)localObject1).xDd.put("downloadURL", "TEXT");
    ((StringBuilder)localObject2).append(" downloadURL TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[8] = "startTime";
    ((c.a)localObject1).xDd.put("startTime", "LONG");
    ((StringBuilder)localObject2).append(" startTime LONG");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[9] = "endTime";
    ((c.a)localObject1).xDd.put("endTime", "LONG");
    ((StringBuilder)localObject2).append(" endTime LONG");
    ((c.a)localObject1).columns[10] = "rowid";
    ((c.a)localObject1).sql = ((StringBuilder)localObject2).toString();
    fjX = (c.a)localObject1;
    localObject2 = " PRIMARY KEY (";
    localObject1 = gUR;
    int j = localObject1.length;
    while (i < j)
    {
      str = localObject1[i];
      localObject2 = (String)localObject2 + ", " + str;
      i++;
    }
    localObject2 = ((String)localObject2).replaceFirst(",", "");
    String str = (String)localObject2 + " )";
    localObject2 = new StringBuilder();
    localObject1 = fjX;
    ((c.a)localObject1).sql = (((c.a)localObject1).sql + "," + str);
    AppMethodBeat.o(101723);
  }

  public final c.a Ag()
  {
    return fjX;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.at
 * JD-Core Version:    0.6.2
 */