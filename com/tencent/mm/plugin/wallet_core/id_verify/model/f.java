package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f extends m
{
  public String tvH;
  public String tvI;
  public String tvJ;
  public String tvK;
  public String tvL;

  public f(String paramString)
  {
    AppMethodBeat.i(46648);
    HashMap localHashMap = new HashMap();
    localHashMap.put("channel", "1");
    M(localHashMap);
    this.tvL = paramString;
    AppMethodBeat.o(46648);
  }

  public final int ZU()
  {
    return 1630;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46649);
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      this.tvH = paramJSONObject.optString("guide_flag");
      this.tvI = paramJSONObject.optString("guide_wording");
      this.tvJ = paramJSONObject.optString("left_button_wording");
      this.tvK = paramJSONObject.optString("right_button_wording");
    }
    AppMethodBeat.o(46649);
  }

  public final int bgI()
  {
    return 1630;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/realnameguidequery";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.model.f
 * JD-Core Version:    0.6.2
 */