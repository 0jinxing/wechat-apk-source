package com.tencent.mm.plugin.wallet_payu.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a
{
  public String cEW;
  public String tTb;
  public String tTc;
  public boolean tTz;

  public b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(48408);
    this.tTb = paramString1;
    this.tTc = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("dial_code", paramString1);
    localHashMap.put("number", String.valueOf(paramString2));
    M(localHashMap);
    AppMethodBeat.o(48408);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48409);
    ab.d("MicroMsg.NetScenePayUGenerateOtp", "hy: get NetScenePayUGenerateOtp info. errCode: %d, errMsg:%s, json:%s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject.toString() });
    this.tTz = paramJSONObject.optBoolean("has_mobile");
    this.cEW = paramJSONObject.optString("payu_reference");
    AppMethodBeat.o(48409);
  }

  public final int cOX()
  {
    return 12;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.a.b
 * JD-Core Version:    0.6.2
 */