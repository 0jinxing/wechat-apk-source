package com.tencent.mm.plugin.brandservice.ui.timeline.preload.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.y;
import com.tencent.mm.protocal.protobuf.er;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends y
{
  public static c.a fjX;

  static
  {
    AppMethodBeat.i(14394);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appMsgReportContextId";
    locala.xDd.put("appMsgReportContextId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" appMsgReportContextId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "appMsgReportContextId";
    locala.columns[1] = "url";
    locala.xDd.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "reportTime";
    locala.xDd.put("reportTime", "LONG");
    localStringBuilder.append(" reportTime LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "aScene";
    locala.xDd.put("aScene", "INTEGER");
    localStringBuilder.append(" aScene INTEGER");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    fjX = locala;
    AppMethodBeat.o(14394);
  }

  public a()
  {
  }

  public a(er paramer)
  {
    this.field_url = paramer.Url;
    this.field_reportTime = paramer.vGy;
  }

  public final c.a Ag()
  {
    return fjX;
  }

  public final String toString()
  {
    AppMethodBeat.i(14393);
    String str = "BizAppMsgReportContext{field_appMsgReportContextId=" + this.field_appMsgReportContextId + ", field_url='" + this.field_url + '\'' + ", field_reportTime=" + this.field_reportTime + ", field_aScene=" + this.field_aScene + '}';
    AppMethodBeat.o(14393);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.a.a
 * JD-Core Version:    0.6.2
 */