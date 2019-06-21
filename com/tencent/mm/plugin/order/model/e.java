package com.tencent.mm.plugin.order.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends m
{
  public int kCd;
  private int nYh;
  public List<i> pcP;
  public List<d> pcQ;
  public String pcR;

  public e(int paramInt, String paramString)
  {
    AppMethodBeat.i(43773);
    this.pcP = null;
    this.pcQ = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("Limit", "10");
    localHashMap.put("Offset", String.valueOf(paramInt));
    localHashMap.put("Extbuf", paramString);
    M(localHashMap);
    AppMethodBeat.o(43773);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    int i = 0;
    AppMethodBeat.i(43774);
    ab.d("MicroMsg.NetScenePatchQueryUserRoll", "errCode " + paramInt + " errMsg: " + paramString);
    this.pcP = new LinkedList();
    try
    {
      this.kCd = paramJSONObject.getInt("TotalNum");
      this.nYh = paramJSONObject.getInt("RecNum");
      this.pcR = paramJSONObject.optString("Extbuf");
      Object localObject = paramJSONObject.getJSONArray("UserRollList");
      if (localObject != null)
        for (paramInt = 0; paramInt < ((JSONArray)localObject).length(); paramInt++)
        {
          i locali = new com/tencent/mm/plugin/order/model/i;
          locali.<init>();
          paramString = ((JSONArray)localObject).getJSONObject(paramInt);
          locali.pdc = paramString.optInt("PayType");
          locali.pcU = paramString.optString("Transid");
          locali.pcV = paramString.optDouble("TotalFee");
          locali.pcW = paramString.optString("GoodsName");
          locali.pcX = paramString.optInt("CreateTime");
          locali.pcZ = paramString.optInt("ModifyTime");
          locali.pda = paramString.optString("FeeType");
          locali.pdf = paramString.optString("AppThumbUrl");
          locali.pcY = paramString.optString("TradeStateName");
          locali.pdk = paramString.optString("StatusColor");
          locali.pdl = paramString.optString("FeeColor");
          locali.pdm = paramString.optDouble("ActualPayFee");
          locali.pdn = paramString.optString("BillId");
          this.pcP.add(locali);
        }
      paramString = new java/util/LinkedList;
      paramString.<init>();
      this.pcQ = paramString;
      paramString = paramJSONObject.optJSONArray("month_info");
      if (paramString != null)
        for (paramInt = i; paramInt < paramString.length(); paramInt++)
        {
          localObject = paramString.getJSONObject(paramInt);
          paramJSONObject = new com/tencent/mm/plugin/order/model/d;
          paramJSONObject.<init>();
          paramJSONObject.year = ((JSONObject)localObject).optInt("year");
          paramJSONObject.month = ((JSONObject)localObject).optInt("month");
          paramJSONObject.pcO = ((JSONObject)localObject).optString("feetext");
          this.pcQ.add(paramJSONObject);
        }
      AppMethodBeat.o(43774);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.NetScenePatchQueryUserRoll", "Parse Json exp:" + paramString.getLocalizedMessage());
        AppMethodBeat.o(43774);
      }
    }
  }

  public final int bgI()
  {
    return 105;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.e
 * JD-Core Version:    0.6.2
 */