package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class o extends m
{
  public o(s params)
  {
    AppMethodBeat.i(46198);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("verify_code", params.tCi);
    localHashMap1.put("token", params.token);
    a(params.pGr, localHashMap1, localHashMap2);
    M(localHashMap1);
    ba(localHashMap2);
    AppMethodBeat.o(46198);
  }

  public final int ZU()
  {
    return 470;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int bgI()
  {
    return 11;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdverify";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.o
 * JD-Core Version:    0.6.2
 */