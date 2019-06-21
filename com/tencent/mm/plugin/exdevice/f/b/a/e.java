package com.tencent.mm.plugin.exdevice.f.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cf;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class e extends cf
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(19489);
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "rankID";
    locala.xDd.put("rankID", "TEXT");
    localStringBuilder.append(" rankID TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "appusername";
    locala.xDd.put("appusername", "TEXT");
    localStringBuilder.append(" appusername TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "username";
    locala.xDd.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "timestamp";
    locala.xDd.put("timestamp", "INTEGER default '0' ");
    localStringBuilder.append(" timestamp INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "liketips";
    locala.xDd.put("liketips", "TEXT default '' ");
    localStringBuilder.append(" liketips TEXT default '' ");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(19489);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.b.a.e
 * JD-Core Version:    0.6.2
 */