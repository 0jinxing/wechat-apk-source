package com.tencent.mm.plugin.wallet_core.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public boolean lSP;
  public Bankcard tDH;
  public String tDI;
  public String tDJ;
  public boolean tDK;
  public int tDL;

  public b(Bankcard paramBankcard)
  {
    AppMethodBeat.i(47046);
    this.tDH = paramBankcard;
    try
    {
      paramBankcard = new org/json/JSONObject;
      paramBankcard.<init>(this.tDH.field_ext_msg);
      this.tDI = paramBankcard.optString("information");
      this.lSP = paramBankcard.optBoolean("verified");
      this.tDJ = paramBankcard.optString("card_expiry");
      this.tDL = paramBankcard.optInt("cvv_length");
      this.tDK = paramBankcard.optBoolean("is_credit");
      AppMethodBeat.o(47046);
      return;
    }
    catch (JSONException paramBankcard)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BankcardPayUWrapper", paramBankcard, "", new Object[0]);
        AppMethodBeat.o(47046);
      }
    }
  }

  public static String aJ(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(47045);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("cvv_length", paramJSONObject.optInt("cvv_length"));
      localJSONObject.put("information", paramJSONObject.optString("information"));
      localJSONObject.put("verified", paramJSONObject.optBoolean("verified"));
      localJSONObject.put("card_expiry", paramJSONObject.optString("card_expiry"));
      localJSONObject.put("is_credit", paramJSONObject.optString("bank_type").equals("CREDITCARD_PAYU"));
      paramJSONObject = localJSONObject.toString();
      AppMethodBeat.o(47045);
      return paramJSONObject;
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.BankcardPayUWrapper", paramJSONObject, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.a.b
 * JD-Core Version:    0.6.2
 */