package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cl;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class g extends cl
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(21933);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "svrId";
    locala.xDd.put("svrId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" svrId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "svrId";
    locala.columns[1] = "isRead";
    locala.xDd.put("isRead", "SHORT default '0' ");
    localStringBuilder.append(" isRead SHORT default '0' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "title";
    locala.xDd.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "content";
    locala.xDd.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "pushTime";
    locala.xDd.put("pushTime", "LONG");
    localStringBuilder.append(" pushTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "msgType";
    locala.xDd.put("msgType", "INTEGER");
    localStringBuilder.append(" msgType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "descUrl";
    locala.xDd.put("descUrl", "TEXT");
    localStringBuilder.append(" descUrl TEXT");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(21933);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.g
 * JD-Core Version:    0.6.2
 */