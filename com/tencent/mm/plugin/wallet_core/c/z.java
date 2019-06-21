package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class z extends m
{
  public Orders tux;

  public z(String paramString)
  {
    AppMethodBeat.i(46549);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString);
    M(localHashMap);
    AppMethodBeat.o(46549);
  }

  public z(String paramString, int paramInt)
  {
    AppMethodBeat.i(46550);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString);
    localHashMap.put("pay_type", String.valueOf(paramInt));
    M(localHashMap);
    AppMethodBeat.o(46550);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46551);
    if (paramJSONObject != null);
    while (true)
    {
      try
      {
        paramString = new com/tencent/mm/plugin/wallet_core/model/Orders;
        paramString.<init>();
        this.tux = paramString;
        paramString = new com/tencent/mm/plugin/wallet_core/model/Orders$Commodity;
        paramString.<init>();
        paramString.pbX = paramJSONObject.getString("buy_uin");
        paramString.pbY = paramJSONObject.getString("buy_name");
        paramString.pbZ = paramJSONObject.optString("sale_uin");
        paramString.pca = paramJSONObject.optString("sale_name");
        paramString.cAa = paramJSONObject.getString("trans_id");
        paramString.desc = paramJSONObject.optString("goods_name");
        paramString.kCJ = (paramJSONObject.optDouble("pay_num") / 100.0D);
        paramString.pce = paramJSONObject.getString("trade_state");
        paramString.pcf = paramJSONObject.getString("trade_state_name");
        paramString.pcj = paramJSONObject.getString("buy_bank_name");
        paramString.pcq = paramJSONObject.optString("discount", "");
        paramString.pch = paramJSONObject.optInt("modify_timestamp");
        paramString.pcl = paramJSONObject.optString("fee_type");
        paramString.pcm = paramJSONObject.optString("appusername");
        paramString.pbP = paramJSONObject.optString("app_telephone");
        paramString.tAR = (paramJSONObject.optDouble("original_total_fee", -1.0D) / 100.0D);
        paramString.pcl = paramJSONObject.optString("fee_type", "");
        paramInt = 1;
        Object localObject1 = paramJSONObject.optJSONObject("subscribe_biz_info");
        if (localObject1 != null)
        {
          localObject2 = new com/tencent/mm/plugin/wallet_core/model/Orders$Promotions;
          ((Orders.Promotions)localObject2).<init>();
          ((Orders.Promotions)localObject2).type = Orders.tAP;
          ((Orders.Promotions)localObject2).name = ((JSONObject)localObject1).optString("nickname");
          ((Orders.Promotions)localObject2).pcm = ((JSONObject)localObject1).optString("username");
          paramString.tAS = ((Orders.Promotions)localObject2).pcm;
          ((Orders.Promotions)localObject2).pia = ((JSONObject)localObject1).optString("logo_round_url");
          ((Orders.Promotions)localObject2).url = ((JSONObject)localObject1).optString("subscribe_biz_url");
          i = ((JSONObject)localObject1).optInt("recommend_level");
          paramString.tAh = i;
          paramInt = i;
          if (!bo.isNullOrNil(((Orders.Promotions)localObject2).name))
          {
            paramString.tBa.add(localObject2);
            paramInt = i;
          }
        }
        Object localObject3 = paramJSONObject.getJSONArray("activity_info");
        int j = ((JSONArray)localObject3).length();
        int i = 0;
        if (i < j)
        {
          localObject2 = ((JSONArray)localObject3).getJSONObject(i);
          localObject1 = new com/tencent/mm/plugin/wallet_core/model/Orders$Promotions;
          ((Orders.Promotions)localObject1).<init>();
          ((Orders.Promotions)localObject1).type = Orders.tAQ;
          ((Orders.Promotions)localObject1).pia = ((JSONObject)localObject2).optString("icon");
          ((Orders.Promotions)localObject1).name = ((JSONObject)localObject2).optString("wording");
          ((Orders.Promotions)localObject1).url = ((JSONObject)localObject2).optString("url");
          ((Orders.Promotions)localObject1).tzS = ((JSONObject)localObject2).optString("btn_text");
          ((Orders.Promotions)localObject1).tBn = ((JSONObject)localObject2).optInt("type");
          ((Orders.Promotions)localObject1).title = ((JSONObject)localObject2).optString("title");
          ((Orders.Promotions)localObject1).ttW = ((JSONObject)localObject2).optLong("activity_id");
          ((Orders.Promotions)localObject1).tBo = ((JSONObject)localObject2).optInt("activity_type", 0);
          ((Orders.Promotions)localObject1).tBp = ((JSONObject)localObject2).optInt("award_id");
          ((Orders.Promotions)localObject1).tzP = ((JSONObject)localObject2).optInt("send_record_id");
          ((Orders.Promotions)localObject1).tzQ = ((JSONObject)localObject2).optInt("user_record_id");
          ((Orders.Promotions)localObject1).tBr = ((JSONObject)localObject2).optString("activity_tinyapp_username");
          ((Orders.Promotions)localObject1).tBs = ((JSONObject)localObject2).optString("activity_tinyapp_path");
          ((Orders.Promotions)localObject1).tzR = ((JSONObject)localObject2).optLong("activity_mch_id");
          ((Orders.Promotions)localObject1).tBt = ((JSONObject)localObject2).optInt("activity_tinyapp_version");
          ((Orders.Promotions)localObject1).tBu = ((JSONObject)localObject2).optString("get_award_params");
          ((Orders.Promotions)localObject1).tBv = ((JSONObject)localObject2).optString("query_award_status_params");
          Orders.a((Orders.Promotions)localObject1, ((JSONObject)localObject2).optJSONObject("exposure_info"));
          paramString.tBa.add(localObject1);
          i++;
          continue;
        }
        localObject1 = paramJSONObject.optJSONArray("discount_array");
        if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
        {
          j = ((JSONArray)localObject1).length();
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          paramString.tAU = ((List)localObject2);
          i = 0;
          if (i < j)
          {
            localObject2 = ((JSONArray)localObject1).optJSONObject(i);
            localObject3 = new com/tencent/mm/plugin/wallet_core/model/Orders$DiscountInfo;
            ((Orders.DiscountInfo)localObject3).<init>();
            ((Orders.DiscountInfo)localObject3).tBm = ((JSONObject)localObject2).optDouble("payment_amount");
            ((Orders.DiscountInfo)localObject3).pOz = ((JSONObject)localObject2).optString("favor_desc");
            paramString.tAU.add(localObject3);
            i++;
            continue;
          }
        }
        paramString.tAV = paramJSONObject.optString("rateinfo");
        paramString.tAW = paramJSONObject.optString("discount_rateinfo");
        paramString.tAX = paramJSONObject.optString("original_feeinfo");
        Object localObject2 = this.tux;
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        ((Orders)localObject2).tAq = ((List)localObject1);
        this.tux.tAq.add(paramString);
        this.tux.tAj = paramJSONObject.optString("trade_state_name");
        this.tux.tAh = paramInt;
        AppMethodBeat.o(46551);
        return;
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", paramString, "", new Object[0]);
        AppMethodBeat.o(46551);
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", paramString, "", new Object[0]);
      }
      AppMethodBeat.o(46551);
    }
  }

  public final int bgI()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.z
 * JD-Core Version:    0.6.2
 */