package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.cmy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class bn$1
  implements a<Object, cmy>
{
  bn$1(bn parambn, q paramq, int paramInt)
  {
  }

  private Object a(cmy paramcmy)
  {
    AppMethodBeat.i(101958);
    if (paramcmy == null)
    {
      ab.e("MicroMsg.JsApiVerifyPlugin", "getsubbusinessinfo cgi failed, null response");
      this.hsD.M(this.eIl, this.hzy.j("fail:cgi fail", null));
      AppMethodBeat.o(101958);
    }
    while (true)
    {
      return null;
      if (paramcmy.BaseResponse.Ret != 0)
      {
        ab.e("MicroMsg.JsApiVerifyPlugin", "getsubbusinessinfo cgi failed, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramcmy.BaseResponse.Ret), paramcmy.BaseResponse.ErrMsg });
        this.hsD.M(this.eIl, this.hzy.j("fail:cgi fail", null));
        AppMethodBeat.o(101958);
      }
      else
      {
        HashMap localHashMap = new HashMap();
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(paramcmy.xkv);
          localHashMap.put("data", localJSONObject);
          this.hsD.M(this.eIl, this.hzy.j("ok", localHashMap));
          AppMethodBeat.o(101958);
        }
        catch (Exception paramcmy)
        {
          this.hsD.M(this.eIl, this.hzy.j("fail:resp invalid", null));
          AppMethodBeat.o(101958);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bn.1
 * JD-Core Version:    0.6.2
 */