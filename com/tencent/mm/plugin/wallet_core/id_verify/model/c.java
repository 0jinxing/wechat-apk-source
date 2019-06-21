package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends m
{
  public c(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, (byte)0);
  }

  private c(String paramString1, String paramString2, int paramInt, byte paramByte)
  {
    AppMethodBeat.i(46639);
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", "1");
    localHashMap.put("passwd", paramString1);
    localHashMap.put("token", paramString2);
    localHashMap.put("realname_scene", String.valueOf(paramInt));
    ab.i("MicroMsg.NetSceneRealNameReg", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
    M(localHashMap);
    AppMethodBeat.o(46639);
  }

  public final int ZU()
  {
    return 1648;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46640);
    ab.i("MicroMsg.NetSceneRealNameReg", "errCode=" + paramString + ";errMsg=" + paramString);
    AppMethodBeat.o(46640);
  }

  public final int bgI()
  {
    return 1648;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/realnamereg";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.model.c
 * JD-Core Version:    0.6.2
 */