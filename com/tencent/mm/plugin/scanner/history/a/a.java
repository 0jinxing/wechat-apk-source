package com.tencent.mm.plugin.scanner.history.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ea;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends ea
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(80799);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "productId";
    locala.xDd.put("productId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" productId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "productId";
    locala.columns[1] = "xmlContent";
    locala.xDd.put("xmlContent", "TEXT");
    localStringBuilder.append(" xmlContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "ScanTime";
    locala.xDd.put("ScanTime", "LONG");
    localStringBuilder.append(" ScanTime LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "funcType";
    locala.xDd.put("funcType", "INTEGER");
    localStringBuilder.append(" funcType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "qrcodeUrl";
    locala.xDd.put("qrcodeUrl", "TEXT");
    localStringBuilder.append(" qrcodeUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "scene";
    locala.xDd.put("scene", "INTEGER");
    localStringBuilder.append(" scene INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(80799);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.history.a.a
 * JD-Core Version:    0.6.2
 */