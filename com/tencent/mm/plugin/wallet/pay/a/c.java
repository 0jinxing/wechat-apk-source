package com.tencent.mm.plugin.wallet.pay.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.d;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends m
{
  public String desc;
  public double pPz;
  public String pcl;

  public c(String paramString)
  {
    AppMethodBeat.i(45919);
    HashMap localHashMap = new HashMap();
    localHashMap.put("token", paramString);
    M(localHashMap);
    AppMethodBeat.o(45919);
  }

  public final int ZU()
  {
    return 1603;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45920);
    com.tencent.mm.plugin.wallet_core.model.ah localah;
    if (paramInt == 0)
    {
      this.pcl = paramJSONObject.optString("fee_type");
      this.pPz = (paramJSONObject.optDouble("total_fee") / 100.0D);
      paramString = paramJSONObject.optJSONArray("Array");
      if ((paramString != null) && (paramString.length() > 0))
        this.desc = ((JSONObject)paramString.opt(0)).optString("desc");
      localah = r.cPJ();
      paramJSONObject = paramJSONObject.optJSONObject("bindqueryresp");
      localah.tCN.clear();
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.WalletRepaymentBankcardMgr", "parse from json error,json is null");
        AppMethodBeat.o(45920);
      }
    }
    while (true)
    {
      return;
      JSONArray localJSONArray = paramJSONObject.optJSONArray("Array");
      if ((localJSONArray == null) || (localJSONArray.length() <= 0))
      {
        ab.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list is null");
        paramString = paramJSONObject.optJSONObject("user_info");
        if (paramString != null)
        {
          localah.tCO = paramString.optString("last_card_bind_serialno");
          AppMethodBeat.o(45920);
        }
      }
      else
      {
        paramInt = 0;
        while (paramInt < localJSONArray.length())
        {
          d locald = d.cPh();
          try
          {
            paramString = (JSONObject)localJSONArray.get(paramInt);
            if (paramString != null)
            {
              paramString = locald.ar(paramString);
              if (paramString.cPc())
              {
                paramString.field_desc = paramString.field_bankName;
                localah.tCN.add(paramString);
              }
            }
            else
            {
              paramInt++;
            }
          }
          catch (JSONException paramString)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.WalletRepaymentBankcardMgr", paramString, "", new Object[0]);
              paramString = null;
              continue;
              if (paramString.cPe())
                paramString.field_desc = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131304761, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
              else if (paramString.cPb())
                paramString.field_desc = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131305484, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
              else
                paramString.field_desc = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131304781, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
            }
          }
        }
        ab.e("MicroMsg.WalletRepaymentBankcardMgr", "user_info is null");
        AppMethodBeat.o(45920);
      }
    }
  }

  public final int bgI()
  {
    return 123;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/webankloanordershow";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.c
 * JD-Core Version:    0.6.2
 */