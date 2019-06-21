package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import org.json.JSONObject;

public final class e extends m
{
  public d okN;

  public e()
  {
    AppMethodBeat.i(43096);
    M(new HashMap());
    AppMethodBeat.o(43096);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43097);
    ab.d("MicroMsg.NetSceneGetEUInfo", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(43097);
    while (true)
    {
      return;
      try
      {
        paramString = new com/tencent/mm/plugin/mall/a/d;
        paramString.<init>(paramJSONObject.toString());
        this.okN = paramString;
        g.RQ();
        g.RP().Ry().set(ac.a.xVD, paramJSONObject.toString());
        AppMethodBeat.o(43097);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneGetEUInfo", paramString, "", new Object[0]);
        AppMethodBeat.o(43097);
      }
    }
  }

  public final int bgI()
  {
    return 2713;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/geteuinfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.e
 * JD-Core Version:    0.6.2
 */