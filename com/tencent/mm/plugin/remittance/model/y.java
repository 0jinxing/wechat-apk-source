package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.b.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class y extends a
{
  public int kCv;
  public String kCx;
  public String kCy;
  public String pQy;
  public String pQz;

  public y(int paramInt)
  {
    AppMethodBeat.i(44790);
    this.kCv = 0;
    this.pQy = "";
    this.pQz = "";
    ab.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTenpayh5Index create");
    HashMap localHashMap = new HashMap();
    localHashMap.put("wallet_type", String.valueOf(paramInt));
    M(localHashMap);
    AppMethodBeat.o(44790);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44791);
    ab.i("MicroMsg.NetSceneTenpayh5Index", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      ab.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTransferChargeQuery request error");
      AppMethodBeat.o(44791);
    }
    while (true)
    {
      return;
      paramString = new StringBuffer();
      this.kCv = paramJSONObject.optInt("currency");
      this.pQy = paramJSONObject.optString("currencyUint");
      this.pQz = paramJSONObject.optString("currencyWording");
      this.kCx = paramJSONObject.optString("notice");
      this.kCy = paramJSONObject.optString("notice_url");
      paramString.append("currency:" + this.kCv);
      paramString.append(" currencyuint:" + this.pQy);
      paramString.append(" currencywording:" + this.pQz);
      paramString.append(" notice:" + this.kCx);
      paramString.append(" notice_url:" + this.kCy);
      ab.i("MicroMsg.NetSceneTenpayh5Index", "resp " + paramString.toString());
      AppMethodBeat.o(44791);
    }
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/h5transferoperate";
  }

  public final int bgG()
  {
    return 0;
  }

  public final int getType()
  {
    return 1574;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.y
 * JD-Core Version:    0.6.2
 */