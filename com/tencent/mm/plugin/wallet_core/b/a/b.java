package com.tencent.mm.plugin.wallet_core.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends m
  implements i
{
  public BindCardOrder ttK;

  public b(s params)
  {
    this(params, -1);
  }

  public b(s params, int paramInt)
  {
    AppMethodBeat.i(46486);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("flag", params.flag);
    localHashMap1.put("passwd", params.guu);
    localHashMap1.put("verify_code", params.tCi);
    localHashMap1.put("token", params.token);
    if (params.tCj);
    for (String str = "1"; ; str = "0")
    {
      localHashMap1.put("bind_flag", str);
      if (paramInt > 0)
      {
        localHashMap1.put("realname_scene", String.valueOf(paramInt));
        ab.i("MicroMsg.NetSenceTenPayBase", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
      }
      if (!bo.isNullOrNil(params.pbn))
        localHashMap1.put("bank_type", params.pbn);
      if (x.dNS())
      {
        localHashMap2.put("uuid_for_bindcard", x.dNU());
        localHashMap2.put("bindcard_scene", x.dNT());
      }
      a(params.pGr, localHashMap1, localHashMap2);
      M(localHashMap1);
      ba(localHashMap2);
      AppMethodBeat.o(46486);
      return;
    }
  }

  public final int ZU()
  {
    return 475;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46487);
    this.ttK = new BindCardOrder();
    this.ttK.as(paramJSONObject);
    AppMethodBeat.o(46487);
  }

  public final int bgI()
  {
    return 17;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/bindverifyreg";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.b.a.b
 * JD-Core Version:    0.6.2
 */