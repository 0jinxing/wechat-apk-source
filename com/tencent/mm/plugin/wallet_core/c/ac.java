package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ac extends m
{
  public String tuh;
  public String tuu;

  public ac(s params, String paramString)
  {
    AppMethodBeat.i(46554);
    HashMap localHashMap = new HashMap();
    localHashMap.put("verify_code", params.tCi);
    localHashMap.put("token", params.token);
    localHashMap.put("passwd", params.guu);
    localHashMap.put("relation_key", paramString);
    M(localHashMap);
    AppMethodBeat.o(46554);
  }

  public final int ZU()
  {
    return 1604;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46555);
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.tuh = paramJSONObject.optString("token_type");
      this.tuu = paramJSONObject.optString("usertoken");
    }
    AppMethodBeat.o(46555);
  }

  public final int bgI()
  {
    return 124;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/webankverifysms";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.ac
 * JD-Core Version:    0.6.2
 */