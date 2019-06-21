package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p extends m
{
  public p(String paramString)
  {
    AppMethodBeat.i(46199);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    M(localHashMap);
    AppMethodBeat.o(46199);
  }

  public final int ZU()
  {
    return 1304;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46201);
    this.ehi = paramf;
    int i = super.a(parame, paramf);
    AppMethodBeat.o(46201);
    return i;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46200);
    if (paramJSONObject != null);
    for (paramJSONObject = paramJSONObject.toString(); ; paramJSONObject = "null")
    {
      ab.v("MicroMsg.NetSceneTouchLockVerifyByPwd", "alvinluo errCode: %d, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
      AppMethodBeat.o(46200);
      return;
    }
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/touchlockauthen";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.p
 * JD-Core Version:    0.6.2
 */