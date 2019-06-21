package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p extends m
{
  public p(String paramString)
  {
    AppMethodBeat.i(46528);
    HashMap localHashMap = new HashMap();
    localHashMap.put("wallet_tpa_country", paramString);
    M(localHashMap);
    AppMethodBeat.o(46528);
  }

  public final int ZU()
  {
    return 1663;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int bgI()
  {
    return 1663;
  }

  public final int getType()
  {
    AppMethodBeat.i(46529);
    int i = super.getType();
    AppMethodBeat.o(46529);
    return i;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/setuserwallet";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.p
 * JD-Core Version:    0.6.2
 */