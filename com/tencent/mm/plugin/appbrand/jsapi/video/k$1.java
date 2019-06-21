package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

final class k$1
  implements ap.a
{
  k$1(k paramk)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(126570);
    try
    {
      int i = this.iav.iaq.getCurrPosMs();
      int j = Math.abs(i - this.iav.iat);
      if (j < 250)
        AppMethodBeat.o(126570);
      while (true)
      {
        return true;
        JSONObject localJSONObject = this.iav.aFV();
        this.iav.iat = i;
        double d = i * 1.0D / 1000.0D;
        Object localObject = new java/math/BigDecimal;
        ((BigDecimal)localObject).<init>(d);
        localJSONObject.put("position", ((BigDecimal)localObject).setScale(3, 4).doubleValue());
        localJSONObject.put("duration", this.iav.iaq.getDuration());
        k localk = this.iav;
        localObject = new com/tencent/mm/plugin/appbrand/jsapi/video/k$l;
        ((k.l)localObject).<init>((byte)0);
        localk.a((ah)localObject, localJSONObject);
        AppMethodBeat.o(126570);
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.JsApiVideoCallback", "OnVideoTimeUpdate e=%s", new Object[] { localJSONException });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.k.1
 * JD-Core Version:    0.6.2
 */