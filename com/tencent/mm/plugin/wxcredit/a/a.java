package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends m
{
  public String cFl;
  public boolean cQU;
  private Map<String, String> oYG;
  public String token;
  public boolean uYs;

  public a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(48652);
    this.cQU = true;
    this.uYs = false;
    this.oYG = new HashMap();
    this.oYG.put("session_key", paramString3);
    this.oYG.put("bank_type", paramString4);
    this.oYG.put("name", paramString1);
    this.oYG.put("cre_id", paramString2);
    M(this.oYG);
    AppMethodBeat.o(48652);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48654);
    ab.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(48654);
    while (true)
    {
      return;
      try
      {
        this.token = paramJSONObject.optString("session_key");
        this.cQU = "1".equals(paramJSONObject.getString("need_bind"));
        this.uYs = "1".equals(paramJSONObject.getString("bank_user"));
        this.cFl = paramJSONObject.optString("mobile_no");
        AppMethodBeat.o(48654);
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
        AppMethodBeat.o(48654);
      }
    }
  }

  public final boolean bXl()
  {
    AppMethodBeat.i(48653);
    super.bXl();
    this.oYG.put("retry", "1");
    M(this.oYG);
    AppMethodBeat.o(48653);
    return true;
  }

  public final int bgI()
  {
    return 64;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.a.a
 * JD-Core Version:    0.6.2
 */