package com.tencent.mm.plugin.appbrand.weishi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class f extends a<c>
{
  public static final int CTRL_INDEX = 621;
  public static final String NAME = "showShareActionSheet";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(133645);
    if ((paramc instanceof s))
      paramJSONObject = ((s)paramc).aun();
    while (true)
    {
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.JsApiShowShareActionSheet", "fail, page view is null");
        paramc.M(paramInt, j("fail:page don't exist", null));
        AppMethodBeat.o(133645);
      }
      while (true)
      {
        return;
        if (!(paramc instanceof w))
          break label99;
        paramJSONObject = (w)paramc;
        break;
        ab.i("MicroMsg.JsApiShowShareActionSheet", "weishi show share action sheet");
        paramJSONObject.aJT();
        paramc.M(paramInt, j("ok", null));
        AppMethodBeat.o(133645);
      }
      label99: paramJSONObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.f
 * JD-Core Version:    0.6.2
 */