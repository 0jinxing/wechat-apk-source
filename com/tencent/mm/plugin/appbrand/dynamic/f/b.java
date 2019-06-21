package com.tencent.mm.plugin.appbrand.dynamic.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.z.b.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends c
{
  public String cacheKey;
  public Map<String, String> hod;
  public int hoe;
  public int hof;
  public String path;
  public String title;

  public b()
  {
    super("onCanvasInsert");
  }

  b(int paramInt)
  {
    super("onCanvasInsert", paramInt);
  }

  public final JSONObject toJSONObject()
  {
    AppMethodBeat.i(10911);
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put("title", this.title);
      localJSONObject1.put("path", this.path);
      JSONObject localJSONObject2 = new org/json/JSONObject;
      Object localObject;
      if (this.hod == null)
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
      }
      while (true)
      {
        localJSONObject2.<init>((Map)localObject);
        localJSONObject1.put("query", localJSONObject2);
        localJSONObject1.put("cacheKey", this.cacheKey);
        localJSONObject1.put("width", g.qa(this.hoe));
        localJSONObject1.put("height", g.qa(this.hof));
        label107: AppMethodBeat.o(10911);
        return localJSONObject1;
        localObject = this.hod;
      }
    }
    catch (JSONException localJSONException)
    {
      break label107;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.f.b
 * JD-Core Version:    0.6.2
 */