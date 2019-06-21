package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bg;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class m extends bg
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(62862);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "prodcutID";
    locala.xDd.put("prodcutID", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" prodcutID TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "prodcutID";
    locala.columns[1] = "totalCount";
    locala.xDd.put("totalCount", "INTEGER");
    localStringBuilder.append(" totalCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "continuCount";
    locala.xDd.put("continuCount", "INTEGER");
    localStringBuilder.append(" continuCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "flag";
    locala.xDd.put("flag", "INTEGER");
    localStringBuilder.append(" flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "modifyTime";
    locala.xDd.put("modifyTime", "LONG");
    localStringBuilder.append(" modifyTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "showTipsTime";
    locala.xDd.put("showTipsTime", "LONG");
    localStringBuilder.append(" showTipsTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "setFlagTime";
    locala.xDd.put("setFlagTime", "LONG");
    localStringBuilder.append(" setFlagTime LONG");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(62862);
  }

  public final c.a Ag()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.m
 * JD-Core Version:    0.6.2
 */