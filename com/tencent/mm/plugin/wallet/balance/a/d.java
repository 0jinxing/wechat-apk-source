package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.b;
import com.tencent.mm.plugin.wallet_core.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave.RetryPayInfo;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d extends m
  implements i, ITenpaySave
{
  public String cBT;
  public String cRb;
  public String cRc;
  public String cRd;
  public String cRe;
  public String cRf;
  public int cuy;
  public double pPp;
  public double pPz;
  public boolean teW;
  public String teX;
  public b teY;
  public b teZ;
  public j tfa;
  public String tfb;
  public boolean tfc;
  public d.a tfd;
  private ITenpaySave.RetryPayInfo tfe;

  public d(double paramDouble, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(45223);
    this.cBT = null;
    this.teW = false;
    this.teX = "";
    this.pPp = 0.0D;
    this.pPz = 0.0D;
    this.cuy = 0;
    this.tfc = false;
    HashMap localHashMap = new HashMap();
    localHashMap.put("total_fee", com.tencent.mm.wallet_core.ui.e.b(String.valueOf(paramDouble), "100", 0, RoundingMode.HALF_UP).toString());
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("operation", String.valueOf(paramInt));
    localHashMap.put("charge_rate_version", (String)g.RP().Ry().get(ac.a.xUg, ""));
    M(localHashMap);
    AppMethodBeat.o(45223);
  }

  public final int ZU()
  {
    return 1503;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    boolean bool1 = false;
    AppMethodBeat.i(45224);
    ab.d("Micromsg.NetSceneTenpayBalanceFetch", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      AppMethodBeat.o(45224);
      return;
    }
    this.cBT = paramJSONObject.optString("req_key");
    this.teW = "1".equals(paramJSONObject.optString("should_alert"));
    this.teX = paramJSONObject.optString("alert_msg");
    this.pPp = (paramJSONObject.optDouble("charge_fee", 0.0D) / 100.0D);
    this.pPz = (paramJSONObject.optDouble("total_fee", 0.0D) / 100.0D);
    paramString = paramJSONObject.optJSONObject("first_fetch_info");
    if (paramString != null)
    {
      ab.i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is valid");
      this.teY = af.a(paramString, false);
      label140: paramString = paramJSONObject.optJSONObject("need_charge_fee_info");
      if (paramString == null)
        break label579;
      ab.i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is valid");
      this.teZ = af.a(paramString, false);
    }
    while (true)
    {
      this.cuy = paramJSONObject.optInt("operation", 0);
      ab.i("Micromsg.NetSceneTenpayBalanceFetch", "charge_fee:" + this.pPp + " total_fee:" + this.pPz + " operation:" + this.cuy);
      if (paramJSONObject.has("real_name_info"))
      {
        paramString = paramJSONObject.optJSONObject("real_name_info");
        ab.i("Micromsg.NetSceneTenpayBalanceFetch", "get real_name_info %s", new Object[] { paramString.toString() });
        this.cRb = paramString.optString("guide_flag");
        this.cRc = paramString.optString("guide_wording");
        this.cRd = paramString.optString("left_button_wording");
        this.cRe = paramString.optString("right_button_wording");
        this.cRf = paramString.optString("upload_credit_url");
      }
      this.tfc = paramJSONObject.optBoolean("need_large_account_tip");
      if ((this.tfc) && (paramJSONObject.has("large_account_tip")))
      {
        ab.i("Micromsg.NetSceneTenpayBalanceFetch", "get large_account_tip");
        paramString = new d.a();
        JSONObject localJSONObject = paramJSONObject.optJSONObject("large_account_tip");
        paramString.title = localJSONObject.optString("title");
        paramString.content = localJSONObject.optString("content");
        paramString.tff = localJSONObject.optString("button_name");
        paramString.tfg = localJSONObject.optString("button_jump_url");
        ab.d("Micromsg.NetSceneTenpayBalanceFetch", "parseLargeAccountTipDialog() title:%s content:%s button_name:%s button_jump_url:%s", new Object[] { bo.nullAsNil(paramString.title), bo.nullAsNil(paramString.content), bo.nullAsNil(paramString.tff), bo.nullAsNil(paramString.tfg) });
        this.tfd = paramString;
      }
      boolean bool2 = this.tfc;
      if (this.tfd == null)
        bool1 = true;
      ab.i("Micromsg.NetSceneTenpayBalanceFetch", "needLargeAccountTip:%s accountTipDialog:%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      this.tfe = new ITenpaySave.RetryPayInfo();
      this.tfe.aA(paramJSONObject);
      this.tfb = paramJSONObject.optString("charge_checkout_wording");
      this.tfa = j.ay(paramJSONObject.optJSONObject("fetch_alert_dialog"));
      AppMethodBeat.o(45224);
      break;
      ab.e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is null");
      break label140;
      label579: ab.e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is null");
    }
  }

  public final int bgI()
  {
    return 75;
  }

  public final ITenpaySave.RetryPayInfo cMC()
  {
    return this.tfe;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/genprefetch";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.d
 * JD-Core Version:    0.6.2
 */