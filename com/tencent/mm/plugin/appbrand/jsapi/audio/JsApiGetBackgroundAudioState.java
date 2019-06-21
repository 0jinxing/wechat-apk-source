package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class JsApiGetBackgroundAudioState extends u
{
  public static final int CTRL_INDEX = 159;
  public static final String NAME = "getBackgroundAudioState";

  public final String b(c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(137736);
    paramc = paramc.getAppId();
    paramJSONObject = new JsApiGetBackgroundAudioState.GetBackgroundAudioStateTask();
    paramJSONObject.appId = paramc;
    if (!AppBrandMainProcessService.b(paramJSONObject))
    {
      ab.e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail");
      paramc = j("fail", null);
      AppMethodBeat.o(137736);
    }
    while (true)
    {
      return paramc;
      HashMap localHashMap = new HashMap();
      localHashMap.put("duration", Double.valueOf(paramJSONObject.hAb));
      localHashMap.put("currentTime", Double.valueOf(paramJSONObject.hAc));
      boolean bool;
      if (paramJSONObject.fSc == 1)
      {
        bool = true;
        label105: localHashMap.put("paused", Boolean.valueOf(bool));
        localHashMap.put("buffered", Double.valueOf(paramJSONObject.hAd));
        localHashMap.put("src", paramJSONObject.ckz);
        localHashMap.put("title", paramJSONObject.title);
        localHashMap.put("epname", paramJSONObject.hAe);
        localHashMap.put("singer", paramJSONObject.hAf);
        localHashMap.put("coverImgUrl", paramJSONObject.hAg);
        localHashMap.put("webUrl", paramJSONObject.hAh);
        if (paramJSONObject.protocol != null)
          break label317;
        paramc = "";
        label223: localHashMap.put("protocol", paramc);
        localHashMap.put("startTime", Integer.valueOf(paramJSONObject.startTime / 1000));
        if (!TextUtils.isEmpty(paramJSONObject.hAa))
          break label325;
      }
      label317: label325: for (paramc = ""; ; paramc = paramJSONObject.hAa)
      {
        if (!paramJSONObject.error)
          break label333;
        ab.e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail, err:%s", new Object[] { paramc });
        paramc = j("fail:".concat(String.valueOf(paramc)), null);
        AppMethodBeat.o(137736);
        break;
        bool = false;
        break label105;
        paramc = paramJSONObject.protocol;
        break label223;
      }
      label333: ab.d("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState is ok");
      paramc = j("ok", localHashMap);
      AppMethodBeat.o(137736);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState
 * JD-Core Version:    0.6.2
 */