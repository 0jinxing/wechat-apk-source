package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class t extends m
{
  public t(String paramString1, String paramString2)
  {
    AppMethodBeat.i(44767);
    HashMap localHashMap = new HashMap();
    localHashMap.put("receiver_user_name", paramString1);
    localHashMap.put("transfer_qrcode_id", paramString2);
    M(localHashMap);
    AppMethodBeat.o(44767);
  }

  public t(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(44768);
    HashMap localHashMap = new HashMap();
    localHashMap.put("receiver_user_name", paramString1);
    localHashMap.put("transfer_qrcode_id", paramString2);
    localHashMap.put("rcvr_ticket", paramString3);
    localHashMap.put("receiver_openid", paramString4);
    M(localHashMap);
    AppMethodBeat.o(44768);
  }

  public final int ZU()
  {
    return 1535;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44769);
    ab.d("MicroMsg.NetSenceTenPayBase", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(44769);
    while (true)
    {
      return;
      AppMethodBeat.o(44769);
    }
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transfersendcancelf2f";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.t
 * JD-Core Version:    0.6.2
 */