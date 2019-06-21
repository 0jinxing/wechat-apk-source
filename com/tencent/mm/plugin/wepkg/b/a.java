package com.tencent.mm.plugin.wepkg.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fj;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends fj
{
  public static final c.a fjX;

  static
  {
    AppMethodBeat.i(63386);
    c.a locala = new c.a();
    locala.xDb = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "pkgId";
    locala.xDd.put("pkgId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" pkgId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "pkgId";
    locala.columns[1] = "version";
    locala.xDd.put("version", "TEXT");
    localStringBuilder.append(" version TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "oldVersion";
    locala.xDd.put("oldVersion", "TEXT");
    localStringBuilder.append(" oldVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "oldPath";
    locala.xDd.put("oldPath", "TEXT");
    localStringBuilder.append(" oldPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "md5";
    locala.xDd.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "downloadUrl";
    locala.xDd.put("downloadUrl", "TEXT");
    localStringBuilder.append(" downloadUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "pkgSize";
    locala.xDd.put("pkgSize", "INTEGER");
    localStringBuilder.append(" pkgSize INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "downloadNetType";
    locala.xDd.put("downloadNetType", "INTEGER");
    localStringBuilder.append(" downloadNetType INTEGER");
    locala.columns[8] = "rowid";
    locala.sql = localStringBuilder.toString();
    fjX = locala;
    AppMethodBeat.o(63386);
  }

  public final c.a Ag()
  {
    return fjX;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.b.a
 * JD-Core Version:    0.6.2
 */