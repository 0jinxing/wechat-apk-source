package com.tencent.mm.plugin.appbrand.game.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fz;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends fz
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(130108);
    c.a locala = new c.a();
    locala.xDb = new Field[9];
    locala.columns = new String[10];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "RecordId";
    locala.xDd.put("RecordId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" RecordId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "RecordId";
    locala.columns[1] = "AppId";
    locala.xDd.put("AppId", "TEXT");
    localStringBuilder.append(" AppId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "AppName";
    locala.xDd.put("AppName", "TEXT");
    localStringBuilder.append(" AppName TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "UserName";
    locala.xDd.put("UserName", "TEXT");
    localStringBuilder.append(" UserName TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "IconUrl";
    locala.xDd.put("IconUrl", "TEXT");
    localStringBuilder.append(" IconUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "BriefIntro";
    locala.xDd.put("BriefIntro", "TEXT");
    localStringBuilder.append(" BriefIntro TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "isSync";
    locala.xDd.put("isSync", "INTEGER default 'false' ");
    localStringBuilder.append(" isSync INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "debugType";
    locala.xDd.put("debugType", "INTEGER");
    localStringBuilder.append(" debugType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "createTime";
    locala.xDd.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    locala.columns[9] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(130108);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.a.b
 * JD-Core Version:    0.6.2
 */