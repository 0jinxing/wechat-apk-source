package com.tencent.mm.plugin.report.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ax;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends ax
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(72663);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bakLogId";
    locala.xDd.put("bakLogId", "INTEGER");
    localStringBuilder.append(" bakLogId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[1] = "valueStr";
    locala.xDd.put("valueStr", "TEXT");
    localStringBuilder.append(" valueStr TEXT");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(72663);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.a.a
 * JD-Core Version:    0.6.2
 */