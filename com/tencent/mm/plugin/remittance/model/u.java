package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class u extends m
{
  public String nYZ;
  public String pPk;

  public u(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2)
  {
    AppMethodBeat.i(44770);
    this.pPk = null;
    this.nYZ = "";
    this.pPk = paramString3;
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString2);
    localHashMap.put("transaction_id", paramString1);
    localHashMap.put("op", paramString3);
    localHashMap.put("username", paramString4);
    localHashMap.put("invalid_time", String.valueOf(paramInt2));
    localHashMap.put("total_fee", String.valueOf(paramInt1));
    ab.i("Micromsg.NetSceneTenpayRemittanceQuery", "trans_id=" + paramString2 + ";transaction_id=" + paramString1 + ";total_fee=" + paramInt1);
    M(localHashMap);
    AppMethodBeat.o(44770);
  }

  public final int ZU()
  {
    return 1691;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44771);
    ab.d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(44771);
    while (true)
    {
      return;
      paramString = paramJSONObject.optJSONObject("real_name_info");
      if (paramString != null)
        this.nYZ = paramString.optString("guide_flag", "0");
      AppMethodBeat.o(44771);
    }
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transferoperation";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.u
 * JD-Core Version:    0.6.2
 */