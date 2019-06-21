package com.tencent.mm.openim.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dg;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class e extends dg
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(78990);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appid";
    locala.xDd.put("appid", "TEXT");
    localStringBuilder.append(" appid TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "wordingId";
    locala.xDd.put("wordingId", "TEXT");
    localStringBuilder.append(" wordingId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "language";
    locala.xDd.put("language", "TEXT");
    localStringBuilder.append(" language TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "wording";
    locala.xDd.put("wording", "TEXT");
    localStringBuilder.append(" wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "pinyin";
    locala.xDd.put("pinyin", "TEXT");
    localStringBuilder.append(" pinyin TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "quanpin";
    locala.xDd.put("quanpin", "TEXT");
    localStringBuilder.append(" quanpin TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "updateTime";
    locala.xDd.put("updateTime", "LONG default '0' ");
    localStringBuilder.append(" updateTime LONG default '0' ");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(78990);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.e.e
 * JD-Core Version:    0.6.2
 */