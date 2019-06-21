package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.w;
import java.util.HashMap;
import org.json.JSONObject;

public final class q extends m
{
  public q()
  {
    AppMethodBeat.i(49178);
    M(new HashMap());
    AppMethodBeat.o(49178);
  }

  public final int ZU()
  {
    return 477;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49179);
    ab.d("Micromsg.NetSceneTenpayTimeSeed", " errCode: " + paramInt + " errMsg :" + paramString);
    paramString = paramJSONObject.optString("time_stamp");
    if (!bo.isNullOrNil(paramString))
    {
      w.setTimeStamp(paramString);
      AppMethodBeat.o(49179);
    }
    while (true)
    {
      return;
      ab.w("Micromsg.NetSceneTenpayTimeSeed", "hy: no timeseed. use local timeseed");
      w.setTimeStamp(System.currentTimeMillis() / 1000L);
      AppMethodBeat.o(49179);
    }
  }

  public final int bgI()
  {
    return 19;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/timeseed";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.tenpay.model.q
 * JD-Core Version:    0.6.2
 */