package com.tencent.mm.plugin.wallet_core.c.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.Log;

public final class a extends m
{
  private int tuK;
  public Orders tuL;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, String paramString6, String paramString7)
  {
    AppMethodBeat.i(46572);
    this.tuK = paramInt;
    HashMap localHashMap = new HashMap();
    if (bo.isNullOrNil(paramString1))
    {
      localHashMap.put("appId", paramString1);
      if (!bo.isNullOrNil(paramString2))
        break label196;
      label49: localHashMap.put("timeStamp", paramString2);
      if (!bo.isNullOrNil(paramString3))
        break label204;
      label67: localHashMap.put("nonceStr", paramString3);
      if (!bo.isNullOrNil(paramString4))
        break label212;
      label86: localHashMap.put("package", paramString4);
      if (!bo.isNullOrNil(paramString5))
        break label222;
      label106: localHashMap.put("reqKey", paramString5);
      localHashMap.put("payScene", q.encode(String.valueOf(paramInt)));
      if (!bo.isNullOrNil(paramString6))
        break label232;
      label144: localHashMap.put("signType", paramString6);
      if (!bo.isNullOrNil(paramString7))
        break label242;
    }
    while (true)
    {
      localHashMap.put("paySign", paramString7);
      M(localHashMap);
      AppMethodBeat.o(46572);
      return;
      paramString1 = q.encode(paramString1);
      break;
      label196: paramString2 = q.encode(paramString2);
      break label49;
      label204: paramString3 = q.encode(paramString3);
      break label67;
      label212: paramString4 = q.encode(paramString4);
      break label86;
      label222: paramString5 = q.encode(paramString5);
      break label106;
      label232: paramString6 = q.encode(paramString6);
      break label144;
      label242: paramString7 = q.encode(paramString7);
    }
  }

  private Orders ap(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46574);
    if (this.tuL == null)
      this.tuL = new Orders();
    try
    {
      JSONArray localJSONArray = paramJSONObject.getJSONArray("payresult");
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        paramJSONObject = localJSONArray.getJSONObject(i);
        Orders.Commodity localCommodity = new com/tencent/mm/plugin/wallet_core/model/Orders$Commodity;
        localCommodity.<init>();
        localCommodity.cAa = paramJSONObject.getString("transaction_id");
        localCommodity.pca = paramJSONObject.optString("sp_name");
        if (bo.isNullOrNil(this.tuL.pcl))
          this.tuL.pcl = paramJSONObject.optString("fee_type");
        this.tuL.tAq.add(localCommodity);
      }
    }
    catch (JSONException paramJSONObject)
    {
      paramJSONObject = this.tuL;
      AppMethodBeat.o(46574);
    }
    return paramJSONObject;
  }

  public final int ZU()
  {
    int i = 2570;
    if (this.tuK == 2)
      i = 2516;
    return i;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46573);
    Log.i("MicroMsg.NetSceneGetPaidOrderDetail", "errCode: " + paramInt + " errMsg: " + paramString);
    if ((paramJSONObject != null) && (dNO()))
    {
      this.tuL = ap(paramJSONObject);
      this.tuL = Orders.a(paramJSONObject, this.tuL);
    }
    AppMethodBeat.o(46573);
  }

  public final int bgI()
  {
    int i = 2570;
    if (this.tuK == 2)
      i = 2516;
    return i;
  }

  public final String getUri()
  {
    String str = "/cgi-bin/mmpay-bin/tenpay/getpaidorderdetail";
    if (this.tuK == 2)
      str = "/cgi-bin/mmpay-bin/tenpay/offlinegetpaidorderdetail";
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.c.a
 * JD-Core Version:    0.6.2
 */