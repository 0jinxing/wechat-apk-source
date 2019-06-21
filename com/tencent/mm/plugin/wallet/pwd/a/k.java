package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k extends m
  implements com.tencent.mm.network.k
{
  public JSONObject tqH;

  public k(boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(46189);
    HashMap localHashMap = new HashMap();
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "cpuId: %s, uid: %s", new Object[] { paramString1, paramString2 });
    localHashMap.put("is_root", "0");
    if (paramBoolean);
    for (String str = "1"; ; str = "0")
    {
      localHashMap.put("is_device_open_touch", str);
      localHashMap.put("cpu_id", paramString1);
      localHashMap.put("app_uid", paramString2);
      M(localHashMap);
      AppMethodBeat.o(46189);
      return;
    }
  }

  public final int ZU()
  {
    return 1669;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46190);
    this.ehi = paramf;
    int i = super.a(parame, paramf);
    AppMethodBeat.o(46190);
    return i;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46191);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "alvinluo errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "alvinluo json: %s", new Object[] { paramJSONObject.toString() });
      this.tqH = paramJSONObject;
      com.tencent.mm.wallet_core.c.ab.dNZ().aT(this.tqH);
    }
    AppMethodBeat.o(46191);
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/paysecurity";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.k
 * JD-Core Version:    0.6.2
 */