package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.a.a;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

public abstract class d extends com.tencent.mm.plugin.appbrand.jsapi.a<q>
{
  private static c.a hAK;
  private u hTn = null;

  abstract void b(q paramq, JSONObject paramJSONObject, int paramInt);

  public final void dU(boolean paramBoolean)
  {
    try
    {
      if (!al.isMainThread())
      {
        Runnable local1 = new com/tencent/mm/plugin/appbrand/jsapi/j/d$1;
        local1.<init>(this, paramBoolean);
        al.d(local1);
      }
      while (true)
      {
        return;
        if ((this.hTn != null) && (this.hTn.getRuntime() != null))
        {
          if (hAK != null)
          {
            hAK.dismiss();
            hAK = null;
          }
          if (paramBoolean)
            hAK = com.tencent.mm.plugin.appbrand.page.a.z(this.hTn.getRuntime()).a(a.a.iqH);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.luggage.g.d.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "setSubTitle error:" + localException.toString());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.j.d
 * JD-Core Version:    0.6.2
 */