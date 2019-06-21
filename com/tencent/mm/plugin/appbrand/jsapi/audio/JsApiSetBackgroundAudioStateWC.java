package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.ui.banner.f;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import org.json.JSONObject;

public final class JsApiSetBackgroundAudioStateWC extends JsApiSetBackgroundAudioState
{
  protected final JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask a(a parama, c paramc, int paramInt)
  {
    AppMethodBeat.i(130766);
    parama = new JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC(parama, paramc, paramInt);
    AppMethodBeat.o(130766);
    return parama;
  }

  protected final String a(JSONObject paramJSONObject, c paramc)
  {
    AppMethodBeat.i(130768);
    paramJSONObject = super.a(paramJSONObject, paramc);
    if ((paramJSONObject == null) || (paramJSONObject.length() <= 0))
    {
      paramJSONObject = "";
      AppMethodBeat.o(130768);
    }
    while (true)
    {
      return paramJSONObject;
      if ((paramJSONObject.startsWith("http://")) || (paramJSONObject.startsWith("https://")))
      {
        AppMethodBeat.o(130768);
      }
      else
      {
        paramJSONObject = paramc.asE().yg(paramJSONObject);
        if ((paramJSONObject != null) && (paramJSONObject.exists()))
        {
          paramc = paramJSONObject.getAbsolutePath();
          paramJSONObject = paramc;
          if (!paramc.startsWith("file://"))
            paramJSONObject = "file://".concat(String.valueOf(paramc));
          AppMethodBeat.o(130768);
        }
        else
        {
          paramJSONObject = "";
          AppMethodBeat.o(130768);
        }
      }
    }
  }

  protected final void a(String paramString, c paramc)
  {
    AppMethodBeat.i(130767);
    h localh;
    if (this.hAp != null)
    {
      localh = (h)paramc.aa(h.class);
      this.hAp.cBc = localh.hhd.gVt;
      this.hAp.cwz = localh.cwz;
      this.hAp.cBb = com.tencent.mm.plugin.appbrand.p.a(paramc);
      ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "pkgType:%d, brandName:%s, appUserName", new Object[] { Integer.valueOf(this.hAp.cBc), this.hAp.cwz, this.hAp.cBb });
    }
    while (true)
    {
      synchronized (v.Zp().y(paramString, true))
      {
        f localf = (f)???.get("StickyBannerChangeListener", null);
        paramString = localf;
        if (localf == null)
        {
          paramString = new com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiSetBackgroundAudioStateWC$1;
          paramString.<init>(this, ???);
          ???.j("pkgType", Integer.valueOf(localh.hhd.gVt));
          ???.j("StickyBannerChangeListener", paramString);
          ???.j("appId", paramc.getAppId());
        }
        if ((g.c)???.get("AppBrandLifeCycle.Listener", null) == null)
        {
          paramc = new com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiSetBackgroundAudioStateWC$2;
          paramc.<init>(this, ???);
          ???.j("AppBrandLifeCycle.Listener", paramc);
          this.hAp.huj = paramc;
        }
        if ((this.hAp instanceof JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC))
        {
          ((JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC)this.hAp).hAy = paramString;
          ((JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC)this.hAp).hAx = ???;
        }
        AppMethodBeat.o(130767);
        return;
      }
      AppMethodBeat.o(130767);
    }
  }

  protected final JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask b(a parama, c paramc, int paramInt)
  {
    AppMethodBeat.i(130765);
    parama = new JsApiSetBackgroundAudioStateWC.SetBackgroundAudioStateTaskWC(parama, paramc, paramInt);
    AppMethodBeat.o(130765);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC
 * JD-Core Version:    0.6.2
 */