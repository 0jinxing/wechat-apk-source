package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.b.a.a;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class z extends a
{
  public int kCv;
  public String pPf;
  public int pPl;
  public String pQA;
  public int pQB;

  public z(double paramDouble, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    AppMethodBeat.i(44792);
    this.kCv = 0;
    this.pPf = "";
    this.pQA = "";
    ab.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay create");
    HashMap localHashMap = new HashMap();
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localHashMap.put("transfer_amount", Math.round(100.0D * paramDouble));
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localHashMap.put("pay_nickname", URLEncoder.encode(paramString1, "utf-8"));
      localHashMap.put("rcvd_username", String.valueOf(paramString2));
      paramString1 = new java/lang/StringBuilder;
      paramString1.<init>();
      localHashMap.put("rcvd_nickname", URLEncoder.encode(paramString3, "utf-8"));
      paramString1 = new java/lang/StringBuilder;
      paramString1.<init>();
      localHashMap.put("reason", URLEncoder.encode(bo.bc(paramString4, ""), "utf-8"));
      localHashMap.put("currency", String.valueOf(paramInt));
      M(localHashMap);
      AppMethodBeat.o(44792);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
        ab.e("MicroMsg.NetSceneTenpayh5Pay", "error " + paramString1.getMessage());
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44793);
    ab.i("MicroMsg.NetSceneTenpayh5Pay", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      ab.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay request error");
      AppMethodBeat.o(44793);
    }
    while (true)
    {
      return;
      paramString = new StringBuffer();
      this.pPf = paramJSONObject.optString("payurl");
      this.pQA = paramJSONObject.optString("tradeurl");
      this.pPl = paramJSONObject.optInt("transfering_num");
      this.pQB = paramJSONObject.optInt("transfering_type");
      paramString.append("payurl:" + this.pPf);
      paramString.append(" tradeurl:" + this.pQA);
      paramString.append(" transfering_num:" + this.pPl);
      paramString.append(" transfering_type:" + this.pQB);
      ab.i("MicroMsg.NetSceneTenpayh5Pay", "resp " + paramString.toString());
      AppMethodBeat.o(44793);
    }
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/h5requesttransfer";
  }

  public final int bgG()
  {
    return 1;
  }

  public final int getType()
  {
    return 1622;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.z
 * JD-Core Version:    0.6.2
 */