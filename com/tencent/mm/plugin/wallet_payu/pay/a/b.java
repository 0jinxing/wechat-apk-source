package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a
{
  public String czZ;
  public String kBE;
  public String pin;
  public String tDT;
  public String tSB;
  public String tSs;
  public String tSy;
  public String tSz;
  public double tTQ;
  public String tTR;
  public double tTS;
  public String tTT;
  public boolean tTU;
  public boolean tTV;
  public String tTW;
  public String tTX;
  public String tTY;
  public int timestamp;
  public String tlg;

  public b(String paramString1, double paramDouble, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(48440);
    this.czZ = paramString1;
    this.tTQ = paramDouble;
    this.tTR = paramString2;
    this.tDT = paramString3;
    this.tlg = paramString4;
    this.tSs = paramString5;
    this.pin = paramString6;
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString1);
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString2);
    localHashMap.put("bank_type", String.valueOf(paramString3));
    localHashMap.put("bind_serial", paramString4);
    if (!paramString3.equals("SVA_PAYU"))
      localHashMap.put("cvv", String.valueOf(paramString5));
    localHashMap.put("pin", String.valueOf(paramString6));
    M(localHashMap);
    AppMethodBeat.o(48440);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48442);
    if (paramJSONObject != null)
    {
      this.kBE = paramJSONObject.optString("trans_id");
      this.tTS = (paramJSONObject.optDouble("total_fee") / 100.0D);
      this.tTT = paramJSONObject.optString("fee_type");
      this.tTU = paramJSONObject.optBoolean("redirect");
      this.tSy = paramJSONObject.optString("gateway_reference");
      this.tSz = paramJSONObject.optString("gateway_code");
      this.tTW = paramJSONObject.optString("pay_status");
      this.timestamp = paramJSONObject.optInt("timestamp");
      this.tTX = paramJSONObject.optString("pay_status_name");
      this.tTY = paramJSONObject.optString("bank_type");
      this.tTV = paramJSONObject.optBoolean("is_force_adjust");
      this.tSB = paramJSONObject.optString("force_adjust_code");
    }
    AppMethodBeat.o(48442);
  }

  public final int cOX()
  {
    return 9;
  }

  public final boolean isSuccess()
  {
    AppMethodBeat.i(48441);
    boolean bool = this.tTW.equals("1");
    AppMethodBeat.o(48441);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.a.b
 * JD-Core Version:    0.6.2
 */