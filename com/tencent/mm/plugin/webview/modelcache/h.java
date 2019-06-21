package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fl;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.util.Map;

final class h extends fl
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(6840);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "disable";
    locala.xDd.put("disable", "INTEGER default 'false' ");
    localStringBuilder.append(" disable INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "configId";
    locala.xDd.put("configId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" configId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "configId";
    locala.columns[2] = "configUrl";
    locala.xDd.put("configUrl", "TEXT");
    localStringBuilder.append(" configUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "configResources";
    locala.xDd.put("configResources", "TEXT");
    localStringBuilder.append(" configResources TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "configCrc32";
    locala.xDd.put("configCrc32", "LONG");
    localStringBuilder.append(" configCrc32 LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "isFromXml";
    locala.xDd.put("isFromXml", "INTEGER default 'false' ");
    localStringBuilder.append(" isFromXml INTEGER default 'false' ");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(6840);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final String toString()
  {
    AppMethodBeat.i(6839);
    Object localObject1 = new StringBuilder(getClass().getSimpleName() + " {");
    try
    {
      for (Field localField : getClass().getSuperclass().getDeclaredFields())
        if (localField.getName().startsWith("field_"))
        {
          localField.setAccessible(true);
          Object localObject2 = localField.get(this);
          ((StringBuilder)localObject1).append(localField.getName().replaceFirst("field_", "")).append(" = ").append(localObject2).append(", ");
        }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      ab.printErrStackTrace("MicroMsg.WebViewCacheResConfigMap", localIllegalAccessException, "", new Object[0]);
      localObject1 = " }";
      AppMethodBeat.o(6839);
    }
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.h
 * JD-Core Version:    0.6.2
 */