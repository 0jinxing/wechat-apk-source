package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class x extends m
{
  public x(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(44788);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("transfer_id", paramString2);
    localHashMap.put("receiver_name", paramString3);
    localHashMap.put("from", String.valueOf(paramInt2));
    localHashMap.put("invalid_time", String.valueOf(paramInt1));
    M(localHashMap);
    AppMethodBeat.o(44788);
  }

  public final int ZU()
  {
    return 1545;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44789);
    ab.d("Micromsg.NetSceneTenpayRemittanceResendMsg", "errCode " + paramInt + " errMsg: " + paramString);
    AppMethodBeat.o(44789);
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transferresendmsg";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.x
 * JD-Core Version:    0.6.2
 */