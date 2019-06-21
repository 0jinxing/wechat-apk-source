package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m extends com.tencent.mm.wallet_core.tenpay.model.m
{
  public String ehr;
  public String tud;
  public String tue;
  public BindCardOrder tuf;

  public m(BindCardOrder paramBindCardOrder, String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, String paramString6, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(46523);
    this.tuf = paramBindCardOrder;
    paramBindCardOrder = new HashMap();
    paramBindCardOrder.put("activity_id", paramString1);
    paramBindCardOrder.put("award_id", paramString2);
    paramBindCardOrder.put("send_record_id", paramString3);
    paramBindCardOrder.put("user_record_id", paramString4);
    paramBindCardOrder.put("activity_mch_id", String.valueOf(paramLong1));
    paramBindCardOrder.put("activity_type", String.valueOf(paramLong2));
    paramBindCardOrder.put("bank_type", String.valueOf(paramString5));
    paramBindCardOrder.put("bank_serial", String.valueOf(paramString6));
    paramBindCardOrder.put("bindbankscene", String.valueOf(paramInt1));
    paramBindCardOrder.put("realname_scene", String.valueOf(paramInt2));
    M(paramBindCardOrder);
    AppMethodBeat.o(46523);
  }

  public final int ZU()
  {
    return 1786;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46524);
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.tud = paramJSONObject.optString("result_code");
      this.ehr = paramJSONObject.optString("result_msg");
      this.tue = paramJSONObject.optString("alert_wording");
    }
    AppMethodBeat.o(46524);
  }

  public final int bgI()
  {
    return 1786;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/sendbindcardaward";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.m
 * JD-Core Version:    0.6.2
 */