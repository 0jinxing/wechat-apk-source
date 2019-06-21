package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ah extends ak
{
  public String kCI;

  public ah(int paramInt1, long paramLong1, long paramLong2, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt3)
  {
    AppMethodBeat.i(42403);
    HashMap localHashMap = new HashMap();
    localHashMap.put("totalNum", String.valueOf(paramInt1));
    localHashMap.put("totalAmount", String.valueOf(paramLong1));
    localHashMap.put("perValue", String.valueOf(paramLong2));
    localHashMap.put("hbType", String.valueOf(paramInt2));
    localHashMap.put("wishing", URLEncoder.encode(bo.nullAsNil(paramString1)));
    localHashMap.put("currency", String.valueOf(paramInt3));
    if (!bo.isNullOrNil(paramString3))
      localHashMap.put("headImg", URLEncoder.encode(paramString3));
    localHashMap.put("nickName", URLEncoder.encode(bo.nullAsNil(paramString4)));
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("username", URLEncoder.encode(paramString2));
    M(localHashMap);
    AppMethodBeat.o(42403);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42404);
    ab.i("MicroMsg.NetSceneLuckyMoneyH5Request", "NetSceneLuckyMoneyH5Request response errCode=".concat(String.valueOf(paramInt)));
    if (paramInt == 0)
      this.kCI = paramJSONObject.optString("payUrl");
    AppMethodBeat.o(42404);
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/h5requestwxhb";
  }

  public final int bgG()
  {
    return 0;
  }

  public final int getType()
  {
    return 1647;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.ah
 * JD-Core Version:    0.6.2
 */