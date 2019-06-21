package com.tencent.mm.plugin.wallet_payu.balance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.tencent.mm.wallet_core.e.a.a
{
  public String cuZ;
  public String czZ;
  public double pTN;

  public a(double paramDouble, String paramString)
  {
    AppMethodBeat.i(48320);
    this.pTN = paramDouble;
    this.cuZ = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString);
    M(localHashMap);
    AppMethodBeat.o(48320);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48321);
    this.czZ = paramJSONObject.optString("prepayid");
    AppMethodBeat.o(48321);
  }

  public final int cOX()
  {
    return 20;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.balance.a.a
 * JD-Core Version:    0.6.2
 */