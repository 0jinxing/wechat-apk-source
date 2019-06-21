package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ar extends ak
{
  public ar(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(42423);
    HashMap localHashMap = new HashMap();
    localHashMap.put("username", paramString1);
    localHashMap.put("sendId", paramString2);
    localHashMap.put("channelId", "1");
    localHashMap.put("ver", paramString3);
    localHashMap.put("sendUserName", r.Yz());
    M(localHashMap);
    AppMethodBeat.o(42423);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/sharewxhb";
  }

  public final int getType()
  {
    return 1668;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.ar
 * JD-Core Version:    0.6.2
 */