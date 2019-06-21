package com.tencent.mm.plugin.wallet_payu.create.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a
{
  public String cEW;
  public String cMQ;
  public String pin;
  public String tTb;

  public b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(48371);
    this.tTb = paramString1;
    this.cMQ = paramString2;
    this.pin = paramString3;
    this.cEW = paramString4;
    HashMap localHashMap = new HashMap();
    localHashMap.put("dial_code", paramString1);
    localHashMap.put("number", paramString2);
    localHashMap.put("pin", paramString3);
    localHashMap.put("payu_reference", paramString4);
    M(localHashMap);
    AppMethodBeat.o(48371);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int cOX()
  {
    return 17;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.a.b
 * JD-Core Version:    0.6.2
 */