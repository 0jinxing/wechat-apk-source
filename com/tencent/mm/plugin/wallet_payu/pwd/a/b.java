package com.tencent.mm.plugin.wallet_payu.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a
{
  public b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(48503);
    HashMap localHashMap = new HashMap();
    localHashMap.put("old_pin", paramString1);
    localHashMap.put("new_pin", String.valueOf(paramString2));
    M(localHashMap);
    AppMethodBeat.o(48503);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int cOX()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pwd.a.b
 * JD-Core Version:    0.6.2
 */