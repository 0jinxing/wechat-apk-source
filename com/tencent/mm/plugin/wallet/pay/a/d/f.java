package com.tencent.mm.plugin.wallet.pay.a.d;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.plugin.wallet_core.utils.b;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.tenpay.model.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class f extends n
{
  private int pQY;
  public Orders tog;
  protected s tox;

  public f(s params, Orders paramOrders)
  {
    AppMethodBeat.i(45948);
    this.tog = null;
    this.pQY = -1;
    this.tog = paramOrders;
    this.tox = params;
    List localList = paramOrders.tAq;
    if (localList.size() > 0)
      localObject = ((Orders.Commodity)localList.get(0)).cAa;
    if (params.pGr == null)
    {
      ab.e("MicroMsg.NetSceneTenpayPayVertify", "empty payInfo");
      AppMethodBeat.o(45948);
      return;
    }
    this.pQY = params.pGr.cIf;
    int i = params.pGr.cIb;
    a(paramOrders.czZ, (String)localObject, params.pGr.cIf, i, params.pbn, params.pbo);
    localObject = new HashMap();
    paramOrders = new HashMap();
    ((Map)localObject).put("flag", params.flag);
    ((Map)localObject).put("passwd", params.guu);
    boolean bool;
    if (!bo.isNullOrNil(params.guu))
    {
      bool = true;
      label183: ab.i("MicroMsg.NetSceneTenpayPayVertify", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(params.pGr, (Map)localObject, paramOrders, bool);
      ((Map)localObject).put("verify_type", params.cHG);
      if (params.cHG != 0)
        break label410;
      ((Map)localObject).put("verify_code", params.tCi);
    }
    while (true)
    {
      ((Map)localObject).put("token", params.token);
      ((Map)localObject).put("bank_type", params.pbn);
      ((Map)localObject).put("bind_serial", params.pbo);
      ((Map)localObject).put("arrive_type", params.twk);
      ((Map)localObject).put("default_favorcomposedid", params.twn);
      ((Map)localObject).put("favorcomposedid", params.two);
      aj((Map)localObject);
      if (x.dNS())
      {
        paramOrders.put("uuid_for_bindcard", x.dNU());
        paramOrders.put("bindcard_scene", x.dNT());
      }
      M((Map)localObject);
      ba(paramOrders);
      AppMethodBeat.o(45948);
      break;
      bool = false;
      break label183;
      label410: ((Map)localObject).put("cre_tail", params.tCk);
      ((Map)localObject).put("cre_type", params.tCl);
    }
  }

  public int ZU()
  {
    int i;
    if (this.pQY == 11)
      i = 1607;
    while (true)
    {
      return i;
      if (this.pQY == 21)
        i = 1606;
      else
        i = 462;
    }
  }

  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45949);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
      AppMethodBeat.o(45949);
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneTenpayPayVertify", "Pay Success! saving bind_serial:".concat(String.valueOf(paramJSONObject.optString("bind_serial"))));
      if ("1".equals(paramJSONObject.optString("pay_flag")))
      {
        this.tpw = true;
        this.tog = Orders.a(paramJSONObject, this.tog);
        ab.i("MicroMsg.NetSceneTenpayPayVertify", "mPayScene:" + this.pQY);
        if (this.pQY != 39)
          break label171;
        ab.i("MicroMsg.NetSceneTenpayPayVertify", "it's the sns scene, parse the sns pay data");
        b.aK(paramJSONObject);
      }
      while (true)
      {
        paramString = a.atm("PayProcess").iterator();
        while (paramString.hasNext())
          ((c)paramString.next()).mqu.putInt("key_is_clear_failure", this.AgM);
        this.tpw = false;
        break;
        label171: ab.i("MicroMsg.NetSceneTenpayPayVertify", "it's not the sns scene");
      }
      AppMethodBeat.o(45949);
    }
  }

  protected void aj(Map<String, String> paramMap)
  {
  }

  public int bgI()
  {
    return 1;
  }

  public final boolean cNK()
  {
    if ((this.pQY == 11) || (this.pQY == 21));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String getUri()
  {
    String str;
    if (this.pQY == 11)
      str = "/cgi-bin/mmpay-bin/tenpay/saveverify";
    while (true)
    {
      return str;
      if (this.pQY == 21)
        str = "/cgi-bin/mmpay-bin/tenpay/fetchverify";
      else
        str = "/cgi-bin/mmpay-bin/tenpay/verify";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.d.f
 * JD-Core Version:    0.6.2
 */