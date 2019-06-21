package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave.RetryPayInfo;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e extends m
  implements i, ITenpaySave
{
  public String cBT;
  public String cRb;
  public String cRc;
  public String cRd;
  public String cRe;
  public String cRf;
  public boolean teW;
  public String teX;
  private ITenpaySave.RetryPayInfo tfe;

  public e(double paramDouble, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(45225);
    this.cBT = null;
    this.teW = false;
    this.teX = "";
    HashMap localHashMap = new HashMap();
    localHashMap.put("total_fee", com.tencent.mm.wallet_core.ui.e.b(String.valueOf(paramDouble), "100", 0, RoundingMode.HALF_UP).toString());
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("bank_type", paramString3);
    M(localHashMap);
    AppMethodBeat.o(45225);
  }

  public final int ZU()
  {
    return 1502;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45226);
    ab.d("Micromsg.NetSceneTenpayBalanceSave", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(45226);
    while (true)
    {
      return;
      this.cBT = paramJSONObject.optString("req_key");
      this.teW = "1".equals(paramJSONObject.optString("should_alert"));
      this.teX = paramJSONObject.optString("alert_msg");
      if (paramJSONObject.has("real_name_info"))
      {
        paramString = paramJSONObject.optJSONObject("real_name_info");
        ab.i("Micromsg.NetSceneTenpayBalanceSave", "get real_name_info %s", new Object[] { paramString.toString() });
        this.cRb = paramString.optString("guide_flag");
        this.cRc = paramString.optString("guide_wording");
        this.cRd = paramString.optString("left_button_wording");
        this.cRe = paramString.optString("right_button_wording");
        this.cRf = paramString.optString("upload_credit_url");
      }
      this.tfe = new ITenpaySave.RetryPayInfo();
      this.tfe.aA(paramJSONObject);
      AppMethodBeat.o(45226);
    }
  }

  public final int bgI()
  {
    return 74;
  }

  public final ITenpaySave.RetryPayInfo cMC()
  {
    return this.tfe;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/genpresave";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.e
 * JD-Core Version:    0.6.2
 */