package com.tencent.mm.plugin.wallet.bind.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends m
{
  public int tle;
  public String tlf;

  public a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(45724);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bankcard_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    M(localHashMap);
    AppMethodBeat.o(45724);
  }

  public final int ZU()
  {
    return 1540;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45725);
    if (paramInt == 0)
      if (paramJSONObject != null)
      {
        this.tle = paramJSONObject.optInt("unbindbannerlevel", 0);
        this.tlf = paramJSONObject.optString("unbindbannerwording");
        AppMethodBeat.o(45725);
      }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneGetUnbindInfo", "json is null");
      AppMethodBeat.o(45725);
    }
  }

  public final int bgI()
  {
    return 1540;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/unbindbanner";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.a.a
 * JD-Core Version:    0.6.2
 */