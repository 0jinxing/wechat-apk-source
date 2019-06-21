package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i extends m
{
  public String cFl;
  public String oYi;
  private String oYj;
  private boolean oYk;

  public i(Bankcard paramBankcard, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(43397);
    this.oYi = "0";
    this.oYj = "0";
    this.cFl = "";
    this.oYk = false;
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("oper", paramString2);
    if (paramString2.equals("changeto"))
    {
      if (!TextUtils.isEmpty(paramString3))
        break label169;
      localHashMap.put("verify_code", "");
    }
    while (true)
    {
      localHashMap.put("chg_fee", String.valueOf(paramInt));
      localHashMap.put("bind_serialno", paramBankcard.field_bindSerial);
      localHashMap.put("bank_type", paramBankcard.field_bankcardType);
      localHashMap.put("card_tail", paramBankcard.field_bankcardTail);
      this.cFl = paramBankcard.field_mobile;
      M(localHashMap);
      AppMethodBeat.o(43397);
      return;
      label169: localHashMap.put("verify_code", paramString3);
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43398);
    if (paramJSONObject != null)
    {
      this.oYi = paramJSONObject.optString("verify_flag");
      this.oYj = paramJSONObject.optString("limit_fee");
    }
    AppMethodBeat.o(43398);
  }

  public final int bgI()
  {
    return 50;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.i
 * JD-Core Version:    0.6.2
 */