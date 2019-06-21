package com.tencent.mm.plugin.offline.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d extends m
{
  public String oXV;
  public int oXW;
  public String oXX;

  public d()
  {
    AppMethodBeat.i(43388);
    HashMap localHashMap = new HashMap();
    g.RQ();
    Object localObject = g.RP().Ry().get(ac.a.xRS, null);
    if (localObject != null)
      localHashMap.put("ack_key", (String)localObject);
    localHashMap.put("timestamp", System.currentTimeMillis());
    M(localHashMap);
    AppMethodBeat.o(43388);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43389);
    if (paramInt == 0)
    {
      h.pYm.a(135L, 56L, 1L, true);
      this.oXV = paramJSONObject.optString("appmsg");
      this.oXW = (paramJSONObject.optInt("poll_time") * 1000);
      this.oXX = paramJSONObject.optString("ack_key");
      if (this.oXW > 0)
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xRR, Integer.valueOf(this.oXW));
      }
      g.RQ();
      g.RP().Ry().set(ac.a.xRS, this.oXX);
      AppMethodBeat.o(43389);
    }
    while (true)
    {
      return;
      h.pYm.a(135L, 57L, 1L, true);
      AppMethodBeat.o(43389);
    }
  }

  public final boolean bXl()
  {
    return false;
  }

  public final int bgI()
  {
    return 1981;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlinegetmsg";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.d
 * JD-Core Version:    0.6.2
 */