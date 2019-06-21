package com.tencent.mm.plugin.wallet_core.c.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.aj;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends com.tencent.mm.wallet_core.e.a.a
{
  private boolean tuJ;

  public a()
  {
    this("");
  }

  public a(String paramString)
  {
    this(paramString, true);
  }

  public a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(46569);
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString);
    M(localHashMap);
    this.tuJ = paramBoolean;
    AppMethodBeat.o(46569);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46570);
    int i = super.a(parame, paramf);
    AppMethodBeat.o(46570);
    return i;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46571);
    ab.i("MicroMsg.NetScenePayUQueryBoundBankcard", "hy: payu query bind on gy net end. errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt != 0)
    {
      AppMethodBeat.o(46571);
      return;
    }
    Object localObject1;
    while (true)
    {
      try
      {
        long l = paramJSONObject.optLong("time_stamp");
        if (l > 0L)
        {
          w.setTimeStamp(String.valueOf(l));
          localObject1 = paramJSONObject.getJSONObject("user_info");
          paramString = new com/tencent/mm/plugin/wallet_core/model/aj;
          paramString.<init>();
          if ((localObject1 == null) || (((JSONObject)localObject1).length() <= 0))
            break label325;
          paramString.field_is_reg = bo.getInt(((JSONObject)localObject1).optString("is_reg"), 0);
          paramString.field_true_name = ((JSONObject)localObject1).optString("true_name");
          paramString.field_main_card_bind_serialno = ((JSONObject)localObject1).optString("main_card_bind_serialno");
          paramString.field_ftf_pay_url = ((JSONObject)localObject1).optString("transfer_url");
          r.cPI();
          ak.acD(paramString.field_main_card_bind_serialno);
          paramString.field_switchConfig = paramJSONObject.getJSONObject("switch_info").getInt("switch_bit");
          localObject2 = paramJSONObject.optJSONArray("Array");
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          if ((localObject2 == null) || (((JSONArray)localObject2).length() <= 0))
            break label330;
          int i = ((JSONArray)localObject2).length();
          paramInt = 0;
          if (paramInt >= i)
            break label330;
          Object localObject3 = ((JSONArray)localObject2).getJSONObject(paramInt);
          ((JSONObject)localObject3).put("extra_bind_flag", "NORMAL");
          localObject3 = com.tencent.mm.plugin.wallet_core.model.a.a.cQY().ar((JSONObject)localObject3);
          if (localObject3 != null)
            ((ArrayList)localObject1).add(localObject3);
          paramInt++;
          continue;
        }
        ab.w("MicroMsg.NetScenePayUQueryBoundBankcard", "no time_stamp in bindquerynew.");
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.NetScenePayUQueryBoundBankcard", paramString, "", new Object[0]);
      }
      if ((this.tuJ) && (!r.cPI().cQg()))
      {
        this.ehi.onSceneEnd(1000, -100869, "", this);
        this.AfK = true;
      }
      AppMethodBeat.o(46571);
      break;
      label325: paramString = null;
    }
    label330: Object localObject2 = paramJSONObject.optJSONObject("balance_info");
    if ((localObject2 != null) && (((JSONObject)localObject2).length() > 0))
    {
      paramJSONObject = new com/tencent/mm/plugin/wallet_core/model/Bankcard;
      paramJSONObject.<init>((byte)0);
      paramJSONObject.twS = (((JSONObject)localObject2).optInt("avail_balance") / 100.0D);
      paramJSONObject.twU = (((JSONObject)localObject2).optInt("fetch_balance") / 100.0D);
      paramJSONObject.field_bankcardType = ((JSONObject)localObject2).optString("balance_bank_type");
      paramJSONObject.field_bindSerial = ((JSONObject)localObject2).optString("balance_bind_serial");
      paramJSONObject.field_forbidWord = ((JSONObject)localObject2).optString("balance_forbid_word");
      paramJSONObject.field_desc = ah.getContext().getString(2131304827);
      paramJSONObject.field_cardType |= Bankcard.twI;
    }
    while (true)
    {
      r.cPI().a(paramString, (ArrayList)localObject1, null, paramJSONObject, null, null, null, null, 0, 0, null);
      break;
      paramJSONObject = null;
    }
  }

  public final int cOX()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.b.a
 * JD-Core Version:    0.6.2
 */