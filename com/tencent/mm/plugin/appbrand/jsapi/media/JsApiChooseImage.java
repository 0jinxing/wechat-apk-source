package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiChooseImage extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 29;
  public static final String NAME = "chooseImage";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131151);
    if (com.tencent.mm.plugin.appbrand.n.xa(paramc.getAppId()).gPi)
    {
      paramc.M(paramInt, j("cancel", null));
      AppMethodBeat.o(131151);
    }
    Context localContext;
    while (true)
    {
      return;
      localContext = paramc.getContext();
      if ((localContext != null) && ((localContext instanceof Activity)))
        break;
      paramc.M(paramInt, j("fail", null));
      AppMethodBeat.o(131151);
    }
    JsApiChooseImage.ChooseRequest localChooseRequest = new JsApiChooseImage.ChooseRequest();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("sourceType");
    String str1 = paramJSONObject.optString("sizeType");
    String str2 = paramJSONObject.optString("count");
    ab.i("MicroMsg.JsApiChooseImage", "doChooseImage sourceType = %s, sizeType = %s, count = %s", new Object[] { localJSONArray, str1, str2 });
    label167: int i;
    if ((localJSONArray == null) || (localJSONArray.length() == 0))
    {
      localChooseRequest.hOS = true;
      localChooseRequest.hOT = true;
      if (!localChooseRequest.hOS)
        break label318;
      com.tencent.mm.plugin.appbrand.permission.n.b(paramc.getAppId(), new JsApiChooseImage.3(this, paramc, paramJSONObject, paramInt));
      paramJSONObject = paramc.getContext();
      if ((paramJSONObject != null) && ((paramJSONObject instanceof Activity)))
        break label276;
      paramc.M(paramInt, j("fail", null));
      i = 0;
    }
    while (true)
    {
      if (i != 0)
        break label318;
      AppMethodBeat.o(131151);
      break;
      localChooseRequest.hOS = localJSONArray.toString().contains("camera");
      localChooseRequest.hOT = localJSONArray.toString().contains("album");
      break label167;
      label276: boolean bool = b.a((Activity)paramJSONObject, "android.permission.CAMERA", 113, "", "");
      i = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.permission.n.Dr(paramc.getAppId());
        i = bool;
      }
    }
    label318: com.tencent.mm.plugin.appbrand.n.xb(paramc.getAppId()).gPi = true;
    g.a(paramc.getAppId(), new JsApiChooseImage.1(this, paramc));
    if (bo.isNullOrNil(str1));
    for (paramJSONObject = "compressed"; ; paramJSONObject = str1)
    {
      localChooseRequest.hOU = paramJSONObject.contains("compressed");
      localChooseRequest.hOV = paramJSONObject.contains("original");
      localChooseRequest.count = bo.getInt(str2, 9);
      localChooseRequest.appId = paramc.getAppId();
      com.tencent.mm.plugin.appbrand.ipc.a.b(localContext, localChooseRequest, new JsApiChooseImage.2(this, paramc, paramInt));
      AppMethodBeat.o(131151);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage
 * JD-Core Version:    0.6.2
 */