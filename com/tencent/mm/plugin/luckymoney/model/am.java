package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class am extends ak
{
  public String nSd;
  public String nWX;

  public am(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(42412);
    this.nWX = paramString3;
    this.nSd = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    localHashMap.put("receiveId", paramString3);
    localHashMap.put("wishing", URLEncoder.encode(bo.nullAsNil(paramString2)));
    localHashMap.put("ver", paramString4);
    M(localHashMap);
    AppMethodBeat.o(42412);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/wishwxhb";
  }

  public final int getType()
  {
    return 1682;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.am
 * JD-Core Version:    0.6.2
 */