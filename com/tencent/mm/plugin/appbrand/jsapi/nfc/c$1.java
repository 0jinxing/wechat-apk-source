package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class c$1
  implements JsApiAppBrandNFCBase.a
{
  c$1(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, int paramInt, JSONObject paramJSONObject)
  {
  }

  public final void T(int paramInt, String paramString)
  {
    AppMethodBeat.i(137869);
    Object localObject1 = new HashMap();
    ((Map)localObject1).put("errCode", Integer.valueOf(paramInt));
    Object localObject2;
    HashMap localHashMap;
    if (paramInt == 0)
    {
      localObject1 = this.hSc;
      paramString = this.hxc;
      paramInt = this.eIl;
      localObject2 = this.hSb;
      localHashMap = new HashMap();
      localObject2 = ((JSONObject)localObject2).optString("data");
      if (bo.isNullOrNil((String)localObject2))
      {
        localHashMap.put("errCode", Integer.valueOf(13005));
        c.a(paramString, paramInt, ((c)localObject1).j("fail", localHashMap));
        AppMethodBeat.o(137869);
      }
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putString("key_apdu_command", (String)localObject2);
      HCEEventLogic.a(paramString.getAppId(), 32, localBundle);
      localHashMap.put("errCode", Integer.valueOf(0));
      paramString.M(paramInt, ((c)localObject1).j("ok", localHashMap));
      AppMethodBeat.o(137869);
      continue;
      c.a(this.hxc, this.eIl, this.hSc.j("fail: ".concat(String.valueOf(paramString)), (Map)localObject1));
      AppMethodBeat.o(137869);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.c.1
 * JD-Core Version:    0.6.2
 */