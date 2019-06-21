package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dq;
import com.tencent.mm.plugin.appbrand.q.b;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Map;

public final class ae extends dq
  implements b
{
  static final c.a fjX;
  static final String[] gSr;

  static
  {
    int i = 0;
    AppMethodBeat.i(59446);
    gSr = new String[] { "appId", "type", "version" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).xDb = new Field[5];
    ((c.a)localObject1).columns = new String[6];
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
    ((c.a)localObject1).columns[3] = "pkgMd5";
    ((c.a)localObject1).xDd.put("pkgMd5", "TEXT");
    ((StringBuilder)localObject2).append(" pkgMd5 TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[4] = "pkgPath";
    ((c.a)localObject1).xDd.put("pkgPath", "TEXT");
    ((StringBuilder)localObject2).append(" pkgPath TEXT");
    ((c.a)localObject1).columns[5] = "rowid";
    ((c.a)localObject1).sql = ((StringBuilder)localObject2).toString();
    fjX = (c.a)localObject1;
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
    localObject2 = new StringBuilder();
    localObject1 = fjX;
    ((c.a)localObject1).sql = (((c.a)localObject1).sql + "," + str);
    AppMethodBeat.o(59446);
  }

  public final c.a Ag()
  {
    return fjX;
  }

  public final String[] getKeys()
  {
    return gSr;
  }

  public final String toShortString()
  {
    AppMethodBeat.i(59445);
    String str = String.format(Locale.US, "EncryptPkgInfo[%s %d %d]", new Object[] { this.field_appId, Integer.valueOf(this.field_type), Integer.valueOf(this.field_version) });
    AppMethodBeat.o(59445);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ae
 * JD-Core Version:    0.6.2
 */