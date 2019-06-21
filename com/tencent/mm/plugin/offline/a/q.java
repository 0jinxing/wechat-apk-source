package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.Map;
import org.json.JSONObject;

public final class q extends m
{
  public n oYH;
  public y oYI;
  public com.tencent.mm.wallet_core.c.d oYJ;
  public com.tencent.mm.wallet_core.c.d oYK;

  public q(int paramInt)
  {
    AppMethodBeat.i(43416);
    this.oYH = new n(System.currentTimeMillis(), paramInt);
    M(this.oYH.oYG);
    this.oYI = new y(null, 8);
    aZ(this.oYI.oYG);
    ba(this.oYI.toe);
    AppMethodBeat.o(43416);
  }

  private static com.tencent.mm.wallet_core.c.d ab(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43418);
    com.tencent.mm.wallet_core.c.d locald = new com.tencent.mm.wallet_core.c.d();
    locald.aIm = ah.getContext().getString(2131304763);
    String str = ah.getContext().getString(2131304763);
    try
    {
      i = paramJSONObject.getInt("retcode");
      paramJSONObject = paramJSONObject.optString("retmsg");
      if (i != 0)
      {
        ab.w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: resolve busi error: retCode is error");
        if (i != -10089)
        {
          locald.f(1000, i, paramJSONObject, 2);
          AppMethodBeat.o(43418);
          return locald;
        }
      }
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: json resolve error: error when resolving error code : " + paramJSONObject.toString());
        int i = -10089;
        paramJSONObject = str;
        continue;
        locald.f(1000, 2, paramJSONObject, 2);
        continue;
        ab.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: all's OK");
      }
    }
  }

  public static boolean isEnabled()
  {
    AppMethodBeat.i(43419);
    boolean bool1 = false;
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100337");
    boolean bool2 = bool1;
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).dru();
      bool2 = bool1;
      if (((Map)localObject).containsKey("enabled"))
      {
        bool2 = bool1;
        if ("1".equals(((Map)localObject).get("enabled")))
          bool2 = true;
      }
    }
    ab.v("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "isUserBindQueryEnabled: ".concat(String.valueOf(bool2)));
    AppMethodBeat.o(43419);
    return bool2;
  }

  public final int ZU()
  {
    return 1742;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43417);
    if (paramInt != 0)
      AppMethodBeat.o(43417);
    while (true)
    {
      return;
      paramString = paramJSONObject.optJSONObject("queryuser_resp");
      this.oYJ = ab(paramString);
      this.oYH.a(this.oYJ.errCode, this.oYJ.aIm, paramString);
      paramJSONObject = paramJSONObject.optJSONObject("bindquerynew_resp");
      this.oYK = ab(paramJSONObject);
      this.oYI.a(this.oYK.errCode, this.oYK.aIm, paramJSONObject);
      if (paramString != null)
      {
        paramString = paramString.optString("card_list");
        if (paramString != null)
          a.Uf(paramString);
      }
      AppMethodBeat.o(43417);
    }
  }

  public final int bgI()
  {
    return 1742;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlineuserbindquery";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.q
 * JD-Core Version:    0.6.2
 */