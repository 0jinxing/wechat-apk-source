package com.tencent.mm.plugin.exdevice.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends ce
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(19711);
    c.a locala = new c.a();
    locala.xDb = new Field[14];
    locala.columns = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "deviceID";
    locala.xDd.put("deviceID", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" deviceID TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "deviceID";
    locala.columns[1] = "brandName";
    locala.xDd.put("brandName", "TEXT");
    localStringBuilder.append(" brandName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "mac";
    locala.xDd.put("mac", "LONG");
    localStringBuilder.append(" mac LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "deviceType";
    locala.xDd.put("deviceType", "TEXT");
    localStringBuilder.append(" deviceType TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "connProto";
    locala.xDd.put("connProto", "TEXT");
    localStringBuilder.append(" connProto TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "connStrategy";
    locala.xDd.put("connStrategy", "INTEGER");
    localStringBuilder.append(" connStrategy INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "closeStrategy";
    locala.xDd.put("closeStrategy", "INTEGER");
    localStringBuilder.append(" closeStrategy INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "md5Str";
    locala.xDd.put("md5Str", "TEXT");
    localStringBuilder.append(" md5Str TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "authKey";
    locala.xDd.put("authKey", "TEXT");
    localStringBuilder.append(" authKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "url";
    locala.xDd.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "sessionKey";
    locala.xDd.put("sessionKey", "BLOB");
    localStringBuilder.append(" sessionKey BLOB");
    localStringBuilder.append(", ");
    locala.columns[11] = "sessionBuf";
    locala.xDd.put("sessionBuf", "BLOB");
    localStringBuilder.append(" sessionBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "authBuf";
    locala.xDd.put("authBuf", "BLOB");
    localStringBuilder.append(" authBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "lvbuffer";
    locala.xDd.put("lvbuffer", "BLOB");
    localStringBuilder.append(" lvbuffer BLOB");
    locala.columns[14] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(19711);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.h.b
 * JD-Core Version:    0.6.2
 */