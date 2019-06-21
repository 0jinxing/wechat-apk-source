package com.tencent.mm.plugin.sns.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ey;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class x extends ey
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(38032);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "canvasId";
    locala.xDd.put("canvasId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" canvasId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "canvasId";
    locala.columns[1] = "canvasXml";
    locala.xDd.put("canvasXml", "TEXT");
    localStringBuilder.append(" canvasXml TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "createTime";
    locala.xDd.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "canvasExt";
    locala.xDd.put("canvasExt", "TEXT");
    localStringBuilder.append(" canvasExt TEXT");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(38032);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.x
 * JD-Core Version:    0.6.2
 */