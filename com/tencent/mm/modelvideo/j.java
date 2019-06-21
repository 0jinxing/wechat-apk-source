package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.eg;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class j extends eg
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(50726);
    c.a locala = new c.a();
    locala.xDb = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.xDd.put("localId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" localId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "localId";
    locala.columns[1] = "fileName";
    locala.xDd.put("fileName", "TEXT");
    localStringBuilder.append(" fileName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "fileNameHash";
    locala.xDd.put("fileNameHash", "INTEGER");
    localStringBuilder.append(" fileNameHash INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "fileMd5";
    locala.xDd.put("fileMd5", "TEXT default '' ");
    localStringBuilder.append(" fileMd5 TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "fileLength";
    locala.xDd.put("fileLength", "LONG default '0' ");
    localStringBuilder.append(" fileLength LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "fileStatus";
    locala.xDd.put("fileStatus", "INTEGER default '0' ");
    localStringBuilder.append(" fileStatus INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "fileDuration";
    locala.xDd.put("fileDuration", "INTEGER default '0' ");
    localStringBuilder.append(" fileDuration INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "createTime";
    locala.xDd.put("createTime", "LONG default '0' ");
    localStringBuilder.append(" createTime LONG default '0' ");
    locala.columns[8] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(50726);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.j
 * JD-Core Version:    0.6.2
 */