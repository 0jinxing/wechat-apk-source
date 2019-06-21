package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.d.f;
import com.tencent.mm.plugin.wallet_core.model.aa;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l extends m
{
  public l()
  {
    AppMethodBeat.i(46521);
    M(new HashMap());
    AppMethodBeat.o(46521);
  }

  public final int ZU()
  {
    return 1631;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46522);
    ab.i("MicroMsg.NetSceneQueryUserWallet", "errCode is : ".concat(String.valueOf(paramInt)));
    if (paramInt == 0)
    {
      r.cPL().bSd.hY("WalletKindInfo", "delete from WalletKindInfo");
      if (paramJSONObject != null)
      {
        ab.i("MicroMsg.NetSceneQueryUserWallet", "resp json " + paramJSONObject.toString());
        paramJSONObject = paramJSONObject.optJSONArray("UserWalletInfoList");
        if (paramJSONObject != null)
        {
          int i = paramJSONObject.length();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            paramString = aa.aD(paramJSONObject.optJSONObject(paramInt));
            if (paramString != null)
              r.cPL().b(paramString);
          }
          AppMethodBeat.o(46522);
        }
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneQueryUserWallet", "wallet array is null");
      AppMethodBeat.o(46522);
      continue;
      ab.e("MicroMsg.NetSceneQueryUserWallet", "response json is null");
      AppMethodBeat.o(46522);
    }
  }

  public final int bgI()
  {
    return 1631;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/queryuserwallet";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.l
 * JD-Core Version:    0.6.2
 */