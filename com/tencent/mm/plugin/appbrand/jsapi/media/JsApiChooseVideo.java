package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.permission.n;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiChooseVideo extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 36;
  public static final String NAME = "chooseVideo";
  private static volatile boolean hPP = false;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131296);
    if (hPP)
    {
      paramc.M(paramInt, j("cancel", null));
      AppMethodBeat.o(131296);
    }
    while (true)
    {
      return;
      Context localContext = paramc.getContext();
      if ((localContext == null) || (!(localContext instanceof Activity)))
      {
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(131296);
      }
      else
      {
        JsApiChooseVideo.ChooseRequest localChooseRequest = new JsApiChooseVideo.ChooseRequest();
        JSONArray localJSONArray = paramJSONObject.optJSONArray("sourceType");
        String str = paramJSONObject.optString("maxDuration");
        ab.i("MicroMsg.JsApiChooseVideo", "doChooseVideo sourceType = %s, maxDuration = %s", new Object[] { localJSONArray, str });
        label145: int i;
        if ((localJSONArray == null) || (localJSONArray.length() == 0))
        {
          localChooseRequest.hOS = true;
          localChooseRequest.hOT = true;
          localChooseRequest.hPR = paramJSONObject.optBoolean("compressed", true);
          if (!localChooseRequest.hOS)
            break label308;
          n.a(paramc.getAppId(), new JsApiChooseVideo.3(this, paramc, paramJSONObject, paramInt));
          paramJSONObject = paramc.getContext();
          if ((paramJSONObject != null) && ((paramJSONObject instanceof Activity)))
            break label266;
          paramc.M(paramInt, j("fail", null));
          i = 0;
        }
        while (true)
        {
          if (i != 0)
            break label308;
          AppMethodBeat.o(131296);
          break;
          localChooseRequest.hOS = localJSONArray.toString().contains("camera");
          localChooseRequest.hOT = localJSONArray.toString().contains("album");
          break label145;
          label266: boolean bool = b.a((Activity)paramJSONObject, "android.permission.CAMERA", 115, "", "");
          i = bool;
          if (bool)
          {
            n.Dr(paramc.getAppId());
            i = bool;
          }
        }
        label308: hPP = true;
        g.a(paramc.getAppId(), new JsApiChooseVideo.1(this, paramc));
        localChooseRequest.maxDuration = bo.getInt(str, 60);
        localChooseRequest.appId = paramc.getAppId();
        com.tencent.mm.plugin.appbrand.ipc.a.b(localContext, localChooseRequest, new JsApiChooseVideo.2(this, paramc, paramInt));
        AppMethodBeat.o(131296);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo
 * JD-Core Version:    0.6.2
 */