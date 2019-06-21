package com.tencent.mm.plugin.webview.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fn;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class d extends fn
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(5645);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "recordId";
    locala.xDd.put("recordId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" recordId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "recordId";
    locala.columns[1] = "link";
    locala.xDd.put("link", "TEXT");
    localStringBuilder.append(" link TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "title";
    locala.xDd.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "source";
    locala.xDd.put("source", "TEXT");
    localStringBuilder.append(" source TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "imgUrl";
    locala.xDd.put("imgUrl", "TEXT");
    localStringBuilder.append(" imgUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "timeStamp";
    locala.xDd.put("timeStamp", "LONG");
    localStringBuilder.append(" timeStamp LONG");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(5645);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.b.d
 * JD-Core Version:    0.6.2
 */