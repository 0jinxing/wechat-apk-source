package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cn;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k extends cn
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(21942);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "phonenumber";
    locala.xDd.put("phonenumber", "TEXT");
    localStringBuilder.append(" phonenumber TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "calltime";
    locala.xDd.put("calltime", "LONG");
    localStringBuilder.append(" calltime LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "duration";
    locala.xDd.put("duration", "LONG");
    localStringBuilder.append(" duration LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "addressId";
    locala.xDd.put("addressId", "LONG default '-1' ");
    localStringBuilder.append(" addressId LONG default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "phoneType";
    locala.xDd.put("phoneType", "INTEGER default '-1' ");
    localStringBuilder.append(" phoneType INTEGER default '-1' ");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(21942);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.k
 * JD-Core Version:    0.6.2
 */