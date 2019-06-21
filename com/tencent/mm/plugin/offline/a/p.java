package com.tencent.mm.plugin.offline.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p extends m
{
  public p(String paramString)
  {
    AppMethodBeat.i(43415);
    HashMap localHashMap = new HashMap();
    localHashMap.put("device_id", q.LM());
    localHashMap.put("passwd", paramString);
    M(localHashMap);
    AppMethodBeat.o(43415);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int bgI()
  {
    return 51;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.p
 * JD-Core Version:    0.6.2
 */