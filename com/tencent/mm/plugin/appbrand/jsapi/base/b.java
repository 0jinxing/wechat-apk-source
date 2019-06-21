package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b<CONTEXT extends e> extends d<c>
{
  private void b(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    if (!paramc.isRunning())
      paramc.M(paramInt, "fail:interrupted");
    e locale;
    while (true)
    {
      return;
      locale = m(paramc);
      if (locale != null)
        break;
      ab.w("MicroMsg.BaseRemoveViewJsApi", "invoke JsApi(%s) failed, component view is null", new Object[] { getName() });
      paramc.M(paramInt, j("fail:ComponentView is null.", null));
    }
    while (true)
    {
      try
      {
        int i = r(paramJSONObject);
        View localView = locale.aBf().q(i);
        if (!locale.aBf().pz(i))
          break label258;
        boolean bool1 = locale.aBf().pv(i);
        bool2 = bool1;
        if (bool1)
          bool2 = b(locale, i, localView, paramJSONObject);
        if (bool2)
          locale.aBf().pA(i);
        ab.i("MicroMsg.BaseRemoveViewJsApi", "remove view(parentId : %s, viewId : %s, r : %s)", new Object[] { Integer.valueOf(paramJSONObject.optInt("parentId", 0)), Integer.valueOf(i), Boolean.valueOf(bool2) });
        if (!bool2)
          break label252;
        paramJSONObject = "ok";
        paramc.M(paramInt, j(paramJSONObject, null));
      }
      catch (JSONException paramJSONObject)
      {
        ab.e("MicroMsg.BaseRemoveViewJsApi", "get viewId error. exception : %s", new Object[] { paramJSONObject });
        paramc.M(paramInt, j("fail:view id do not exist", null));
      }
      break;
      label252: paramJSONObject = "fail";
      continue;
      label258: boolean bool2 = false;
    }
  }

  private static e m(c paramc)
  {
    return ((f)paramc.B(f.class)).c(paramc);
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    if (al.isMainThread())
      b(paramc, paramJSONObject, paramInt);
    while (true)
    {
      return;
      al.d(new b.1(this, paramc, paramJSONObject, paramInt));
    }
  }

  protected boolean b(CONTEXT paramCONTEXT, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.base.b
 * JD-Core Version:    0.6.2
 */