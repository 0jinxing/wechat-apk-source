package com.tencent.mm.plugin.wallet.bind.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d extends m
{
  public d(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(45730);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("passwd", paramString3);
    if (paramBoolean)
      localHashMap.put("unbind_scene", "1");
    M(localHashMap);
    AppMethodBeat.o(45730);
  }

  public d(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(45731);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("expired_flag", "1");
    if (paramBoolean)
      localHashMap.put("unbind_scene", "1");
    M(localHashMap);
    AppMethodBeat.o(45731);
  }

  public final int ZU()
  {
    return 473;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int bgI()
  {
    return 14;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/unbind";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.a.d
 * JD-Core Version:    0.6.2
 */