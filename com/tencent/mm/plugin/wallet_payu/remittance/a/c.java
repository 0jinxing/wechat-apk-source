package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends a
{
  public c(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(48529);
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString1);
    localHashMap.put("total_fee", String.valueOf(paramInt));
    localHashMap.put("fee_type", paramString2);
    localHashMap.put("to_customer_name", paramString3);
    M(localHashMap);
    AppMethodBeat.o(48529);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48530);
    ab.d("MicroMsg.NetScenePayURemittanceConfirm", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(48530);
    while (true)
    {
      return;
      AppMethodBeat.o(48530);
    }
  }

  public final int cOX()
  {
    return 15;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.a.c
 * JD-Core Version:    0.6.2
 */