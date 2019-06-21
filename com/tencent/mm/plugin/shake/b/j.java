package com.tencent.mm.plugin.shake.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.shake.a.a.b;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class j extends b
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(24470);
    c.a locala = new c.a();
    locala.xDb = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.xDd.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "username";
    locala.columns[1] = "lastshaketime";
    locala.xDd.put("lastshaketime", "INTEGER default '0' ");
    localStringBuilder.append(" lastshaketime INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "isshowed";
    locala.xDd.put("isshowed", "INTEGER default 'false' ");
    localStringBuilder.append(" isshowed INTEGER default 'false' ");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(24470);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.j
 * JD-Core Version:    0.6.2
 */