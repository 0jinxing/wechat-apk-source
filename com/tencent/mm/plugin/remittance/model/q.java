package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.b.a.a;
import com.tencent.mm.wallet_core.c.i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class q extends a
  implements i
{
  public String pPf;

  public q(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(44760);
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("recv_username", paramString1);
    localHashMap.put("recv_nickname", paramString2);
    localHashMap.put("qrcodeid", paramString5);
    try
    {
      if (!bo.isNullOrNil(paramString3))
        localHashMap.put("desc", URLEncoder.encode(paramString3, "UTF-8"));
      if (!bo.isNullOrNil(paramString4))
        localHashMap.put("message", URLEncoder.encode(paramString4, "UTF-8"));
      localHashMap.put("currency", String.valueOf(paramInt1));
      localHashMap.put("set_amount", String.valueOf(paramInt2));
      M(localHashMap);
      ab.i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", new Object[] { paramString1, paramString2, Long.valueOf(paramLong), paramString3, paramString4, Integer.valueOf(paramInt1) });
      AppMethodBeat.o(44760);
      return;
    }
    catch (UnsupportedEncodingException paramString5)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferPay", paramString5, "", new Object[0]);
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44761);
    this.pPf = paramJSONObject.optString("payurl", "");
    ab.i("MicroMsg.NetSceneH5F2fTransferPay", "payurl: %s", new Object[] { this.pPf });
    AppMethodBeat.o(44761);
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/h5f2ftransferpay";
  }

  public final int bgG()
  {
    return 1529;
  }

  public final int getType()
  {
    return 1529;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.q
 * JD-Core Version:    0.6.2
 */