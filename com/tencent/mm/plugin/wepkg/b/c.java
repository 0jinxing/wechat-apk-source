package com.tencent.mm.plugin.wepkg.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fr;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c extends fr
{
  public static final c.a fjX;

  static
  {
    AppMethodBeat.i(63391);
    c.a locala = new c.a();
    locala.xDb = new Field[14];
    locala.columns = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.xDd.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "key";
    locala.columns[1] = "pkgId";
    locala.xDd.put("pkgId", "TEXT");
    localStringBuilder.append(" pkgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "version";
    locala.xDd.put("version", "TEXT");
    localStringBuilder.append(" version TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "filePath";
    locala.xDd.put("filePath", "TEXT");
    localStringBuilder.append(" filePath TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "rid";
    locala.xDd.put("rid", "TEXT");
    localStringBuilder.append(" rid TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "mimeType";
    locala.xDd.put("mimeType", "TEXT");
    localStringBuilder.append(" mimeType TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "md5";
    locala.xDd.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "downloadUrl";
    locala.xDd.put("downloadUrl", "TEXT");
    localStringBuilder.append(" downloadUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "size";
    locala.xDd.put("size", "INTEGER");
    localStringBuilder.append(" size INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "downloadNetType";
    locala.xDd.put("downloadNetType", "INTEGER");
    localStringBuilder.append(" downloadNetType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "completeDownload";
    locala.xDd.put("completeDownload", "INTEGER default 'false' ");
    localStringBuilder.append(" completeDownload INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "createTime";
    locala.xDd.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "autoDownloadCount";
    locala.xDd.put("autoDownloadCount", "INTEGER default '0' ");
    localStringBuilder.append(" autoDownloadCount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "fileDownloadCount";
    locala.xDd.put("fileDownloadCount", "INTEGER default '0' ");
    localStringBuilder.append(" fileDownloadCount INTEGER default '0' ");
    locala.columns[14] = "rowid";
    locala.sql = localStringBuilder.toString();
    fjX = locala;
    AppMethodBeat.o(63391);
  }

  public final c.a Ag()
  {
    return fjX;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.b.c
 * JD-Core Version:    0.6.2
 */