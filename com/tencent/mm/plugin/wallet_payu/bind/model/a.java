package com.tencent.mm.plugin.wallet_payu.bind.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.tencent.mm.wallet_core.e.a.a
{
  public String cQY;
  public String description;
  public String pin;
  public String tDI;
  public String tSC;
  public String tSD;
  public String tSE;
  public String tSs;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    AppMethodBeat.i(48333);
    this.tSC = paramString1;
    this.tDI = paramString2;
    this.cQY = paramString3;
    this.tSD = paramString4;
    this.tSE = paramString5;
    this.description = paramString6;
    this.tSs = paramString7;
    this.pin = paramString8;
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("information", paramString2);
    localHashMap.put("name_on_card", paramString3);
    localHashMap.put("card_number", paramString4);
    localHashMap.put("card_expiry", paramString5);
    localHashMap.put("description", paramString6);
    localHashMap.put("cvv", paramString7);
    localHashMap.put("pin", paramString8);
    M(localHashMap);
    AppMethodBeat.o(48333);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int cOX()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.model.a
 * JD-Core Version:    0.6.2
 */