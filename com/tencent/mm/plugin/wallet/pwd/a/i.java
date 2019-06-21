package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i extends m
{
  public i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(46182);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("new_passwd", paramString2);
    localHashMap.put("new_rpasswd", paramString2);
    M(localHashMap);
    AppMethodBeat.o(46182);
  }

  public final int ZU()
  {
    return 468;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46183);
    ab.d("Micromsg.NetSceneTenpayChangePwd", "errCode " + paramInt + " errMsg: " + paramString);
    AppMethodBeat.o(46183);
  }

  public final int bgI()
  {
    return 9;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/changepwd";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.i
 * JD-Core Version:    0.6.2
 */