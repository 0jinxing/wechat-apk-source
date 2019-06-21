package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class s extends m
{
  public String tui;
  public int tuj;
  public String tuk;
  public String tul;

  public s(String paramString1, String paramString2)
  {
    AppMethodBeat.i(46534);
    HashMap localHashMap = new HashMap();
    localHashMap.put("token", paramString1);
    localHashMap.put("use_touch", "1");
    M(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("soter_req", paramString2);
    ba(paramString1);
    AppMethodBeat.o(46534);
  }

  public s(String paramString1, String paramString2, byte paramByte)
  {
    AppMethodBeat.i(46535);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("token", paramString2);
    M(localHashMap);
    ba(new HashMap());
    AppMethodBeat.o(46535);
  }

  public s(String paramString1, String paramString2, char paramChar)
  {
    AppMethodBeat.i(46536);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("token", paramString2);
    localHashMap.put("resend", "1");
    M(localHashMap);
    ba(new HashMap());
    AppMethodBeat.o(46536);
  }

  public final int ZU()
  {
    return 1515;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46537);
    ab.d("Micromsg.NetSceneTenpayCheckPwdByToken", "errCode " + paramInt + " errMsg: " + paramString);
    this.tui = paramJSONObject.optString("usertoken");
    this.tuj = paramJSONObject.optInt("is_free_sms");
    this.tuk = paramJSONObject.optString("mobile_no");
    this.tul = paramJSONObject.optString("relation_key");
    AppMethodBeat.o(46537);
  }

  public final int bgI()
  {
    return 100;
  }

  public final boolean cOT()
  {
    if (this.tuj == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/getusertoken";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.s
 * JD-Core Version:    0.6.2
 */