package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class w extends m
{
  public String desc;
  public double kCJ;
  public String pPP;
  public String pPQ;
  public String pPR;
  public String pPS;
  public String pPT;
  public String pPU;
  public int pPV;
  public String pPW;
  public String pPX;
  public int pPY;
  public String pPZ;
  public String pPw;
  public String pQa;
  public int pQb;
  public String pQc;
  public BusiRemittanceResp pQd;
  public int scene;
  public String username;

  public w(String paramString, int paramInt)
  {
    AppMethodBeat.i(44774);
    this.pPR = "";
    this.pPS = "";
    this.pPT = "";
    this.pPU = "";
    this.pPW = "";
    this.pPX = "";
    HashMap localHashMap = new HashMap();
    localHashMap.put("transfer_url", URLEncoder.encode(paramString));
    M(localHashMap);
    paramString = new HashMap();
    paramString.put("channel", String.valueOf(paramInt));
    ba(paramString);
    AppMethodBeat.o(44774);
  }

  public final int ZU()
  {
    return 1515;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44775);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("errCode ");
      ab.d("Micromsg.NetSceneTenpayRemittanceGetUsername", paramInt + " errMsg: " + paramString);
      if (paramInt != 0)
        AppMethodBeat.o(44775);
      while (true)
      {
        return;
        ab.d("Micromsg.NetSceneTenpayRemittanceGetUsername", "json %s", new Object[] { paramJSONObject.toString() });
        this.username = paramJSONObject.optString("user_name", "");
        this.pPP = paramJSONObject.optString("true_name");
        this.kCJ = (paramJSONObject.optDouble("fee") / 100.0D);
        this.desc = paramJSONObject.optString("desc");
        this.scene = paramJSONObject.optInt("scene");
        this.pPQ = URLEncoder.encode(paramJSONObject.optString("transfer_qrcode_id"));
        this.pPR = paramJSONObject.optString("f2f_pay_desc");
        this.pPS = paramJSONObject.optString("rcvr_desc");
        this.pPT = paramJSONObject.optString("payer_desc");
        this.pPU = paramJSONObject.optString("rcvr_ticket");
        this.pPV = paramJSONObject.optInt("busi_type", 0);
        this.pPW = paramJSONObject.optString("mch_name");
        this.pPX = paramJSONObject.optString("mch_photo");
        this.pQa = paramJSONObject.optString("mch_type", "");
        this.pPY = paramJSONObject.optInt("mch_time", 0);
        this.pPZ = paramJSONObject.optString("receiver_openid");
        this.pQb = paramJSONObject.optInt("get_pay_wifi");
        this.pPw = paramJSONObject.optString("receiver_true_name");
        this.pQc = paramJSONObject.optString("mch_info_string");
        paramString = new com/tencent/mm/plugin/remittance/model/BusiRemittanceResp;
        paramString.<init>(paramJSONObject);
        this.pQd = paramString;
        AppMethodBeat.o(44775);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceGetUsername", paramString, "", new Object[0]);
        AppMethodBeat.o(44775);
      }
    }
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transferscanqrcode";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.w
 * JD-Core Version:    0.6.2
 */