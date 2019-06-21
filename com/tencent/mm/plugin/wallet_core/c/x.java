package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class x extends m
{
  public JSONObject hwh;
  public String tuv;

  public x(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, String paramString6, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(46545);
    this.tuv = "";
    this.tuv = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("activity_id", paramString1);
    localHashMap.put("award_id", paramString2);
    localHashMap.put("send_record_id", paramString3);
    localHashMap.put("user_record_id", paramString4);
    localHashMap.put("activity_mch_id", String.valueOf(paramLong1));
    localHashMap.put("activity_type", String.valueOf(paramLong2));
    localHashMap.put("bank_type", String.valueOf(paramString5));
    localHashMap.put("bank_serial", String.valueOf(paramString6));
    localHashMap.put("bindbankscene", String.valueOf(paramInt1));
    localHashMap.put("realname_scene", String.valueOf(paramInt2));
    M(localHashMap);
    AppMethodBeat.o(46545);
  }

  public final int ZU()
  {
    return 1773;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46546);
    ab.i("MicroMsg.NetSceneTenpayQueryBindPayaward", "errcode %s errmsg %s json %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    this.hwh = paramJSONObject;
    AppMethodBeat.o(46546);
  }

  public final boolean bXm()
  {
    return false;
  }

  public final int bgI()
  {
    return 1773;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/querybindcardaward";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.x
 * JD-Core Version:    0.6.2
 */