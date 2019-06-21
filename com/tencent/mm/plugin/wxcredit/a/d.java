package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends m
{
  public k uYw;

  public d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(48659);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bind_serialno", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("query_method", "1");
    M(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("banktype", paramString2);
    ba(paramString1);
    AppMethodBeat.o(48659);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    boolean bool = true;
    AppMethodBeat.i(48660);
    ab.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(48660);
    while (true)
    {
      return;
      Object localObject;
      while (true)
      {
        String str;
        try
        {
          paramString = new com/tencent/mm/plugin/wxcredit/a/k;
          paramString.<init>();
          this.uYw = paramString;
          this.uYw.uYA = paramJSONObject.optInt("credit_state");
          this.uYw.uYv = (paramJSONObject.optInt("credit_amount") / 100.0D);
          this.uYw.uYB = (paramJSONObject.optInt("credit_usable") / 100.0D);
          this.uYw.uYC = (paramJSONObject.optInt("bill_amount") / 100.0D);
          this.uYw.uYD = paramJSONObject.optInt("bill_date");
          this.uYw.uYE = (paramJSONObject.optInt("repay_amount") / 100.0D);
          this.uYw.uYF = (paramJSONObject.optInt("repay_minimum") / 100.0D);
          paramString = this.uYw;
          if (paramJSONObject.optInt("upgrade_amount") == 1)
          {
            paramString.uYG = bool;
            this.uYw.uYH = paramJSONObject.optInt("bill_month");
            this.uYw.uYI = paramJSONObject.optString("repay_url");
            this.uYw.uYJ = paramJSONObject.optString("repay_lasttime");
            this.uYw.uYM = paramJSONObject.optString("lasttime");
            localObject = paramJSONObject.getJSONArray("jump_url_array");
            if ((localObject == null) || (((JSONArray)localObject).length() <= 0))
              break label435;
            int i = ((JSONArray)localObject).length();
            paramInt = 0;
            if (paramInt >= i)
              break label435;
            paramString = ((JSONArray)localObject).getJSONObject(paramInt);
            str = paramString.getString("jump_name");
            if ("account_rights_url".equals(str))
            {
              this.uYw.uYL = paramString.getString("jump_url");
              paramInt++;
              continue;
            }
          }
          else
          {
            bool = false;
            continue;
          }
          if (!"bill_url".equals(str))
            break label383;
          this.uYw.pPO = paramString.getString("jump_url");
          continue;
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
          AppMethodBeat.o(48660);
        }
        break;
        label383: if ("card_detail_url".equals(str))
          this.uYw.uYK = paramString.getString("jump_url");
        else if ("know_more_url".equals(str))
          this.uYw.uYN = paramString.getString("jump_url");
      }
      label435: paramJSONObject = paramJSONObject.getJSONObject("appservice");
      if (paramJSONObject != null)
      {
        localObject = this.uYw;
        paramString = new com/tencent/mm/plugin/wxcredit/a/j;
        paramString.<init>();
        ((k)localObject).uYO = paramString;
        this.uYw.uYO.uYz = paramJSONObject.getString("app_telephone");
        this.uYw.uYO.nickname = paramJSONObject.getString("nickname");
        this.uYw.uYO.username = paramJSONObject.getString("username");
        this.uYw.uYO.url = paramJSONObject.getString("jump_url");
      }
      AppMethodBeat.o(48660);
    }
  }

  public final int bgI()
  {
    return 57;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.a.d
 * JD-Core Version:    0.6.2
 */