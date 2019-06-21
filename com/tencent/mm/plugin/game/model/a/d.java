package com.tencent.mm.plugin.game.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bz;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class d extends bz
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(111507);
    c.a locala = new c.a();
    locala.xDb = new Field[17];
    locala.columns = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.xDd.put("appId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" appId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "appId";
    locala.columns[1] = "downloadUrl";
    locala.xDd.put("downloadUrl", "TEXT");
    localStringBuilder.append(" downloadUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "size";
    locala.xDd.put("size", "LONG default '0' ");
    localStringBuilder.append(" size LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "md5";
    locala.xDd.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "packageName";
    locala.xDd.put("packageName", "TEXT");
    localStringBuilder.append(" packageName TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "expireTime";
    locala.xDd.put("expireTime", "LONG default '0' ");
    localStringBuilder.append(" expireTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "randomTime";
    locala.xDd.put("randomTime", "LONG default '0' ");
    localStringBuilder.append(" randomTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "isFirst";
    locala.xDd.put("isFirst", "INTEGER default 'true' ");
    localStringBuilder.append(" isFirst INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "nextCheckTime";
    locala.xDd.put("nextCheckTime", "LONG default '0' ");
    localStringBuilder.append(" nextCheckTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "isRunning";
    locala.xDd.put("isRunning", "INTEGER default 'false' ");
    localStringBuilder.append(" isRunning INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "noWifi";
    locala.xDd.put("noWifi", "INTEGER default 'true' ");
    localStringBuilder.append(" noWifi INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "noSdcard";
    locala.xDd.put("noSdcard", "INTEGER default 'true' ");
    localStringBuilder.append(" noSdcard INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "noEnoughSpace";
    locala.xDd.put("noEnoughSpace", "INTEGER default 'true' ");
    localStringBuilder.append(" noEnoughSpace INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "lowBattery";
    locala.xDd.put("lowBattery", "INTEGER default 'true' ");
    localStringBuilder.append(" lowBattery INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "continueDelay";
    locala.xDd.put("continueDelay", "INTEGER default 'true' ");
    localStringBuilder.append(" continueDelay INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "SecondaryUrl";
    locala.xDd.put("SecondaryUrl", "TEXT");
    localStringBuilder.append(" SecondaryUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "downloadInWidget";
    locala.xDd.put("downloadInWidget", "INTEGER");
    localStringBuilder.append(" downloadInWidget INTEGER");
    locala.columns[17] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(111507);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.d
 * JD-Core Version:    0.6.2
 */