package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a
{
  public b(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(48527);
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString1);
    localHashMap.put("total_fee", String.valueOf(paramInt));
    localHashMap.put("fee_type", paramString2);
    localHashMap.put("to_customer_name", paramString3);
    M(localHashMap);
    AppMethodBeat.o(48527);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48528);
    ab.d("MicroMsg", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(48528);
    while (true)
    {
      return;
      AppMethodBeat.o(48528);
    }
  }

  public final int cOX()
  {
    return 16;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.a.b
 * JD-Core Version:    0.6.2
 */