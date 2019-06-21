package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d extends a
{
  public String desc;
  public double kCJ;
  public String pPP;
  public String pPQ;
  public int scene;
  public int timestamp;
  public String username;

  public d(String paramString)
  {
    AppMethodBeat.i(48531);
    HashMap localHashMap = new HashMap();
    localHashMap.put("transfer_url", paramString);
    M(localHashMap);
    AppMethodBeat.o(48531);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48532);
    ab.d("MicroMsg.NetScenePayURemittanceGetUsername", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(48532);
    while (true)
    {
      return;
      this.username = paramJSONObject.optString("user_name");
      this.pPP = paramJSONObject.optString("true_name");
      this.kCJ = (paramJSONObject.optDouble("fee") / 100.0D);
      this.desc = paramJSONObject.optString("desc");
      this.scene = paramJSONObject.optInt("scene");
      this.pPQ = paramJSONObject.optString("transfer_qrcode_id");
      this.timestamp = paramJSONObject.optInt("time_stamp");
      AppMethodBeat.o(48532);
    }
  }

  public final int cOX()
  {
    return 24;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.a.d
 * JD-Core Version:    0.6.2
 */