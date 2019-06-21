package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends m
{
  public a(int paramInt)
  {
    AppMethodBeat.i(46634);
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt));
    M(localHashMap);
    AppMethodBeat.o(46634);
  }

  public final int ZU()
  {
    return 1584;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46635);
    ab.i("MicroMsg.NetSceneAgreeDisclaimer", "errCode = " + paramInt + ";errMsg = " + paramString);
    AppMethodBeat.o(46635);
  }

  public final int bgI()
  {
    return 1584;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/realnamesetduty";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.model.a
 * JD-Core Version:    0.6.2
 */