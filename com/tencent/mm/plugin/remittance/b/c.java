package com.tencent.mm.plugin.remittance.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dw;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c extends dw
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(44706);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "transferId";
    locala.xDd.put("transferId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" transferId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "transferId";
    locala.columns[1] = "locaMsgId";
    locala.xDd.put("locaMsgId", "LONG");
    localStringBuilder.append(" locaMsgId LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "receiveStatus";
    locala.xDd.put("receiveStatus", "INTEGER default '-1' ");
    localStringBuilder.append(" receiveStatus INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "isSend";
    locala.xDd.put("isSend", "INTEGER");
    localStringBuilder.append(" isSend INTEGER");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(44706);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.b.c
 * JD-Core Version:    0.6.2
 */