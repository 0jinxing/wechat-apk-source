package com.tencent.mm.plugin.wallet_payu.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.tencent.mm.wallet_core.e.a.a
{
  public String cEW;
  public boolean qnM;
  public String tTx;
  public String tTy;

  public a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(48406);
    this.tTx = paramString1;
    this.cEW = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("otp", paramString1);
    localHashMap.put("payu_reference", String.valueOf(paramString2));
    M(localHashMap);
    AppMethodBeat.o(48406);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48407);
    ab.d("MicroMsg.NetScenePayUComfirmOtp", "hy: get NetScenePayUCreateUser info. errCode: %d, errMsg:%s, json:%s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject.toString() });
    this.qnM = paramJSONObject.optBoolean("verified");
    this.tTy = paramJSONObject.optString("payu_reference");
    AppMethodBeat.o(48407);
  }

  public final int cOX()
  {
    return 4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.a.a
 * JD-Core Version:    0.6.2
 */