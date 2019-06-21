package com.tencent.mm.plugin.wallet_payu.bind.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a
{
  public String cEW;
  public String tSI;

  public b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(48337);
    this.tSI = paramString1;
    this.cEW = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("bind_serial", paramString1);
    localHashMap.put("payu_reference", String.valueOf(paramString2));
    M(localHashMap);
    AppMethodBeat.o(48337);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int cOX()
  {
    return 6;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.model.b
 * JD-Core Version:    0.6.2
 */