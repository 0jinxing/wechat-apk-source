package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ct;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class j extends ct
{
  public static final c.a gSs;

  static
  {
    AppMethodBeat.i(70661);
    c.a locala = new c.a();
    locala.xDb = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appIdHash";
    locala.xDd.put("appIdHash", "INTEGER");
    localStringBuilder.append(" appIdHash INTEGER");
    localStringBuilder.append(", ");
    locala.columns[1] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "pkgType";
    locala.xDd.put("pkgType", "INTEGER");
    localStringBuilder.append(" pkgType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "widgetType";
    locala.xDd.put("widgetType", "INTEGER");
    localStringBuilder.append(" widgetType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "launchAction";
    locala.xDd.put("launchAction", "BLOB");
    localStringBuilder.append(" launchAction BLOB");
    localStringBuilder.append(", ");
    locala.columns[5] = "jsApiInfo";
    locala.xDd.put("jsApiInfo", "BLOB");
    localStringBuilder.append(" jsApiInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[6] = "versionInfo";
    locala.xDd.put("versionInfo", "BLOB");
    localStringBuilder.append(" versionInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[7] = "widgetSetting";
    locala.xDd.put("widgetSetting", "BLOB");
    localStringBuilder.append(" widgetSetting BLOB");
    locala.columns[8] = "rowid";
    locala.sql = localStringBuilder.toString();
    gSs = locala;
    AppMethodBeat.o(70661);
  }

  public final c.a Ag()
  {
    return gSs;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.j
 * JD-Core Version:    0.6.2
 */