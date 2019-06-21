package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class JsApiOperateMusicPlayer$2 extends g.c
{
  JsApiOperateMusicPlayer$2(JsApiOperateMusicPlayer paramJsApiOperateMusicPlayer, v.b paramb, s params)
  {
  }

  public final void a(g.d paramd)
  {
    AppMethodBeat.i(130716);
    String str = this.hAt.getString("appId", "");
    this.hAt.getInt("pkgType", 0);
    switch (JsApiOperateMusicPlayer.3.gWZ[paramd.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(130716);
      return;
      int i = this.hsj.getRuntime().ya().bQn.scene;
      AppBrandStickyBannerLogic.a.aMP();
      if (i == 1023)
        continue;
      paramd = new JSONObject();
      try
      {
        paramd.put("operationType", "pause");
        label111: JsApiOperateMusicPlayer.OperateMusicPlayer localOperateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(this.hAw, this.hsj, JsApiOperateMusicPlayer.OperateMusicPlayer.a(this.hAw.hAv));
        localOperateMusicPlayer.jsonString = paramd.toString();
        localOperateMusicPlayer.csB = str;
        localOperateMusicPlayer.hAx = this.hAt;
        AppBrandMainProcessService.a(localOperateMusicPlayer);
      }
      catch (JSONException localJSONException)
      {
        break label111;
      }
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(130717);
    ab.d("MicroMsg.JsApiOperateMusicPlayer", "onDestroy");
    String str = this.hAt.getString("appId", "");
    this.hAt.getInt("pkgType", 0);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("operationType", "stop");
      label52: JsApiOperateMusicPlayer.OperateMusicPlayer localOperateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(this.hAw, this.hsj, JsApiOperateMusicPlayer.OperateMusicPlayer.a(this.hAw.hAv));
      localOperateMusicPlayer.jsonString = localJSONObject.toString();
      localOperateMusicPlayer.csB = str;
      localOperateMusicPlayer.action = -1;
      localOperateMusicPlayer.hAx = this.hAt;
      AppBrandMainProcessService.b(localOperateMusicPlayer);
      AppMethodBeat.o(130717);
      return;
    }
    catch (JSONException localJSONException)
    {
      break label52;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer.2
 * JD-Core Version:    0.6.2
 */