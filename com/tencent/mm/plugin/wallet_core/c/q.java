package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class q extends m
{
  public BindCardOrder ttK;

  public q(s params)
  {
    this(params, -1);
  }

  public q(s params, int paramInt)
  {
    AppMethodBeat.i(46530);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(params.pGr, localHashMap1, localHashMap2);
    localHashMap1.put("flag", params.flag);
    if ("2".equals(params.flag))
      localHashMap1.put("passwd", params.guu);
    localHashMap1.put("verify_code", params.tCi);
    localHashMap1.put("token", params.token);
    if ((params.pGr != null) && (!bo.isNullOrNil(params.pGr.czZ)))
      localHashMap1.put("req_key", params.pGr.czZ);
    if (paramInt >= 0)
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
    M(localHashMap1);
    ba(localHashMap2);
    AppMethodBeat.o(46530);
  }

  public final int ZU()
  {
    return 472;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46531);
    ab.i("test", "test");
    this.ttK = new BindCardOrder();
    this.ttK.as(paramJSONObject);
    AppMethodBeat.o(46531);
  }

  public final int bgI()
  {
    return 13;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/bindverify";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.q
 * JD-Core Version:    0.6.2
 */