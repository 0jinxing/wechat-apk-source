package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends a
{
  public String cEW;
  public String id;
  public String tUL;

  public c()
  {
    this("");
  }

  public c(String paramString)
  {
    AppMethodBeat.i(48570);
    this.cEW = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("payu_reference", bo.bc(paramString, ""));
    M(localHashMap);
    AppMethodBeat.o(48570);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48571);
    this.id = paramJSONObject.optString("id");
    this.tUL = paramJSONObject.optString("description");
    AppMethodBeat.o(48571);
  }

  public final int cOX()
  {
    return 23;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.model.c
 * JD-Core Version:    0.6.2
 */