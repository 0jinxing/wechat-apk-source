package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.p;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class s$a extends p
{
  static final c.a fjX;
  static final String[] gSr;

  static
  {
    int i = 0;
    AppMethodBeat.i(129644);
    gSr = new String[] { "username", "versionType" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[4];
    ((c.a)localObject1).columns = new String[5];
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
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "orderSequence";
    ((c.a)localObject1).xDd.put("orderSequence", "LONG");
    ((StringBuilder)localObject2).append(" orderSequence LONG");
    ((c.a)localObject1).columns[4] = "rowid";
    ((c.a)localObject1).sql = ((StringBuilder)localObject2).toString();
    fjX = (c.a)localObject1;
    localObject2 = " PRIMARY KEY ( ";
    localObject1 = gSr;
    int j = localObject1.length;
    while (i < j)
    {
      str = localObject1[i];
      localObject2 = (String)localObject2 + ", " + str;
      i++;
    }
    localObject2 = ((String)localObject2).replaceFirst(",", "");
    String str = (String)localObject2 + " )";
    localObject1 = new StringBuilder();
    localObject2 = fjX;
    ((c.a)localObject2).sql = (((c.a)localObject2).sql + "," + str);
    AppMethodBeat.o(129644);
  }

  public final c.a Ag()
  {
    return fjX;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.s.a
 * JD-Core Version:    0.6.2
 */