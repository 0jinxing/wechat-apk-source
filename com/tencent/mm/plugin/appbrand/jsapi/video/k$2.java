package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import org.json.JSONException;
import org.json.JSONObject;

final class k$2
  implements ap.a
{
  k$2(k paramk)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(126571);
    int i;
    k localk;
    if (this.iav.iaq != null)
    {
      i = this.iav.iaq.getCacheTimeSec();
      int j = this.iav.iaq.getDuration();
      if (j != 0)
      {
        i = (int)(i * 100.0F / j);
        if (i != this.iav.iau)
        {
          this.iav.iau = i;
          localk = this.iav;
        }
      }
    }
    try
    {
      ab.i("MicroMsg.JsApiVideoCallback", "onVideoCacheUpdate, percent:%d", new Object[] { Integer.valueOf(i) });
      JSONObject localJSONObject = localk.aFV();
      localJSONObject.put("buffered", i);
      k.i locali = new com/tencent/mm/plugin/appbrand/jsapi/video/k$i;
      locali.<init>((byte)0);
      localk.a(locali, localJSONObject);
      AppMethodBeat.o(126571);
      return true;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.JsApiVideoCallback", "onVideoCacheUpdate e=%s", new Object[] { localJSONException });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.k.2
 * JD-Core Version:    0.6.2
 */