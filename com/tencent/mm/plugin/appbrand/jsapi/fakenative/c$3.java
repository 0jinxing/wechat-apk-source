package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kh;
import com.tencent.mm.g.a.kh.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class c$3 extends com.tencent.mm.sdk.b.c<kh>
{
  c$3(c paramc, com.tencent.mm.plugin.appbrand.d paramd, int paramInt)
  {
    AppMethodBeat.i(131033);
    this.xxI = kh.class.getName().hashCode();
    AppMethodBeat.o(131033);
  }

  private boolean a(kh paramkh)
  {
    AppMethodBeat.i(131034);
    int i = paramkh.cFN.errCode;
    HashMap localHashMap;
    if (i < 0)
    {
      localHashMap = new HashMap();
      localHashMap.put("errCode", Integer.valueOf(i));
      if (i == d.hJx.errCode)
      {
        paramkh = d.hJx.aIm;
        ab.i("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram fail, errCode:%s, errMsg:%s", new Object[] { Integer.valueOf(i), paramkh });
        this.hJo.M(this.eIl, this.hJp.j(paramkh, localHashMap));
      }
    }
    while (true)
    {
      dead();
      AppMethodBeat.o(131034);
      return false;
      if (i == d.hJy.errCode)
      {
        paramkh = d.hJy.aIm;
        break;
      }
      if (i == d.hJz.errCode)
      {
        paramkh = d.hJz.aIm;
        break;
      }
      paramkh = d.hJw.aIm;
      break;
      localHashMap = new HashMap();
      localHashMap.put("errCode", Integer.valueOf(i));
      String str = bo.bc(paramkh.cFN.cFM, "{}");
      try
      {
        paramkh = new org/json/JSONObject;
        paramkh.<init>(str);
        localHashMap.put("extraData", paramkh);
        ab.i("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram success");
        this.hJo.M(this.eIl, this.hJp.j(d.hJv.aIm, localHashMap));
      }
      catch (JSONException paramkh)
      {
        while (true)
        {
          ab.e("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram, parse extraData fail", new Object[] { paramkh });
          paramkh = new JSONObject();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.fakenative.c.3
 * JD-Core Version:    0.6.2
 */