package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ad;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends ad
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(11249);
    c.a locala = new c.a();
    locala.xDb = new Field[13];
    locala.columns = new String[14];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userName";
    locala.xDd.put("userName", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" userName TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "userName";
    locala.columns[1] = "qyUin";
    locala.xDd.put("qyUin", "INTEGER");
    localStringBuilder.append(" qyUin INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "userUin";
    locala.xDd.put("userUin", "INTEGER");
    localStringBuilder.append(" userUin INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "userFlag";
    locala.xDd.put("userFlag", "INTEGER");
    localStringBuilder.append(" userFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "wwExposeTimes";
    locala.xDd.put("wwExposeTimes", "INTEGER");
    localStringBuilder.append(" wwExposeTimes INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "wwMaxExposeTimes";
    locala.xDd.put("wwMaxExposeTimes", "INTEGER");
    localStringBuilder.append(" wwMaxExposeTimes INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "wwCorpId";
    locala.xDd.put("wwCorpId", "LONG");
    localStringBuilder.append(" wwCorpId LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "wwUserVid";
    locala.xDd.put("wwUserVid", "LONG");
    localStringBuilder.append(" wwUserVid LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "userType";
    locala.xDd.put("userType", "INTEGER");
    localStringBuilder.append(" userType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "chatOpen";
    locala.xDd.put("chatOpen", "INTEGER");
    localStringBuilder.append(" chatOpen INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "wwUnreadCnt";
    locala.xDd.put("wwUnreadCnt", "INTEGER default '0' ");
    localStringBuilder.append(" wwUnreadCnt INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "show_confirm";
    locala.xDd.put("show_confirm", "INTEGER");
    localStringBuilder.append(" show_confirm INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "use_preset_banner_tips";
    locala.xDd.put("use_preset_banner_tips", "INTEGER");
    localStringBuilder.append(" use_preset_banner_tips INTEGER");
    locala.columns[13] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(11249);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.b
 * JD-Core Version:    0.6.2
 */