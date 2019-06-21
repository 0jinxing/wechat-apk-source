package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import org.json.JSONObject;

public final class ad extends m
{
  public double pPt;
  public String pRv;
  public String tuy;
  public double tuz;

  public final int ZU()
  {
    return 1689;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46556);
    ab.i("Micromsg.NetSceneTransferChargeQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      ab.i("Micromsg.NetSceneTransferChargeQuery", "NetSceneTransferChargeQuery request error");
      AppMethodBeat.o(46556);
    }
    while (true)
    {
      return;
      this.tuy = paramJSONObject.optString("short_desc");
      this.pRv = paramJSONObject.optString("charge_desc");
      this.tuz = paramJSONObject.optDouble("acc_fee");
      this.pPt = (paramJSONObject.optDouble("remain_fee") / 100.0D);
      AppMethodBeat.o(46556);
    }
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transfergetchargefee";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.ad
 * JD-Core Version:    0.6.2
 */