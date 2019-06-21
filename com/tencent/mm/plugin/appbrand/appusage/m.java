package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.n;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class m extends n
{
  public static final String[] gSr;
  public static final c.a gSs;

  static
  {
    int i = 0;
    AppMethodBeat.i(129571);
    gSr = new String[] { "username", "versionType" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[3];
    ((c.a)localObject1).columns = new String[4];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "username";
    ((c.a)localObject1).xDd.put("username", "TEXT");
    ((StringBuilder)localObject2).append(" username TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "versionType";
    ((c.a)localObject1).xDd.put("versionType", "INTEGER");
    ((StringBuilder)localObject2).append(" versionType INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "updateTime";
    ((c.a)localObject1).xDd.put("updateTime", "LONG");
    ((StringBuilder)localObject2).append(" updateTime LONG");
    ((c.a)localObject1).columns[3] = "rowid";
    ((c.a)localObject1).sql = ((StringBuilder)localObject2).toString();
    gSs = (c.a)localObject1;
    localObject1 = " PRIMARY KEY ( ";
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
    AppMethodBeat.o(129571);
  }

  public final c.a Ag()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.m
 * JD-Core Version:    0.6.2
 */