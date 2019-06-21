package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.eb;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class p extends eb
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(80885);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "originMD5";
    locala.xDd.put("originMD5", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" originMD5 TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "originMD5";
    locala.columns[1] = "resultFile";
    locala.xDd.put("resultFile", "TEXT");
    localStringBuilder.append(" resultFile TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "fromLang";
    locala.xDd.put("fromLang", "TEXT");
    localStringBuilder.append(" fromLang TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "toLang";
    locala.xDd.put("toLang", "TEXT");
    localStringBuilder.append(" toLang TEXT");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(80885);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.p
 * JD-Core Version:    0.6.2
 */