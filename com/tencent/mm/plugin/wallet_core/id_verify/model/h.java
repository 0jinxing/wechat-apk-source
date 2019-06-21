package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h extends m
{
  public h(String paramString1, String paramString2, String paramString3, Profession paramProfession, String paramString4)
  {
    AppMethodBeat.i(46652);
    ab.d("MicroMsg.NetSceneTenpaySetUserExInfo", "country: %s, province: %s, city: %s, nationality: %s", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    HashMap localHashMap = new HashMap();
    if (!bo.isNullOrNil(paramString1))
      localHashMap.put("user_country", paramString1);
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("user_province", paramString2);
    if (!bo.isNullOrNil(paramString3))
      localHashMap.put("user_city", paramString3);
    if (paramProfession != null)
    {
      ab.d("MicroMsg.NetSceneTenpaySetUserExInfo", "name: %s, type: %s", new Object[] { paramProfession.tvN, Integer.valueOf(paramProfession.tvO) });
      localHashMap.put("profession_name", paramProfession.tvN);
      localHashMap.put("profession_type", String.valueOf(paramProfession.tvO));
    }
    if (!bo.isNullOrNil(paramString4))
      localHashMap.put("nationality", paramString4);
    M(localHashMap);
    AppMethodBeat.o(46652);
  }

  public final int ZU()
  {
    return 1978;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46653);
    ab.i("MicroMsg.NetSceneTenpaySetUserExInfo", "errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(46653);
  }

  public final int bgI()
  {
    return 1978;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/setuserexinfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.model.h
 * JD-Core Version:    0.6.2
 */