package com.tencent.mm.plugin.offline.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j extends m
{
  public j(String paramString)
  {
    AppMethodBeat.i(43399);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    localHashMap.put("device_id", com.tencent.mm.compatible.e.q.LM());
    M(localHashMap);
    AppMethodBeat.o(43399);
  }

  public final int ZU()
  {
    return 566;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43400);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    AppMethodBeat.o(43400);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int bgI()
  {
    return 47;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlineclose";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.j
 * JD-Core Version:    0.6.2
 */