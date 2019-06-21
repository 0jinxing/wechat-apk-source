package com.tencent.mm.plugin.aa.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends com.tencent.mm.g.c.a
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(40663);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "payMsgId";
    locala.xDd.put("payMsgId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" payMsgId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "payMsgId";
    locala.columns[1] = "insertmsg";
    locala.xDd.put("insertmsg", "INTEGER");
    localStringBuilder.append(" insertmsg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "chatroom";
    locala.xDd.put("chatroom", "TEXT");
    localStringBuilder.append(" chatroom TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "msgId";
    locala.xDd.put("msgId", "LONG");
    localStringBuilder.append(" msgId LONG");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(40663);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.b.a
 * JD-Core Version:    0.6.2
 */