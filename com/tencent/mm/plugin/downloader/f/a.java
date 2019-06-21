package com.tencent.mm.plugin.downloader.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.br;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends br
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(2481);
    c.a locala = new c.a();
    locala.xDb = new Field[33];
    locala.columns = new String[34];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "downloadId";
    locala.xDd.put("downloadId", "LONG default '-1'  PRIMARY KEY ");
    localStringBuilder.append(" downloadId LONG default '-1'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "downloadId";
    locala.columns[1] = "downloadUrl";
    locala.xDd.put("downloadUrl", "TEXT default '' ");
    localStringBuilder.append(" downloadUrl TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "secondaryUrl";
    locala.xDd.put("secondaryUrl", "TEXT default '' ");
    localStringBuilder.append(" secondaryUrl TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "fileSize";
    locala.xDd.put("fileSize", "LONG default '0' ");
    localStringBuilder.append(" fileSize LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "fileName";
    locala.xDd.put("fileName", "TEXT default '' ");
    localStringBuilder.append(" fileName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "filePath";
    locala.xDd.put("filePath", "TEXT default '' ");
    localStringBuilder.append(" filePath TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "fileType";
    locala.xDd.put("fileType", "INTEGER default '0' ");
    localStringBuilder.append(" fileType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "status";
    locala.xDd.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "md5";
    locala.xDd.put("md5", "TEXT default '' ");
    localStringBuilder.append(" md5 TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "autoInstall";
    locala.xDd.put("autoInstall", "INTEGER default 'false' ");
    localStringBuilder.append(" autoInstall INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "showNotification";
    locala.xDd.put("showNotification", "INTEGER default 'false' ");
    localStringBuilder.append(" showNotification INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "sysDownloadId";
    locala.xDd.put("sysDownloadId", "LONG default '-1' ");
    localStringBuilder.append(" sysDownloadId LONG default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "downloaderType";
    locala.xDd.put("downloaderType", "INTEGER default '0' ");
    localStringBuilder.append(" downloaderType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "appId";
    locala.xDd.put("appId", "TEXT default '' ");
    localStringBuilder.append(" appId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "downloadUrlHashCode";
    locala.xDd.put("downloadUrlHashCode", "INTEGER default '0' ");
    localStringBuilder.append(" downloadUrlHashCode INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "packageName";
    locala.xDd.put("packageName", "TEXT default '' ");
    localStringBuilder.append(" packageName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "downloadedSize";
    locala.xDd.put("downloadedSize", "LONG default '0' ");
    localStringBuilder.append(" downloadedSize LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[17] = "totalSize";
    locala.xDd.put("totalSize", "LONG default '0' ");
    localStringBuilder.append(" totalSize LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "autoDownload";
    locala.xDd.put("autoDownload", "INTEGER default 'false' ");
    localStringBuilder.append(" autoDownload INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "channelId";
    locala.xDd.put("channelId", "TEXT default '' ");
    localStringBuilder.append(" channelId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "scene";
    locala.xDd.put("scene", "INTEGER default '0' ");
    localStringBuilder.append(" scene INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[21] = "errCode";
    locala.xDd.put("errCode", "INTEGER default '0' ");
    localStringBuilder.append(" errCode INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[22] = "startTime";
    locala.xDd.put("startTime", "LONG default '0' ");
    localStringBuilder.append(" startTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[23] = "startSize";
    locala.xDd.put("startSize", "LONG default '0' ");
    localStringBuilder.append(" startSize LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[24] = "startState";
    locala.xDd.put("startState", "INTEGER default '0' ");
    localStringBuilder.append(" startState INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[25] = "fromWeApp";
    locala.xDd.put("fromWeApp", "INTEGER default 'false' ");
    localStringBuilder.append(" fromWeApp INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[26] = "downloadInWifi";
    locala.xDd.put("downloadInWifi", "INTEGER default 'false' ");
    localStringBuilder.append(" downloadInWifi INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[27] = "extInfo";
    locala.xDd.put("extInfo", "TEXT default '' ");
    localStringBuilder.append(" extInfo TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[28] = "finishTime";
    locala.xDd.put("finishTime", "LONG default '0' ");
    localStringBuilder.append(" finishTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[29] = "isSecondDownload";
    locala.xDd.put("isSecondDownload", "INTEGER default 'false' ");
    localStringBuilder.append(" isSecondDownload INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[30] = "fromDownloadApp";
    locala.xDd.put("fromDownloadApp", "INTEGER default 'false' ");
    localStringBuilder.append(" fromDownloadApp INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[31] = "updateTime";
    locala.xDd.put("updateTime", "LONG default '0' ");
    localStringBuilder.append(" updateTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[32] = "reserveInWifi";
    locala.xDd.put("reserveInWifi", "INTEGER default 'false' ");
    localStringBuilder.append(" reserveInWifi INTEGER default 'false' ");
    locala.columns[33] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(2481);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.f.a
 * JD-Core Version:    0.6.2
 */