package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends m
{
  public String name;
  public String token;
  public String uYt;
  public boolean uYu;

  public b(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(48655);
    this.uYu = true;
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("check_pwd_scene", String.valueOf(paramInt));
    M(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("check_pwd_scene", String.valueOf(paramInt));
    ba(paramString1);
    AppMethodBeat.o(48655);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48656);
    ab.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(48656);
    while (true)
    {
      return;
      this.token = paramJSONObject.optString("session_key");
      if ("1".equals(paramJSONObject.optString("all_info")))
      {
        this.uYu = false;
        AppMethodBeat.o(48656);
      }
      else
      {
        this.uYu = true;
        this.name = paramJSONObject.optString("name");
        this.uYt = paramJSONObject.optString("cre_id");
        AppMethodBeat.o(48656);
      }
    }
  }

  public final int bgI()
  {
    return 63;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.a.b
 * JD-Core Version:    0.6.2
 */