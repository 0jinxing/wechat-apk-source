package com.tencent.mm.plugin.cdndownloader.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.al;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends al
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(958);
    c.a locala = new c.a();
    locala.xDb = new Field[9];
    locala.columns = new String[10];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "mediaId";
    locala.xDd.put("mediaId", "TEXT");
    localStringBuilder.append(" mediaId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "downloadUrlHashCode";
    locala.xDd.put("downloadUrlHashCode", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" downloadUrlHashCode INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "downloadUrlHashCode";
    locala.columns[2] = "downloadUrl";
    locala.xDd.put("downloadUrl", "TEXT");
    localStringBuilder.append(" downloadUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "httpsUrl";
    locala.xDd.put("httpsUrl", "TEXT");
    localStringBuilder.append(" httpsUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "filePath";
    locala.xDd.put("filePath", "TEXT");
    localStringBuilder.append(" filePath TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "verifyHeaders";
    locala.xDd.put("verifyHeaders", "TEXT");
    localStringBuilder.append(" verifyHeaders TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "game_package_download";
    locala.xDd.put("game_package_download", "INTEGER");
    localStringBuilder.append(" game_package_download INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "allowMobileNetDownload";
    locala.xDd.put("allowMobileNetDownload", "INTEGER");
    localStringBuilder.append(" allowMobileNetDownload INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "wifiAutoDownload";
    locala.xDd.put("wifiAutoDownload", "INTEGER");
    localStringBuilder.append(" wifiAutoDownload INTEGER");
    locala.columns[9] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(958);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.f.a
 * JD-Core Version:    0.6.2
 */