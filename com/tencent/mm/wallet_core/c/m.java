package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m extends com.tencent.mm.wallet_core.tenpay.model.m
{
  public String Afw;

  public m(String paramString)
  {
    AppMethodBeat.i(49061);
    this.Afw = paramString;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("crt_no", com.tencent.mm.compatible.util.q.encode(paramString));
    localHashMap1.put("deviceid", com.tencent.mm.compatible.e.q.getDeviceID(ah.getContext()));
    M(localHashMap1);
    ba(localHashMap2);
    AppMethodBeat.o(49061);
  }

  public final int ZU()
  {
    return 1568;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49062);
    ab.i("MicroMsg.NetSceneDeletedigitalcert", "onGYNetEnd %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(49062);
  }

  public final int bgI()
  {
    return 1568;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/deletedigitalcert";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.m
 * JD-Core Version:    0.6.2
 */