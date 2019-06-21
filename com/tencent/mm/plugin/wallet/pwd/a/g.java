package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import org.json.JSONObject;

public final class g extends m
{
  public g(String paramString1, String paramString2)
  {
    AppMethodBeat.i(46176);
    HashMap localHashMap = new HashMap();
    localHashMap.put("auth_token", paramString1);
    localHashMap.put("passwd", String.valueOf(paramString2));
    localHashMap.put("timestamp", System.currentTimeMillis());
    M(localHashMap);
    AppMethodBeat.o(46176);
  }

  public final int ZU()
  {
    return 2514;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46177);
    d.i("MicroMsg.NetSceneResetPayPwdByFace", "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    if (paramInt == 0)
    {
      paramJSONObject.optString("retcode");
      paramJSONObject.optString("retmsg");
    }
    AppMethodBeat.o(46177);
  }

  public final int bgI()
  {
    return 2514;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/resetpaypwdbyface";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.g
 * JD-Core Version:    0.6.2
 */