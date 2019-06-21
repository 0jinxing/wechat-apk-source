package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class aa extends m
{
  public JSONObject hwh;
  public String tuv;

  public aa(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong)
  {
    AppMethodBeat.i(46552);
    this.tuv = "";
    this.tuv = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("activity_id", paramString1);
    localHashMap.put("award_id", paramString2);
    localHashMap.put("send_record_id", paramString3);
    localHashMap.put("user_record_id", paramString4);
    localHashMap.put("req_key", paramString5);
    localHashMap.put("transaction_id", paramString6);
    localHashMap.put("activity_mch_id", String.valueOf(paramLong));
    M(localHashMap);
    AppMethodBeat.o(46552);
  }

  public final int ZU()
  {
    return 1979;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46553);
    ab.i("MicroMsg.NetSceneTenpayQueryPayaward", "errcode %s errmsg %s json %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    this.hwh = paramJSONObject;
    AppMethodBeat.o(46553);
  }

  public final boolean bXm()
  {
    return false;
  }

  public final int bgI()
  {
    return 1979;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/querypayaward";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.aa
 * JD-Core Version:    0.6.2
 */