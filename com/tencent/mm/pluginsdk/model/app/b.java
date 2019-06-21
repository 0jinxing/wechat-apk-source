package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.h;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends h
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(79230);
    c.a locala = new c.a();
    locala.xDb = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "sdkVer";
    locala.xDd.put("sdkVer", "LONG");
    localStringBuilder.append(" sdkVer LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "mediaSvrId";
    locala.xDd.put("mediaSvrId", "TEXT");
    localStringBuilder.append(" mediaSvrId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "mediaId";
    locala.xDd.put("mediaId", "TEXT");
    localStringBuilder.append(" mediaId TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "clientAppDataId";
    locala.xDd.put("clientAppDataId", "TEXT");
    localStringBuilder.append(" clientAppDataId TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "type";
    locala.xDd.put("type", "LONG");
    localStringBuilder.append(" type LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "totalLen";
    locala.xDd.put("totalLen", "LONG");
    localStringBuilder.append(" totalLen LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "offset";
    locala.xDd.put("offset", "LONG");
    localStringBuilder.append(" offset LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "status";
    locala.xDd.put("status", "LONG");
    localStringBuilder.append(" status LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "isUpload";
    locala.xDd.put("isUpload", "INTEGER");
    localStringBuilder.append(" isUpload INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "createTime";
    locala.xDd.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "lastModifyTime";
    locala.xDd.put("lastModifyTime", "LONG");
    localStringBuilder.append(" lastModifyTime LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "fileFullPath";
    locala.xDd.put("fileFullPath", "TEXT");
    localStringBuilder.append(" fileFullPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "fullXml";
    locala.xDd.put("fullXml", "TEXT");
    localStringBuilder.append(" fullXml TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "msgInfoId";
    locala.xDd.put("msgInfoId", "LONG");
    localStringBuilder.append(" msgInfoId LONG");
    localStringBuilder.append(", ");
    locala.columns[15] = "netTimes";
    locala.xDd.put("netTimes", "LONG");
    localStringBuilder.append(" netTimes LONG");
    localStringBuilder.append(", ");
    locala.columns[16] = "isUseCdn";
    locala.xDd.put("isUseCdn", "INTEGER");
    localStringBuilder.append(" isUseCdn INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "signature";
    locala.xDd.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "fakeAeskey";
    locala.xDd.put("fakeAeskey", "TEXT");
    localStringBuilder.append(" fakeAeskey TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "fakeSignature";
    locala.xDd.put("fakeSignature", "TEXT");
    localStringBuilder.append(" fakeSignature TEXT");
    locala.columns[20] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(79230);
  }

  public b()
  {
    this.field_netTimes = 0L;
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean bCR()
  {
    boolean bool = false;
    if (this.field_totalLen <= 0L);
    while (true)
    {
      return bool;
      if (this.field_offset == this.field_totalLen)
        bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.b
 * JD-Core Version:    0.6.2
 */