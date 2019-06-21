package com.tencent.mm.plugin.appbrand.appcache.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.do;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends do
{
  static final c.a fjX;

  static
  {
    AppMethodBeat.i(129505);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.xDd.put("username", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" username TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "username";
    locala.columns[1] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "startTime";
    locala.xDd.put("startTime", "LONG");
    localStringBuilder.append(" startTime LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "endTime";
    locala.xDd.put("endTime", "LONG");
    localStringBuilder.append(" endTime LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "sceneList";
    locala.xDd.put("sceneList", "TEXT");
    localStringBuilder.append(" sceneList TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "cgiList";
    locala.xDd.put("cgiList", "TEXT");
    localStringBuilder.append(" cgiList TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "reportId";
    locala.xDd.put("reportId", "INTEGER");
    localStringBuilder.append(" reportId INTEGER");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    fjX = locala;
    AppMethodBeat.o(129505);
  }

  public final c.a Ag()
  {
    return fjX;
  }

  public final String toString()
  {
    AppMethodBeat.i(129504);
    String str = "CmdBlockCgiPersistentInfo{field_username='" + this.field_username + '\'' + ", field_appId='" + this.field_appId + '\'' + ", field_startTime=" + this.field_startTime + ", field_endTime=" + this.field_endTime + ", field_sceneList='" + this.field_sceneList + '\'' + ", field_cgiList='" + this.field_cgiList + '\'' + ", field_reportId=" + this.field_reportId + '}';
    AppMethodBeat.o(129504);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.e.a
 * JD-Core Version:    0.6.2
 */