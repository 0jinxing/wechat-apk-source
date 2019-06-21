package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a
{
  public String cEW;
  public String id;
  public boolean lSP;
  public String nYb;
  public String tUK;

  public b(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(48568);
    this.id = paramString2;
    this.nYb = paramString3;
    this.cEW = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", paramString2);
    localHashMap.put("answer", paramString3);
    localHashMap.put("payu_reference", paramString1);
    M(localHashMap);
    AppMethodBeat.o(48568);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48569);
    this.lSP = paramJSONObject.optBoolean("verified");
    this.tUK = paramJSONObject.optString("payu_reference");
    AppMethodBeat.o(48569);
  }

  public final int cOX()
  {
    return 18;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.model.b
 * JD-Core Version:    0.6.2
 */