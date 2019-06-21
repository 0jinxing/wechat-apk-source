package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.luggage.g.i;
import com.tencent.mm.plugin.appbrand.s.q;
import com.tencent.mm.plugin.appbrand.s.q.a;
import com.tencent.mm.plugin.appbrand.s.q.b;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONObject;

public abstract class m extends b
{
  public final String AK(String paramString)
  {
    return j(paramString, null);
  }

  public final String a(c paramc, String paramString, Map<String, ? extends Object> paramMap)
  {
    if (q.a(paramc.aBx(), paramMap, (q.a)paramc.aa(q.a.class)) == q.b.iRJ);
    for (paramc = j("fail:convert native buffer parameter fail. native buffer exceed size limit.", null); ; paramc = j(paramString, paramMap))
      return paramc;
  }

  protected void g(c paramc)
  {
  }

  protected void h(c paramc)
  {
  }

  public final String j(String paramString, Map<String, ? extends Object> paramMap)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", getName() + ":" + paramString);
    if (paramMap != null)
    {
      if ((com.tencent.mm.sdk.a.b.dnO()) && (paramMap.containsKey("errMsg")))
        Assert.assertTrue("api " + getName() + ": Cant put errMsg in res!!!", false);
      localHashMap.putAll(paramMap);
    }
    i.d(localHashMap);
    return new JSONObject(localHashMap).toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m
 * JD-Core Version:    0.6.2
 */