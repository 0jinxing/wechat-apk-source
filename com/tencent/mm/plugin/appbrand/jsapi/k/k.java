package com.tencent.mm.plugin.appbrand.jsapi.k;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigDecimal;
import org.json.JSONObject;

public final class k extends com.tencent.mm.plugin.appbrand.jsapi.u<d>
{
  private static final int CTRL_INDEX = 413;
  public static final String NAME = "scrollWebviewTo";

  private String a(d paramd, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(74757);
    if ((paramd instanceof com.tencent.mm.plugin.appbrand.page.u))
    {
      paramd = (com.tencent.mm.plugin.appbrand.page.u)paramd;
      if (paramd != null)
        break label59;
      paramd = j("fail:page don't exist", null);
      AppMethodBeat.o(74757);
    }
    while (true)
    {
      return paramd;
      if ((paramd instanceof q))
      {
        paramd = ((q)paramd).getCurrentPageView();
        break;
      }
      paramd = null;
      break;
      label59: long l = paramJSONObject.optLong("duration", 300L);
      if (!paramJSONObject.has("scrollTop"))
      {
        paramd = j("fail:invalid data", null);
        AppMethodBeat.o(74757);
      }
      else
      {
        try
        {
          BigDecimal localBigDecimal = new java/math/BigDecimal;
          localBigDecimal.<init>(paramJSONObject.getString("scrollTop"));
          int i = Math.round(g.av(localBigDecimal.floatValue()));
          al.d(new k.1(this, paramd, i, l));
          paramd = j("ok", null);
          AppMethodBeat.o(74757);
        }
        catch (Exception paramd)
        {
          ab.e("MicroMsg.AppBrand.Jsapi_scrollWebviewTo", "opt scrollTop, e = %s", new Object[] { paramd });
          paramd = j("fail:invalid data " + bo.nullAsNil(paramd.getMessage()), null);
          AppMethodBeat.o(74757);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.k.k
 * JD-Core Version:    0.6.2
 */