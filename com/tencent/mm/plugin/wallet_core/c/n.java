package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n extends m
{
  public String ehr;
  public String tud;
  public String tue;
  public Orders.Promotions tug;

  public n(Orders.Promotions paramPromotions, String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(46525);
    this.tug = paramPromotions;
    HashMap localHashMap = new HashMap();
    localHashMap.put("activity_id", paramPromotions.ttW);
    localHashMap.put("award_id", paramPromotions.tBp);
    localHashMap.put("send_record_id", paramPromotions.tzP);
    localHashMap.put("user_record_id", paramPromotions.tzQ);
    localHashMap.put("req_key", paramString1);
    localHashMap.put("transaction_id", paramString2);
    localHashMap.put("activity_mch_id", String.valueOf(paramLong));
    M(localHashMap);
    AppMethodBeat.o(46525);
  }

  public final int ZU()
  {
    return 1589;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46526);
    ab.i("MicroMsg.NetSenceTenPayBase", "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.tud = paramJSONObject.optString("result_code");
      this.ehr = paramJSONObject.optString("result_msg");
      this.tue = paramJSONObject.optString("alert_wording");
    }
    AppMethodBeat.o(46526);
  }

  public final int bgI()
  {
    return 1589;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/sendpayaward";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.n
 * JD-Core Version:    0.6.2
 */