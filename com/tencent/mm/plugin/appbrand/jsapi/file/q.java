package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.appstorage.p.a;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class q extends a
{
  private static final int CTRL_INDEX = 115;
  private static final String NAME = "getSavedFileList";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(102789);
    Object localObject = paramc.asE().awQ();
    paramJSONObject = new JSONArray();
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        p.a locala = (p.a)((Iterator)localObject).next();
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("filePath", locala.getFileName());
          localJSONObject.put("size", locala.awL());
          localJSONObject.put("createTime", TimeUnit.MILLISECONDS.toSeconds(locala.lastModified()));
          paramJSONObject.put(localJSONObject);
        }
        catch (Exception localException)
        {
        }
      }
    }
    localObject = new HashMap(1);
    ((Map)localObject).put("fileList", paramJSONObject);
    paramc.M(paramInt, j("ok", (Map)localObject));
    AppMethodBeat.o(102789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.q
 * JD-Core Version:    0.6.2
 */