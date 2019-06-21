package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.tencent.mm.wallet_core.e.a.a
{
  public String cMr;
  public String cuZ;
  public String czZ;
  public double pTN;
  public String pin;
  public int tSw;
  public int tUv;
  public double tUw;
  public String tUx;
  public String tlg;

  public a(String paramString1, String paramString2, double paramDouble, String paramString3, int paramInt, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(48525);
    this.czZ = paramString1;
    this.pin = paramString2;
    this.pTN = paramDouble;
    this.cuZ = paramString3;
    if (paramInt == 2);
    for (int i = 0; ; i = paramInt)
    {
      this.tUv = i;
      this.cMr = paramString4;
      this.tlg = paramString5;
      HashMap localHashMap = new HashMap();
      localHashMap.put("pin", paramString2);
      localHashMap.put("req_key", paramString1);
      localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
      localHashMap.put("fee_type", paramString3);
      localHashMap.put("transfer_type", String.valueOf(paramInt));
      localHashMap.put("target_username", paramString4);
      localHashMap.put("bind_serial", paramString5);
      localHashMap.put("transfer_qrcode_id", paramString6);
      M(localHashMap);
      AppMethodBeat.o(48525);
      return;
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48526);
    this.tSw = paramJSONObject.optInt("response_result");
    this.tUw = bo.getDouble(paramJSONObject.optString("total_fee"), 0.0D);
    this.tUx = paramJSONObject.optString("fee_type");
    AppMethodBeat.o(48526);
  }

  public final int cOX()
  {
    return 14;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.a.a
 * JD-Core Version:    0.6.2
 */