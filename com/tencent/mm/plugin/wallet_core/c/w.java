package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class w extends m
{
  public String tuu;

  public w(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(46542);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("check_pwd_scene", String.valueOf(paramInt));
    localHashMap.put("package", URLEncoder.encode(paramString2));
    localHashMap.put("sign", paramString3);
    localHashMap.put("sign_type", paramString4);
    localHashMap.put("busi_id", paramString5);
    M(localHashMap);
    AppMethodBeat.o(46542);
  }

  public w(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, String paramString7)
  {
    AppMethodBeat.i(46543);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("check_pwd_scene", String.valueOf(paramInt1));
    localHashMap.put("package", URLEncoder.encode(paramString2));
    localHashMap.put("sign", paramString3);
    localHashMap.put("sign_type", paramString4);
    localHashMap.put("busi_id", paramString5);
    localHashMap.put("use_touch", String.valueOf(paramInt2));
    M(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("soter_req", paramString6);
    paramString1.put("fingerData", paramString7);
    ba(paramString1);
    AppMethodBeat.o(46543);
  }

  public final int ZU()
  {
    return 2704;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46544);
    this.tuu = paramJSONObject.optString("usertoken", "");
    AppMethodBeat.o(46544);
  }

  public final int bgI()
  {
    return 2704;
  }

  public final boolean cOW()
  {
    return true;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/getpaypwdtoken";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.w
 * JD-Core Version:    0.6.2
 */