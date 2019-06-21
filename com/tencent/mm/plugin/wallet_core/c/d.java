package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends m
{
  public d()
  {
    AppMethodBeat.i(46498);
    r.cPM().bSd.hY("WalletBulletin", "delete from WalletBulletin");
    M(new HashMap());
    AppMethodBeat.o(46498);
  }

  public final int ZU()
  {
    return 1679;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46499);
    ab.i("MicroMsg.NetSceneGetBannerInfo", "NetSceneGetBannerInfo errCode = " + paramInt + " " + paramJSONObject);
    if (paramInt == 0)
    {
      u.aC(paramJSONObject);
      long l = paramJSONObject.optLong("banner_update_interval", 0L);
      ab.i("MicroMsg.NetSceneGetBannerInfo", "update_interval=".concat(String.valueOf(l)));
      g.RQ();
      g.RP().Ry().set(ac.a.xMO, Long.valueOf(l));
      paramString = paramJSONObject.optJSONObject("lbs_info");
      if (paramString != null)
      {
        JSONArray localJSONArray = paramString.optJSONArray("config_array");
        if ((localJSONArray != null) && (localJSONArray.length() > 0))
        {
          k localk = k.cPt();
          if (localJSONArray != null)
          {
            ab.d("MicroMsg.GpsReportHelper", localJSONArray.toString());
            localk.tzo = localJSONArray;
            g.RQ();
            g.RP().Ry().set(ac.a.xNF, localJSONArray.toString());
          }
        }
        g.RQ();
        g.RP().Ry().set(ac.a.xNG, paramString.optString("title"));
        g.RQ();
        g.RP().Ry().set(ac.a.xNH, paramString.optString("content"));
      }
      paramJSONObject = paramJSONObject.optJSONObject("realname_info");
      if (paramJSONObject != null)
      {
        paramString = paramJSONObject.optString("title");
        paramJSONObject = paramJSONObject.optString("balance_title");
        g.RQ();
        g.RP().Ry().set(ac.a.xNI, paramString);
        g.RQ();
        g.RP().Ry().set(ac.a.xNJ, paramJSONObject);
      }
    }
    AppMethodBeat.o(46499);
  }

  public final int bgI()
  {
    return 1679;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/getbannerinfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.d
 * JD-Core Version:    0.6.2
 */