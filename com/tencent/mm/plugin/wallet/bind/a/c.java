package com.tencent.mm.plugin.wallet.bind.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends m
{
  public boolean cQT;
  public ArrayList<Bankcard> tgB;
  public boolean tlh;
  public String tli;
  public String tlj;
  private String tlk;
  public String token;

  public c(String paramString, PayInfo paramPayInfo)
  {
    AppMethodBeat.i(45728);
    this.tlh = true;
    this.tgB = null;
    this.cQT = false;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(paramPayInfo, localHashMap1, localHashMap2);
    g.RQ();
    paramPayInfo = new p(bo.a((Integer)g.RP().Ry().get(9, null), 0));
    this.tlk = paramString;
    localHashMap1.put("import_code", paramString);
    localHashMap1.put("qqid", paramPayInfo.toString());
    M(localHashMap1);
    ba(localHashMap2);
    AppMethodBeat.o(45728);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45729);
    if (paramInt != 0)
      AppMethodBeat.o(45729);
    while (true)
    {
      return;
      this.tgB = new ArrayList();
      while (true)
      {
        try
        {
          this.cQT = "1".equals(paramJSONObject.optString("is_reg", "0"));
          this.token = paramJSONObject.optString("token", "");
          paramJSONObject = paramJSONObject.getJSONArray("Array");
          int i = paramJSONObject.length();
          paramInt = 0;
          if (paramInt >= i)
            break label445;
          JSONObject localJSONObject = paramJSONObject.getJSONObject(paramInt);
          paramString = d.cPh().ar(localJSONObject);
          if (paramString != null)
          {
            if (2 == localJSONObject.optInt("bank_acc_type", 2))
            {
              j = 1;
              if (j != 0)
                paramString.field_cardType |= Bankcard.twG;
              paramString.field_bankcardTail = localJSONObject.optString("bank_tail");
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("************");
              paramString.twO = paramString.field_bankcardTail;
              paramString.field_trueName = localJSONObject.optString("true_name");
              paramString.twN = localJSONObject.optString("cre_id");
              paramString.twf = localJSONObject.optInt("cre_type", -1);
              paramString.txa = this.tlk;
              if (1 != localJSONObject.optInt("samecardexist", 0))
                continue;
              bool = true;
              paramString.txb = bool;
              if (!paramString.cPc())
                continue;
              paramString.field_desc = paramString.field_bankName;
              localJSONObject = localJSONObject.optJSONObject("bankappservice");
              if (localJSONObject != null)
              {
                this.tli = localJSONObject.optString("username");
                this.tlj = localJSONObject.optString("app_recommend_desc");
              }
              this.tgB.add(paramString);
            }
          }
          else
          {
            paramInt++;
            continue;
          }
          int j = 0;
          continue;
          boolean bool = false;
          continue;
          if (!paramString.cPe())
            break label370;
          paramString.field_desc = ah.getContext().getString(2131304761, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
          continue;
        }
        catch (JSONException paramString)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneTenpayQueryBindBankcard", paramString, "", new Object[0]);
          AppMethodBeat.o(45729);
        }
        break;
        label370: if (paramString.cPb())
          paramString.field_desc = ah.getContext().getString(2131305484, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
        else
          paramString.field_desc = ah.getContext().getString(2131304781, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
      }
      label445: paramString = new java/lang/StringBuilder;
      paramString.<init>("got data---isReg:");
      ab.d("MicroMsg.NetSceneTenpayQueryBindBankcard", this.cQT + ",bankcard.size:" + this.tgB.size());
      AppMethodBeat.o(45729);
    }
  }

  public final int bgI()
  {
    return 37;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.a.c
 * JD-Core Version:    0.6.2
 */