package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

public abstract class c<CONTEXT extends e> extends d<com.tencent.mm.plugin.appbrand.jsapi.c>
{
  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    e locale = ((f)paramc.B(f.class)).c(paramc);
    if (locale == null)
      paramc.M(paramInt, j("fail:ComponentView is null.", null));
    while (true)
    {
      return;
      al.d(new c.1(this, locale, paramc, paramInt, paramJSONObject));
    }
  }

  protected boolean aCE()
  {
    return false;
  }

  protected boolean aCF()
  {
    return false;
  }

  protected boolean b(CONTEXT paramCONTEXT, int paramInt, View paramView, JSONObject paramJSONObject, g paramg)
  {
    return true;
  }

  protected boolean c(CONTEXT paramCONTEXT, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.base.c
 * JD-Core Version:    0.6.2
 */