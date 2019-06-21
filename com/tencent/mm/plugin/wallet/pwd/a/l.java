package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class l extends m
  implements i
{
  public l(s params)
  {
    AppMethodBeat.i(46192);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("flag", params.flag);
    localHashMap1.put("passwd", params.guu);
    localHashMap1.put("rpasswd", params.guu);
    localHashMap1.put("verify_code", params.tCi);
    localHashMap1.put("token", params.token);
    a(params.pGr, localHashMap1, localHashMap2);
    M(localHashMap1);
    ba(localHashMap2);
    AppMethodBeat.o(46192);
  }

  public final int ZU()
  {
    return 478;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int bgI()
  {
    return 20;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/resetpwd";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.l
 * JD-Core Version:    0.6.2
 */