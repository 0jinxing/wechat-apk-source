package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.cwi;
import com.tencent.mm.protocal.protobuf.fu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.c.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ap$1
  implements a<Object, cwi>
{
  ap$1(ap paramap, c paramc, int paramInt)
  {
  }

  private Object a(cwi paramcwi)
  {
    AppMethodBeat.i(101944);
    if (paramcwi == null)
    {
      ab.e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq cgi failed, null response");
      this.hxc.M(this.eIl, this.hxd.j("fail:cgi fail", null));
      AppMethodBeat.o(101944);
    }
    while (true)
    {
      return null;
      if (paramcwi.BaseResponse.Ret == 0)
        break;
      ab.e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq cgi failed, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramcwi.BaseResponse.Ret), paramcwi.BaseResponse.ErrMsg });
      this.hxc.M(this.eIl, this.hxd.j("fail:cgi fail", null));
      AppMethodBeat.o(101944);
    }
    Object localObject;
    try
    {
      localObject = paramcwi.xsb;
      paramcwi = new org/json/JSONArray;
      paramcwi.<init>();
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        fu localfu = (fu)((Iterator)localObject).next();
        JSONObject localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        try
        {
          localJSONObject1.put("scope", localfu.scope);
          localJSONObject1.put("state", localfu.state);
          localJSONObject1.put("desc", localfu.vHE);
          paramcwi.put(localJSONObject1);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.JsApiGetSetting", "parse json failed : %s", new Object[] { localException.getMessage() });
        }
      }
    }
    catch (Exception paramcwi)
    {
    }
    while (true)
      while (true)
      {
        this.hxc.M(this.eIl, this.hxd.j("fail:resp invalid", null));
        AppMethodBeat.o(101944);
        break;
        localObject = paramcwi.toString();
        ab.d("MicroMsg.JsApiGetSetting", "authInfo %s", new Object[] { paramcwi });
        JSONObject localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        try
        {
          localJSONObject2.put("errMsg", "getSetting:ok");
          paramcwi = new org/json/JSONArray;
          paramcwi.<init>(bo.nullAsNil((String)localObject));
          localJSONObject2.put("authSetting", paramcwi);
          this.hxc.M(this.eIl, localJSONObject2.toString());
          AppMethodBeat.o(101944);
        }
        catch (JSONException paramcwi)
        {
          ab.printErrStackTrace("MicroMsg.JsApiGetSetting", paramcwi, "set json error!", new Object[0]);
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ap.1
 * JD-Core Version:    0.6.2
 */