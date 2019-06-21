package com.tencent.mm.plugin.wallet_payu.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d extends a
{
  public String cEW;
  public String tUr;
  public String tUs;

  public d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(48506);
    this.tUr = paramString1;
    this.tUs = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("payu_reference", paramString1);
    localHashMap.put("new_pin", paramString2);
    M(localHashMap);
    AppMethodBeat.o(48506);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48507);
    this.cEW = paramJSONObject.optString("payu_reference");
    AppMethodBeat.o(48507);
  }

  public final int cOX()
  {
    return 19;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pwd.a.d
 * JD-Core Version:    0.6.2
 */