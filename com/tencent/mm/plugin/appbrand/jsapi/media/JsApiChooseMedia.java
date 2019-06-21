package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.permission.n;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiChooseMedia extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 193;
  public static final String NAME = "chooseMedia";
  private static volatile boolean hPi = false;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131213);
    if (hPi)
    {
      ab.e("MicroMsg.JsApiChooseMedia", "chooseMedia sChoosingMedia is true, do not again");
      paramc.M(paramInt, j("cancel", null));
      AppMethodBeat.o(131213);
    }
    Context localContext1;
    while (true)
    {
      return;
      localContext1 = paramc.getContext();
      if ((localContext1 == null) || (!(localContext1 instanceof Activity)))
      {
        ab.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  pageContext is null");
        paramc.M(paramInt, j("fail:page context is null", null));
        AppMethodBeat.o(131213);
      }
      else
      {
        if (paramJSONObject != null)
          break;
        ab.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  data is null");
        paramc.M(paramInt, j("fail:data is null", null));
        AppMethodBeat.o(131213);
      }
    }
    ab.i("MicroMsg.JsApiChooseMedia", "chooseMedia data:" + paramJSONObject.toString());
    String str1 = "";
    if ((paramJSONObject.optJSONArray("sourceType") != null) && (paramJSONObject.optJSONArray("sourceType").length() > 0))
    {
      str1 = paramJSONObject.optJSONArray("sourceType").toString();
      label181: if (!bo.isNullOrNil(str1))
        break label894;
    }
    label229: label878: label887: label894: for (String str2 = "camera|album"; ; str2 = str1)
    {
      str1 = "";
      if ((paramJSONObject.optJSONArray("mediaType") != null) && (paramJSONObject.optJSONArray("mediaType").length() > 0))
      {
        str1 = paramJSONObject.optJSONArray("mediaType").toString();
        if (!bo.isNullOrNil(str1))
          break label887;
      }
      for (String str3 = "video|image"; ; str3 = str1)
      {
        int i = Math.min(paramJSONObject.optInt("maxDuration", 10), 10);
        if ((i < 3) || (i > 10))
        {
          ab.e("MicroMsg.JsApiChooseMedia", "maxDuration is invalid");
          i = 10;
        }
        while (true)
        {
          String str4 = paramJSONObject.optString("camera");
          if (bo.isNullOrNil(str4))
            str4 = "back";
          while (true)
          {
            int j = Math.min(paramJSONObject.optInt("count", 9), 9);
            str1 = "";
            if ((paramJSONObject.optJSONArray("sizeType") != null) && (paramJSONObject.optJSONArray("sizeType").length() > 0))
            {
              str1 = paramJSONObject.optJSONArray("sizeType").toString();
              if (!bo.isNullOrNil(str1))
                break label878;
              str1 = "original|compressed";
            }
            while (true)
            {
              ab.i("MicroMsg.JsApiChooseMedia", "chooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s", new Object[] { str2, str3, Integer.valueOf(i), str4, Integer.valueOf(j), str1 });
              n.b(paramc.getAppId(), new JsApiChooseMedia.3(this, paramc, paramJSONObject, paramInt));
              Context localContext2 = paramc.getContext();
              int k;
              if ((localContext2 == null) || (!(localContext2 instanceof Activity)))
              {
                ab.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestAudioPermission pageContext is null");
                paramc.M(paramInt, j("fail", null));
                k = 0;
              }
              boolean bool;
              while (true)
              {
                if (k != 0)
                  break label569;
                ab.e("MicroMsg.JsApiChooseMedia", "chooseMedia requestAudioPermission is fail");
                AppMethodBeat.o(131213);
                break;
                ab.e("MicroMsg.JsApiChooseMedia", "sourceType is invalid param");
                break label181;
                ab.e("MicroMsg.JsApiChooseMedia", "mediaType is invalid param");
                break label229;
                ab.e("MicroMsg.JsApiChooseMedia", "sizeType is invalid param");
                break label351;
                bool = b.a((Activity)localContext2, "android.permission.RECORD_AUDIO", 120, "", "");
                k = bool;
                if (bool)
                {
                  n.Dr(paramc.getAppId());
                  k = bool;
                }
              }
              n.b(paramc.getAppId(), new JsApiChooseMedia.4(this, paramc, paramJSONObject, paramInt));
              paramJSONObject = paramc.getContext();
              if ((paramJSONObject == null) || (!(paramJSONObject instanceof Activity)))
              {
                ab.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestCameraPermission pageContext is null");
                paramc.M(paramInt, j("fail", null));
                k = 0;
              }
              while (true)
              {
                if (k != 0)
                  break label693;
                ab.e("MicroMsg.JsApiChooseMedia", "chooseMedia requestCameraPermission is fail");
                AppMethodBeat.o(131213);
                break;
                bool = b.a((Activity)paramJSONObject, "android.permission.CAMERA", 119, "", "");
                k = bool;
                if (bool)
                {
                  n.Dr(paramc.getAppId());
                  k = bool;
                }
              }
              ab.i("MicroMsg.JsApiChooseMedia", "do chooseMedia");
              hPi = true;
              g.a(paramc.getAppId(), new JsApiChooseMedia.1(this, paramc));
              paramJSONObject = new JsApiChooseMedia.ChooseRequest();
              paramJSONObject.appId = paramc.getAppId();
              paramJSONObject.hPk = str2.contains("album");
              paramJSONObject.hPl = str2.contains("camera");
              paramJSONObject.hPm = str3.contains("image");
              paramJSONObject.hPn = str3.contains("video");
              if ((!str4.contains("back")) && (str4.contains("front")));
              for (paramJSONObject.isFront = true; ; paramJSONObject.isFront = false)
              {
                paramJSONObject.maxDuration = i;
                paramJSONObject.count = j;
                paramJSONObject.hOU = str1.contains("compressed");
                paramJSONObject.hOV = str1.contains("original");
                com.tencent.mm.plugin.appbrand.ipc.a.a(localContext1, paramJSONObject, new JsApiChooseMedia.2(this, paramc, paramInt));
                AppMethodBeat.o(131213);
                break;
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia
 * JD-Core Version:    0.6.2
 */