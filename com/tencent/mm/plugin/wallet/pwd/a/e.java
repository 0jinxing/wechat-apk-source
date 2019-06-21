package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e extends m
{
  public e(String paramString)
  {
    AppMethodBeat.i(46170);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    M(localHashMap);
    AppMethodBeat.o(46170);
  }

  public final int ZU()
  {
    return 1321;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46171);
    ab.i("MicroMsg.NetSceneCloseWalletLock", "alvinluo close wallet lock errCode: %d, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    AppMethodBeat.o(46171);
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/closewalletlock";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.e
 * JD-Core Version:    0.6.2
 */