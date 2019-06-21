package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class r extends m
{
  private int scene;
  public String token;
  public String tuh;

  public r(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(46532);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("req_key", paramString2);
    if (paramInt == 6)
      localHashMap.put("time_stamp", System.currentTimeMillis());
    M(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("check_pwd_scene", String.valueOf(paramInt));
    if (x.dNS())
    {
      paramString1.put("uuid_for_bindcard", x.dNU());
      paramString1.put("bindcard_scene", x.dNT());
    }
    ba(paramString1);
    this.scene = paramInt;
    AppMethodBeat.o(46532);
  }

  public final int ZU()
  {
    return 476;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46533);
    ab.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if ((this.scene == 6) || (this.scene == 8) || (this.scene == 18))
    {
      this.token = paramJSONObject.optString("usertoken");
      this.tuh = paramJSONObject.optString("token_type");
    }
    AppMethodBeat.o(46533);
  }

  public final int bgI()
  {
    return 18;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/checkpwd";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.r
 * JD-Core Version:    0.6.2
 */