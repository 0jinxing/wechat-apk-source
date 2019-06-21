package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.af;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class g extends af
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(11384);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "openId";
    locala.xDd.put("openId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" openId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "openId";
    locala.columns[1] = "brandUsername";
    locala.xDd.put("brandUsername", "TEXT default '' ");
    localStringBuilder.append(" brandUsername TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "headImgUrl";
    locala.xDd.put("headImgUrl", "TEXT");
    localStringBuilder.append(" headImgUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "nickname";
    locala.xDd.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "kfType";
    locala.xDd.put("kfType", "INTEGER");
    localStringBuilder.append(" kfType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "updateTime";
    locala.xDd.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(11384);
  }

  public g()
  {
  }

  public g(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, long paramLong)
  {
    this.field_openId = paramString1;
    this.field_brandUsername = paramString2;
    this.field_headImgUrl = paramString3;
    this.field_nickname = paramString4;
    this.field_kfType = paramInt;
    this.field_updateTime = paramLong;
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.g
 * JD-Core Version:    0.6.2
 */