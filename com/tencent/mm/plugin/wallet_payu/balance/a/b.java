package com.tencent.mm.plugin.wallet_payu.balance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a
{
  public String cuZ;
  public String czZ;
  public String kBE;
  public double pTN;
  public String pin;
  public boolean tSA;
  public String tSB;
  public String tSs;
  public String tSt;
  public String tSu;
  public String tSv;
  public int tSw;
  public boolean tSx;
  public String tSy;
  public String tSz;

  public b(String paramString1, String paramString2, String paramString3, double paramDouble, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(48322);
    this.pin = paramString1;
    this.tSs = paramString2;
    this.czZ = paramString3;
    this.pTN = paramDouble;
    this.cuZ = paramString4;
    this.tSt = paramString5;
    this.tSu = paramString6;
    this.tSv = paramString7;
    HashMap localHashMap = new HashMap();
    localHashMap.put("pin", paramString1);
    localHashMap.put("bind_serial", paramString5);
    localHashMap.put("req_key", paramString3);
    localHashMap.put("fee_type", paramString4);
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("bank_type", paramString6);
    localHashMap.put("cvv", paramString2);
    localHashMap.put("dest_bind_serial", paramString7);
    M(localHashMap);
    AppMethodBeat.o(48322);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48323);
    this.kBE = paramJSONObject.optString("trans_id");
    this.tSw = paramJSONObject.optInt("response_result");
    this.tSx = paramJSONObject.optBoolean("redirect");
    this.tSy = paramJSONObject.optString("gateway_reference");
    this.tSz = paramJSONObject.optString("gateway_code");
    this.tSA = paramJSONObject.optBoolean("is_force_adjust");
    this.tSB = paramJSONObject.optString("force_adjust_code");
    AppMethodBeat.o(48323);
  }

  public final int cOX()
  {
    return 10;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.balance.a.b
 * JD-Core Version:    0.6.2
 */