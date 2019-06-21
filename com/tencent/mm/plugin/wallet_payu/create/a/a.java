package com.tencent.mm.plugin.wallet_payu.create.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.tencent.mm.wallet_core.e.a.a
{
  public String cEW;
  public String pin;
  public String tTb;
  public String tTc;
  public String tTd;
  public String tTe;
  public String tTf;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(48369);
    this.tTb = paramString1;
    this.tTc = paramString2;
    this.pin = paramString3;
    this.tTe = paramString4;
    this.tTd = paramString4;
    this.tTf = paramString6;
    HashMap localHashMap = new HashMap();
    localHashMap.put("dial_code", paramString1);
    localHashMap.put("number", String.valueOf(paramString2));
    localHashMap.put("pin", String.valueOf(paramString3));
    localHashMap.put("secret_question_id", String.valueOf(paramString4));
    localHashMap.put("secret_question_answer", String.valueOf(paramString5));
    localHashMap.put("payu_reference", paramString6);
    M(localHashMap);
    AppMethodBeat.o(48369);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48370);
    ab.d("MicroMsg.NetScenePayUCreateUser", "hy: get NetScenePayUCreateUser info. errCode: %d, errMsg:%s, json:%s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject.toString() });
    this.cEW = paramJSONObject.optString("payu_reference");
    AppMethodBeat.o(48370);
  }

  public final int cOX()
  {
    return 5;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.a.a
 * JD-Core Version:    0.6.2
 */