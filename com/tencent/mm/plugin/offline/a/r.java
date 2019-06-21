package com.tencent.mm.plugin.offline.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dd;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class r extends dd
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(43420);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "reqkey";
    locala.xDd.put("reqkey", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" reqkey TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "reqkey";
    locala.columns[1] = "ack_key";
    locala.xDd.put("ack_key", "TEXT");
    localStringBuilder.append(" ack_key TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "receive_time";
    locala.xDd.put("receive_time", "LONG");
    localStringBuilder.append(" receive_time LONG");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(43420);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.r
 * JD-Core Version:    0.6.2
 */