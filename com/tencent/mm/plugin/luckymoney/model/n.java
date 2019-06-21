package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cv;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n extends cv
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(42334);
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "subtype";
    locala.xDd.put("subtype", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" subtype INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "subtype";
    locala.columns[1] = "bubbleMd5";
    locala.xDd.put("bubbleMd5", "TEXT");
    localStringBuilder.append(" bubbleMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "coverMd5";
    locala.xDd.put("coverMd5", "TEXT");
    localStringBuilder.append(" coverMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "minilogoMd5";
    locala.xDd.put("minilogoMd5", "TEXT");
    localStringBuilder.append(" minilogoMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "version";
    locala.xDd.put("version", "INTEGER");
    localStringBuilder.append(" version INTEGER");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(42334);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.n
 * JD-Core Version:    0.6.2
 */