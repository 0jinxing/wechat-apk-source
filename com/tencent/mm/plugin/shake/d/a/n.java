package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.shake.a.a.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n extends c
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(24677);
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.xDd.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "username";
    locala.columns[1] = "deeplink";
    locala.xDd.put("deeplink", "TEXT default '' ");
    localStringBuilder.append(" deeplink TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "title";
    locala.xDd.put("title", "TEXT default '' ");
    localStringBuilder.append(" title TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "iconurl";
    locala.xDd.put("iconurl", "TEXT default '' ");
    localStringBuilder.append(" iconurl TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "createtime";
    locala.xDd.put("createtime", "LONG default '' ");
    localStringBuilder.append(" createtime LONG default '' ");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(24677);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.n
 * JD-Core Version:    0.6.2
 */