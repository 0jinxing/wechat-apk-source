package com.tencent.mm.af.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fx;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends fx
{
  public static c.a fjX;

  static
  {
    AppMethodBeat.i(51123);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "shareKeyHash";
    locala.xDd.put("shareKeyHash", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" shareKeyHash INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "shareKeyHash";
    locala.columns[1] = "btnState";
    locala.xDd.put("btnState", "INTEGER");
    localStringBuilder.append(" btnState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "msgState";
    locala.xDd.put("msgState", "INTEGER");
    localStringBuilder.append(" msgState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "content";
    locala.xDd.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "contentColor";
    locala.xDd.put("contentColor", "TEXT");
    localStringBuilder.append(" contentColor TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "updatePeroid";
    locala.xDd.put("updatePeroid", "INTEGER");
    localStringBuilder.append(" updatePeroid INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    fjX = locala;
    AppMethodBeat.o(51123);
  }

  public final c.a Ag()
  {
    return fjX;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.a.b
 * JD-Core Version:    0.6.2
 */