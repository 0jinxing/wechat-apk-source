package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class u extends m
{
  public u(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(46540);
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("appid", URLEncoder.encode(paramString1, "UTF-8"));
      localHashMap.put("timestamp", URLEncoder.encode(paramString2, "UTF-8"));
      localHashMap.put("noncestr", URLEncoder.encode(paramString3, "UTF-8"));
      localHashMap.put("package", URLEncoder.encode(paramString4, "UTF-8"));
      localHashMap.put("sign", URLEncoder.encode(paramString5, "UTF-8"));
      M(localHashMap);
      ab.d("MicroMsg.NetSceneTenpayF2fJsapiCheck", "package: %s, sign: %s", new Object[] { paramString4, paramString5 });
      AppMethodBeat.o(46540);
      return;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneTenpayF2fJsapiCheck", paramString1, "", new Object[0]);
        AppMethodBeat.o(46540);
      }
    }
  }

  public final int ZU()
  {
    return 1973;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46541);
    ab.d("MicroMsg.NetSceneTenpayF2fJsapiCheck", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(46541);
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/f2frcvdlistjsapicheck";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.u
 * JD-Core Version:    0.6.2
 */