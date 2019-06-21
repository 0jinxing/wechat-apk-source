package com.tencent.mm.plugin.wallet_payu.bind.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class NetScenePayUElementQuery extends a
{
  public String tSD;
  public NetScenePayUElementQuery.PayUBankcardElement tSF;

  public NetScenePayUElementQuery(String paramString)
  {
    AppMethodBeat.i(48335);
    this.tSD = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("card_number", paramString);
    M(localHashMap);
    AppMethodBeat.o(48335);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48336);
    this.tSF = new NetScenePayUElementQuery.PayUBankcardElement();
    this.tSF.tSG = paramJSONObject.optString("bin");
    this.tSF.pcj = paramJSONObject.optString("bank_name");
    this.tSF.tSH = paramJSONObject.optString("issuer_type");
    this.tSF.cardType = paramJSONObject.optString("card_type");
    this.tSF.cEW = paramJSONObject.optString("payu_reference");
    AppMethodBeat.o(48336);
  }

  public final int cOX()
  {
    return 22;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery
 * JD-Core Version:    0.6.2
 */