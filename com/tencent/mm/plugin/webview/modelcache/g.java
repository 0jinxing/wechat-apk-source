package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fp;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.util.Map;

public final class g extends fp
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(6838);
    c.a locala = new c.a();
    locala.xDb = new Field[17];
    locala.columns = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "urlMd5Hashcode";
    locala.xDd.put("urlMd5Hashcode", "INTEGER");
    localStringBuilder.append(" urlMd5Hashcode INTEGER");
    localStringBuilder.append(", ");
    locala.columns[1] = "url";
    locala.xDd.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "domain";
    locala.xDd.put("domain", "TEXT");
    localStringBuilder.append(" domain TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "version";
    locala.xDd.put("version", "TEXT");
    localStringBuilder.append(" version TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "localPath";
    locala.xDd.put("localPath", "TEXT");
    localStringBuilder.append(" localPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "contentType";
    locala.xDd.put("contentType", "TEXT");
    localStringBuilder.append(" contentType TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "contentLength";
    locala.xDd.put("contentLength", "LONG");
    localStringBuilder.append(" contentLength LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "isLatestVersion";
    locala.xDd.put("isLatestVersion", "INTEGER");
    localStringBuilder.append(" isLatestVersion INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "createTime";
    locala.xDd.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "accessTime";
    locala.xDd.put("accessTime", "LONG");
    localStringBuilder.append(" accessTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "expireTime";
    locala.xDd.put("expireTime", "LONG default '0' ");
    localStringBuilder.append(" expireTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "cacheType";
    locala.xDd.put("cacheType", "INTEGER");
    localStringBuilder.append(" cacheType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "configId";
    locala.xDd.put("configId", "TEXT");
    localStringBuilder.append(" configId TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "protocol";
    locala.xDd.put("protocol", "INTEGER");
    localStringBuilder.append(" protocol INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "packageId";
    locala.xDd.put("packageId", "TEXT");
    localStringBuilder.append(" packageId TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "contentMd5";
    locala.xDd.put("contentMd5", "TEXT");
    localStringBuilder.append(" contentMd5 TEXT");
    locala.columns[17] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(6838);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final String toString()
  {
    AppMethodBeat.i(6837);
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
      ab.printErrStackTrace("MicroMsg.WebViewCacheRes", localIllegalAccessException, "", new Object[0]);
      localObject1 = " }";
      AppMethodBeat.o(6837);
    }
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.g
 * JD-Core Version:    0.6.2
 */