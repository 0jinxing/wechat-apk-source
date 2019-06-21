package com.tencent.mm.plugin.wallet.pay.a.e;

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
import com.tencent.mm.wallet_core.tenpay.model.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class j extends n
{
  private int pQY;
  public Orders tog;

  public j(s params, Orders paramOrders)
  {
    AppMethodBeat.i(45950);
    this.tog = null;
    this.pQY = -1;
    this.tog = paramOrders;
    if (params.pGr != null)
    {
      this.pQY = params.pGr.cIf;
      i = params.pGr.cIb;
    }
    List localList = paramOrders.tAq;
    if (localList.size() > 0)
      localObject = ((Orders.Commodity)localList.get(0)).cAa;
    a(paramOrders.czZ, (String)localObject, this.pQY, i, params.pbn, params.pbo);
    paramOrders = new HashMap();
    localObject = new HashMap();
    if (!bo.isNullOrNil(params.guu));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.NetSceneTenpayVertifyReg", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(params.pGr, paramOrders, (Map)localObject, bool);
      paramOrders.put("flag", params.flag);
      paramOrders.put("passwd", params.guu);
      paramOrders.put("verify_code", params.tCi);
      paramOrders.put("token", params.token);
      paramOrders.put("favorcomposedid", params.two);
      paramOrders.put("default_favorcomposedid", params.twn);
      M(paramOrders);
      ba((Map)localObject);
      AppMethodBeat.o(45950);
      return;
    }
  }

  public int ZU()
  {
    int i;
    if (this.pQY == 11)
      i = 1684;
    while (true)
    {
      return i;
      if (this.pQY == 21)
        i = 1608;
      else
        i = 474;
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45951);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
      AppMethodBeat.o(45951);
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneTenpayVertifyReg", "Pay Success! saving bind_serial:".concat(String.valueOf(paramJSONObject.optString("bind_serial"))));
      if ("1".equals(paramJSONObject.optString("pay_flag")))
      {
        this.tpw = true;
        this.tog = Orders.a(paramJSONObject, this.tog);
        ab.i("MicroMsg.NetSceneTenpayVertifyReg", "mPayScene:" + this.pQY);
        if (this.pQY != 39)
          break label168;
        ab.i("MicroMsg.NetSceneTenpayVertifyReg", "it's the sns scene, parse the sns pay data");
        b.aK(paramJSONObject);
      }
      while (true)
      {
        paramString = a.atm("PayProcess").iterator();
        while (paramString.hasNext())
          ((c)paramString.next()).mqu.putInt("key_is_clear_failure", this.AgM);
        this.tpw = false;
        break;
        label168: ab.i("MicroMsg.NetSceneTenpayVertifyReg", "it's not the sns scene");
      }
      AppMethodBeat.o(45951);
    }
  }

  public final int bgI()
  {
    return 16;
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
      str = "/cgi-bin/mmpay-bin/tenpay/saveverifyreg";
    while (true)
    {
      return str;
      if (this.pQY == 21)
        str = "/cgi-bin/mmpay-bin/tenpay/fetchverifyreg";
      else
        str = "/cgi-bin/mmpay-bin/tenpay/verifyreg";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.e.j
 * JD-Core Version:    0.6.2
 */