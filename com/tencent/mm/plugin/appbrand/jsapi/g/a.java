package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.luggage.g.d;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.g;
import org.json.JSONObject;

public abstract class a extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  protected final void a(c paramc, int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramc.M(paramInt, paramString);
    com.tencent.mm.plugin.appbrand.jsapi.g.a.e.d(getName(), paramBoolean1, paramBoolean2);
  }

  public void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    com.tencent.mm.plugin.appbrand.jsapi.g.a.e.Bj(getName());
  }

  protected final b f(c paramc, JSONObject paramJSONObject)
  {
    if ((paramc instanceof com.tencent.mm.plugin.appbrand.jsapi.e))
      paramc = g.cj(paramc.getAppId(), com.tencent.mm.plugin.appbrand.jsapi.g.a.f.g(paramc, paramJSONObject));
    while (true)
    {
      return paramc;
      if (paramc.B(com.tencent.mm.plugin.appbrand.jsapi.base.f.class) == null)
      {
        d.e("MicroMsg.BaseMapJsApi", "name:%s IComponentConverter is null, return", new Object[] { getName() });
        paramc = null;
      }
      else
      {
        paramc = ((com.tencent.mm.plugin.appbrand.jsapi.base.f)paramc.B(com.tencent.mm.plugin.appbrand.jsapi.base.f.class)).c(paramc);
        if (paramc == null)
        {
          d.e("MicroMsg.BaseMapJsApi", "name:%s is not componentView", new Object[] { getName() });
          paramc = null;
        }
        else
        {
          paramc = g.cj(paramc.getAppId(), com.tencent.mm.plugin.appbrand.jsapi.g.a.f.g(paramc, paramJSONObject));
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a
 * JD-Core Version:    0.6.2
 */