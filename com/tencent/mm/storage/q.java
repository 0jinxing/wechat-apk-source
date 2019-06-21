package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ag;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class q extends ag
{
  protected static c.a ccO;
  public boolean xHT = false;
  public boolean xHU = false;

  static
  {
    AppMethodBeat.i(11853);
    c.a locala = new c.a();
    locala.xDb = new Field[17];
    locala.columns = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.xDd.put("msgId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "msgId";
    locala.columns[1] = "msgSvrId";
    locala.xDd.put("msgSvrId", "LONG");
    localStringBuilder.append(" msgSvrId LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "type";
    locala.xDd.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "createTime";
    locala.xDd.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "talker";
    locala.xDd.put("talker", "TEXT");
    localStringBuilder.append(" talker TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "content";
    locala.xDd.put("content", "TEXT default '' ");
    localStringBuilder.append(" content TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "imgPath";
    locala.xDd.put("imgPath", "TEXT");
    localStringBuilder.append(" imgPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "lvbuffer";
    locala.xDd.put("lvbuffer", "BLOB");
    localStringBuilder.append(" lvbuffer BLOB");
    localStringBuilder.append(", ");
    locala.columns[9] = "talkerId";
    locala.xDd.put("talkerId", "INTEGER");
    localStringBuilder.append(" talkerId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "isExpand";
    locala.xDd.put("isExpand", "INTEGER");
    localStringBuilder.append(" isExpand INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "orderFlag";
    locala.xDd.put("orderFlag", "LONG default '0' ");
    localStringBuilder.append(" orderFlag LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "hasShow";
    locala.xDd.put("hasShow", "INTEGER default '1' ");
    localStringBuilder.append(" hasShow INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "placeTop";
    locala.xDd.put("placeTop", "INTEGER default '1' ");
    localStringBuilder.append(" placeTop INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "appMsgStatInfoProto";
    locala.xDd.put("appMsgStatInfoProto", "BLOB");
    localStringBuilder.append(" appMsgStatInfoProto BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "isRead";
    locala.xDd.put("isRead", "INTEGER default '0' ");
    localStringBuilder.append(" isRead INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "bitFlag";
    locala.xDd.put("bitFlag", "INTEGER default '0' ");
    localStringBuilder.append(" bitFlag INTEGER default '0' ");
    locala.columns[17] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(11853);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final long drB()
  {
    return (this.field_orderFlag & 0x0) >> 32;
  }

  public final boolean drC()
  {
    if (this.field_type == 285212721);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean drD()
  {
    if (this.field_type == 34);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean drE()
  {
    switch (this.field_type)
    {
    default:
    case 3:
    case 13:
    case 23:
    case 33:
    case 39:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final boolean drF()
  {
    AppMethodBeat.i(11852);
    boolean bool;
    if (drB() == 1L)
    {
      bool = true;
      AppMethodBeat.o(11852);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11852);
    }
  }

  public final void drG()
  {
    this.field_bitFlag |= 1;
  }

  public final boolean isText()
  {
    switch (this.field_type)
    {
    default:
    case 1:
    case 11:
    case 21:
    case 31:
    case 36:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.q
 * JD-Core Version:    0.6.2
 */