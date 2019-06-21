package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.os.Handler;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class b extends u<c>
{
  public abstract String OA();

  public abstract void a(c paramc, JSONObject paramJSONObject, String paramString);

  public abstract String aBA();

  public final String b(c paramc, JSONObject paramJSONObject)
  {
    String str = aBA();
    HashMap localHashMap = new HashMap();
    localHashMap.put(OA(), str);
    paramc.aBy().post(new b.1(this, paramc, paramJSONObject, str));
    return j("ok", localHashMap);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.b
 * JD-Core Version:    0.6.2
 */