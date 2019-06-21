package com.tencent.mm.plugin.wallet_core.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.d;
import org.json.JSONObject;

public final class a extends d
{
  private static a tDG = null;

  public static a cQY()
  {
    AppMethodBeat.i(47043);
    if (tDG == null)
      tDG = new a();
    a locala = tDG;
    AppMethodBeat.o(47043);
    return locala;
  }

  public final Bankcard ar(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(47044);
    Bankcard localBankcard = super.ar(paramJSONObject);
    localBankcard.field_ext_msg = b.aJ(paramJSONObject);
    localBankcard.field_bankcardClientType = 1;
    localBankcard.field_desc = paramJSONObject.optString("description");
    localBankcard.field_trueName = paramJSONObject.optString("name_on_card");
    if ("CREDITCARD_PAYU".equals(paramJSONObject.optString("bank_type")));
    for (localBankcard.field_cardType |= Bankcard.twG; ; localBankcard.field_cardType |= Bankcard.twI)
    {
      AppMethodBeat.o(47044);
      return localBankcard;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.a.a
 * JD-Core Version:    0.6.2
 */