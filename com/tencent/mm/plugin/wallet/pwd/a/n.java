package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n extends m
{
  public n(String paramString1, String paramString2)
  {
    AppMethodBeat.i(46196);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("resetpwd_token", paramString2);
    localHashMap1.put("passwd", paramString1);
    M(localHashMap1);
    ba(localHashMap2);
    AppMethodBeat.o(46196);
  }

  public final int ZU()
  {
    return 1371;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46197);
    ab.d("MicroMsg.NetSceneTenpayResetPwdByToken", " json %s", new Object[] { paramJSONObject.toString() });
    AppMethodBeat.o(46197);
  }

  public final int bgI()
  {
    return 1371;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdbytoken";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.n
 * JD-Core Version:    0.6.2
 */