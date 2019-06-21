package com.tencent.mm.plugin.luckymoney.sns.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends m
{
  public int obS;

  public a(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(42549);
    this.obS = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", String.valueOf(paramInt));
    localHashMap.put("passwd", paramString1);
    localHashMap.put("req_key", String.valueOf(paramString2));
    this.obS = paramInt;
    M(localHashMap);
    AppMethodBeat.o(42549);
  }

  public final int ZU()
  {
    return 1697;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42550);
    ab.i("MicroMsg.NetSceneSnsPayManage", " errCode: " + paramInt + " errMsg :" + paramString);
    if (paramInt == 0)
      if (this.obS == 1)
      {
        com.tencent.mm.plugin.luckymoney.sns.b.a.xV(1);
        ab.i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 1");
        AppMethodBeat.o(42550);
      }
    while (true)
    {
      return;
      com.tencent.mm.plugin.luckymoney.sns.b.a.xV(0);
      ab.i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 0");
      AppMethodBeat.o(42550);
      continue;
      ab.e("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() NetSceneSnsPayManage is false!");
      AppMethodBeat.o(42550);
    }
  }

  public final int bgI()
  {
    return 1697;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/snspaymanage";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.a.a
 * JD-Core Version:    0.6.2
 */