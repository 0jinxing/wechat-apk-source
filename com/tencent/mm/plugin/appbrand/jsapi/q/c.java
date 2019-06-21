package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends a
{
  public static final int CTRL_INDEX = 169;
  public static final String NAME = "getClipboardData";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126406);
    paramJSONObject = (ClipboardManager)ah.getContext().getSystemService("clipboard");
    if (paramJSONObject == null)
    {
      ab.i("MicroMsg.JsApiGetClipboardData", "getSystemService(CLIPBOARD_SERVICE) failed.");
      paramc.M(paramInt, j("fail", null));
      AppMethodBeat.o(126406);
    }
    while (true)
    {
      return;
      Object localObject1 = paramJSONObject.getPrimaryClip();
      Object localObject2 = "";
      paramJSONObject = (JSONObject)localObject2;
      if (localObject1 != null)
      {
        paramJSONObject = (JSONObject)localObject2;
        if (((ClipData)localObject1).getItemCount() > 0)
        {
          localObject1 = ((ClipData)localObject1).getItemAt(0);
          paramJSONObject = (JSONObject)localObject2;
          if (((ClipData.Item)localObject1).getText() != null)
            paramJSONObject = ((ClipData.Item)localObject1).getText().toString();
        }
      }
      localObject2 = new HashMap();
      ((Map)localObject2).put("data", paramJSONObject);
      paramc.M(paramInt, j("ok", (Map)localObject2));
      AppMethodBeat.o(126406);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.c
 * JD-Core Version:    0.6.2
 */