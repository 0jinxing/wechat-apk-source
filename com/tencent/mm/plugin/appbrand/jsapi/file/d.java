package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

abstract class d
  implements f
{
  m hJG;

  static
  {
    e.a.init();
  }

  abstract f.a a(c paramc, String paramString, JSONObject paramJSONObject);

  public final f.a c(c paramc, JSONObject paramJSONObject)
  {
    String str = y(paramJSONObject);
    if (bo.isNullOrNil(str))
      paramc = new f.a("fail invalid path", new Object[0]);
    while (true)
    {
      return paramc;
      if (!paramc.isRunning())
        paramc = new f.a("fail:interrupted", new Object[0]);
      else
        paramc = a(paramc, str, paramJSONObject);
    }
  }

  protected String y(JSONObject paramJSONObject)
  {
    Object localObject1 = paramJSONObject.optString("filePath", null);
    Object localObject2 = localObject1;
    if (bo.isNullOrNil((String)localObject1))
      localObject2 = paramJSONObject.optString("dirPath", null);
    localObject1 = localObject2;
    if (bo.isNullOrNil((String)localObject2))
      localObject1 = paramJSONObject.optString("path", null);
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.d
 * JD-Core Version:    0.6.2
 */